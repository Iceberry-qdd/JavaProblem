public class Test7{
	public static void main(String[] args){
		int a,b;
		a=b=20;
		boolean bo;
		bo=((++a%3==0&&a++%7==0)?true:false);
		System.out.println("bo的值："+bo);
		System.out.println("a的值："+a);
	}
}