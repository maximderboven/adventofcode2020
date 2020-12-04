import java.util.ArrayList;

/**
 * @author Maxim Derboven
 * @version 1.0 4/12/2020 8:56
 */
public class part1 {
    public static void main(String[] args) {
        String input = "ecl:gry pid:860033327 eyr:2020 hcl:#fffffd\n" +
                "byr:1937 iyr:2017 cid:147 hgt:183cm\n" +
                "\n" +
                "iyr:2013 ecl:amb cid:350 eyr:2023 pid:028048884\n" +
                "hcl:#cfa07d byr:1929\n" +
                "\n" +
                "hcl:#ae17e1 iyr:2013\n" +
                "eyr:2024\n" +
                "ecl:brn pid:760753108 byr:1931\n" +
                "hgt:179cm\n" +
                "\n" +
                "hcl:#cfa07d eyr:2025 pid:166559648\n" +
                "iyr:2011 ecl:brn hgt:59in";

                String[] inputlist = input.split("\n\\s*\n");
                int teller = 0;
        for (String il: inputlist) {
            if ((il.contains("byr:") && il.contains("iyr:") && il.contains("eyr:") && il.contains("hgt:") && il.contains("hcl:") && (il.contains("ecl:") && il.contains("pid:") && il.contains("cid:")) || il.contains("byr:") && il.contains("iyr:") && il.contains("eyr:") && il.contains("hgt:") && il.contains("hcl:") && il.contains("ecl:") && il.contains("pid:"))) {
                teller++;
            }
        }
        System.out.println(teller);
    }
}
