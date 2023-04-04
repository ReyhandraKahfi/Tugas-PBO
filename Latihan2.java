public class Latihan2 {
 
    public static void main(String[] args) {
  
        int arr[] = { 7, 1, 3, 5, 2};
  
        for(int i = 0; i < arr.length-1; i++) {
           for(int j = 0; j < arr.length-1-i; j++) {
                 
                 //Logic to swap element
                 if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                 }
            }
        }
  
       for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
       }
   }
  
 }