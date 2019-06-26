package cg;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ExecThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			FileReader fr = new FileReader("D:\\source.txt");
			BufferedReader br=new BufferedReader(fr);
			FileWriter fw=new FileWriter("D:\\target.txt",true);
			int st;
			int c=0;
				while((st=br.read())!=-1)
			{	
				if(c==10)
				{
					System.out.println("10 character copied");
					c=0;
					TimeUnit.SECONDS.sleep(5);
				}
				fw.write(st);
				c++;
				fw.flush();
			}
			br.close();
			fw.close();
		}catch(IOException e)
		{
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
