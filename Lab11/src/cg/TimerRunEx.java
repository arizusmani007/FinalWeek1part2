package cg;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

   public class TimerRunEx implements Runnable{
	@Override
    public void run() {
    for(int i=1;i<=10;i++)
    {
    	System.out.println(i);
    	try {
    		TimeUnit.SECONDS.sleep(1);
    	}catch(InterruptedException e) {
    		e.printStackTrace();
    	};
    
	if(i==10)
	{
		i=0;
		System.out.println("Timer out");
	}
    }

     
	} 

}

