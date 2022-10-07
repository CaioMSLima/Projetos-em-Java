import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

    public static void main(String[] args) {

        method1();

        System.out.println("End of program");

    }

    public static void method1(){
        System.out.println("***METHOD1 START***");

        method2();

        System.out.println("***METHOD1 END***");

    }
    public static  void method2(){

        System.out.println("***METHOD2 START***");


        Scanner scan = new Scanner(System.in);

        try {
            String[] vect = scan.nextLine().split(" ");
            int position = scan.nextInt();
            System.out.println(vect[position]);
        }
        catch (ArrayIndexOutOfBoundsException e ){
            System.out.println("Invalid position!");
            e.printStackTrace();
            scan.next();
        }
        catch (InputMismatchException e){
            System.out.println("Imput error");

        }

        System.out.println("***METHOD2 END***");

        scan.close();
    }
}
