import java.util.*;

class Main{
    public static void main(String[]args){
        int n=3;
        for(int i=1; i<=3;i++){
            for(int j=1;j<n;j++)
                System.out.print(" ");
            for(int j=i;j<=i;j++){
                System.out.print("* ");
            }
          System.out.print("\n");
        }
    }
}
