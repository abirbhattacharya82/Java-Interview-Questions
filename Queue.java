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
    public Node push(int n, Node front, Node rear)
    {
        Node obj=new Node();
        obj.x=n;
        if(front==null && rear==null)
        {
            front=obj;
            rear=obj;
        }
        else
        {
            rear.next=obj;
            rear=obj;
        }
        return rear;
    }
    public Node pop(Node front, Node rear)
    {
        if(front==null && rear==null)
        {
            System.out.println("Queue is Empty");
        }
        else
        {
            System.out.println(front.x);
            front=front.next;
        }
        return front;
    }
    public void display(Node front)
    {
        while(front!=null)
        {
            System.out.print(front.x+" ");
            front=front.next;
        }
        System.out.println();
    }
}

public class Queue
{
    public static void main(String []a)
    {
        Scanner sc=new Scanner(System.in);
        Node front=null;
        Node rear=null;
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
                rear=obj.push(n,front,rear);
                if(front==null)
                    front=rear;
            }
            else if(ch==2)
            {
                Node obj=new Node();
                front=obj.pop(front,rear);
                if(front==null)
                    rear=null;
            }
            else if(ch==3)
            {
                Node obj=new Node();
                obj.display(front);
            }
        }while(ch!=4);
    }
}