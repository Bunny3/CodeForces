class appendCodePoint
{
  public static void main(String args[])
  {
    StringBuffer sbf=new StringBuffer("Hello World");
    System.out.println(sbf);
    sbf.appendCodePoint(65);
    System.out.println(sbf);
  }
}
