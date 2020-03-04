package com.Test.multiThreads;

public class Product extends Thread {
	
	private int num;

	public StorageInterface storageInterface;
	
	public  Product(StorageInterface storageInterface) {
		this.storageInterface = storageInterface;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public void product(int num) {
		this.storageInterface.product(num);
	}
	
	
	
	@Override
	public void run() {
		product(num);
	}

}
