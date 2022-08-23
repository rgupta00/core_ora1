package com.day1.session1;

public class Demo2DArray2IdentityMatrix {

    public static void main(String[] args) {
//        int a[][]=new int [5][4];
        int a[][] = {{1,0,8},{0,1,0},{0,0,1}};
        
       printTwoDArray(a);
       
        if(checkForIdentity(a)){
            System.out.println("it is a identity matrix");
        }else
            System.out.println("it is not a identity matrix");

//        int arr[]={5,6,7};
//        a[0]=arr;
    }
    public static void printTwoDArray(int a[][]){
         for (int temp[] : a) {
            for (int tempVal : temp) {
                System.out.print(tempVal + " ");
            }
            System.out.println(" ");
        }
    }

    private static boolean checkForIdentity(int[][] a) {
      
        boolean isIdentityMatrix=true;
        
        for(int i=0;i<a.length; i++){
            for(int j=0;j<a[i].length; j++){
                //it is principle diagnal element
                if(i==j){
                    if(a[i][j]!=1){
                        isIdentityMatrix=false;
                        break;
                    }
                }else{
                     if(a[i][j]!=0){
                        isIdentityMatrix=false;
                        break;
                    }
                }
            }
        }
        
        return isIdentityMatrix;
    }
}
