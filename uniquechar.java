 import java.util.*;
 public class uniquechar
 {

   public static void main(String args[])
   {
     Scanner p=new Scanner(System.in);
     String str=p.nextLine();
    /*//Method 1 using HashMap
     HashMap<Character,Integer> dictionary=new HashMap<Character,Integer>();
     char[] chr=str.toCharArray();
     for(char ch:chr)
     {
      //char ch=str.charAt(i);
       if(dictionary.containsKey(ch))
       {
         Integer val=dictionary.get(ch);
         dictionary.put(ch,val+1);
       }
       else
       dictionary.put(ch,1);
     }
     for(Map.Entry entry:dictionary.entrySet())
       System.out.println(entry.getKey()+"\t"+entry.getValue());
     int flag=0;
     for(char key: dictionary.keySet())
     {
       Integer val=dictionary.get(key);
        if(val>1)
        {
          flag=1;
          break;
        }
     }
     if(flag==0)
     System.out.println("Unique string");
     else
     System.out.println("Not unique");*/
     //Method2
     if(isUnique(str))
     System.out.println("Unique string");
     else
     System.out.println("Not unique");
   }
   /*public static boolean isUnique(String str)
   {
     if(str.length()>128)
      return false;
      boolean[] char_set=new boolean[128];
      for(int i=0;i<str.length();i++)
      {
        int val=str.charAt(i);
        if(char_set[val])
        return false;
        char_set[val]=true;
      }
      return true;
   }*/
   //Method3
   public static boolean isUnique(String str)
   {
     int checher=0;
     for(int i=0;i<str.length();i++)
     {
       int val=str.charAt(i)-'a';
       if((checher & (1<<val))>0)
       {
         return false;
       }
       checher |=(1<<val);
     }
     return true;
   }
 }
