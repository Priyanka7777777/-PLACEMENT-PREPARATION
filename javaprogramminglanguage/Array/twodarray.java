import java.util.*;
public class twodarray{

  //fnding if the key is there or not;
  public static boolean search(int matrix[][], int key){
    int n = matrix.length;
    int m=matrix[0].length;
    for(int i =0;i<n;i++){
      for(int j=0;j<m;j++){
        if(matrix[i][j]==key){
          System.out.println("element is found at"+ i + ","+ j + " ");
          return true;
        }
      }
    }
return false;
  }
    public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int m = sc.nextInt();
int n= sc.nextInt();
int arr[][]= new int [m][n];
n = arr.length;
m=arr[0].length;
//creation of 2d array
  for(int i =0;i<n;i++){
    for(int j=0;j<m;j++){
      arr[i][j]=sc.nextInt();  
    }
  }
  for(int i =0;i<n;i++){
    for(int j=0;j<m;j++){
  System.out.print(arr[i][j]+ " ");
    }
    System.out.println( );

}
search (arr, 5);
}
}