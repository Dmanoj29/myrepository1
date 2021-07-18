class program2
{
	public static void main(String[] args) {
		for(int i=1;i<5;i++)
		{
			if(i%2==0)
			{
				for(int j=1;j<i;j++)
						{
							System.out.print(j);
						}
						System.out.println();
			}
			else
			{
				for(int j=i-1;j>=1;j--)
						{
							System.out.print(j);
						}
						System.out.println();
			}}


			for(int m=4;m>1;m--)
		   {
			if(m%2==0)
			{
				for(int n=m;n>=1;n--)
						{if(m!=4||n!=1)
							System.out.print(n);
						}
						System.out.println();
			}
			else
			{
				for(int n=1;n<=m;n++)
						{
							System.out.print(n);
						}
						System.out.println();
			}
		
		}
	}
}