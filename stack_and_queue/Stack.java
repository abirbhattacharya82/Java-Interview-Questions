import java.util.*;
class Node
{
    int x;
    Node next;
    Node()
    {
        x=0;
        next=null;
    }
    public Node push(int n, Node top)
    {
        Node obj=new Node();
        obj.x=n;
        obj.next=null;
        if(top==null)
        {
            top=obj;
        }
        else
        {
            obj.next=top;
            top=obj;
        }
        return top;
    }
    public Node pop(Node top)
    {
        if(top==null)
            System.out.println("Stack is Empty");
        else
        {
            System.out.println(top.x);
            top=top.next;
        }
        return top;
    }
    public void display(Node top)
    {
        while(top!=null)
        {
            System.out.print(top.x+" ");
            top=top.next;
        }
        System.out.println();
    }
}

public class Stack
{
    public static void main(String []a)
    {
        Scanner sc=new Scanner(System.in);
        Node top=null;
        int ch=0;
        do
        {
            System.out.println("Menu\n1: Push\n2: Pop\n3: Display\n4: Exit");
            ch=sc.nextInt();
            if(ch==1)
            {
                System.out.println("Enter the data");
                int n=sc.nextInt();
                Node obj=new Node();
                top=obj.push(n,top);
            }
            else if(ch==2)
            {
                Node obj=new Node();
                top=obj.pop(top);
            }
            else if(ch==3)
            {
                Node obj=new Node();
                obj.display(top);
            }
        }while(ch!=4);
    }
}