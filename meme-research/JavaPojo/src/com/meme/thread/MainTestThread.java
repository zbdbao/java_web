package com.meme.thread;

import java.util.Date;

public class MainTestThread implements Runnable {

	@Override
	public void run() {
		System.out.println(new Date()+"MainTestThread.run(), invoked.");
	}

}
