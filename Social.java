//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  - 

import static java.lang.System.*;

public class Social
{
   private String socialNum;
   private int sum;

	public Social()
	{
		socialNum = "000-00-0000";
	}

	public Social(String soc)
	{
		socialNum = soc;
	}


	public void setWord(String w)
	{
		socialNum = w;
	}

	public void chopAndAdd()
	{
		String sub = socialNum;
		sum = Integer.parseInt(sub.substring(0, sub.indexOf("-"))) + Integer.parseInt(sub.substring(sub.indexOf("-") + 1, sub.lastIndexOf("-") )) + Integer.parseInt(sub.substring(sub.lastIndexOf("-") + 1 ));
		
	}

	public String toString()
	{
		return "SS# " + socialNum + " has a total of " + sum + "\n";
	}
}