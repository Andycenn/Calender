public class Calendar
{
    public static void main (String[] args)
    {
        int x = 1;
        while (x < 31)
        {
            System.out.println( "September" + x);
        x++ ;
        
        if ( x == 6 || x == 7 || x == 13 || x == 14 || x == 20 || x == 21 || x == 27 || x == 28 )
        {
        System.out.println( " - WEEKEND");
        }
        if (x == 8)
        {
            System.out.println( " - NO SCHOOL (LABOR DAY)");
        }
            if (x == 26)
            { System.out.println( " - END OF MARKING PERIOD");
            }
        }
    }
}