package linked_lists;

public class practiseLL {
    Node head;
    static class Node{
        Node next;
        int data;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void printLL(){
        Node current= head;
        while (current!=null){
            System.out.print(current.data+" ->");
            current=current.next;
        }
    }
    public int lenght(){
        int count=0;
        Node current = head;
        while (current!=null){
            count++;
            current=current.next;
        }
        return count;
    }
    public void insertAtTheBegining(int value){
        Node new_node = new Node(value);
        new_node.next=head;
        head=new_node;
    }
    public void insertNodeAtTheEnd(int value){
        Node new_node = new Node(value);
        Node current=head;
        while (current.next!=null){
            current=current.next;
        }
        current.next=new_node;
    }
    public void inserAfter(int aftervalue,int value){
        Node new_node = new Node(value);
        Node current = head;
        while (current.data!=aftervalue){
            current=current.next;
        }
        new_node.next=current.next;
        current.next=new_node;
    }
    public static void main(String[] args){
        practiseLL pl = new practiseLL();
        System.out.println(pl.lenght());
        pl.head=new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);
        Node fourth = new Node(40);
        pl.head.next=second;
        second.next=third;
        third.next=fourth;
        pl.printLL();
        System.out.println();
        System.out.println(pl.lenght());
        pl.insertAtTheBegining(5);
        pl.printLL();
        System.out.println();
        System.out.println(pl.lenght());
        pl.insertNodeAtTheEnd(50);
        pl.printLL();
        System.out.println();
        System.out.println(pl.lenght());
        pl.inserAfter(20,25);
        System.out.println();
        pl.printLL();
        System.out.println(pl.lenght());
    }
}
