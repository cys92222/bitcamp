package com.example.demo.db;

import java.io.Reader;
import java.util.HashMap;
import java.util.List;

import javax.websocket.Session;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.example.demo.vo.GoodsVo;

public class GoodsManager {
	private static SqlSessionFactory factory;
	static {
		try {
			Reader reader = Resources.getResourceAsReader("com/example/demo/db/dbConfig.xml");
			factory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int deleteGoods(int no) {
		SqlSession session = factory.openSession(true);
		int re = session.delete("goods.goodsDelete",no);
		//session.commit();
		session.close();
		return re;
	}
	
	public static GoodsVo detailGoods(int no) {
		SqlSession session = factory.openSession();
		GoodsVo g = session.selectOne("goods.goodsDetail", no);
		session.close();
		return g;
	}
	
	public static List<GoodsVo> listGoods(HashMap map){	//검색기능
		SqlSession session = factory.openSession();
		List<GoodsVo> list = session.selectList("goods.goodsList",map);
		session.close();
		return list;
	}
}
