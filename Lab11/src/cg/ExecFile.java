package cg;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecFile extends ExecThread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Executor executor=Executors.newSingleThreadExecutor();
		ExecThread ob=new ExecThread();
		Runnable r=ob::run;
		executor.execute(r);
	
		
	}

}
