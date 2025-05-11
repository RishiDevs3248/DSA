public class LL_01_LinklistBasics {
    public static class Node {
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }





    // 2 variables for storing the first and last node location
    public static Node head;
    public static Node tail;





    // Add first function 
    // not using a static because we are not directly calling fun in main fun , we will call it using a obj
    public void addFirst(int data){
        // step 1 - create new node
        Node newNode = new Node(data);

        // if linklist is empty
        if(head == null){
            head = tail = newNode;
            return;
        }

        // step 2 - link next
        newNode.next = head;

        // step 3 - reset head
        head = newNode; 
    }





    // Add Last 
    public void addLast(int data){
         // step 1 - create new node
        Node newNode = new Node(data);

        // if linklist is empty
        if(head == null){
            head = tail = newNode;
            return;
        }

        // step 2 - link next
        tail.next = newNode;

        // step 3 - reset tail
        tail = newNode;  
    }





    // Print linklist
    public void printLL(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }



    public static void main(String[] args) {
        LL_01_LinklistBasics ll = new LL_01_LinklistBasics();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.printLL();
    }
}
