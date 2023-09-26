 import java.util.*;
 class Array17 {

    public static void main(String[] args) {
        
        
        System.out.println("Enter array size");
         Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        

        int arr[]= new int[size];
        int arr2[]= new int[size];


         System.out.println("Enter array element for first array");


        for(int i=0;i<arr.length;i++){

            arr[i] = sc.nextInt();
        }
        System.out.println();


        System.out.println("Enter array element for second array");

        for(int i=0;i<arr.length;i++){

            arr2[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println();
        

      for(int i=0;i<arr.length;i++){

            System.out.print(arr2[i]+" ");
        }
        System.out.println();


        int max = arr[0];

        for(int i=0;i<arr.length;i++){

        
            if(arr[i]>max){

                max= arr[i];
            }
        }
        System.out.println(max);

        int min = arr2[0];

        for(int i=0;i<arr2.length;i++){

        
            if(arr2[i]<min){

                min= arr2[i];
            }
        }
 System.out.println(min);

  System.out.println("product of max and min of first and second array ="+max*min);
        
        



    }
}
