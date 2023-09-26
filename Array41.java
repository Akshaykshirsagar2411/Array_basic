
import java.util.*;

class Array41 {
    
    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();


        int arr[]= new int[size];
        int arr2[]= new int[size];

         System.out.println("Enter array element for first array");


        for(int i=0;i<arr.length;i++){

            arr[i] = sc.nextInt();
        }

        System.out.println("Enter array element for second array");
        for(int i=0;i<arr.length;i++){

            arr2[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();


        for(int i=0;i<arr2.length;i++){

            System.out.print(arr2[i]+" ");
        }
        System.out.println();

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr2.length;j++){

                if(arr[i]>arr2[j]){

                    arr2[j]=0;
                }
                if(arr[i]<arr2[j]){

                    arr[i]=0;
                }
            }
        }

        int count1=0;
        int count2=0;

         for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();

        for(int i=0;i<arr.length;i++){

            for(int j=0;j<arr2.length;j++){

                if(arr[i]==0){

                    count1++;
                }
                if(arr2[j]==0){
                    count2++;
                }
            }
        }


        if(count1==size){

            System.out.println(arr);
        }
        
        if(count2==size){

            System.out.println(arr2);
        }




        

    }
}
