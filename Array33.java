
import java.util.*;

class Array33 {
    
    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter even array size");
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

        int mid = arr.length/2;
        

        System.out.println(mid+mid);

        // left addition
        int leftSum=0;
    for(int i=0;i<mid;i++){

       leftSum=leftSum + arr[i];
        
    }

    System.out.println("Left sum = "+leftSum);

// right sum

int rightSum=0;
    for(int i=mid;i<mid+mid;i++){

       rightSum=rightSum + arr[i];
        
    }
    System.out.println("Right sum = "+rightSum);


    System.out.println("Multiplication of left and right sum = "+leftSum*rightSum);
    }

}
