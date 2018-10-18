import java.util.*;
import java.io.*;
class UVa10550
{
  public static void main(String[] args)
  {
    Scanner p=new Scanner(System.in);
    while(p.hasNext())
    {
      String str=p.nextLine();
      String[] result=str.split(" ");
      int a=Integer.parseInt(result[0]);

      int b=Integer.parseInt(result[1]);

      int c=Integer.parseInt(result[2]);

      int d=Integer.parseInt(result[3]);
      if((a==0)&&(b==0)&&(c==0)&&(d==0))
      System.exit(0);
      int totaldegree=1080+((a-b+40)%40+(c-b+40)%40+(c-d+40)%40)*9;
      System.out.println(totaldegree);
    }
  }
}
