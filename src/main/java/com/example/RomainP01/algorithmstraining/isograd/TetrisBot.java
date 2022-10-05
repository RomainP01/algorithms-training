package com.example.RomainP01.algorithmstraining.isograd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TetrisBot {
    public static boolean lineHas9X(String[] line) {
        var count = 0;
        for (String item : line) {
            if (item.equals("#")) {
                count += 1;
            }
        }
        return count == 9;
    }

    public static boolean upsideRowsIsEmpty(List<String[]> allLines, int selectedRow, int selectedLine) {
        var areEmpty = true;
        for (var i = 0; i < selectedLine; i++) {
            if (allLines.get(i)[selectedRow].equals("#")) {
                areEmpty = false;
                break;
            }
        }
        return areEmpty;
    }

    public static boolean belowRowAreNotEmpty(List<String[]> allLines, int selectedRow, int selectedLine) {
        var areNotEmpty = true;
        if (selectedLine + 1 < allLines.size()) {
            if (allLines.get(selectedLine + 1)[selectedRow].equals(".")) {
                areNotEmpty = false;
            }
        }
        return areNotEmpty;
    }

    public static void main(String[] argv) throws Exception {
        Scanner sc = new Scanner(System.in);
        List<String[]> allLines = new ArrayList<>();
        var result = "NOPE";
        while (sc.hasNextLine()) {
            allLines.add(sc.nextLine().split(""));
        }
        OUTER:
        for (var i = 0; i < allLines.size() - 3; i++) {
            String[] line = allLines.get(i);
            if (lineHas9X(line)) {
                for (var j = 0; j < line.length; j++) {
                    if (line[j].equals(".")) {
                        if (upsideRowsIsEmpty(allLines, j, i)) {
                            if (allLines.get(i + 1)[j].equals(".") && allLines.get(i + 2)[j].equals(".") && allLines.get(i + 3)[j].equals(".") && lineHas9X(allLines.get(i + 1)) && lineHas9X(allLines.get(i + 2)) && lineHas9X(allLines.get(i + 3))) {
                                if ((i + 3) < allLines.size()) {
                                    if (belowRowAreNotEmpty(allLines, j, i + 3)) {
                                        result = "BOOM " + (j + 1);
                                        break OUTER;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(result);
    }
}
