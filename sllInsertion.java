class sllInsertion
{
  Node head;
  static class Node
  {
    int data;
    Node next;
    Node(int d)
    {
      data=d;
      next=null;
    }
  }
  public static void main(String[] args)
  {
    sllInsertion obj=new sllInsertion();
    obj.head=new Node(1);
    Node second=new Node(2);
    Node third=new Node(3);
    obj.head.next=second;
    second.next=third;
    obj.prinlist();
    System.out.println("Want to Insert ");
    Node x=new Node(25);
    x.next=obj.head;
    obj.head=x;
    obj.prinlist();
    System.out.println("Enter at the end");
    Node y=new Node(30);
    Node n=obj.head;
    while(n.next!=null)
    {
      n=n.next;
    }
    n.next=y;
    obj.prinlist();
    System.out.println("Enter the node at a particular position");

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
