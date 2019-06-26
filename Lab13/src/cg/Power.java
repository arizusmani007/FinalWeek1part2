package cg;
public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindP pow=(a,b)->Math.pow(a,b);
		double res=pow.findPow(2,3);
		System.out.println(res);
	}

}
