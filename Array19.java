import java.util.*;

class Array19 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size");
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();
        int size3 = sc.nextInt();





        int arr1[]= new int[size1];
         int arr2[]= new int[size2];
          int arr3[]= new int[size3];

         System.out.println("Enter array element for first array");


        for(int i=0;i<arr1.length;i++){

            arr1[i] = sc.nextInt();
        }

        for(int i=0;i<arr1.length;i++){

            System.out.print(arr1[i]+" ");
        }
        System.out.println();


        
         System.out.println("Enter array element for second array");


        for(int i=0;i<arr2.length;i++){

            arr2[i] = sc.nextInt();
        }

        for(int i=0;i<arr2.length;i++){

            System.out.print(arr2[i]+" ");
        }
        System.out.println();

        
         System.out.println("Enter array element for third  array");


        for(int i=0;i<arr3.length;i++){

            arr3[i] = sc.nextInt();
        }

        for(int i=0;i<arr3.length;i++){

            System.out.print(arr3[i]+" ");
        }
        System.out.println();


        

        for(int i=0;i<arr1.length;i++){

            for(int j=0;j<arr2.length;j++){

                for(int k=0;k<arr3.length;k++){

                    if(arr1[i]==arr2[j] && arr2[j]==arr3[k] && arr1[i]==arr3[k]){

                        System.out.println("Common element are "+arr1[i]);
                    
                    }

                    
                
                }
            }
        }


    }
}
