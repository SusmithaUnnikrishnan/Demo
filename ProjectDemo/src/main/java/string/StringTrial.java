package string;

public class StringTrial {

	public static void main(String[] args) {
		
		String str="Hai,World,i,am,here";
		String str2="World";
		String str3=new String("Hello");
		
		System.out.println(str3);
		
		System.out.println(str.equals(str2));
		
		int i=str.length();
		System.out.println(i);
		
		System.out.println(str.concat(str2));
		
		System.out.println(str.contains("a"));
		
		System.out.println(str.charAt(2));
		
		System.out.println(str.replace('H', 'K'));
		
		System.out.println(str.substring(0, 3));
		
		System.out.println(str.toLowerCase());
		
		System.out.println(str.toUpperCase());
		
		String arr[]=str.split(",");
		for(String j:arr)
		{
		System.out.println(j);

	}
		

}
}
