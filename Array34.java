
import java.util.*;

class Array34 {
    
    public static void main(String args[]){


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size = sc.nextInt();


        int arr[]= new int[size];
        int arr2[] = new int[size];

         System.out.println("Enter array element");


        for(int i=0;i<arr.length;i++){

            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();


        int mid = arr.length/2;

        System.out.println(mid);

        int min = arr[0];

        for(int i=0;i<arr.length;i++){

            if(arr[i]<min){

                min = arr[i];
            }
        }
        System.out.println(min);

        arr2[mid]=min;

        for(int i=0; i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if(arr[i]<arr[j]){

                    int temp = arr[i];
                    arr[i]=arr[j];
                     arr[j]=temp;
                }
            }
        }


         for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }
        System.out.println();


        int index1=1;

        for(int i=0;i<mid;i++){

            arr2[i] = arr[index1];
            index1++;
        }

         System.out.println("Pendulam array");

        for(int i=0;i<arr2.length;i++){

            System.out.print(arr2[i]+" ");
        }
       
 System.out.println();


         for(int i=0; i<arr.length;i++){

            for(int j=i+1;j<arr.length;j++){

                if(arr[i]<arr[j]){

                    int temp = arr[i];
                    arr[i]=arr[j];
                     arr[j]=temp;
                }
            }
        }

        // for(int i=0;i<arr.length;i++){

        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();

        // int index2 = arr.length-1;
        
        // for(int i=mid+1;i<arr.length;i++){

        //     arr2[i] = arr[index2];
        //     index2--;
            
        // }

        // System.out.println("Pendulam array");

        // for(int i=0;i<arr2.length;i++){

        //     System.out.print(arr2[i]+" ");
        // }
       




    }
}
