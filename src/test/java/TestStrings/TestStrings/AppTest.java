package TestStrings.TestStrings;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
		public static void main(String args[])
		{
			String str="Siddaganga";
			String reverse="";
			for( int i=str.length()-1;i>=0;i--)
			{
				reverse= reverse+str.charAt(i);
			}
			
			System.out.println(reverse);
		}

}
