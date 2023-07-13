package linked_lists;

public class doublyLinkedLists {
    Node head;
    Node tail;
    int length;
    class Node{
        int data;
        Node prev;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public doublyLinkedLists(){
        this.head=null;
        this.tail=null;
        this.length=0;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public int lengthofDL(){
        return length;
    }

    public void DisplayFoward(){
        if(head==null){
            return;
        }
        Node temp=head;
        while (temp!=null){
            System.out.println("data is "+temp.data);
            temp=temp.next;
        }
        System.out.println("Null");
    }
    public void DisplayBackword(){
        if(head==null){
            return;
        }
        Node temp=tail;
        while (temp!=null){
            System.out.println("data is "+temp.data);
            temp=temp.prev;
        }
        System.out.println("Null");
    }

    public void insertFirst(int value){
        Node newNode = new Node(value);
        if(isEmpty()){
            newNode=tail;
        }
        else {
            head.prev=newNode;
        }
        newNode.next=head;
        head=newNode;
        length++;
    }

    public static void main(String[] args){
        doublyLinkedLists dl = new doublyLinkedLists();

    }

}
