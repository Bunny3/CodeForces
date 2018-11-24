class printLoop
{
  Node head;
  static class Node{
    Node next;
    int data;
    Node(int d)
    {
      data=d;
      next=null;
    }
  }
  public static void main(String[] args)
{
  printLoop llist=new printLoop();

        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);

        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head;
        llist.prinlist();

      //System.out.println(llist.findLoop());
}
public void push(int x)
{
  Node new_data=new Node(x);
  new_data.next=head;
  head=new_data;
}
public void prinlist()
{
  Node n=head;
  while(n!= null)
  {
    System.out.println(n.data+"   ");
    n=n.next;
  }
}
}
