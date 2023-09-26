 
 import java.util.*;
 class Array13 {

    public static void main(String[] args) {
        

        System.out.println("Enter array size");
         Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        

        int arr[]= new int[size];
     

         System.out.println("Enter array element");


        for(int i=0;i<arr.length;i++){

            arr[i] = sc.nextInt();
        }
        System.out.println();

    
        int count = 0;
        for(int i=0;i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if(arr[i]==arr[j]){

                    count++;
                }
            }

            if(count==0){

                System.out.println("Unique elememt= "+arr[i]);


            }else{
                 System.out.println("No Unique elememt found");


            }
        }


    }
}
