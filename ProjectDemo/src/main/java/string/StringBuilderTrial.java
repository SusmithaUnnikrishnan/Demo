package string;

public class StringBuilderTrial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer S=new StringBuffer("mem");
		StringBuffer S1=new StringBuffer("joj");
		
		System.out.println(S.deleteCharAt(2));
		
		System.out.println(S1.delete(0, 2));
		
		System.out.println(S.insert(0, 'S'));
		
		System.out.println(S.reverse());

	}

}
