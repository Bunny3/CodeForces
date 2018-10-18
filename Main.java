import java.util.*;
class Main
{
public static void main(String args[])
{
  Scanner p=new Scanner(System.in);
  int flag=0;
  String result;
  char ch;
  String str;
  while(p.hasNextLine())
  {
    result="";
      str=p.nextLine();
      for(int  i=0;i<str.length();i++)
      {
        ch=str.charAt(i);
        if(ch=='"')
        {
          flag++;
          if(flag%2==1)
          result=result+"``";
          if(flag%2==0)
          result=result+"''";
        }
      else
      {
        result=result+ch;
      }
    }
    System.out.println(result);
  }
}
}
