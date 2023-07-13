//package linked_lists;
//
//public class linkylists {
//    public static class Node{
//        int val;
//        LinkedList.Node next;
//        public Node(int val){
//            this.val=val;
//        }
//    }
//    Node head=null;
//    Node tail=null;
//
//    private void addNode(int val){
//        Node newNode = new Node(val);
//        if(head==null){
//            head = newNode;
//            tail = newNode;
//        }else{
//            newNode.next=head;
//            head=newNode;
//        }
//    }
//
//    private void printll(){
//        Node curr=head;
//        while (curr!=null){
//            System.out.println(curr.val);
//            curr=curr.next;
//        }
//    }
//
//    private void addAtTheEnd(int val){
//        Node newNode= new Node(val);
//        if(head==null){
//            head = newNode;
//            tail = newNode;
//        }else{
//            tail.next=newNode;
//            newNode.next=null;
//            tail=newNode;
//        }
//
//    }
//    public static void main(String[] args){
//        linkylists ll = new linkylists();
//        ll.addNode(10);
//        ll.addNode(5);
//        ll.addNode(200);
//        ll.addAtTheEnd(30);
//        ll.printll();
//
//    }
//}
