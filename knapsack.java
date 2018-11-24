import java.util.*;
public class knapsack
{
  public static void main(String args[])
  {
    Scanner p=new Scanner(System.in);
    System.out.println("Enter number of item");
    int n=p.nextInt();
    System.out.println("Enter the item weight");
    int i;
    int weight[]=new int[n+1];
    for(i=1;i<n;i++)
    {
      weight[i]=p.nextInt();
    }
    System.out.println("Enter the values of item");
    int values[]=new int[n+1];
    for(i=1;i<n;i++)
    {
      values[i]=p.nextInt();
    }
    System.out.println("Enter the maximum capacity");
    int max=p.nextInt();
    knapsackAlgo(n,weight,values,max);
  }
  public static void knapsackAlgo(int n,int weight[],int values[],int max)
  {
      int dp[][]=new int[n+1][max+1];
      int i,j;
      for(i=0;i<=n;i++)
      {
        dp[i][0]=0;
      }
      for(i=0;i<=max;i++)
      {
        dp[0][i]=0;
      }
      for(i=1;i<=n;i++)
      {
        for(j=0;j<=max;j++)
        {
          dp[i][j]=dp[i-1][j];
          if(j-weight[i]>=0)
          {
            dp[i][j]=(dp[i][j]>dp[i-1][j-weight[i]]+values[i])?dp[i][j]:dp[i-1][j-weight[i]]+values[i];
          }
        }
      }
      System.out.println(dp[n][max]);
  }
}
