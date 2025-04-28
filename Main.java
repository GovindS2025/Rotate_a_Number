import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        var num = sc.nextInt();
        var times =sc.nextInt();


        // then we will find number of digits


        var temp = num;
        var nOfDigit=0;
        while(temp>0){
            temp= temp/10; //reduce temp value
            nOfDigit++;  // increasing no of digit


        }

        var divs = 1;
        var mult= 1;
        for(var i=1; i<=nOfDigit; i++){
            if(i<=times){
                divs = divs *10;
            }
            else{
                mult= mult * 10;
            }
        }
     var ques= num/divs ;
        var remainder = num % divs ;
        var res = remainder * mult + ques;
        System.out.println(res);


    }


}