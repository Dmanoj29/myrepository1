class program1
{
	public static void main(String[] args) {
	
		for(int i=1;i<=5;i++)
		{
			if(i%2!=0)
			{
				for(int j=1;j<=i;j++)
						{
							System.out.print(j);
							if(i!=j)
								System.out.print(" # ");
						}
						System.out.println();
			}
			else
			{
				for(int j=i;j>=1;j--)
						{
							System.out.print(j);
							if ( j!=1) 
						{
							System.out.print(" # ");
						}
						}

								
						System.out.println();
			}
		}
	}
}