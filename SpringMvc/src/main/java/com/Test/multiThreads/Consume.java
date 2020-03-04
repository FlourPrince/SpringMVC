package com.Test.multiThreads;

public class Consume extends Thread {
	
	private int num;

	public StorageInterface storageInterface;
	
	public  Consume(StorageInterface storageInterface) {
		this.storageInterface = storageInterface;
	}

	public void setNum(int num) {
		this.num = num;
	}
	public void consume(int num) {
		this.storageInterface.consume(num);
	}

	@Override
	public void run() {
		consume(num);
	}

}
