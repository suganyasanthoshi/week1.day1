package week1.day1;

public class Isprime {

	public static void main(String[] args) {
	int n=14;
	for(int i=2;i<=n;i++)
	{
		n=n-1;
		System.out.println(n+" ");
	if(n%2==0)
	{
		System.out.println("Prime");}
	else {
		System.out.println("non-prime");
	}
	}
	}
}
