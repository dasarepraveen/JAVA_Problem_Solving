//package linked_lists;
//class maiIsaKyuHun {
//    Node head;
//
//    static class Node {
//        int data;
//        Node next;
//
//        Node(int data) {
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    public void printLL() {
//        Node current = head;
//        while (current != null) {
//            System.out.print(current.data + " ->");
//            current = current.next;
//        }
//    }
//
//    public int lengt() {
//        int count = 0;
//        Node current = head;
//        while (current != null) {
//            count++;
//            current = current.next;
//        }
//        return count;
//    }
//
//    public void insertNodeAtBegining(int val) {
//        Node newNode = new Node(val);
//        newNode.next = head;
//        head = newNode;
//    }
//
//    public void insertNodeAtTheEnd(int val) {
//        Node newNode = new Node(val);
//        Node current = head;
//        while (current.next != null) {
//            current = current.next;
//        }
//        current.next = newNode;
//    }
//
//    public void insertAfter(int aftervalue, int val) {
//        Node newNode = new Node(val);
//        Node current = head;
//        while (current.data != aftervalue) {
//            current = current.next;
//        }
//        newNode.next = current.next;
//        current.next = newNode;
//    }
//
//    public static void main(String[] args) {
//        maiIsaKyuHun mh = new maiIsaKyuHun();
//        mh.head = new Node(10);
//        Node second = new Node(20);
//        Node third = new Node(30);
//        Node fourth = new Node(40);
//        mh.head.next = second;
//        second.next = third;
//        third.next = fourth;
//        mh.printLL();
//        System.out.println("Length is " + mh.lengt());
//        mh.insertNodeAtBegining(5);
//        mh.printLL();
//        System.out.println("Length is " + mh.lengt());
//        mh.insertNodeAtTheEnd(50);
//        mh.printLL();
//        System.out.println("Length is " + mh.lengt());
//        mh.insertAfter(20, 25);
//        mh.printLL();
//        System.out.println("Length is " + mh.lengt());
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////    Node head;
////    static class Node{
////        int data;
////        Node next;
////        Node(int data){
////            this.data=data;
////            this.next=null;
////        }
////    }
////    public void printLL(){
////        Node current = head;
////        while(current!=null){
////            System.out.println(current.data);
////            current=current.next;
////        }
////    }
////    public int leanght(){
////        int count=0;
////        Node curr=head;
////        while(curr!=null){
////            count++;
////            curr=curr.next;
////        }
////        return count;
////    }
////    public void insertNodeinTheBegining(int value){
////        Node newNode = new Node(value);
////           newNode.next=head;
////           head=newNode;
////    }
////    public void insertAtTheEnd(int value){
////        Node newNode = new Node(value);
////        if(head==null){
////            head=newNode;
////            return;
////        }
////        Node currentNode=head;
////        while(currentNode.next!=null){
////            currentNode=currentNode.next;
////        }
////        currentNode.next=newNode;
////    }
////
////    public void insertAfter(int value,int new_Node_Value){
////        Node newNode = new Node(new_Node_Value);
////        Node current=head;
////        while(current.data!=value){
////            current=current.next;
////        }
////        newNode.next=current.next;
////        current.next=newNode;
////
////    }
////
////    public static void main(String[] args){
////        maiIsaKyuHun mh = new maiIsaKyuHun();
////        mh.head=new Node(10);
////        Node second = new Node(15);
////        Node third = new Node(20);
////        Node fourth = new Node(25);
////        mh.head.next=second;
////        second.next=third;
////        third.next=fourth;
////        mh.printLL();
////        System.out.println("Before inserting 5 "+mh.leanght());
////        mh.insertNodeinTheBegining(5);
////        System.out.println("After inserting 5 "+mh.leanght());
////        System.out.println("After 5");
////        mh.printLL();
////        mh.insertNodeinTheBegining(100);
////        System.out.println("After 100");
////        mh.printLL();
////        System.out.println("After inserting 100 "+mh.leanght());
////        mh.insertAtTheEnd(200);
////        System.out.println("After inserting 200 "+mh.leanght());
////        System.out.println("After 200");
////        mh.printLL();
////        mh.insertAfter(5,300);
////        System.out.println("After 300");
////        mh.printLL();
////        System.out.println("After inserting 300 "+mh.leanght());
////    }
//}