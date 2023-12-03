package Homework20_from_23_10_23;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class ReaderGeneratorPensionFund {
    public static void main(String[] args) throws FileNotFoundException {
        String readerPensionFund = "src/Files/generatorPensionFund.txt";

        FileReader fileReaderPensionFund = new FileReader(readerPensionFund);
        BufferedReader bufferedReaderPenFund = new BufferedReader(fileReaderPensionFund);

        List<PensionFund> readerPensionFunds = bufferedReaderPenFund.lines()
                .map(PensionFund::new)
                .toList();
        System.out.println(readerPensionFunds);

        for (int i = 0; i < readerPensionFunds.size(); i++) {
            PensionFund pensFunds = readerPensionFunds.get(i);
            System.out.println(pensFunds);

        }

        List<PensionFund> readerGenerFund = new ArrayList<>();
    }
}
