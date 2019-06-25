package com.cg;
import java.util.*;
import java.util.concurrent.*;
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShareMarket sm=new ShareMarket();
		ExecutorService executor=Executors.newFixedThreadPool(10);
		List<Future<Double>> reslist=new ArrayList<>();
		
		for(int i=1;i<=5;i++)
		{
			Future<Double> f=executor.submit(sm);
			reslist.add(f);
		}
		try {
			executor.awaitTermination(2, TimeUnit.SECONDS);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		executor.shutdown();
		double price=0.0;
		for(Future<Double> f:reslist)
		{
			try {
				price=f.get();
			}catch(InterruptedException|ExecutionException e)
			{
				e.printStackTrace();
			}
			System.out.println("Price "+price);
		}
	}

}
