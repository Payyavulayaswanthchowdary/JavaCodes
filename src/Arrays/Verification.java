package Arrays;

public class Verification {
    public static void main(String[] args) {
        int [] n = {2,4,1,2,4,6,64,5,68,8,786};
        int ele = 64;
        boolean flag = false;
        for(int i = 0;i<=n.length-1;i++){
            if(n[i] == ele){
                flag = true;
                break;
            }
        }
        if(!flag){
            System.out.println("element doesn't exist");
        }
        else{
            System.out.println("element  exist");
        }
    }
}
