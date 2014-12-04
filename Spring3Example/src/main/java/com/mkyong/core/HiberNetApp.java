package com.mkyong.core;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mkyong.common.Stock;
import com.mkyong.persistence.HibernetUtil;

public class HiberNetApp {

	public static void main(String[] args) {
		Session session = HibernetUtil.getSessionFactory().openSession();
		Stock stock = new Stock();
		stock.setStockName("PenDrive");
		stock.setStockCode("11");
		Transaction tx = session.beginTransaction();
		session.save(stock);
		tx.commit();
		session.close();

	}

}
