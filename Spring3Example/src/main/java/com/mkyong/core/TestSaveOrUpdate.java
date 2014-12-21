package com.mkyong.core;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mkyong.common.Stock;
import com.mkyong.persistence.HibernetUtil;

public class TestSaveOrUpdate {

	public static void main(String[] args) {
		Session session=HibernetUtil.getSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		//Stock stock= (Stock)session.get(Stock.class, 1);
		Stock stock= (Stock)session.load(Stock.class, 1);
		//stock.setStockId(1);
		//stock.setStockName("Mobile");
		session.saveOrUpdate(stock);
		//session.save(stock);
		tx.commit();
		session.close();
		
		
		
		
		
	}

}
