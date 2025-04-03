package weekonedaytwo;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 String str = "RADAR" ,revstr = "";
	 int strLength = str.length();// int strlength = 5
	
	 for(int i=(strLength-1); i>=0; --i) { // i=5-1 ==> 4 ; 4>0; 4-1 = 3 loop iterate till 0
		 revstr = revstr + str.charAt(i);
	 }
	if(str.toLowerCase().equals(revstr.toLowerCase())) { 
		System.out.println(str+ "is a palindrome string");
	}
	else
		{System.out.println(str+ "Not a Palindrome string");
	}
	}
}
