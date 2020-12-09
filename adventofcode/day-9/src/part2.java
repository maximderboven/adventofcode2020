import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Arrays.stream;

/**
 * @author Maxim Derboven
 * @version 1.0 9/12/2020 8:01
 */
public class part2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("C:\\Users\\maxim\\Desktop\\adventofcode2020\\adventofcode\\day-9\\src\\day9.txt"));
        ArrayList<Long> getallen = new ArrayList<>();
        while (sc.hasNextLine()) {
            getallen.add(sc.nextLong());
        }
        sc.close();

        for (int i = 0; i < getallen.size(); i++) {
            int count = 0;
            ArrayList<Long> continuousSet = new ArrayList<>();
            int j = i;
            while (count < 105950735) {
                count += getallen.get(j);
                continuousSet.add(getallen.get(j));
                if (count == 105950735) {
                    System.out.println(Collections.min(continuousSet) + Collections.max(continuousSet));
                }
                j++;
            }
        }
    }
}
