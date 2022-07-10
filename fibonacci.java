package week1.day1;

public class fibonacci {

	public static void main(String[] args) {
		int a=0,b=1,sum=0;
		System.out.println(a);
		for(int i=1;i<=10;i++)
		{
			sum=a+b;
			a=b;
			b=sum;	
			if(b==1)
				System.out.println(b);
			System.out.println(sum);
				
		}
			}

}
