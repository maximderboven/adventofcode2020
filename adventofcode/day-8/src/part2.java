import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Maxim Derboven
 * @version 1.0 8/12/2020 11:57
 */
public class part2 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("C:\\Users\\maxim\\Desktop\\adventofcode2020\\adventofcode\\day-8\\src\\day8.txt"));
        ArrayList<String> lijnen = new ArrayList<>();
        while (sc.hasNextLine()) {
            lijnen.add(sc.nextLine());
        }
        sc.close();
        boolean programTerminates = false;
        int i = 0;
        while (!programTerminates && i < lijnen.size()) {
            String originalElement = lijnen.get(i);
            String el = null;
            switch (lijnen.get(i).substring(0, 3)) {
                case "nop":
                    el = lijnen.get(i).replace("nop", "jmp");
                    break;
                case "jmp":
                    el = lijnen.get(i).replace("jmp", "nop");
                    break;
            }
            if (el != null) {
                lijnen.remove(i);
                lijnen.add(i, el);
                programTerminates = checkIfProgramTerminates(lijnen);
                if (!programTerminates) {
                    lijnen.remove(i);
                    lijnen.add(i, originalElement);
                }
            }
            i++;
        }
    }
    static boolean checkIfProgramTerminates(List<String> input) {
        final boolean[] used = new boolean[input.size()];
        int localacc = 0;
        int jmp = 1;
        for (int i = 0; i < input.size(); i += jmp) {
            if (used[i]) {
                // Part1
                // System.out.println(input.get(i) + "         acc = " + acc);
                return false;
            }
            used[i] = true;
            switch (input.get(i).substring(0, 3)) {
                case "acc":
                    localacc += (input.get(i).substring(4, 5).trim().equals("+") ? 1 : -1) * Integer.parseInt(input.get(i).substring(5));
                    jmp = 1;
                    break;
                case "nop":
                    jmp = 1;
                    break;
                case "jmp":
                    jmp = (input.get(i).substring(4, 5).equals("+") ? 1 : -1) * Integer.parseInt(input.get(i).substring(5));
                    break;
            }
        }
        System.out.println("acc = " + localacc);
        return true;
    }
}
