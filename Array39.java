
import java.util.*;

class Array39 {
    
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



        for (int i = 0; i < arr.length; i++){
    {
        for (int j = i; j < arr.length; j++)
        {
            if (arr[i] < arr[j])
            {
                break;
            }

            if (j == arr.length - 1)
                System.out.println("leaders in array is "+arr[i]);
        }
    }

    }
}
}