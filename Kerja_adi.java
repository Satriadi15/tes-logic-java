import java.util.Scanner;

public class Kerja_adi 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
		
        System.out.println("\t");
        System.out.println("============");
        System.out.println("Jawaban NO 1");
        System.out.println("============");
        int x = 1;
        for (int i = 10; i >= 1; i--) 
        {
           for (int j = 1; j<= i; j++)
           {
               System.out.print(j+" ");
           }
           for (int k = 10 - x; k >= 1; k--) 
           {
               System.out.print(k+" ");
           }
           System.out.println();
           x += 1;
        }
        
        System.out.println("\t");
        System.out.println("============");
        System.out.println("Jawaban NO 2");
        System.out.println("============");
        for (int i = 10; i >= 1; i--)
		{
            for (int j = 1; j<= i; j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
		}
        System.out.println("\t");
        System.out.println("============");
        System.out.println("Jawaban NO 3");
        System.out.println("============");
        for (int i = 10; i >= 1; i--)
		{
            for (int j = 10; j>= i; j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
		}
        System.out.println("\t");
        System.out.println("============");
        System.out.println("Jawaban NO 4");
        System.out.println("============");
        Scanner input = new Scanner (System.in);
        int i, j;
        System.out.print("Penjumlahan Ke = ");
            j=input.nextInt();
        
            for (i=1; i<=10; i++) 
            {
                System.out.println(i + " + " + j + " : " + (i+j));
            }
    }
}