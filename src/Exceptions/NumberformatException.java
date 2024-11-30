package Exceptions;

public class NumberformatException {
    public static void main(String[] args) {
        String s = "16";
        if(Character.isDigit(s.charAt(0))){
            System.out.println(Integer.parseInt(s));
        }
        else{
            System.out.println("we can't convert characters into String format");
        }

    }
}
