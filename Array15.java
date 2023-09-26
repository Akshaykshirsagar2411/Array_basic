 import java.util.*;
 class Array15 {
    

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

        int sum = 0;
        
        for(int i=0;i<arr.length;i++){

            int count=1;
           for(int j=i+1;j<arr.length;j++){

            
            if(arr[i]==arr[j]){

                count++;
            }

            

           }
           if(count<2){

            sum = sum + arr[i];

           }
            
        }

        System.out.println("Sum of distinct number = "+sum);

        
    }
}
