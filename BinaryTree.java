import java.util.*;
class Node
{
    int n;
    Node leftChild;
    Node rightChild;
    public Node push(int x, Node root)
    {
        Node i=null;
        Node actualRoot=root;
        Node obj=new Node();
        if(root==null)
        {
            obj.n=x;
            actualRoot=obj;
        }
        else
        {
            while(root!=null)
            {
                i=root;
                if(root.n>x)
                {
                    root=root.leftChild;
                }
                else if(root.n<x)
                {
                    root=root.rightChild;
                }
            }
            if(i.n>x)
            {
                obj.n=x;
                i.leftChild=obj;
            }
            else
            {
                obj.n=x;
                i.rightChild=obj;
            }
        }
        return actualRoot;
    }
    void preOrderDisplay(Node i)
    {
        if(i==null)
        {
            return;
        }
        System.out.println(i.n);
        preOrderDisplay(i.leftChild);
        preOrderDisplay(i.rightChild);
    }
}
public class BinaryTree
{
    public static void main(String []args)
    {
        int choice=0;
        Node root=null;
        Node obj=new Node();
        Scanner sc=new Scanner(System.in);
        do
        {
            System.out.println("Enter 1 to enter data in the Tree\nEnter 2 to Exit the Tree");
            choice=sc.nextInt();
            if(choice==1)
            {
                System.out.println("Enter data to be inserted");
                int n=sc.nextInt();
                root=obj.push(n, root);
            }
        }while(choice!=2);
        obj.preOrderDisplay(root);
    }
}