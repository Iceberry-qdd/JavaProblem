public class Test5{
	public static void main(String[] args){
		int jj=20,a=0,b=0;
		for(int ii=0;ii<jj;ii+=2,jj--)
		{
			if(ii%3==0)
			{
				a=ii;
				System.out.println(ii+"Hello");
			}
			else
			{
				b=ii;
				System.out.println(ii+"Hello");
			}
		}
		System.out.println("a*bµÄÖµ£º"+a+"*"+b+"="+(a*b));
	}
}