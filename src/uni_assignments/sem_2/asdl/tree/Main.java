package uni_assignments.sem_2.asdl.tree;


public class Main {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(50);
        bt.insert(45);
        bt.insert(30);
        bt.insert(48);
        bt.insert(49);
        bt.insert(70);
        bt.insert(65);
        bt.insert(46);
        bt.insert(29);
        bt.insert(44);
        bt.Traversal(1);
        System.out.println();
        bt.Traversal(2);
        System.out.println();
        bt.Traversal(3);
        System.out.println();
        bt.search(50);
        bt.search(65);
        bt.search(49);
        bt.search(47);
        // System.out.println();
        // bt.delete(45);
        // bt.Traversal(1);
        // System.out.println();
    }
}
