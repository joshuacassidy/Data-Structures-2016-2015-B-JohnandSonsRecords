public class BinarySearchTree<T extends Comparable<T>> implements ITree {

    private Node root;

    @Override
    public void insert(DVD data) {
        if (isEmpty()) {
            root = new Node(data);
        } else {
            insert(root, data);
        }
    }

    @Override
    public Node insert(Node node, DVD data) {
        if(node.getData().getAuthorName().compareTo(data.getAuthorName()) > 0){
            if (node.getLeft() == null) {
                node.left = new Node<>(data);
                return node.left;
            } else {
                return insert(node.getLeft(), data);
            }
        } else {
            if (node.getRight() == null) {
                node.right = new Node<>(data);
                return node.right;
            } else {
                return insert(node.getRight(), data);
            }
        }
    }

    @Override
    public void search(DVD data) {
        if (isEmpty()) {
            throw new BinaryTreeIsEmptyException("Tree is empty");
        } else {
            search(root, data);
        }
    }

    @Override
    public Node search(Node node, DVD data) {
        if (node != null) {
            if (data.getAuthorName().compareTo(node.getKey()) < 0) {
                return insert(node.getLeft(), data);
            } else if(data.getAuthorName().compareTo(node.getKey()) > 0) {
                return insert(node.getRight(), data);
            } else {
                return node;
            }
        } else {
            return null;
        }
    }

    @Override
    public void delete(DVD data) {

        if (isEmpty()) {
            throw new BinaryTreeIsEmptyException("Tree is empty");
        } else {
            delete(root, data);
        }

    }

    @Override
    public Node delete(Node node, DVD data) {
        if (node == null) {
            return null;
        } else {
            if (data.getAuthorName().compareTo(node.getKey()) < 0) {
                node.setLeft(delete(node.left, data));
            } else if (data.getAuthorName().compareTo(node.getKey()) > 0) {
                node.setRight(delete(node.right, data));
            } else {
                if (node.left == null && node.right == null) {
                    return null;
                } else if (node.left == null) {
                    Node temp = node.right;
                    node = null;
                    return temp;
                } else if (node.right == null) {
                    Node temp = node.left;
                    node = null;
                    return temp;
                } else {
                    Node temp = getPredecessor(node.getLeft());
                    node.data = temp.data;
                    node.left = delete(node.getLeft(),temp.getData());
                }
            }
        }
        return node;
    }

    public Node getPredecessor(Node node) {
        if (node.getRight() != null) {
            return getPredecessor(node.getRight());
        } else {
            return node;
        }
    }

    @Override
    public void inorderTraversal() {
        if (isEmpty()) {
            throw new BinaryTreeIsEmptyException("Tree is empty");
        } else {
            inorderTraversal(root);
        }
    }

    @Override
    public void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.getLeft());
            System.out.println(node.data.getAuthorName() + " ");
            inorderTraversal(node.getRight());
        }
    }

    @Override
    public boolean isEmpty() {
        return root == null;
    }
}
