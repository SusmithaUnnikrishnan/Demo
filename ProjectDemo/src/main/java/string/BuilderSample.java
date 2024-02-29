package string;

public class BuilderSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder str=new StringBuilder("HelloWorld");
		StringBuilder str2=new StringBuilder("Hai");
		
		System.out.println(str.length());//to find length
		
		System.out.println(str.append(str2));//to combine
		
		System.out.println(str.equals(str2));//to check if they are equal
		
		
		System.out.println(str.deleteCharAt(1));//to delete a single character
		System.out.println(str.delete(1, 3));//to delete a set of characters
		
		System.out.println(str.insert(0, 'a'));//to insert a character at required position
		
		System.out.println(str.reverse());//to reverse
	}

}
