public class pub extends superKey{
    public int x=100;
    public pub(){
        super();
        System.out.println("Priniting from child class");
    }
    public void ff(){
        super.getsuperFunction();
        System.out.println(super.x);
    }
    public static void main(String[] args){
        pub pb = new pub();
        pb.ff();
    }
}
