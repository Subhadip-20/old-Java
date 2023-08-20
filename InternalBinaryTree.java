import java.util.*;
class Tree1
{
    int data;
    Tree1 left;
    Tree1 right;
    Tree1(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }
}
public class InternalBinaryTree
{
    static Tree1 root = new Tree1(1);
    static void Inorder(Tree1 root)
    {
        if(root == null)
        {
            root =new Tree1(Integer.MIN_VALUE);
            System.out.print(root.data+ " ");
        }
        else{
            Inorder(root.left);
            System.out.print(root.data+" ");
            Inorder(root.right);}
    }

    public static void main(String args[])
    {
        root.left = new Tree1(2);
        root.right = new Tree1(3);
        root.left.left = new Tree1(4);
        Inorder(root);
    }
}