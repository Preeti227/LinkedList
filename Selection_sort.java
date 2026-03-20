import java.util.Arrays;

public class Selection_sort {
    public static void main(String[] args) {
        int arr[]={7,4,11,25};
        int n=arr.length;
        for(int i=0;i<n-1;i++){//n-1 passes
            int minIndex=i;
            for(int j=i+1;j<n;j++){//Find the smallest element for each pass
                if(arr[j]<arr[minIndex]){
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
