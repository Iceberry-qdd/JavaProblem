public class Test10{
	public static void main(String[] args){
		printNum();
	}
	public static void printNum(){
		String str;
		int num=500;
		str=(num%2==0?"ż��":"����");
		System.out.println("num:"+num+"��"+str);
	}
}