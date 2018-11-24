import java.util.*;
import java.io.*;
class arrayli
{
  public static void main(String args[])
{
  int n=5;
  ArrayList<Integer> arrali=new ArrayList<Integer>(n);
  for(int i=1;i<=n;i++)
    arrali.add(i);
    System.out.println(arrali);
    arrali.remove(3);
    System.out.println(arrali);
    for(int i=0;i<arrali.size();i++)
    {
      System.out.println((arrali.get(i)).getClass()+" ");
    }
}
}
