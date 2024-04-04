//ye linked list ka ques h bhut bada h but isme sabhi to list me first
//last kese karte h ye sab batayaa h ismee....
public class LL1
{
    Node head;
    class Node  //node naam ki class bana lengeee
    {
        String data;
        Node next;
        Node(String data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null)
        {
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void printList()
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null)
        {
            System.out.print(currNode.data+"->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args)
    {
       LL1 lis=new LL1();
       lis.addFirst("a");
       lis.addFirst("is");
       lis.printList();
       lis.addLast("list");
       lis.addFirst("this");
       lis.printList();
    }
}