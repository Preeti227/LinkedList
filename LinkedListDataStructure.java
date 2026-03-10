class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
        this.next=null;
    }
}

class LinkedL{
    Node head;
    Node tail;
    int size;
    boolean search(int val){
        if(head==null) return false;
        Node temp=head;
        while(temp!=null){
            if(temp.val==val) return true;
            temp=temp.next;
        }
        return false;
    }

    void addAtTail(int val){
        Node t=new Node(val);
        if(tail==null) head=tail=t;
        else{
            tail.next=t;
            tail=t;
        }
        size++;
    }
    void addAtHead(int val){
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
       size++; 
    }
    void deleteAtHead(){
        if(head==null){
            System.out.print("List empty");
            return;
        }
        head=head.next;
        if(head==null) tail=null;//for size 1
        size--;
    }
    void display(){
        if(head==null) return;
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void insert(int val, int index) {
        if(index<0||index>size){
            System.out.println("Invalid");
            return;
        }
        if(index==0) addAtHead(val);
        else if(index==size) addAtTail(val);
        else{
            Node temp=head;
            for(int i=0;i<index-1;i++){
                temp=temp.next;
            }
            Node n=new Node(val);
            n.next=temp.next;
            temp.next=n;
            size++;
        }
    }

    void deleteAtIndex(int index) {
        if(index<0||index>=size){
            System.out.println("Invalid");
            return;
        }
        if(index==0) {
            deleteAtHead();
            return;
        }
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;//Deleting link
        if(index==size-1) tail=temp;//If the tail is being deleted
        size--;
    }
}
public class LinkedListDataStructure{
    public static void main(String[] args) {
        LinkedL ll=new LinkedL();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(40);
        ll.display();
        ll.addAtHead(50);
        ll.deleteAtHead();
        ll.insert(45,2);ll.display();
        ll.deleteAtIndex(2);ll.display();
    }
    

}