package com.meme.thread.test;

public class KeywordVolatileTest{
	static final WorkClass wc = new WorkClass();
	
	public static void main(String[] args){
		
		new Thread(){
			@Override
			public void run() {
				while(true){
					wc.work();
				}
			}
		}.start();
		new Thread(){
			@Override
			public void run() {
				while(true){
					wc.print();
				}
			}
		}.start();
		
	}


	
}

class WorkClass{
	volatile static int i=0, j=0;
	
	public void work(){
		i++;
		j++;
	}
	
	public void print(){
		System.out.println("value i="+i +", j="+j);
	}
}