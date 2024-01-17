//Explicit throw , Explicit catch ok
import java.util.*;

public class Exception4{
    public static void  main(String args[]){
    Scanner sc = new Scanner(System.in);

    int numerator = sc.nextInt();
    int denominator = sc.nextInt();
try{
    if(denominator == 0){
        throw new ArithmeticException("Number cannot be divided by Zero");
    }
    int result = numerator/denominator;

    System.out.println(result);
}


catch(Exception e){
    System.out.println(e.getMessage());
}
    }
}