 import java.util.*;
 class Array27 {



    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();


        int arr1[]= new int[size];
        int arr2[]= new int[size];

         System.out.println("Enter array element for first array");


        for(int i=0;i<arr1.length;i++){

            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter array element for second array");

        for(int i=0;i<arr1.length;i++){

            arr2[i] = sc.nextInt();
        }


        for(int i=0;i<arr1.length;i++){

            System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for(int i=0;i<arr2.length;i++){

            System.out.print(arr2[i]+" ");
        }
        System.out.println();
          System.out.println("Enter the sum find pairs");


        int sum = sc.nextInt();
       int count =0;

        for(int i=0;i<arr1.length;i++){

            for(int j=0;j<arr2.length;j++){


                if(arr1[i]+arr2[j]==sum){

                  count++;

                }
            }
        }
        if(count>0){

            System.out.println("Total pairs are = "+count);
        }else{
         
            System.out.println("Total pairs are = "+count);
        }
    }
    
}
