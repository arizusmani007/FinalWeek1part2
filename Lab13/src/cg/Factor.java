package cg;

interface FindF
{
public void findFact(int num);
}
public class Factor{
public static void findFact(int num)
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindF f=Factor::findFact;
		f.findFact(5);
	}

}
