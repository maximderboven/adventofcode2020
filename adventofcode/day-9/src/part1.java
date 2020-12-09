import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Maxim Derboven
 * @version 1.0 9/12/2020 7:15
 */
public class part1 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\maxim\\Desktop\\adventofcode2020\\adventofcode\\day-9\\src\\day9.txt"));
        ArrayList<Long> getallen = new ArrayList<>();
        while (sc.hasNextLine()) {
            getallen.add(sc.nextLong());
        }
        sc.close();

        for (int i = 25; i < getallen.size(); i++) {
            int teller = 0;

            for (int j = i-25; j <= i; j++) { //i-5 tot i
                for (int k=i-25; k <= i; k++) { //i-5 tot i
                    if (getallen.get(i) == getallen.get(j)+getallen.get(k)) {
                        teller++;
                    }
                }
            }
            if (teller == 0) {
                System.out.println(getallen.get(i) + " Heeft geen voorgaande getallen die evt zijn getal vormen.");
            }
        }
    }




}
