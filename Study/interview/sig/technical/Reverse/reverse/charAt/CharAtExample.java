public class CharAtExample
{
	public static void main(String args[])
	{
		String str = "Welcome to string handling tutorial";

		char ch1 = str.charAt(0);
		char ch2 = str.charAt(5);
		char ch3 = str.charAt(11);
		char ch4 = str.charAt(20);


		System.out.println("Charactor at 0 index is: "+ch1);	
		System.out.println("Charactor at 5th index is: "+ch2);	
		System.out.println("Charactor at 11th index is: "+ch3);	
		System.out.println("Charactor at 20th index is: "+ch4);	
	}
}
