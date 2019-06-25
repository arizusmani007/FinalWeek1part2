package com.cg;
import java.util.concurrent.*;
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=()->System.out.println("th1 Service pattern Run method executed by "+Thread.currentThread().getName());
		Runnable r1=()->System.out.println("th2 Service pattern Run method executed by "+Thread.currentThread().getName());
		Runnable r2=()->System.out.println("th3 Service pattern Run method executed by "+Thread.currentThread().getName());

		//ExecutorService executor=Executors.newSingleThreadExecutor();
		ExecutorService executor=Executors.newFixedThreadPool(8);

		executor.execute(r);
		executor.execute(r1);
		executor.execute(r2);
		executor.shutdown();
	}

}
