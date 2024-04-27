package uni_assignments.sem_2.asdl.adt_collections;

public class Node {
    int info;
    Node next = null;

    Node() {
        info = 0;
    }
    Node (int x) {
        info = x;
    }
}