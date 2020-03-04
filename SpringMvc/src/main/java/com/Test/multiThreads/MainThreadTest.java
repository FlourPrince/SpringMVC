package com.Test.multiThreads;

public class MainThreadTest {
	
	
	
	
	
	public static void main(String[] arg) {
		
		StorageInterface storageInterface = new Storage();
		
		Consume c1=new Consume(storageInterface);
		Consume c2=new Consume(storageInterface);
		Consume c3=new Consume(storageInterface);
		c1.setNum(1);
		c1.start();
		
		c2.setNum(2);
		c2.start();
		
		c3.setNum(3);
		c3.start();
		
		
		Product p1=new Product(storageInterface);
		Product p2=new Product(storageInterface);
		Product p3=new Product(storageInterface);
		Product p4=new Product(storageInterface);
		Product p5=new Product(storageInterface);

		p1.setNum(1);
		p1.start();

		p2.setNum(2);
		p2.start();

		p3.setNum(3);
		p3.start();
		
		p4.setNum(4);
		p4.start();
		
		p5.setNum(5);
		p5.start();
		

		
		
	}
	
	
	
	
	

}
