package W3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Dictionary {

    private final String entry;
    private final String definition;

    public Dictionary(String entry, String definition) {
        this.entry = entry;
        this.definition = definition;
    }

    public static Dictionary[] readDictionary(String path) {
        Dictionary[] entries = new Dictionary[500];
        int count = 0;

        File f = new File(path);
        try {
            Scanner scan = new Scanner(f);
            while (scan.hasNextLine()) {
                String s = scan.nextLine();
                String[] temp = s.split(" \\u003f "); //[?] //\\?
                entries[count++] = new Dictionary(temp[0], temp[1]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No such dictionary");
        }

        return entries;
    }

    public static String matchEntry(Dictionary[] entries, String entry) {
        for (Dictionary i: entries)
            if (i != null) {
                if (i.entry.equals(entry))
                    return i.definition;
            }
            else
                break;

        return "No matching definition";
    }

    public static void main(String[] args) {
        // TODO
        if (args.length == 1) {
            Dictionary[] results = readDictionary(args[0]);
            Scanner scan = new Scanner(System.in);

            while (scan.hasNextLine()) {
                String input = scan.nextLine();
                if (!input.equals(""))
                    System.out.println(matchEntry(results, input) + "\n");
                else
                    break;
            }
        }
        else
            System.out.println("No dictionary provided");
    }

}