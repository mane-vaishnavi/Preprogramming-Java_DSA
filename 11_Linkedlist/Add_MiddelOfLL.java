
public class Add_MiddelOfLL {
    
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

    public void addFrist(int data){
        //step1 = create new node
        Node newNode = new Node(data);
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


    public static void main(String[] args) {
        //create linked list
        Add_MiddelOfLL ll = new Add_MiddelOfLL();     //object
      
       ll.addFrist(2); 
       ll.addFrist(1);     
       ll.addLast(3);
       ll.addLast(4);
       ll.add(2, 9);

       ll.print();
    }
}