package com.Test.multiThreads;

import java.util.LinkedList;

public class Storage implements StorageInterface {
	private final int MAX_size = 100;
	private  LinkedList list = new LinkedList();

	@Override
	public void consume(int num) {
		System.out.println(list.size());
		synchronized (list) {
			if (list.size() < num) {
				System.out.println("【要消费的产品数量】:" + num + "\t【库存量】:" + list.size() + "\t暂时不能执行消费任务!");
				try {
					list.wait(2000);
				}
				catch (InterruptedException exception) {
					exception.printStackTrace();
				}
			}
			for (int i = 0; i < num; i++) {
				list.remove();
			}
			System.out.println("【已经消费产品数】:" + num + "\t【现仓储量为】:" + list.size());
			list.notifyAll();
		}
	
	}

	@Override
	public void product(int num) {
		synchronized (list) {
			if (list.size() + num > MAX_size) {
				System.out.println("【要生产的产品数量】:" + num + "\t【库存量】:" + list.size() + "\t暂时不能执行生成任务!");
				try {
					list.wait(2000);
				}
				catch (InterruptedException exception) {
					exception.printStackTrace();
				}
			}
			for (int i = 0; i < num; i++) {
				list.add(new Object());
			}
			System.out.println("【已经生产产品数】:" + num + "\t【现仓储量为】:" + list.size());
			list.notifyAll();
		}
		
	}

}
