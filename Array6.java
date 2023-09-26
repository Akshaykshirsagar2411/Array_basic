 import java.util.*;
 class Array6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int arr[]= new int[size];


        for(int i=0;i<arr.length;i++){

            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();


        for(int i=0;i<arr.length;i++){

            if(arr[i]==0){

                arr[i]=5;
            }
        }
        System.out.println();

        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }

    }
}
