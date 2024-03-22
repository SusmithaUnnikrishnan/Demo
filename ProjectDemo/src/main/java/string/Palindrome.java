package string;

public class Palindrome {

	public static void main(String[] args) {
		Palindrome obj=new Palindrome();
		obj.palindrome("mom");
		obj.palindrome("java");
	}
	
	public void palindrome(String str)//reverse is not applicable for string,, so a method to assign reverse to stringbuilder is created
	{
	StringBuilder str1=new StringBuilder(str);
	String reverse=str1.reverse().toString();//toString is used to convert stringBuilder to string
	boolean flag=reverse.equalsIgnoreCase(str);//equalsIgnoreCase is used to neglect the uppercase/lowercase issues
	if(flag)
	{
		System.out.println("Palindrome");
	}
	else
	{
		System.out.println("Non Palindrome");
	}
	}
}
