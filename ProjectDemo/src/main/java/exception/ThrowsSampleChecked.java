package exception;//checked exception

import java.io.IOException;


public class ThrowsSampleChecked {

	public static void main(String[] args){
		// TODO Auto-generated method stub
	
			try {
				check();
			} 
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();//if we are giving try catch block manually then we can give Sysout(e); as usual also.
			}
		
	}
	
	public static void check() throws IOException
	{
		throw new IOException("Exception occured");
	}

}
