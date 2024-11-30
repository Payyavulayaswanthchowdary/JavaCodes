package Exceptions;

public class ArExample {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            int div = a/b;
            System.out.println(div);
        }
        catch (ArithmeticException e){
            System.out.println("exception handled");
        }
        catch (Exception e ){
            System.out.println(e.getMessage());
        }



    }
}
