 
//  remve element from given index
 import java.util.*;
 class Array9 {

    public static void main(String[] args) {
        

        System.out.println("Enter array size");


        Scanner sc = new Scanner(System.in);

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


        int arr2[] = new int[size-1];

        System.out.println("Enter index for delete elememt");
        
        int index= sc.nextInt();

        for(int i=0,k=0;i<arr.length;i++){

            
            if(i==index){

                continue;
            }

           
                arr2[k++]=arr[i];
        
            
            
        }


        for(int i=0;i<arr2.length;i++){

            System.out.print(arr2[i]+" ");
        }

    }
}
