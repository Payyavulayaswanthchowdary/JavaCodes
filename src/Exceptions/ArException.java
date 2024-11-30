package Exceptions;

public class ArException {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int div ;
        try{
            div = a/b;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
