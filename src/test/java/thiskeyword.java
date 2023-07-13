public class thiskeyword {
    int x;

    public thiskeyword(int x){
        this.x=x;

    }

    public void getdata(){
        int x=30;
        System.out.println(x+this.x);
    }
    public static void main(String[] args){
        thiskeyword tk = new thiskeyword(100);
        tk.getdata();

    }
}
