package week2.day2;

public class ReverseString {

	public static void main(String[] args) {
		String str="My name is Khan";
		String words[]=str.split("\\s");
		String reverseWord="";
		for(String w:words)
		{
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			reverseWord+=sb.toString()+"";
		}

		System.out.println(reverseWord);
	}	  
}