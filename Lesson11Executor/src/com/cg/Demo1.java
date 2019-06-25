package com.cg;
import java.util.concurrent.*;
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=new MyRunnable();
		Executor executor=Executors.newSingleThreadExecutor();
		executor.execute(r);
		executor.execute(r);
		executor.execute(r);
	}

}
