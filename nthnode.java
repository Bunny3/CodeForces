 class Node
 {
   int data;
   Node next;
   Node(int d)
  {
    data=d;
    next=null;
  }
}
class nthnode
{
  Node head;
  public static void main(String[] args)
  {
    nthnode obj=new nthnode();
    obj.push(1);
    obj.push(4);
    obj.push(1);
    obj.push(12);
       obj.push(1);
    System.out.println("Element at index 3 is "+obj.GetNthNode(3));
    obj.prinlist();
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
    public void push(int new_data)
    {
        Node new_Node = new Node(new_data);
        new_Node.next = head;
        head = new_Node;
    }
    public int GetNthNode(int pos)
    {
      Node curr=head;
      int i;
      for(i=0;i<pos && curr!=null;i++)
      {
        curr=curr.next;
      }
      if(curr != null)
      {System.out.println(curr.data);
      return curr.data;
    }
      else
      return 0;
    }

}
