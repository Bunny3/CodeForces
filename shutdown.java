public class shutdown
{
  public static void main(String ars[])
  {
    Runtime.getRuntime().addShutdownHook(new Thread()
    {
      public void run()
      {
        //System.exit(0);
        System.out.println("ShutdownHookRunning");

      }
    });
    System.out.println("Application running");
  }
}
