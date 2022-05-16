package pattern;

public class PrintZ {

    static void alphabetPattern(int N){
        int index, side_index;
        int Top =1, Bottom=1, Diagonal = N-1;

        // Loop for printing the first row
        for (index = 0; index < N; index++)
            System.out.print(Top++ + " ");

        System.out.println();
        // Main Loop for the rows from (2 to n-1)
        for (index = 1; index < N - 1; index++)
        {
            // Spaces for the diagonals
            for (side_index = 0;side_index < 2 * (N - index - 1);side_index++)
                System.out.print(" ");

            // Printing the diagonal values
            System.out.print(Diagonal--);
            System.out.println();
        }

        // Loop for printing the last row
        for (index = 0; index < N; index++)
            System.out.print(Bottom++ + " ");
    }


    public static void main(String[] args) {
        // Number of rows
        int N = 5;
        alphabetPattern(N);
    }
}
