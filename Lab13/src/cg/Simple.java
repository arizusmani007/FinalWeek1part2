package cg;
interface Instance{
	public void print();
}
public class Simple {
int num;
	public Simple() {
		// TODO Auto-generated constructor stub
	this.num=num;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "Simple [num=" + num + "]";
	}
	public static void print()
	{
		System.out.println("Hello");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Instance ob=Simple::print;
	ob.print();
	}

}
