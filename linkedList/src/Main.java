public class Main
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

    public static void main(String[] args) {
        Node a=new Node(5);
        System.out.println(a.data);
    }
}