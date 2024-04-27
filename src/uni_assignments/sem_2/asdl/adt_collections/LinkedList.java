package uni_assignments.sem_2.asdl.adt_collections;

public class LinkedList {

    // Node first;

    // linkedList() {
    //     this.first = null;
    // }

    // public void add(LinkedList list, int info) {
    //     insertFirst(list, info);
    // }

    // public void printInfo(LinkedList list) {

    //     Node P = linkedList.first;

    //     System.out.print("Linked list : ");
    //     while (P != null) {
    //         System.out.print(P.info + " ");
    //         P = P.next;
    //     }
    // }

    // public void insertLast(LinkedList list, int info) {

    //     Node newNode = new Node(data);

    //     if (list.first == null) list.first = newNode;
    //     else {
    //         Node last;
    //         last = list.first;

    //         while (last.next != null) {
    //             last = last.next;
    //         }
    //         last.next = newNode;
    //     }
    // }

    // public void insertFirst(linkedList list, int data) {

    //     Node newNode = new Node(data);

    //     if (list.first == null) insertLast(list, data);
    //     else {
    //         newNode.next = list.first;
    //         list.first = newNode;
    //     }
    // }

    // public void insertAfter(linkedList list, int data, int index) {

    //     Node newNode = new Node(data);

    //     if (list.first == null) list.first = newNode;
    //     else {
    //         Node Prev;
    //         Prev = list.first;
    //         int i = 0;

    //         while (i < index-1 && Prev != null) {
    //             Prev = Prev.next;
    //             i++;
    //         }

    //         if (Prev != null) {
    //             newNode.next = Prev.next;
    //             Prev.next = newNode;
    //         }
    //     }
    // }

    // public void deleteFirst(linkedList list) {

    //     if (list.first == null) return;
    //     else {
    //         Node Q = list.first;
    //         list.first = Q.next;
    //         Q.next = null;
    //         // System.out.println("Nilai yang dihapus : " + Q.info);
    //     }
    // }

    // public void deleteLast(linkedList list) {

    //     if(list.first == null) return;
    //     // System.out.println("List Kosong");
    //     else {
    //         Node Q = null;
    //         Node last = list.first;
    //         while (last.next != null) {
    //             Q = last;
    //             last = last.next;
    //         }
    //         // System.out.println("Nilai yang dihapus : " + last.info);
    //         Q.next = null;
    //         last = Q;
    //     }
    // }
}