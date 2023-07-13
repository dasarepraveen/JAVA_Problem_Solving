public class abstractinherit extends abstractexample{
    @Override
    public void hadasripa() {

    }
//    @Override
//    public void abcde(){
//
//    }
    @Override
    public void abcd(){
        System.out.println("child");

    }
    public static void main(String[] args){
        abstractinherit aa = new abstractinherit();
        aa.hadasripa();
        aa.abcd();
        aa.xyz();
        aa.abcde();

    }
}
