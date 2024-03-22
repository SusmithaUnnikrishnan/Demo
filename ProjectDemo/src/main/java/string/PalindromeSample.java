package string;

public class PalindromeSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PalindromeSample obj=new PalindromeSample();
		obj.palindrome("Illa");

	}
	
	public void palindrome(String str)
	{
		StringBuilder str1=new StringBuilder(str);
		String reverse=str1.reverse().toString();
		boolean flag=reverse.equalsIgnoreCase(str);
		if(flag)
		{
			System.out.println("P");
		}
		else
		{
			System.out.println("NP");
		}
		
	}

}
