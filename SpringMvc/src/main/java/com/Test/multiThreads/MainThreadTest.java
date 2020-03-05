package com.Test.multiThreads;

public class MainThreadTest {
	public static void main(String[] arg) {
		
		StorageInterface storageInterface = new Storage();
		
		Consume c1=new Consume(storageInterface);
		Consume c2=new Consume(storageInterface);
		Consume c3=new Consume(storageInterface);
		
		
		Product p1=new Product(storageInterface);
		Product p2=new Product(storageInterface);
		Product p3=new Product(storageInterface);
		Product p4=new Product(storageInterface);
		Product p5=new Product(storageInterface);
		Product p6=new Product(storageInterface);
		Product p7=new Product(storageInterface);

		
			c1.setNum(50);
			c1.start();

			c2.setNum(70);
			c2.start();
			
			
			c3.setNum(20);
			c3.start();
			

			    p1.setNum(10);
		        p2.setNum(20);
		        p3.setNum(30);
		        p4.setNum(40);
		        p5.setNum(30);
		        p6.setNum(20);
		        p7.setNum(80);
		        
		        p1.start();
		        p2.start();
		        p3.start();
		        p4.start();
		        p5.start();
		        p6.start();
		        p7.start();
	
	
	}
}
