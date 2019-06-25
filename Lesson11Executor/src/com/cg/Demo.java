package com.cg;
import java.util.concurrent.*;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=()->System.out.println("Run method executed by "+Thread.currentThread().getName());
		Executor executor=Executors.newSingleThreadExecutor();
		
		executor.execute(r);
		executor.execute(r);
		executor.execute(r);
	}

}
