import java.util.Scanner;

class Array20{


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


        System.out.println("enter sum ");

        int sum = sc.nextInt();

        for(int i=0;i<arr.length;i++){

            
            int count=0;
            for(int j=0;j<arr.length;j++){

                if(arr[i]==arr[j]){
                    count++;
                    arr[j]=-1;
                }
            }

            System.out.println("frequncy of "+ arr[i] + "is" + count);
                
            
            
        }
        

    }
}