package com.example.demo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
	
	@Pointcut("execution(public *  com.example.demo.controller..*(..))")
	private void contMethod() {}
	
	@Before("contMethod()")
	public void before(JoinPoint j) {
		String methodName = j.getSignature().toShortString();
//		System.out.println(methodName + "메소드 동작하기 전입니다.");
		
		HttpServletRequest request = (HttpServletRequest)j.getArgs()[0];
		String uri = request.getRequestURI();
//		System.out.println("요청한 uri: "+uri);
		String ip = request.getRemoteAddr();
		String time = new Date().toLocaleString();
		String log = uri+"\t"+ip+"\t"+time+"\n";
		
		Date today = new Date();
		int yy = today.getYear()+1900;
		int mm = today.getMonth()+1;
		int dd = today.getDay();
		String fname = yy+""+mm+""+dd+".txt";
		String path = "c:/bitLogData";
		
		//uri, ip, time로그를 파일로 기록 
		try {
			FileWriter fw = new FileWriter(path+"/"+fname,true);
			//true를 갖는이유 : 이미 있는 파일에 추가된 로그가 기록되야하니까. 안하면 새로운 파일에 기록됨
			fw.write(log);
			fw.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
