package linklist;

public class single {
    
    /**
     * Node
     */ 
    private Node head ;
    private Node tail;
    private  int size;
     
    public single (int size){
        this.size = 0;
    }
     
    public class Node {
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
        
    }

 public void insertfirest(int value){
    Node node1 = new Node(value);
    node1.next = head;
    head = node1;
    if (tail == null) {
        tail = head;
    }
    size++;
}

public void displlay(){
    Node temp = head;
    while (temp != null) {
        System.out.println("node ->"+ temp.value);
        temp = temp.next;
    }
    System.out.println("end");
}

public void insertlast(int value){
    if (tail == null) {
        insertfirest(value);
        return;
    }
    Node node = new Node(value);
    tail.next = node;
    node.next = null;
    size++;
}
public void insert(int value , int index){
    if (index == 0 ) {
        insertfirest(value);
        return;
    }
     if (index == size) {
        insertlast(value);
        return;
     }
    Node temp = head;
    for(int i = 0 ; i < index ; i++){
        temp = temp.next;
    }
    Node node = new Node(value, temp.next);
    temp.next = node;
    size++;
}

public int deletefirst(){
    int val = head.value;
    head = head.next;
    if (head == null) {
        tail = null;
    }
    size--;
    return val;
}

public Node find(int index){
    Node temp = head;
    for(int i = 0 ; i < index ; i++){
        temp = temp.next;
    }
    return temp;
}
 
public int deletelast(){
    if (size <= 1) {
        deletefirst();
        
    }
    Node temp = find(size-2);
    Node node = temp.next;
    temp.next = null;
    return node.value;

}
public int deleteany(int index){
    if (index == 0) {
        return deletefirst();
    }
    if (index == size) {
        return deletelast();
    }
    Node temp = find(index-1);
    int val = temp.next.value;
    temp = temp.next.next;
    return val;
    
}

public Node searchNode(int value){
    
    Node temp = head;
    while (temp !=null) {
        if (temp.value == value) {
            return temp;
        }
        temp = temp.next;

    }
    return null;
}
}



