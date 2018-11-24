import java.util.*;
public class palindromePerm
{
  public static void main(String args[])
  {
    Scanner p=new Scanner(System.in);
    System.out.println("Enter string 1");
    String str1=p.nextLine();
    System.out.println("Enter string 2");
    String str2=p.nextLine();
    if(isPermutation(str1,str2)==true && isPalindrome(str2)==true)
      System.out.println("Entered String is Permatutaion Palindrome");
    else
      System.out.println("NOt satisfied"+isPermutation(str1,str2)+"\t"+isPalindrome(str2));
  }
  public static boolean isPermutation(String str1,String str2)
  {
    if(str1.length()!=str2.length())
      return false;
    if(sort(str1).equals(sort(str2)))
      return true;
    else
      return false;
  }
  public static String sort(String str)
  {
    char[] content=str.toCharArray();
    Arrays.sort(content);
    return new String(content);
  }
  public static boolean isPalindrome(String str)
  {
    char[] content=str.toCharArray();
    int count=0;
    for(int i=0,j=str.length()-1;i<str.length()/2;i++,j--)
    {
      //System.out.println(content[i]+"\t"+content[j]);
      count++;
      if(content[i]!=content[j])
        {
          //System.out.println(count);
          return false;
        }
    }
    return true;
  }
}
