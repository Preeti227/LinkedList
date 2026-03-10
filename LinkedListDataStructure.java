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
    void addAtTail(int val){
        Node t=new Node(val);
        if(tail==null) head=tail=t;
        else{
            tail.next=t;
            tail=t;
        }
        
    }
    void addAtHead(int val){
        Node temp=new Node(val);
        if(head==null) head=tail=temp;
        else{
            temp.next=head;
            head=temp;
        }
        
    }
    void deleteAtHead(){
        if(head==null){
            System.out.print("List empty");
            return;
        }
        head=head.next;
        if(head==null) tail=null;//for size 1
    }
    void display(){
        if(head==null) return;
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
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
    }
    

}