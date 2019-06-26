package cg;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class TimerRun  {

    Timer timer;
	public TimerRun(int seconds) {
		// TODO Auto-generated constructor stub
		timer=new Timer();
    	timer.schedule(new RemindTask(),seconds);
    }
    class RemindTask extends TimerTask{
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
    }
	System.out.println("10 seconds done");
	timer.cancel();
	new TimerRun(10);
	}
    }

     
    public static void main(String args[]){
        new TimerRun(10);
        System.out.println("Timer scheduled");
    }

}

