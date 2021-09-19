import java.util.Scanner;

public class F{
    public static void main(String[] args){
        int a, b;
        int baris = 3;
        int kolom = 3;
        int array[][] = new int[baris][kolom];
        Scanner KB = new Scanner(System.in);

        for(a=0; a<baris; a++)
        {
            for(b=0; b<kolom; b++)
            {
                array[a][b] = KB.nextInt();
            }
        }
        for(a=0; a<kolom; a++)
        {
            for(b=0; b<baris; b++)
            {
                System.out.print(array[b][a]+" ");
            }
            System.out.println();
        }
    }
}