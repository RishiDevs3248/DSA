
public class LL_01_LinklistBasics {

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }





    // 2 variables for storing the first and last node location
    public static Node head;
    public static Node tail;






    // variable for storing size
    public static int size = 0;





    
    // Add first function 
    // not using a static because we are not directly calling fun in main fun , we will call it using a obj
    public void addFirst(int data) {
        // step 1 - create new node
        Node newNode = new Node(data);

        // updating size
        size++;

        // if linklist is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 - link next
        newNode.next = head;

        // step 3 - reset head
        head = newNode;

    }





    
    // Add Last 
    public void addLast(int data) {
        // step 1 - create new node
        Node newNode = new Node(data);

        // if linklist is empty
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 - link next
        tail.next = newNode;

        // step 3 - reset tail
        tail = newNode;

        // updating size
        size++;
    }





    
    // Add in middle 
    public void addMiddle(int data, int target) {
        //step 1 - create a new node 
        Node newNode = new Node(data);

        //step 2 -  travling to right index 
        Node temp = head;
        int i = 0;
        while ((i + 1) != target) {
            temp = temp.next;
            i++;
        }

        //step 3 - inserting element
        newNode.next = temp.next;
        temp.next = newNode;

        // updating size
        size++;
    }





    
    // remove first
    public void removefirst(){
        //case 1 - size 0 
        if(head == null){
            System.out.println("Linklist empty!!, cannot remove");
            return;
        }

        //case 2 - size 1
        int data = head.data;
        if(head == tail){
            head = tail = null;
            System.err.println("removed : "+data);
            //updating size
            size = 0;
            return;
        }

        //case 3 - size more than 1
        head = head.next;  // this line removes the node
        System.err.println("removed : "+data);
        //updating size
        size--;
    }





    
    //remove last
    public void removeLast(){
        //case 1 - size 0  
        if(tail == null){
            System.out.println("Linklist empty!!, cannot remove");
            return;
        }

        //case 2 - size 1
        int data = tail.data;
        if(head == tail){
            head = tail = null;
            System.err.println("removed : "+data);
            //updating size
            size = 0;
            return;
        }

        //case 3 - size more than 1
        Node temp = head;
         // travaling to the position before tail (n-1)
        while (temp.next != tail){
            temp = temp.next;
        }
        //updating tail and removing the link 
        tail = temp ;
        temp.next = null;
        System.err.println("removed : "+data);
        //updating size
        size--;
    }






    // Print linklist
    public void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }





        // itrative serch
    public int itrSearch(int key){
        Node temp = head;
        int i = 0 ;
        while (temp != null){
            if(temp.data == key){
                return i; 
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }
    




    // recursive serch
    public void recSearch(int key , Node node){
        //base case
        if(node == null){
            System.out.println("element not found ");
            return ;
        }

        // if element found
        if(node.data == key){
            System.out.println("element found");
            return ; 
        }

        //reccursive call
        recSearch(key, node.next);
    }
    



    // reverse an linklist ------------------------------------
    public void reverseLL(){
         Node prev = null;
         Node curr = tail = head;
         Node next ;

         while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next; 
         }

         head = prev;

    }





    // Remove n th node from the linklist 
    public void remoneNthNode(int idx){
        int i  = 0  ;
        Node ithNode = head;
        Node prevNode = null;

        while (i < idx){
            i++;
            prevNode = ithNode;
            ithNode=ithNode.next;
        }

        prevNode.next = ithNode.next;
        ithNode.next = null;
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

        System.out.println();

        ll.addMiddle(001, 4);
        ll.printLL();

        System.out.println();
        System.out.println("size : "+ll.size);


        ll.removefirst();
        ll.printLL();
        System.out.println();
        System.out.println("size : "+ll.size);


        ll.removeLast();
        ll.printLL();
        System.out.println();
        System.out.println("size : "+ll.size);


        // itrative serch
        System.out.println("found at idx : "+ll.itrSearch(5));

        //reccursive search
        ll.recSearch(4, head);
        ll.recSearch(40, head);


        // reverse linklist 
        ll.reverseLL();
        ll.printLL();


        // remove nth node 
        System.out.println();
        ll.remoneNthNode(2);
        ll.printLL();
    }
}
