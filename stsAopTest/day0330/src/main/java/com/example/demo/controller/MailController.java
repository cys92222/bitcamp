package com.example.demo.controller;
//package com.example.demo.controller;
//
//import javax.mail.MessagingException;
//import javax.mail.internet.MimeMessage;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.io.ClassPathResource;
//import org.springframework.mail.MailSender;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.mail.javamail.MimeMessageHelper;
//import org.springframework.mail.javamail.MimeMessagePreparator;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//@Controller
//public class MailController2 {
//
//	@Autowired
//	private JavaMailSender mailSender;
//
//
//	public void setJavaMailSender(JavaMailSender mailSender) {
//		this.mailSender = mailSender;
//	}
//
//	//@RequestMapping("/mail2.do")
//	public void mail2() {
//		mailSender.send(new MimeMessagePreparator() {
//			public void prepare(MimeMessage mimeMessage) throws MessagingException {
//				MimeMessageHelper message = new MimeMessageHelper(mimeMessage, true, "UTF-8");
//				message.setFrom("@gmail.com");				//보내는 사람 이메일주소
//				message.setTo("@nate.com");					//받는사람 이메일주소
//				message.setSubject("메일테스트2_현민아");	//메일제목
//				message.setText("my text <img src='cid:sendImg'>", true);	//mytext 부분에 내용 적기
//				message.addInline("sendImg", new ClassPathResource("static/apeach.gif"));	//이미지 첨부
//				//message.addAttachment("myDocument.pdf", new ClassPathResource("doc/myDocument.pdf"));
//			}
//		});
//	}
//
//	//@RequestMapping("/mail.do")
//	public String mail() {
//		String r = "";
//		SimpleMailMessage mailMessage = new SimpleMailMessage();
//		mailMessage.setSubject("메일 발송 성공?");
//		mailMessage.setFrom("@gmail.com");
//		mailMessage.setText("어려워요.....");
//		mailMessage.setTo("@nate.com");
//		try {
//			mailSender.send(mailMessage);
//		} catch (Exception e) {
//			// TODO: handle exception'
//			System.out.println(e.getMessage());
//		}
//		return r;
//	}
//
//}