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
public class Tree
{
    static Tree1 root = new Tree1(1);
    static int Height(Tree1 root)
    {
        if(root == null)
        return 0;
        int left = Height(root.left);
        int right = Height(root.right);
        return Math.max(left,right)+1;
    }

    public static void main(String args[])
    {
        /*root.left = new Tree1(2);
        root.right = new Tree1(3);
        root.left.left = new Tree1(4);*/
        int height = Height(root);
        System.out.println("The height of the tree is "+ height);
    }
}