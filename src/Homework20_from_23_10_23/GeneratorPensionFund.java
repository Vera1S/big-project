package Homework20_from_23_10_23;

import java.io.*;
import java.util.Random;

public class GeneratorPensionFund {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        File pensionFund = new File("src/Files/PensionFund.txt");

        FileReader fileReaderForPensionFund = new FileReader(pensionFund);
        FileWriter fileWriterPensionFund = new FileWriter(pensionFund);

        BufferedReader bufferedReaderPensionFund = new BufferedReader(fileReaderForPensionFund);
       BufferedWriter bufferedWriterPensionFund = new BufferedWriter(fileWriterPensionFund);


    }

}
