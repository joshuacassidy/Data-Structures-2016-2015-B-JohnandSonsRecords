public class Main {

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        DVD d1 = new DVD("Madonna", "Like a Prayer", 1994);
        DVD d2 = new DVD("U2", "Pop", 2006);
        DVD d3 = new DVD("Cliff Richard", "Bold as Brass", 2010);
        DVD d4 = new DVD("Celine Dion", "Miracle", 2004);

        DVD a = new DVD("a", "a", 2004);
        DVD b = new DVD("b", "b", 2004);
        DVD c = new DVD("c", "c", 2004);
        DVD d = new DVD("d", "d", 2004);
        DVD e = new DVD("e", "e", 2004);
        DVD f = new DVD("f", "f", 2004);
        DVD g = new DVD("g", "g", 2004);
        DVD h = new DVD("h", "h", 2004);
        DVD i = new DVD("i", "i", 2004);
        DVD j = new DVD("j", "j", 2004);
        DVD k = new DVD("k", "k", 2004);
        DVD l = new DVD("l", "l", 2004);

        binarySearchTree.insert(d1);
        binarySearchTree.insert(d2);
        binarySearchTree.insert(d3);
        binarySearchTree.insert(d4);

        binarySearchTree.insert(f);
        binarySearchTree.insert(a);
        binarySearchTree.insert(l);
        binarySearchTree.insert(b);
        binarySearchTree.insert(e);
        binarySearchTree.insert(g);
        binarySearchTree.insert(k);
        binarySearchTree.insert(c);
        binarySearchTree.insert(d);


//        binarySearchTree.delete(f);
        binarySearchTree.inorderTraversal();
    }

}
