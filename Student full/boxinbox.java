public class boxinbox
{
    public static void box(int i)
    {
        for(int zeile = 0; zeile < i; zeile++)
        {
            for(int spalte = 0; spalte < i; spalte++)
            {
                if(zeile == 0) {
                    System.out.print("#");
                }
                else if(zeile == i-1) {
                    System.out.print("#");
                }
                else if(spalte == 0) {
                    System.out.print("#");
                }
                else if(spalte == i-1) {
                    System.out.print("#");
                }
                else if(zeile == spalte) {
                    System.out.print("#");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}