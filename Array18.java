import java.util.Scanner;

class Array18 {

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


        System.out.println("Enter the sum for subarray");
        int sum = sc.nextInt();

        for(int i=0;i<arr.length;i++){

             int currentsum =0;

            for(int j=i;j<arr.length;j++){

               

                currentsum = currentsum+arr[j];
                
                if(currentsum==sum){

                    System.out.println("Sub array present at "+"{"+ i + " " + j + "} ");
                    break;
                }



                    
            }

            
        
        }

        

        
            


    }
}
