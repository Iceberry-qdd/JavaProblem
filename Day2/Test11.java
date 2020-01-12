public class Test11{
	public static void main(String[] args){
		
		add();
		sub();
		mul();
		div();
		remain();
	}
	public static void add(){
		int x=100;
		int y=50;
		int z=x+y;
		System.out.println("x,y的和为："+z);
	}
	public static void sub(){
		int x=100;
		int y=50;
		int z=x-y;
		System.out.println("x,y的差为："+z);
	}
	public static void mul(){
		int x=100;
		int y=50;
		int z=x*y;
		System.out.println("x,y的积为："+z);
	}
	public static void div(){
		int x=100;
		int y=50;
		int z=x/y;
		System.out.println("x,y的商为："+z);
	}
	public static void remain(){
		int x=100;
		int y=50;
		int z=x%y;
		System.out.println("x,y的余数为："+z);
	}
	
}