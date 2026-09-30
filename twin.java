
import java.util.*;
public class twin{

    public static void main(String[]args){

        Scanner Sc = new Scanner(System.in);

        int n = Sc.nextInt();
int[] coins = new int[n];
    int total = 0;


 for (int i = 0; i < n; i++) {
            coins[i] = Sc.nextInt();
            total += coins[i];
        }

         Arrays.sort(coins);
         int mySum = 0;
         int count = 0; 

         for (int i = n-1;i>= 0 ; i--){
            mySum += coins[i];
            count++;

if(mySum>total-mySum){
    break;
}

}

System.out.println(count);

         }

    }

