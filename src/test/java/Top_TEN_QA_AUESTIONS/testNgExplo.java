package Top_TEN_QA_AUESTIONS;

import org.testng.annotations.*;

public class testNgExplo {

    @BeforeMethod
    public void fourth(){
        System.out.println("It prints before every @Test");
    }
    @AfterMethod
    public void aftermethod(){
        System.out.println("It prints After every @Test");
    }
    @Test(groups = "SMOKE")
    public void Fifth(){
        System.out.println("Fifth");
    }

    @Test
    public void Gifth(){
        System.out.println("Sixth");
    }

    @Test
    public void Hifth(){
        System.out.println("Seventh");
    }


    @BeforeSuite
    public void bst(){
        System.out.println("It Prints only once before executing anything");
    }

    @AfterSuite
    public void ast(){
        System.out.println("It Prints only once after executing everything");
    }

    @BeforeTest
    public void second(){
        System.out.println("Before Test");
    }

    @AfterTest
    public void AfT(){
        System.out.println("After Test");
    }

    @BeforeClass
    public void third(){
        System.out.println("Before first testcase from the class");
    }

    @AfterClass
    public void thirds(){
        System.out.println("After all the testcase from the class");
    }

}
