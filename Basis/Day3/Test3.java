public class Test3{
	public static void main(String[] args){
		for(int r=10;r>0;)
		{
			int c=r;
			while(c>=0)
			{
				System.out.println(c);
				c-=2;
			}
			r/=c;
		}
	}
}