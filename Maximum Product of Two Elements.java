import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] nums=new int[n];
	    for(int i=0;i<n;i++){
	        nums[i]=sc.nextInt();
	    }
		int largest=0,s_largest=0;
		int smallest=0,s_small=0;
		int max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                s_largest=largest;
                largest=nums[i];
            }
            else if(nums[i]>s_largest){
                s_largest=nums[i];
            }
            if(nums[i]<smallest){
                s_small=smallest;
                smallest=nums[i];
            }
            else if(nums[i]<s_small){
                s_small=nums[i];
            }
        }
        int product1=0,product2=0;
        product1=s_largest*largest;
        product2=s_small*smallest;
        max=Math.max(product1,product2);
        System.out.println(max) ;
	}
}
