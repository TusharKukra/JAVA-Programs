import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int counter =1;
        int sum=0;
        while(counter<=n){
            sum+=counter;
            counter ++;
        }
        System.out.println(sum);

    }
}
