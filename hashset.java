import java.util.HashSet;
import java.util.Set;
import java.util.*;

class hashset
{
  public static void main(String args[])
  {
    Set set=new HashSet();
    set.add(1);
    set.add(2);
    set.add(1);
    int a[]={3,4,5,6};
    set.add(a[0]);
    Iterator i=set.iterator();
    while(i.hasNext())
    {
      System.out.println(i.next());
    }
  }
}
