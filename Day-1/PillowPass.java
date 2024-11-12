import java.util.*;
class PillowPass{
    public int passThePillow(int n, int time) {
         int completeRounds = time / (n - 1);
      
        // Compute the remaining time after the complete rounds
        int remainingTime = time % (n - 1);
    if ((completeRounds & 1) == 1) {
            return n - remainingTime;
        } 
        else {
            // If the number of complete rounds is even, the final position will be counted forward
            // The '+1' is required to adjust the position to a 1-indexed based
            return remainingTime + 1;
        }
    }
    public static void main(String a[])
    {
        Scanner sc=new Scanner(System.in);
        // number of friends
        int n= sc.nextInt(), pass=0;
        //time
        int t=sc.nextInt();
        PillowPass s=new PillowPass();
        pass=s.passThePillow(n,t);
        System.out.println(pass);
        
    }
}