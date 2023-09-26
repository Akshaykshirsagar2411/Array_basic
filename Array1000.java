
import java.util.*;

class Array1000 {
    
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








        int first = arr[0];
        for(int i=0;i<arr.length+1;i++){

            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=first;

         System.out.println();

        for(int i=0;i<arr.length-1;i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();



    }
}
