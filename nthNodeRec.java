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
class nthNodeRec
{
 Node head;
 public static void main(String[] args)
 {
   nthNodeRec obj=new nthNodeRec();
   obj.push(1);
   obj.push(4);
   obj.push(1);
   obj.push(12);
      obj.push(1);
   System.out.println("Element at index 3 is "+obj.GetNthNode(3,0,obj.head));
   //System.out.println(obj.head);
   //obj.prinlist();
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
   public int GetNthNode(int pos,int i,Node curr)
   {

     if(curr==null)
       return 0;
      if(i==pos)
        return curr.data;
        else
      return GetNthNode(pos,++i,curr.next);
   }

}
