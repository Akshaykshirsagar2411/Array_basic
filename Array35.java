
import java.util.*;

class Array35 {
    
    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();


        int arr[]= new int[size];

         System.out.println("Enter array element");


        for(int i=0;i<arr.length;i++){

            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();


        System.out.println("Enter the k value for product of element");

        int k = sc.nextInt();
        int product=1;

        for(int i=0;i<k;i++){


            product=product*arr[i];
        }

        System.out.println("Product of k integers = "+ product);


        }



    }

