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
class middleNode
{
 Node head;
 public static void main(String[] args)
 {
   middleNode obj=new middleNode();
   obj.push(1);
   obj.push(4);
   obj.push(19);
   obj.push(12);
   obj.push(1);
   obj.push(20);
   //System.out.println("Element at index 3 is "+obj.GetNthNode(3));
   obj.middle();
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
   public void middle()
   {
     Node slow=head;
     Node fast=head;
     if(head!=null)
     {
       while(fast!=null && fast.next!=null)
       {
         fast=fast.next.next;
         slow=slow.next;
       }
       System.out.println("The middle Element"+slow.data);
     }
   }
 }
