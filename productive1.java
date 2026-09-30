import java.util.*;
public class productive1 {
    public static void main (String[]args){
        Scanner Sc = new Scanner(System.in);
        int count = 0;
        int prev = Sc.nextInt();
        int num = Sc.nextInt();
        for (int i=0 ; i < num ; i++){
            int curr = Sc.nextInt();
            if (curr - prev >= 3){
                count++;
            }
            prev = curr;


        }
        System.out.println(count);
    }
    
}
