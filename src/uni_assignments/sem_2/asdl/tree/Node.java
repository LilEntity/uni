package uni_assignments.sem_2.asdl.tree;

public class Node {
    int data;
    Node left, right;
    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}
