import java.util.Scanner;
public class isPrime{
    void check_function(){
        int count = 0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number : ");
        int n = sc.nextInt();
        for(int i = 2; i <= n-1; i++){
            if(n % i == 0){
                count++;
                break;
            }
        }
        if(count == 0 && n != 1){
            System.out.println(n +" is a prime number");
        }else{
            System.out.println(n +" is not a prime number");
        }
    }
    public static void main(String[] args){
        isPrime p=new isPrime();
        p.check_function();
    }
}