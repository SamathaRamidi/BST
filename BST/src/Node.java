
public class Node {
	Node left, right;
    int data;

    public Node()
    {
        left = null;
        right = null;
        data = 0;
    }
    /* Constructor */
    public Node(int n)
    {
        left = null;
        right = null;
        data = n;
    }
    public void setLeft(Node n)
    {
        left = n;
    }
    public void setRight(Node n)
    {
        right = n;
    }
    public Node getLeft()
    {
        return left;
    }
    public Node getRight()
    {
        return right;
    }
    public void setData(int d)
    {
        data = d;
    }
    public int getData()
    {
        return data;
    }     

}
