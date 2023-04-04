import java.util.Scanner;

public class Latihan1 {
    public static void main(String[] args) {
        int jumlahArray;
        try (Scanner scanner = new Scanner (System.in)) {
            System.out.print("Jumlah Data : ");
            jumlahArray = scanner.nextInt();
            Integer[] array = new Integer[jumlahArray];
            
            for(int i=0;i<jumlahArray;i++){
                System.out.print("Data ke "+(i+1)+" :");
                array[i]=scanner.nextInt();
            }
            
            System.out.println();
            for(int i=0;i<jumlahArray;i++){
                System.out.println("Hasil data ke "+(i+1)+" :"+array[i]);
            }
        }
    }
}