public interface ITree {

    public void insert(DVD data);
    public Node insert(Node node, DVD data);
    public void search(DVD data);
    public Node search(Node node, DVD data);
    public void inorderTraversal();
    public void inorderTraversal(Node node);
    public boolean isEmpty();
    public void delete(DVD data);
    public Node delete(Node node, DVD data);



}
