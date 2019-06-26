package cg;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TimerExSer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService executor=Executors.newSingleThreadExecutor();
		Runnable r=new TimerRunEx();
		executor.execute(r);
		executor.shutdown();
	}

}
