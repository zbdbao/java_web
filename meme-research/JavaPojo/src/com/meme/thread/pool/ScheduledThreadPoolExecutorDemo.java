package com.meme.thread.pool;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import com.meme.thread.MainTestThread;

public class ScheduledThreadPoolExecutorDemo {
	
	static int POOL_SIZE = 30;
	ScheduledThreadPoolExecutor timer;
	
	public void init() {
		timer = new ScheduledThreadPoolExecutor(POOL_SIZE);
			 
	}
	
	public void execute(){
//		First number, delay on start.
//		Second number, the rate of start
		timer.scheduleAtFixedRate(new MainTestThread(), 5, 30, TimeUnit.SECONDS); //Second

	}
}


