import java.util.*;
class prime{
    static boolean isPrime(int num){
            if(num<2) return false;
            for(int i=2;i*i<=num;i++){
                if(num%i==0) return false;
            }
            return true;
        }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        
        int[] arr=new int[m+n];
        int count=0;
        int number=2;
        while(count<m+n){
            if(isPrime(number)){
                arr[count]=number;
                count++;
            }
            number++;
        }
        int sum=0;
        sum=arr[m]+arr[m+1]+arr[m-1];
        System.out.println(sum);
    }
}
