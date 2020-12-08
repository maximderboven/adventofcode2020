import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Maxim Derboven
 * 8/12/2020
 */
public class part1 {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(new File("C:\\Users\\maxim\\Desktop\\adventofcode2020\\adventofcode\\day-8\\src\\day8.txt"));
        ArrayList<String> lijnen = new ArrayList<>();
        while (sc.hasNextLine()) {
            lijnen.add(sc.nextLine());
        }
        sc.close();
        instructie[] instructie = new instructie[lijnen.size()];
        for (int i = 0; i < lijnen.size(); i++) {
            char ins = lijnen.get(i).charAt(0);
            int stap = Integer.parseInt(lijnen.get(i).substring(4));
            instructie[i] = new instructie(ins,stap);
        }
        int acc = 0;
        int stappen = 0;
        for (int i = 0; i < instructie.length; i+=stappen) {
            if (instructie[i].isFlag()) {
                System.out.println(acc);
                return;
            } else if (instructie[i].getInstructie() == 'n') {
                instructie[i].setFlag(true);
                stappen = 1;
            } else if (instructie[i].getInstructie() == 'j') {
                instructie[i].setFlag(true);
                stappen = instructie[i].getStap();
            } else if (instructie[i].getInstructie() == 'a') {
                instructie[i].setFlag(true);
                acc += instructie[i].getStap();
                stappen = 1;
            }

        }

    }
    public static class instructie {
        private char instructie;
        private int stap;
        private boolean flag;

        public instructie(char instructie, int stap) {
            this.instructie = instructie;
            this.stap = stap;
            this.flag = false;
        }

        public char getInstructie() {
            return instructie;
        }

        public int getStap() {
            return stap;
        }

        public boolean isFlag() {
            return flag;
        }

        public void setFlag(boolean flag) {
            this.flag = flag;
        }
    }
}