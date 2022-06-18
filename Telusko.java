// ----------------------------------------------------------------------------------
//                           PROGRAM BY DEEPAK KUMAR SAINI
// ----------------------------------------------------------------------------------

public class Ineuron {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) // loop for rows
        {
            for (int j = 0; j < 40; j++) // loop for columns
            {
                // Whole Space column
                if (j == 5 || j == 11 || j == 17 || j == 23 || j == 29 || j == 34)
                    System.out.print("   ");

                // printing stars for each row
                else {

                    // starting two rows
                    if (i == 0 || i == 1) 
                    {
                        if (j != 13 && j != 14 && j != 15 && j != 16 && j != 19 && j != 20 && j != 21 && j != 31
                                && j != 32)
                            System.out.print("**");
                        else
                            System.out.print("  ");
                    }

                    // third row
                    else if (i == 2) 
                    {
                        if (j == 2 || j == 6 || j == 12 || j == 18 || j == 22 || j == 24 || j == 30 || j == 32
                                || j == 35 || j == 39)
                            System.out.print("**");
                        else
                            System.out.print("  ");
                    }

                    // middle two rows
                    else if (i == 3 || i == 4) 
                    {
                        if (j == 2 || j == 6 || j == 7 || j == 8 || j == 12 || j == 18 || j == 22 || j == 24 || j == 25 || j == 26 || j == 27 || j == 28 || j == 30 || j == 31 || j == 35 || j == 39)
                            System.out.print("**");
                        else
                            System.out.print("  ");
                    }

                    // sixth row
                    else if (i == 5) 
                    {
                        if (j == 2 || j == 6 || j == 12 || j == 18 || j == 22 || j == 28 || j == 30 || j == 32 || j == 35 || j == 39)
                            System.out.print("**");
                        else
                            System.out.print("  ");
                    }

                    // last two rows
                    if (i == 6 || i == 7) 
                    {
                        if (j != 0 && j != 1 && j != 3 && j != 4 && j != 31 && j != 32)
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

**********   **********   **           **      **   **********   **    **   **********
**********   **********   **           **      **   **********   **    **   **********
    **       **           **           **      **   **           **  **     **      **
    **       ******       **           **      **   **********   ****       **      **
    **       ******       **           **      **   **********   ****       **      **
    **       **           **           **      **           **   **  **     **      **
    **       **********   **********   **********   **********   **    **   **********
    **       **********   **********   **********   **********   **    **   **********

 */