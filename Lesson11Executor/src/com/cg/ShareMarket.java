package com.cg;
import java.util.concurrent.*;
public class ShareMarket implements Callable<Double>{

	@Override
	public Double call() throws Exception {
		// TODO Auto-generated method stub
		double price=Math.random()*1000.00;
		return price;
	}
	

}
