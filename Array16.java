import java.util.*;
class Array16 {
    
    public static void main(String[] args) {
        
        
        System.out.println("Enter the String");

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        char arr[] = new char[str.length()];


        for(int i=0;i<str.length();i++){




            arr[i]=str.charAt(i);
            
        }



        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");
          }
  
          System.out.println();
  
          for(int i=arr.length-1;i>=0;i--){
  
  
              if(arr[i]=='1'){
                  
                  System.out.println(i);
                  break;
              }
              else{
                  
                  System.out.println("-1");
              }
          }
  
    }
}
