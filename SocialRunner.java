//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Chanel

import static java.lang.System.*;

public class SocialRunner
{
	public static void main( String args[] )
	{
		Social testOne = new Social("456-56-234");
		Social testtwo = new Social("1-1-1");
		Social testThree = new Social("102-2-12");
		testOne.chopAndAdd();
		testtwo.chopAndAdd();
		testThree.chopAndAdd();
		System.out.println(testOne);
		System.out.println(testtwo);
		System.out.println(testThree);






		
	}
}