package com.company;

import java.io.*;
import java.util.ArrayList;

public class PeopleData {
    private ArrayList people = new ArrayList();
    File folder = new File("./");

    PeopleData (ArrayList people) throws FileNotFoundException {
        this.people = people;
    }

    void writeFile (String path) throws IOException {
        PrintStream fileOut = new PrintStream("people.json");
        fileOut.println("[");
        for (Object item: people) {
            StringBuffer sb = new StringBuffer(item.toString());
            sb.insert(sb.length() - 1,"\t");
            if (people.indexOf(item) == people.size()-1)
                fileOut.println("\t" + sb);
            else
                fileOut.println("\t" + sb + ',');
        }
        fileOut.println("]");
        fileOut.close();
    }

    void readFile (String path) throws IOException {
        Reader reader = new FileReader(
                path + "/people.json");
        BufferedReader buffReader =
                new BufferedReader(reader);

        while (buffReader.ready()) {
            System.out.println(
                    buffReader.readLine());
        }

        reader.close();
        buffReader.close();
    }
}
