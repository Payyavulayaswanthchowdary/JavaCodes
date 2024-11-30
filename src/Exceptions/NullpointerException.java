package Exceptions;

public class NullpointerException {
    public static void main(String[] args) {
        String s = null;
        if(s != null){
            s.toLowerCase();
            System.out.println(s);
        }
        else{
            System.out.println("Enter a valid string");
        }


    }
}
