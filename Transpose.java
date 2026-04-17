public class Transpose {
    public static void main(String[] args){
        int [][] arr = {{6,0,5,6},{3,4,5,6},{4,5,6,1},{3,4,5,6}};

        for(int i=1;i<arr.length;i++){
            for(int j=0;j<i;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
    }
    for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
    }
    }
}
