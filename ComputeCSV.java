

import java.io.*;
import java.util.*;
// import java.nio.file.Paths;
// import java.nio.*;

public class ComputeCSV {

    public ComputeCSV() {}

    public static void main(String[] args) {

        // Expect args[0] to path to file

        // Path path = Paths.get(Args[0]);

        CSVFile testCsvFile = new CSVFile(args[0], ";");

        System.out.println(testCsvFile.toString());

    }
}
