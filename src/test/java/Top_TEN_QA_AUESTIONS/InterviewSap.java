package Top_TEN_QA_AUESTIONS;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InterviewSap {
    static int count=0;
    //12122
    public static void main(String[] args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();



        //span[@class='f-bold f-19']/parent::div

        List<WebElement> busFare = driver.findElements(By.xpath("//span[@class='f-bold f-19']/parent::div"));
        int i=0;
        //span[@class='f-bold f-19']//ancestor::div//child::div[@class='travels lh-24 f-bold d-color']

        int[] inPutArray = new int[busFare.size()];
        for (WebElement ele:busFare) {
            inPutArray[i] = Integer.parseInt(ele.getText());
            i++;
        }
        Arrays.sort(inPutArray);
        int leastValue = inPutArray[0];

        //span[@class='f-bold f-19']//ancestor::div//child::div[@class='travels lh-24 f-bold d-color']










//        int n = 12122;
//        int copy = n;
//
//        int reversedNum = 0;
//
//        int eSum = 0;
//        int oSum = 0;
//
//        int counter = 1;
//
//        while(n != 0){
//
//            int eachDigit = n % 10;
//
//            reversedNum = reversedNum * 10 + eachDigit;
//
//            if(counter % 2  == 0) {
//                eSum += eachDigit;
//            }
//            else {
//                oSum += eachDigit;
//            }
//            n = n/10;
//            counter++;
//        }
//
//        if(reversedNum==copy && (eSum-oSum)%11==0){
//            System.out.println("Its a pallndrome and divisible by 11");
//        }
//        else if(reversedNum!=copy && (eSum-oSum)%11!=0){
//            System.out.println("Its a pallndrome and non divisible by 11");
//        }
//
//        System.out.println("es :: " + eSum);
//        System.out.println("os :: " +oSum);
//
//        System.out.println("reversed Number  " + reversedNum);
//







//        int input = 1212211;
//        //int count=0;
//        int[] inputArray = new int[7];
//
//        string = ""
//
//        while(input/10!=0){
//            inputArray[count]=input%10;
//            input=input/10;
//            count++;
//        }
//        if(input/10==0){
//            inputArray[count]=input;
//        }
//        for(int i=0;i<inputArray.length;i++){
//            System.out.println(inputArray[i]);
//        }
//        int temp=0;
//
////        for(int i=0;i<inputArray.length/2;i++){
////            inputArray[inputArray.length-1-i] = temp;
////            temp =inputArray[inputArray.length-1-i];
////            //inputArray[inputArray.length-1-i]=temp;
////            inputArray[inputArray.length-1-i]=inputArray[i];
////        }
//
//        int sumOdd=0;
//        int sumEven=0;
//
//        for(int i=0;i<inputArray.length;i++){
//            if(i%2==0){
//                sumOdd=sumOdd+inputArray[i];
//            }
//            else {
//                sumEven=sumEven+inputArray[i];
//            }
//        }
//        if((sumEven-sumOdd)%11==0){
//            System.out.println("Divisb;e by 11");
//        }
//        else {
//            System.out.println(" not Divisb;e by 11");
//        }
//
//
//

    }
}
