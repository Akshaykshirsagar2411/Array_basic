 
 import java.util.*;
 class Array12 {
    
    public static void main(String[] args) {
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

        System.out.println("Enter element for find accourance");

        int x = sc.nextInt();

        for(int i=0;i<arr.length;i++){

            if(arr[i]==x){

                System.out.print("first accourance at index= "+i);
                break;
            }
        }
        System.out.println();

        for(int i=arr.length-1;i>=0;i--){

            if(arr[i]==x){

                System.out.print("last accourance at index= "+i);
                break;
            }
            
        }

    }
}
