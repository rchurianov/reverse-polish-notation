package com.roma.rpn;

import java.util.List;
import java.util.LinkedList;
import java.nio.file.Path;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class CSVFile {

    private List<Line> lines;

    public CSVFile() {}

    public CSVFile(List<Line> lines_list) {
        lines = lines_list;
    }

    public CSVFile(String path, String delimiter) {
        lines = parseCSV(path, delimiter);
    }

    public List<Line> parseCSV(String path, String delimiter) {

        BufferedReader br = null;
        String rawLine;
        List<Line> parsedLines = new LinkedList<Line>();

        try {
            br = new BufferedReader(new FileReader(path));

            while ((rawLine = br.readLine()) != null) {
                String[] rawCells = rawLine.split(delimiter);
                LinkedList<Cell> cells = new LinkedList<Cell>();
                for (String c : rawCells) {
                    cells.add(new Cell(c));
                }
                parsedLines.add(new Line(cells));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    // Close the reader
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return parsedLines;
    }

    public String toString() {
        StringBuilder result = new StringBuilder();

        for (Line l : this.lines) {
            result.append(l.toString());
            result.append("\n");
        }

        return result.toString();
    }
}
