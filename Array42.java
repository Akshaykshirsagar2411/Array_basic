
import java.util.*;

class Array42 {
    
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
         System.out.println();
        

 System.out.println("enter two elemnt");

        int index1 = sc.nextInt();
        int index2 = sc.nextInt();
        int count =1;
        int first =0;
        int second =0;


        for(int i=0;i<arr.length;i++){

            if(arr[i]==index1){

                 first = i;
                System.out.println(i);
                break;
        }
                

            }
             

        

         for(int i=0;i<arr.length;i++){

            if(arr[i]==index2){

                 second = i;
                System.out.println(i);
                break;
                

            }
            
        }


        System.out.println();
        int count1 =0;

        for(int i=first;i<second-1;i++){

            count1++;
        }


        System.out.println("total number between 2 element = "+count1 );






    }
}
