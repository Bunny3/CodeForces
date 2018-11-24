import java.util.*;
public class checkPermutation
{
  static String arr[];
  static int index=0;
  public static void main(String args[])
  {
    System.out.println("Enter the string1");
    Scanner p=new Scanner(System.in);
    String st1=p.nextLine();
    char[] s1=st1.toCharArray();
    System.out.println("Enter the string2");
    String st2=p.nextLine();
    char[] s2=st2.toCharArray();
    /*arr=new String[10];
    check_permutation(s1,"");
    for(int i=0;i<arr.length;i++)
    System.out.println(arr[i]);
  }
  public static void check_permutation(String str,String prefix)
  {
    if(str.length()==0)
    {
      arr[index++]=str;
    }
    else{
      for(int i=0;i<str.length();i++){
        String rem=str.substring(0,i)+str.substring(i+1);
        check_permutation(rem,prefix+str.charAt(i));
      }
    }
  }*/
  if(s1.length!=s2.length)
    System.out.println("NOT belonging");
  if(sort(s1).equals(sort(s2)))
      System.out.println("belonging");
      else
      System.out.println("NOT belonging");
}
public static String sort(char[] content)
{
  java.util.Arrays.sort(content);
  return new String(content);
}

}
