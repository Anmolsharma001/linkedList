class LL
{
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
        }
    }
    public static void main(String[]args)
    {
        Node a=new Node(4);
        Node b=new Node(7);
        Node c=new Node(17);
        Node d=new Node(21);
        Node e=new Node(43);
        System.out.println(a.data);
        System.out.println(b.data);
        System.out.println(c.data);
        System.out.println(d.data);
        System.out.println(e.data);
    }
}