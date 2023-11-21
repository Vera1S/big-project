package Homework20_from_23_10_23;

import java.io.*;
import java.util.List;
import java.util.Random;

public class GeneratorPensionFund {
    public static void main(String[] args) throws IOException {
        Random random = new Random();

        File pensionFund = new File("src/Files/PensionFund.txt");

        File generatorPensionFund = new File("src/Files/generatorPensionFund.txt");

        FileReader fileReaderForPensionFund = new FileReader(pensionFund);
        FileWriter fileWriterPensionFund = new FileWriter(generatorPensionFund);

        BufferedReader bufferedReaderPensionFund = new BufferedReader(fileReaderForPensionFund);
       BufferedWriter bufferedWriterPensionFund = new BufferedWriter(fileWriterPensionFund);

        List<String> pensionFunds = bufferedReaderPensionFund.lines()
                .toList();

        System.out.println(pensionFunds);

        for (int i = 0; i < 100; i++){
            boolean isGos = random.nextBoolean();
            int nameRandomPensionFund = random.nextInt(0, 100);

            String generatorPensionFunds = pensionFunds.get(random.nextInt(0, 86)) + " " + nameRandomPensionFund + ", " + isGos;
            bufferedWriterPensionFund.write(generatorPensionFunds);
            bufferedWriterPensionFund.newLine();
            bufferedWriterPensionFund.flush();
        }
    }

}
