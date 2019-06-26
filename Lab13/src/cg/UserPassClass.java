package cg;

public class UserPassClass {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String user="ariz";
		String pass="usmani";		
		UserPass up=(a,b)->{if(a.equals(user)&&b.equals(pass))
		{System.out.println("User verified "+true);
		}else
		{	System.out.println("User not verified "+false);
		}};
		up.check("ariz", "usmani");
	}

}
