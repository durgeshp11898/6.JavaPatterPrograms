class Pattern100
{
	public static void main(String args[])
	{
		int i=0,j=0,num=100;

		for(i=1;i<=3;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(num+"  ");
				num=num+100;

			}
		System.out.println();
		}
	}
}
