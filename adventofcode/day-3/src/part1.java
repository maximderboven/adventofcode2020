/**
 * @author Maxim Derboven
 * @version 1.0 3/12/2020 16:04
 */
public class part1 {
    public static void main(String[] args) {

        String[] rijen = new String[]{
                ".##.....#....#....#..#.#...#.##",
                ".###........#.##....#......#..#",
                "#..#..#.....#...#....#.#.......",
                ".........#.................#...",
                "..#.......#.#.......#.......#.#",
                ".####........#.#..##.........#.",
                "........#.........#.........#..",
                "#..##...##....#.....##......#..",
                ".........#..............#......",
                "#.........#...##.........#.#...",
                "..............#........##.....#",
                "##....#...........#....#.#...#.",
                ".....#..#.....#...#.#..........",
                "#.......#...#..##........##..#.",
                ".#........#.......#............",
                ".......##.....#.#.#..#.#.......",
                "..#......#..#....##......#.#...",
                ".....##....#..#.....#..#.......",
                ".............#.......#.#....#..",
                ".................#.#......#....",
                ".#..#....#..........#.....#.##.",
                "#.#.#.#.....###.......#.....#..",
                "#...#..........#..#............",
                "...#...##.......#.##..#........",
                "..#...#.#.##...##.........#.#.#",
                ".....#...#.#....#.#.....#......",
                "...#...#.#..#...#.....#........",
                "...........###.#.......#.#.....",
                "..#..#.#........#.#.......#.#.#",
                ".#.......#...........#.........",
                ".#..#...##....#.......###..##..",
                "#....#.....#....##..#.........#",
                "#..#.......#...#......#.#....#.",
                "......##..#..#....#.#........##",
                "#.....#.........#......#..##..#",
                ".#..#.......#....#............#",
                "....#..........#.#...##....#.##",
                "..#...#.#...#.###.#..#......#..",
                "#.#...#..............#.......#.",
                "..##.......#......#....###.....",
                "......#.......#.#.##.#..##.#...",
                ".#......#......#.#....#..#.#..#",
                "....#....#..#...#.....#.#..#...",
                ".#.....#.#.#..#........#.#.###.",
                "#..#..#.#......#..#..#....#.#..",
                "..#.###....#....##...#.........",
                "...........#..#...........#....",
                ".................#..........#.#",
                ".#.#....#..#........#..#.......",
                "...........##..#...............",
                "...#.##.........#.........#.#.#",
                "........#..#....#.#............",
                "...##...##..................#.#",
                "...#..##..#...#......#.....#..#",
                ".##.#..#..#......#......#.....#",
                "....#.....#....#......##.#.....",
                ".....#.##....#...#.............",
                "......#...#.....##....#...#..##",
                "...#............#.###....##....",
                "............#.#.#...#.#........",
                "#.....#..#.#..##...........#.##",
                ".....#.#.#.#..##......##.#..#..",
                ".#.##..#.........#......#.....#",
                ".#.#.#.#.#..#..#........###....",
                "......##..........#.#.....##..#",
                "..#...#..#.....#.#.....#.......",
                "............#....#.............",
                "........#...#..#....#.#..###...",
                "#........##....##..............",
                ".........#.#.#..#..#...#.#.....",
                "....#............#....####...#.",
                "##.#.#......#.....#...#....###.",
                "...#..#..#..#.......#..#.#.#..#",
                "..#..#....#...#.##..#.........#",
                "#..#.#....#....#...#..##..#.#..",
                "...#....#.............#..#.#..#",
                "..#......#.##...#..............",
                "#....##.#.#...##......#.....##.",
                ".#...##...#...####.....##......",
                "...........#.###....#...#...#..",
                "##..#..##..#..#.#.#..###.......",
                ".#...##......#........##..#....",
                ".#...#...#.....#............#..",
                ".#.#.#...#.#..#.......#......#.",
                ".................#..#.#......#.",
                "#..#####......##.#....#...#....",
                "........#......#.....##......#.",
                "....#.#...#...#..#.......#####.",
                ".....##......#...#.......#....#",
                ".#....#...#..#...#.#...#..#...#",
                "....##.........#.#...####.#....",
                "...##..........#.#.......##....",
                ".........#......#.....#....#...",
                "#....##..#......#.....##....#..",
                "...#.#.............#...#.....#.",
                "...........#...#.#....#..#.#...",
                ".......#.#.#.....#..#........#.",
                "..##.....#..#.....##..#........",
                "...#.#..........#...#....#.#...",
                "..#....#......#...#.#...##..#.#",
                ".#...#..#..#..#.......#........",
                ".................#.#...........",
                "...............#......##.....#.",
                "..##.....###..#....#.........##",
                "....#.#........#.####.#...#....",
                ".....#.....##..####..##.......#",
                ".....####.#...#......#.........",
                "........#..#......#.....##.....",
                "...###..#.#..###.......#.......",
                "...#...##..#..#..#..#.##.......",
                "..#......##..#.....##..##......",
                "#.......#.#..#.................",
                "#.......#...#..###....#.#.#.#..",
                "#...#.#....##.##.#...........#.",
                ".#.........#..###..#.........#.",
                "#...#......#...#.#.........#...",
                ".#.##..............#.#....#...#",
                "........#.....#..#.#.#......#..",
                "............####.#......#......",
                "......#.#.#...#.#...#.#.....#..",
                "....#....#...#.....#.......#.#.",
                "..#....#....###..#....#.....##.",
                ".................#.....#.#....#",
                ".#.............#......#.##..#..",
                "#.....##.......#..#.....#....#.",
                "#.#......####...##.....#....##.",
                ".....#.#....#..................",
                "....#....#..#.#...........##...",
                "...#.............##......#..#..",
                "......#..........#...#...##.###",
                "...##......##.....#......#....#",
                "........#.#.#...#...#..##......",
                "......................###....##",
                ".#.....#..#..#.##.#.#.#....#.##",
                ".#..............#.....#......#.",
                ".#...#.##....#.....#.#.#..#..#.",
                "##...##.......#.....#..###.....",
                "...#..#.#....#........#........",
                "....#..............##...#......",
                "...........#..#.....##.#.#.#...",
                "#.#.....##..##.#.#........#....",
                ".........#....#.....#..##.#...#",
                "...#...#..#..#.####...#.......#",
                ".....##.....##.....#......#....",
                "#.##...#....#............#..##.",
                ".#.##..#...#....#.#......#.....",
                "..###................#.........",
                ".#..#..#................#......",
                "....#..#........#..#....#......",
                ".#..........###......#...###...",
                "...........##...#.#..#.........",
                "...#....#..........#.....#..##.",
                "..#..#.............#......###..",
                "#....#....##.....#....#.##.....",
                "......#.......#..#..........##.",
                "#..##.#...#.#.........#....#.#.",
                "...#...#..........#...#..#....#",
                "...###..#.#......#.##.#####...#",
                "..#.....#.#..............#..##.",
                "#..###......#.#..#........#....",
                ".#.......#.......#.....#.##....",
                ".#...##..#.......##.....#....##",
                "..........#.#..#.....#.........",
                ".......####...#...#.....##.....",
                "......#.......#.......#..#.#...",
                "...##....##.#.......#.##......#",
                ".#...#............#......##....",
                "#..#..#...#.#........#.........",
                ".......#.......#.....##.#......",
                ".#....##...#....#.........#...#",
                "#.#....#.....##...........#..#.",
                ".....#......#....#......#.#...#",
                ".#............#...#.#....#....#",
                "........##..#..##..##.##....#..",
                "........................#.#....",
                "#....#...#.....................",
                "##.#.............#.....#...##.#",
                "....##....###.......#..........",
                "..#.#..#.#...####.....#.....#..",
                "#.........#.......#......#..##.",
                ".#.#.............#..#...#...#..",
                "#..#....#....#..##.........#...",
                "#.#.....#.##.#...#.##..#.#..##.",
                "......#......#.###....#..###...",
                ".##...#.......#.........#.#...#",
                "..........#...#....#..#....#...",
                ".....#...#.....#....##....#.#..",
                "#....#...........#.#...#.......",
                ".###..#........##..........#...",
                "....###.##..#...#.#..##......##",
                ".#...#...........#...........#.",
                "#......#....#.##.........##..#.",
                ".#.......#........#......#.#.#.",
                ".......#..##.........#......#..",
                ".#..#.....##....##....#.....#..",
                "#.#.#.....#...#......#.........",
                "..............#.#.........#.#..",
                "....#...#.............#.#......",
                "..##.#............#.#.##....#..",
                ".....####..........#.#....##..#",
                "......#.#.........#.......###..",
                "#....##.#...#.#...........#...#",
                ".....#...#......#....###...#..#",
                "#....#..............#...#......",
                "...#..###...#..........#....#..",
                "#......#..#.#.#......#..#...#..",
                "................##......#..#...",
                "....#..#..#........##..#...#...",
                "...##.......#.##.#.....##...#.#",
                ".......#.##.#..#.....#...#.....",
                "......#........#..#......##.##.",
                "....................#.....#.#..",
                ".##....#...#...##...#.........#",
                "..#...#..#.##..#.#.#......#....",
                "#....###.#..#..#...#..#...##...",
                "#.......#.....#.#.......###.#.#",
                ".#.##...##..#......#....#...#..",
                "#.....#.......##..#....#.......",
                "...###...#............#....#..#",
                ".#....#.#...#..#..#.##.#.#.#...",
                "#......#.#..#.#.#......#.......",
                "..#..#....###.#........#..#.#..",
                ".......#......##.........#.....",
                "...#...###..#..#.##.#..##......",
                ".#.......##.......#..#..#.###.#",
                ".###.#..#.###...........#......",
                "...#................#.#...##..#",
                "....#.###....#.......#........#",
                ".##...#...#..#.....#...#.......",
                ".#...#..#...........#.#......##",
                "...##..#.#.#..#.#.#.......#....",
                ".#.#..#..#.#...........#.......",
                "..#....#.#.#.#.#..............#",
                "..##..............##....#.#..#.",
                "..#....#...##.....###.....#.#.#",
                "#....#......#..........##......",
                ".##.#.#......#...##..###..#....",
                ".#...........#.##.......##..##.",
                "###.....##...#.##..#...........",
                "...#.....#...........#..#.....#",
                "#.........#....#.......#.......",
                ".#.#...#.###....#..#...........",
                ".....#.......#.....#.##.#.#.#..",
                "..##.#.........##.........#..#.",
                ".......#....#......#.........##",
                "...##.....#..#.......#..#.#....",
                "..#...###.......#..#....###....",
                ".......#...###......#.#.....#.#",
                "#....#...#.#....#.#..........#.",
                "........#..#.....#.#.#.........",
                "......##.......###.......#...#.",
                ".........#..#..#.......#.......",
                "#.......#...#.....#.#..#....#..",
                ".##....#..###.............#....",
                "#.#...#.......#.....##.#.#....#",
                "....#....##.#........##........",
                "...##...#.#.............#...##.",
                "##....#.....#..#..#......#.....",
                "#...#.#........##....##......##",
                "..#...........#..#......###....",
                "..##..#.....#......#....##.....",
                "....###.#...#......##......#...",
                "....#....###...........###.#..#",
                "..#....#...#.##....#...#.......",
                "....##...........#............#",
                "..#.#......#......#.##.#...#..#",
                "#.###.............#.#.##.#.....",
                "#....##....#..#.#.#...........#",
                "...#...................#.......",
                ".#...#......#.......#.#....#..#",
                "....#...#..#..#..#.#.....#....#",
                "..#....#............#..###..##.",
                "...##...#...........#..#..#.#..",
                "..#..#..#.........#.........#.#",
                "...#.#.....#.#..##.........#...",
                "....#..........................",
                "....#.....#.#...#.###.........#",
                "....#.#.......#..#.#.#...#...#.",
                ".....#...#..#.....##....#.#.#..",
                "#....###......#..#..........#..",
                ".#.....#......##.......#...#.##",
                "...#..#.....#.#.....#.......##.",
                "............#..#....#...#..#.#.",
                "..........#.#..#..##...........",
                ".......#.......#..##...##.....#",
                "....#...##.#..#...#.#.......#..",
                "....#.#........#...####...#....",
                "#.#.............#.............#",
                ".#.#......#....#..#..#.....##.#",
                "#..#...........#........#.....#",
                "#....#....#.#..#.#....#.#...##.",
                "....##...##...#...#...........#",
                "...#.#..#....#..#..#..#........",
                "...#..##..#........#..........#",
                "#......#.##..##.......#..#.....",
                "..#...#......#...##.#..........",
                ".###.#..#..#........####...#...",
                "#..............#.#.#........#..",
                "..##....#.......#....##...#..##",
                ".##...#..#.#.....#..#.......##.",
                "..#.........##.......#....#..#.",
                ".#..#...#..##.#..#.....#.......",
                ".#....#.........#..#...#...##..",
                "..###..######..#.##.#....#.....",
                "....#..#.....#.............#..#",
                "...#....#.......#..#.#.......##",
                ".....#......#.......#..##...#..",
                ".##..#....##..##......#...#..#.",
                "......#......#...#...###.......",
                "....#.....#.###..##.....#.#.##.",
                ".......#....#...#..#..#...#.#..",
                "...####.#...#...#.#...##....#..",
                "......#.#....#....#.#....##....",
                "#..##...........####....##.#...",
                "...#...##.#.......#.#..........",
                "..#......#..#..#...#......#....",
                "..###..#.....#..#.#.......#...#",
                "#........#...##..#...#....#....",
                "...#.#...#.....#........#...#..",
                "...#....#.###...#..#...#..##.#.",
                ".....#..#..#...#...#..#........",
                "..#......##...............#.#.#",
                ".#...###.#....##..........#.#.."};

        int locatie = 1;
        int totaal = 0;
        int bomen;
        for (int i = 0; i < rijen.length; i++) {
            if (rijen[i].charAt(locatie-1) == '#') {
                totaal++;
            }
            if (locatie+3 > 31)
            {
                locatie = (locatie+3)-31;
            } else {
                locatie +=3;
            }
        }
        System.out.println(totaal);
    }
}
