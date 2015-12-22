package com.meme.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.meme.thread.MainTestThread;

public class SingleThreadExecutorDemo {
	static int POOL_SIZE = 30;
	ExecutorService executor;
	
	public void init() {
//		executor = Executors.newSingleThreadExecutor();
		executor = Executors.newCachedThreadPool();
	}
	
	public void execute(){
		executor.execute(new MainTestThread());
		
	}
}
