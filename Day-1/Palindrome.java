import java.util.*;
class Palindrome {
    public boolean isPalindrome(int x) {
        String a = Integer.toString(x);
        String c = "";
for (int i = a.length() - 1; i >= 0; i--) {
    c += a.charAt(i);
}
if(a.equals(c))
return true;
else 
return false;


    }
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        Palindrome s=new Palindrome();
        System.out.println(s.isPalindrome(x));
        
    }
}