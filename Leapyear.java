class Leapyear
{
	public static void main(String[] args)
	{
		int y=2400;
		if(y%4==0 && y%100!=0)
		{
			System.out.println("its a leapyear");
		}
		else if(y%400==0)
		{
			System.out.println("its a leapyear");
		}
		else
			{
				System.out.println("not a leapyear");
			}
	}
}