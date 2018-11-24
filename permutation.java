//import java.Strings;
public class permutation
{

  public static void main(String args[])
  {
    String arr[]=new String[10];
    int count=0;
    String str="abc";
    System.out.println("Answer" +str.substring(1));
    permat(str,"",arr,count);

  }
  public static void permat(String str,String prefix,String arr[],int count)
  {
    if(str.length()==0)
    {
      /*System.out.println(prefix);
      System.out.println(count++);*/
    arr[count++]=str;
    System.out.println(arr[count-1]);
    }
    else
    {
      for(int i=0;i<str.length();i++)
      {
        String rem=str.substring(0,i)+str.substring(i+1);
        permat(rem,prefix+str.charAt(i),arr,count++);
      }
    }
  }
}
