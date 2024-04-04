//ye linked list ka ques h reverse iterative kese karte h vo h ye ...

public class LL4
{
    Node head;

    class Node
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

    public void reverseIterator()
    {
        if(head==null||head.next==null)
        {
            return;
        }
        Node prevNode=head;
        Node currNode=head.next;
        while(currNode!=null)
        {
            Node nextNode=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=nextNode;
        }
        head.next=null;
        head=prevNode;
    }
    public static void main(String[] args)
    {
        LL4 list=new LL4();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.printList();
        list.reverseIterator();
        list.printList();
    }
}
