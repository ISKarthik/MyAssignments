package weekonedaytwo;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a = 0;
	int b = 1;
	int c;
	int n=8;
	System.out.println(a);  //this will print 0
	System.out.println(b);  //this will print 1
	for(int i = 0; i <= n; ++i)
	{
		c = a + b; // c = 0 + 1 => C = 1
		System.out.println(c);
		a = b;
		b = c;//0,1,1,2,3,5,8,13
	}	
	}
	}
