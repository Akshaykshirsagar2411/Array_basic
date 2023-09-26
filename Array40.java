
import java.util.*;

class Array40 {
    
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


        int num1=0, num2=1;

        int counter =0;

        int arr2[] = new int[size+1];
         System.out.println("fobonocci series");

        while(counter<=size){


            System.out.print(num1+" ");
            arr2[counter]= num1;

            int num3= num1 + num2;
            num1= num2;
            num2=num3;
            counter++;


        }

        System.out.println();


        System.out.println("fobonocci array");

         for(int i=0;i<arr2.length;i++){

            System.out.print(arr2[i]+" ");
        }
        System.out.println();

         System.out.println("fibonacci numbers from array ");

        for(int i=0;i<arr.length;i++){

          if(arr[i]==-1){continue;}

            for(int j=0;j<arr2.length;j++){
                

                if(arr[i]==arr2[j]){

                    System.out.print(arr[i]+" ");
                    arr[i]=-1;
                }
            }
        }






        



    }
}
