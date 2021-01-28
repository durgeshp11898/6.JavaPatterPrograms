class TwoC
{

	public static void main(String args[])
	{
		int num=121239221;
		int b=0,a=0;
		
		 while(num!=0)
                 {
                        a=num%10;
                        if(a==2)
                        {
                                System.out.print(a);
			}
			num=num/10;
		 }
	}
}
