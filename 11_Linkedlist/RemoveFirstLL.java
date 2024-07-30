
public class RemoveFirstLL {
    
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFrist(int data){
        //step1 = create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        //step2 = newNode next = head
        newNode.next = head; //link = 1node to 2node

        //step3 = head = newNode
        head = newNode;
    }

    public void addLast (int data){
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print(){                                                 
        if (head  == null) {                                          
            System.out.println("LL is empty");                       
            return;                                                    
        }                                                             
        Node temp = head;                                            
        while (temp != null) {                          
            System.out.print(temp.data+"--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int idx, int data){     
        if (idx == 0) {
            addFrist(data);
            return;
        }                                                        
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx-1){
            temp = temp.next;
            i++;
        }
 
        //i = idx-1; temp --> prev     new node
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFrist(){
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size --;
        return val;
    }

    public static void main(String[] args) {
        //create linked list
        RemoveFirstLL ll = new RemoveFirstLL();     //object
      
       ll.addFrist(2); 
       ll.addFrist(1);     
       ll.addLast(4);
       ll.addLast(5);
       ll.add(2, 3);

       ll.print(); // 1--> 2--> 3--> 4--> 5--> null   5
       ll.removeFrist();                                                    //ans = 2--> 3--> 4--> 5--> null     
       ll.print();
    }
}