// ----------------------------------------------------------------------------------
//                           PROGRAM BY DEEPAK KUMAR SAINI
// ----------------------------------------------------------------------------------

public class Ineuron {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) // loop for rows
        {
            for (int j = 0; j < 44; j++) // loop for columns
            {
                // Whole Space column
                if (j == 5 || j == 13 || j == 19 || j == 25 || j == 30 || j == 36)
                    System.out.print("   ");

                // printing stars for each row
                else {

                    // starting two rows
                    if (i == 0 || i == 1) 
                    {
                        if (j != 8 && j != 9 && j != 10 && j != 11 && j != 19 && j != 21 && j != 22 && j != 23 && j != 39 && j != 40 && j != 41 && j != 42)
                            System.out.print("**");
                        else
                            System.out.print("  ");
                    }

                    // third row
                    else if (i == 2) 
                    {
                        if (j == 2 || j == 6 || j == 8 || j == 12 || j == 14 || j == 20 || j == 24 || j == 26 || j == 29 || j == 31 || j == 35 || j == 37 || j == 39 || j == 43)
                            System.out.print("**");
                        else
                            System.out.print("  ");
                    }

                    // middle two rows
                    else if (i == 3 || i == 4) 
                    {
                        if (j == 2 || j == 6 || j == 9 || j == 12 || j == 14 || j == 15 || j == 16 || j == 20 || j == 24 || j == 26 || j == 27 || j == 28 || j == 29 || j == 31 || j == 35 || j == 37 || j == 40 || j == 43)
                            System.out.print("**");
                        else
                            System.out.print("  ");
                    }

                    // sixth row
                    else if (i == 5) 
                    {
                        if (j == 2 || j == 6 || j == 10 || j == 12 || j == 14 || j == 20 || j == 24 || j == 26 || j == 28 || j == 31 || j == 35 || j == 37 || j == 41 || j == 43)
                            System.out.print("**");
                        else
                            System.out.print("  ");
                    }

                    // last two rows
                    if (i == 6 || i == 7) 
                    {
                        if (j != 7 && j !=8 && j !=9 && j !=10 && j !=27 && j !=28 && j !=38 && j !=39 && j !=40 && j !=41)
                            System.out.print("**");
                        else
                            System.out.print("  ");
                    }
                }
            }
            System.out.println(""); // seprating each row in new line
        }
    }
}

/*
OUTPUT:-

**********   ****        **   **********   **      **   ********   **********   ****        **
**********   ****        **   **********   **      **   ********   **********   ****        **
    **       **  **      **   **           **      **   **    **   **      **   **  **      **
    **       **    **    **   ******       **      **   ********   **      **   **    **    **
    **       **    **    **   ******       **      **   ********   **      **   **    **    **
    **       **      **  **   **           **      **   **  **     **      **   **      **  **
**********   **        ****   **********   **********   **    **   **********   **        ****
**********   **        ****   **********   **********   **    **   **********   **        ****

 */
