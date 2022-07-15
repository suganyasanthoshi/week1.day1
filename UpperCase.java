package week2.day2;
/*
Pseudo Code

* Declare String Input as Follow
 
* String test = "excuseme";

* a) Convert the String to character array

* b) Traverse through each character (using loop)

* c)find the odd index within the loop (use mod operator)

* d)within the loop, change the character to uppercase, if the index is odd else don't change
 
*/
public class UpperCase {

	public static void main(String[] args) {
		String st="excuseme";
		char[] ch=st.toCharArray();
		for(int i=0;i<=ch.length-1;i++)
		{
			if(i%2!=0)
			{
				char c=Character.toUpperCase(ch[i]);
				System.out.println(c);
			}	
		}
		
	}
}
