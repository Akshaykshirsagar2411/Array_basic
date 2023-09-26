import java.util.Scanner;

class Array21{


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


        System.out.println("enter no occurance of element ");

        int k = sc.nextInt();

        for(int i=0;i<arr.length;i++){

            int x = arr[i];
            int count=0;
            if(x== -1)continue;
            for(int j=0;j<arr.length;j++){

                if(arr[j]==x){
                    count++;
                    arr[j]=-1;
                }

            }
            if(count==k){


                System.out.println("Element "+x+" accour "+k+ " times");
            }

            // System.out.println("frequncy of "+ x + " is " + count);
                
            // int fre[] = new int[5] ;
            
            
        }
        

    }
}