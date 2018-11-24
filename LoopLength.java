class LoopLength
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
  LoopLength llist=new LoopLength();

        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(10);

        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head;

      System.out.println(llist.findLoop());
}
public void push(int x)
{
  Node new_data=new Node(x);
  new_data.next=head;
  head=new_data;
}
int countCal(Node x)
{
  Node temp=x;
  int count=1;
  while(temp.next!=x)
  {
    count++;
    temp=temp.next;
  }
  return count;
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
      return countCal(slow);
    }
  }
  return 0;
}
}
