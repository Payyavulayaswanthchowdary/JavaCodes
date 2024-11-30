package Task20;

public class VowelConsonantSwitch {
    public static void main(String[] args) {
        char ch = 'y';
        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("it's a vowel");
                break;
            default:
            System.out.println("it's a consonant");
        }
    }
}
