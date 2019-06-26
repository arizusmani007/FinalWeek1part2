package cg;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class TimerExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Executor executor=Executors.newSingleThreadExecutor();
		Runnable r=new TimerRunEx();
		executor.execute(r);
	}

}
