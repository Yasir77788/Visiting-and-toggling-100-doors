/*
 * Given 100 doors in a row that are initially closed. 
 * You have to visit these doors 100 times and each time you do; 
 * you start from the first door. For each visited door, you toggle it 
 * (if it is closed, then you open it, and vice versa). 
 * At the first visit, you visit all 100 doors. At the second visit,
 *  you visit every second door (#2, #4, #6 ...). At the third visit, 
 *  you visit every third door (#3, #6, #9, ...). 
 *  You follow this pattern until you visit only the 100th door. 
 *  So, reveal the state of the doors (closed or opened) after 100 visits.
 */



import java.util.Arrays;

public final class HundredDoors 
{

    private static final int DOORS = 100;

    public static void main(String[] args) 
    {

        int[] result = visitToggle();

        System.out.println("Result: " + Arrays.toString(result));
    }

    public static int[] visitToggle() 
    {

        // 0 - closed door
        // 1 - opened door     
        int[] doors = new int[DOORS];

        for (int i = 0; i <= (DOORS - 1); i++) 
        {
            doors[i] = 0;
        }
        
        
        // Iterate over all the doors in the required order
        // open or close the door based on their position 
        // during the iterations.
        for (int i = 0; i <= (DOORS - 1); i++) 
        {
            for (int j = 0; j <= (DOORS - 1); j++) 
            {

                if ((j + 1) % (i + 1) == 0) 
                {

                    if (doors[j] == 0) 
                    {
                        doors[j] = 1;
                    } 
                    else 
                    {
                        doors[j] = 0;
                    }
                }
            }            
        }

        return doors;
    }
}
