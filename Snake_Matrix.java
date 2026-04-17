public class Snake_Matrix {
    public static void main(String[] args){
        int [][] arr = {{6,0,5,6},{3,4,5,6},{4,5,6,1},{3,4,5,6}};
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                for(int j=0;j<arr[0].length;j++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int j=arr[0].length-1;j>=0;j--){
                    System.out.print(arr[i][j]+" ");
                }                
            }
            System.out.println();
        }        
    }    
}
