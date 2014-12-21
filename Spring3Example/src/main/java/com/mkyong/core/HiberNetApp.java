package com.mkyong.core;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mkyong.common.Stock;
import com.mkyong.persistence.HibernetUtil;

public class HiberNetApp {

	public static void main(String[] args) {
		Session session = HibernetUtil.getSessionFactory().openSession();
		/*Stock stock = new Stock();
		stock.setStockName("HardDisk");
		stock.setStockCode("10");*/
		Transaction tx = session.beginTransaction();
		Stock stock=(Stock)session.get(Stock.class, 1);
		System.out.println("stock name::"+stock.getStockName());
		//System.out.println("stock name::"+stock1.getStockName());
		//session.save(stock);
		tx.commit();
		session.close();
		
		Session session1 = HibernetUtil.getSessionFactory().openSession();
		/*Stock stock = new Stock();
		stock.setStockName("HardDisk");
		stock.setStockCode("10");*/
		Transaction tx1 = session1.beginTransaction();
		Stock stock1=(Stock)session1.get(Stock.class, 2);
		System.out.println("stock name::"+stock1.getStockName());
		//System.out.println("stock name::"+stock1.getStockName());
		//session.save(stock);
		tx1.commit();
		session1.close();

	}

}
