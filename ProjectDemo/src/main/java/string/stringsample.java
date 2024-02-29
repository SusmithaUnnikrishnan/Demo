package string;

public class stringsample {

	public static void main(String[] args) {
		
		String str="HelloWorld";
		String str2="Welcome";
		String str3=new String("Hai");//using new keyword
		
		System.out.println(str3);
	
		System.out.println(str.equals(str2));//to find if two strings are equal
		
		int l=str.length();
		System.out.println(l);// TO FIND LENGTH of a string
		
		System.out.println(str+str2);
		
		System.out.println(str.contains("o"));//To search a character inside string
		
		System.out.println(str.charAt(5));// To TAKE A VALUE from a string
		
		System.out.println(str.replace('H', 'K'));// TO REPLACE
		
		System.out.println(str.substring(0, 4)); //to trim
		
		System.out.println(str.toLowerCase());//to change every letter into lower case
		
		System.out.println(str.toUpperCase());//to change every letter into upper case 
		
		String arr[]=str.split("e");// to split(to skip the letter)
		for(String i:arr)
		{
			System.out.print(i);	
		}
		
	}	
}
		
		



