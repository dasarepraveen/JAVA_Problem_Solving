import org.testng.annotations.Test;

public class superKey {

    public superKey(){
        System.out.println("Printing from Parent Class");
    }

    @Test
    public void abcd(){
        System.out.println("ABCD");
    }

    public void getsuperFunction(){
        System.out.println("this is a function extracted from super key without instatiating the object");
    }
    public int x=200;
}
