import java.util.Scanner;

class Array5{

    public static void main(String[] args) {
       
        
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        int arr[]= new int[size];


        for(int i=0;i<arr.length;i++){

            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
        }

        System.out.println();

        int mul=1;
        for(int i=0;i<arr.length;i++){

            mul = mul*arr[i];
            
        }

        System.out.println("product of array"+mul);


        
    }
}