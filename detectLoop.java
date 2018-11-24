class detectLoop
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
  detectLoop llist=new detectLoop();

        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);

        /*Create loop for testing */
        //llist.head.next.next.next.next = llist.head;

      System.out.println(llist.findLoop());
}
public void push(int x)
{
  Node new_data=new Node(x);
  new_data.next=head;
  head=new_data;
}
int findLoop()
{
  Node slow=head;
  Node fast=head;
  while(slow!=null && fast!=null && fast.next!=null)
  {
    slow=slow.next;
    fast=fast.next.next;
    if(slow==fast){
      System.out.println("Found Loop");
      return 1;
    }
  }
  return 0;
}
}
