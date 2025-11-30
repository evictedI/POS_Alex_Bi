
/**
 * Write a description of class arrayboc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class arraybox
{
    private String[] row;
    public void boxarray(int x) {
        row = new String[x];
        for (int i = 0; i < x;i++)
        {
            row[i] = "*";
            System.out.print(row[i] + " ");
            for(int j = 0; j < x;j++) {
                row[j] = "*";
                System.out.print(row[j] + " "); x
            }
            System.out.print("\n");
        }
    }
}