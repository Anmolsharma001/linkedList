import java.util.*;
public class LL3
{
    public static void main(String[] args)
    {
     LinkedList<String>list=new LinkedList<String>();
     list.addFirst("a");
     list.addFirst("is");
     System.out.println();
     list.addFirst("this");
     list.addLast("list");
        System.out.println(list.size());
        for(int i=0;i<list.size();i++) //isse size pata hongi element ki
        {
            System.out.print(list.get(i)+"->");
        }
        System.out.println("NULL");
        list.removeFirst(); //isse remove ho jayenga element
        System.out.print(list);
    }
}
