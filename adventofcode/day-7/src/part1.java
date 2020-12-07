import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * @author Maxim Derboven
 * @version 1.0 7/12/2020 7:39
 */
public class part1 {
    public static void main(String[] args) throws FileNotFoundException {
        // Declaration
        Scanner sc = new Scanner(new File("C:\\Users\\maxim\\Desktop\\adventofcode2020\\adventofcode\\day-7\\src\\day7.txt"));
        ArrayList<String> lijnen = new ArrayList<>();
        // Input
        while (sc.hasNextLine()) {
            lijnen.add(sc.nextLine());
        }
        sc.close();

        //data bruikbaar maken
        ArrayList<String> regelsstripped = new ArrayList<String>();
        for (String lijn : lijnen) { //vibrant plum bags contain 5 faded blue bags, 6 dotted black bags.
            String[] woorden = lijn.split(" "); // vibrant, plum, bags, contain, 5 faded, blue, bags,, 6 dotted, black, bags
            String container = woorden[0] + woorden[1] + woorden[2]; //vibrant plum bags
            container = container.substring(0, container.length() - 1); //-s > vibrant plum bag
            if (!woorden[woorden.length - 3].equals("no")) { // geen andere zakken anders
                int idx = 4;
                while (idx < woorden.length) {
                    String bag = woorden[idx] + " " + woorden[idx + 1] + woorden[idx + 2] + woorden[idx + 3];
                    if (bag.endsWith(".")) {
                        bag = bag.substring(0, bag.length() - 1);
                    }
                    if (bag.endsWith(",")) {
                        bag = bag.substring(0, bag.length() - 1);
                    }
                    if (bag.endsWith("s")) {
                        bag = bag.substring(0, bag.length() - 1);
                    }
                    idx += 4;
                    regelsstripped.add(container + " " + bag);
                }
            }
        }
        Graph<String> g = new Graph<String>();
        for (String regel : regelsstripped) {
            String[] cutted = regel.split(" ");
            String source = "shinygoldbag";
            String eind = cutted[2];
            g.addEdge(source, eind, true);
        }

        // print the graph.
        System.out.println("Lijst:\n"
                + g.toString());

        // gives the no of vertices in the graph.
        g.getVertexCount();

        // gives the no of edges in the graph.
        //g.getEdgesCount(false);
    }




    static class Graph<T> {

        private Map<T, List<T>> map = new HashMap<>();

        public void addVertex(T s) {
            map.put(s, new LinkedList<T>());
        }

        public void addEdge(T source,
                            T destination,
                            boolean bidirectional) {

            if (!map.containsKey(source))
                addVertex(source);

            if (!map.containsKey(destination))
                addVertex(destination);

            map.get(source).add(destination);
            if (bidirectional == true) {
                map.get(destination).add(source);
            }
        }

        // This function gives the count of vertices
        public void getVertexCount() {
            System.out.println("mogelijkheden: "
                    + map.keySet().size()
                    + " vertex");
        }

        // This function gives the count of edges
        public void getEdgesCount(boolean bidirection) {
            int count = 0;
            for (T v : map.keySet()) {
                count += map.get(v).size();
            }
            if (bidirection == true) {
                count = count / 2;
            }
            System.out.println("Mogelijkheden: "
                    + count
                    + " edges.");
        }

        // Prints the adjancency list of each vertex.
        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            for (T v : map.keySet()) {
                if (v.toString().equals("shinygoldbag")) {
                    builder.append(v.toString() + ": ");
                    for (T w : map.get(v)) {
                        builder.append(w.toString() + " ");
                    }
                    builder.append("\n");
                }
            }
            return (builder.toString());
        }
    }
}
