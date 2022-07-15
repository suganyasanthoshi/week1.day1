package week2.day2;

public class Palindrome {

	public static void main(String[] args) 
	{
		/* 
		Initialize the string to the temp variable
		reverse the string
		compare the temp string with reversed string
		if both are same ->palindrome
	not a palindrome*/
		
		String str ="MADAM";
		String str1="";
		for(int i =str.length()-1;i>=0;i--)
		{
			str1=str1+str.charAt(i);//""+"M"="M"
		}
		if(str1.equals(str)) {
			System.out.println(str1+" is a palindrome");
		}else
		{
		System.out.println("not a palindrome");	
		}
		}}