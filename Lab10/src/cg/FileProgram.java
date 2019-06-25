package cg;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class FileProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyDataThread r=new CopyDataThread();
		Thread t1=new Thread(r);
		t1.start();
		
	}

}
