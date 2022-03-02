import java.util.*;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
            int c = a/b;
            System.out.println(a+"/"+b+"="+c);
        }catch(ArithmeticException e){
            System.out.println("Division by zero not possible");
        }finally{
            System.out.println("Finally");
        }
    }
}
