package Question10;

public class Palindrome {

	public static void main(String[] args) {
		
		int num=1233521;
		int q=num;
        int rev=0;
        while (num!=0) {
			int rem=num%10;
			rev=(rev*10)+rem;
			num/=10;
		}
        if (rev==q) {
			System.out.println("Palidrome");
		} else {
			System.out.println("Not a Palidrome");
		}
		System.out.println(isPlindromeString("abc"));
	}
	
	public static boolean isPlindromeString(String s)
	{
		String ans="";
		for (int i = s.length()-1; i >=0; i--) {
			ans+=s.charAt(i);
		}
		return ans.equals(s);
	}
}
