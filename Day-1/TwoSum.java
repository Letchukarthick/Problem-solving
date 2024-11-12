// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.* ;
class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] a=new int[2];
        for(int i=0;i<nums.length-1;i++)
{
    for(int j = i+1;j<nums.length;j++)
        {
          if(nums[i]+nums[j]==target)
          {
         a[0]=i;
         a[1]=j;
          }
        }
}
    return a;
    }
    
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int target=sc.nextInt();
int[] a = new int[n];
int[] b = new int[2];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
TwoSum s= new TwoSum();
b=s.twoSum(a,target);
System.out.println(b[0]+""+b[1]);
}
}