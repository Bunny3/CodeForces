public class hashex
{
  static int has[][]=new int[1000][2];
  public static void main(String args[])
  {
    int a[]={-1,9,-5,-8,-5,-2};
    insert(a,a.length);
    int x=9;
    if(search(x)==true)
      System.out.println("Present");
    else
    System.out.println("Not present");
    /*Runtime.getRuntime().addShutdownHook(new Thread()
    public void run()
    {
      System.out.println("running shutdownHook");
    });*/
    for(int i=0;i<a.length;i++)
    System.out.println(a[i]);
    for(int i=0;i<50;i++)
    {
      for(int j=0;j<2;j++)
      {
        System.out.println(has[i][j]+"\t");

      }
      System.out.println();
    }
  }
  public static void insert(int a[],int n)
  {
     for(int i=0;i< n;i++)
     {
       if(a[i]>=0)
        has[a[i]][0]=1;
        else
        has[(-1*a[i])][1]=1;
     }
  }
  public static boolean search(int x)
  {
    if(x>=0)
    {
      if(has[x][0]==1)
        return true;
      else
       return false;
    }
    x=-1*x;
    if(has[x][1]==1)
      return true;
      return false;
  }
}
