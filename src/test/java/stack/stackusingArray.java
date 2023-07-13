package stack;

public class stackusingArray {
    static final int max=100;
    int top;
    int[] a = new int[max];

    boolean isEmpty(){
        //if(top<0)
            return (top<0);
    }
    stackusingArray(){
        top=-1;
    }

    boolean push(int value){
        if(top>max-1){
            System.out.println("Stack is full");
            return false;
        }
        else{
            a[++top]=value;
            System.out.println(value +"is pushed to the stack");
            return true;
        }
    }
    int pop(){
        if(top==-1){
            System.out.println("Stack is empty");
            return 0;
        }
        else
        {
            int x = a[top--];
            return x;
        }
    }

    void printStack(){
        for(int i=top;i>-1;i--){
            System.out.println(a[i]);
        }
    }












//    boolean isEmpty(){
//        return (top<0);
//    }
//
//    stackusingArray(){
//        top=-1;
//    }
//
//    boolean push(int value){
//        if(top>max-1){
//            System.out.println("Stack over lopaded");
//            return false;
//        }
//        else {
//            a[++top]=value;
//            System.out.println("pushed to stack");
//            return true;
//        }
//    }
//    int pop(){
//        if(top<0){
//            System.out.println("Stack is empty");
//            return 0;
//        }
//        else{
//            int x=a[top--];
//            return x;
//        }
//    }
//
//    void printStack(){
//        for(int i=top;i>-1;i--){
//            System.out.println(" "+a[i]);
//        }
//    }
    public static void main(String[] args){
        stackusingArray sa = new stackusingArray();
        sa.push(1);
        sa.push(2);
        sa.push(5);
        System.out.println("popped value is "+sa.pop());
        sa.push(6);
        sa.push(7);
        sa.push(10);

        System.out.println("popped value is "+sa.pop());

        sa.printStack();
    }
}
