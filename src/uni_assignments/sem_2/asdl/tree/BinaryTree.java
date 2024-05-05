package uni_assignments.sem_2.asdl.tree;

public class BinaryTree {
    Node root;
    public BinaryTree(){
        root = null;
    }
    public boolean isEmpty(){
        return root == null;
    }
    public boolean leftEmpty(Node node){
        return node.left == null;
    }
    public boolean rightEmpty(Node node){
        return node.right == null;
    }
    public void insert(int data){
        Node newNode = new Node(data);
        if(isEmpty())
            root = newNode;
        else{
            insertNode(root, newNode);
        }
    }

    public void delete(int data){
        if(isEmpty())
            System.out.println("Pohon Biner Kosong!");
        else{
            deleteNode(root, data);
        }
    }

    public void insertNode(Node current, Node newNode){
        if(newNode.data < current.data){
            if(leftEmpty(current)){
            System.out.println(newNode.data+" berhasil diinsert ke kiri dari "+current.data);
            current.left = newNode;
            }
            else{
                insertNode(current.left,newNode); //rekursif
            }
        }
        else if(newNode.data > current.data){
            if(rightEmpty(current)){
                System.out.println(newNode.data+" berhasil diinsert ke kanan dari "+current.data);
                current.right = newNode;
            }
            else{
                insertNode(current.right,newNode); //rekursif
            }
        }
    }

    Node deleteNode(Node node,int data){
        if (node == null)
                System.out.println("\n" + data + " tidak ditemukan di dalam pohon biner!");
            else if (data < node.data) {
                node.left = deleteNode(node.left, data);
            }else if (data > node.data) {
                node.right = deleteNode(node.right, data);
            }else {
                if (node.left == null) {
                    return node.right;
                } else if (node.right == null) {
                    return node.left;
                }

                node.data = minValue(node.right);
                node.right = deleteNode(node.right, node.data);
                System.out.println("\n" + data + " Berhasil dihapus dari pohon biner!");
            }
            return node;
    }

    int minValue(Node node)  {
            int minval = node.data;
            while (node.left != null)  {
                minval = node.left.data;
                node = node.left;
            }
            return minval;
        }


    void preOrder(Node node)  {
        if (node == null)
            return;
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    void inOrder(Node node)  {
        if (node == null)
            return;
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    void postOrder(Node node)  {
        if (node == null)
            return;
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    void Traversal(int tipe){
        switch(tipe){
            case 1 : preOrder(root); break;
            case 2 : inOrder(root); break;
            case 3 : postOrder(root); break;
            default : return;
        }
    }

    public void search(int cari) {
        if (isEmpty())
        System.out.println("Pohon Biner Kosong!");
        else
        searchNode(root, cari);
    }
    public void searchNode(Node node, int cari) {
        boolean found = false;

        if (node == null)
            System.out.println("\n" + cari + " tidak ditemukan di dalam pohon biner!");
        else {
        if (node.data == cari)
                found = true;
        else if (cari < node.data)
                searchNode(node.left, cari);
        else if (cari > node.data)
                searchNode(node.right, cari);
        }
        if(found == true)
	    System.out.println(cari + " ditemukan pada pohon biner!");
    }
}
