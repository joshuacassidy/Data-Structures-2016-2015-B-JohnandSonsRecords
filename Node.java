public class Node<T extends Comparable<T>>  {

    public Node left, right;
    public DVD data;

    public Node(DVD data) {
        this.data = data;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setData(DVD data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public DVD getData() {
        return data;
    }

    public String getKey() {
        return data.getAuthorName();
    }

}
