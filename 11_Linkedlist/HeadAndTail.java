
public class HeadAndTail {
    
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
                System.out.print(temp.data+"-->");
                temp = temp.next;
            }
            System.out.println("null");
        }

    public static void main(String[] args) {
        //create linked list
        HeadAndTail ll = new HeadAndTail();     //object
       ll.print();
       ll.addFrist(2);
       ll.print();
       ll.addFrist(1);
       ll.print();
       ll.addLast(3);
       ll.print();
       ll.addLast(4);
       ll.print();
    }
}

















//=======================================================Linked list (part 2)====================================================================



