package Homework20_from_23_10_23;

import java.io.*;
import java.util.List;
import java.util.Random;

public class PeopleGenerator {
    public static void main(String[] args) throws IOException {

        Random random = new Random();

        File nameFemale = new File("name_Female.txt");
        File nameMale = new File("nameMale.txt");
        File pensionFund = new File("PensionFund.txt");

        FileReader fileReaderNameFemale = new FileReader(nameFemale);
        FileReader fileReaderNameMale = new FileReader(nameMale);
        FileReader fileReaderPensionFund = new FileReader(pensionFund);
        FileWriter fileWriterNameFemale = new FileWriter(nameFemale);
        FileWriter fileWriterNameMale = new FileWriter(nameMale);
        FileWriter fileWriterPensionFund = new FileWriter(pensionFund);

        BufferedReader bufferedReaderNameFemale = new BufferedReader(fileReaderNameFemale);
        BufferedReader bufferedReaderNameMale = new BufferedReader(fileReaderNameMale);
        BufferedReader bufferedReaderPensionFund = new BufferedReader(fileReaderPensionFund);
        BufferedWriter bufferedWriterNameFemale = new BufferedWriter(fileWriterNameFemale);
        BufferedWriter bufferedWriterNameMale = new BufferedWriter(fileWriterNameMale);
        BufferedWriter bufferedWriterPensionFund = new BufferedWriter(fileWriterPensionFund);

        List<String> nameFemales = bufferedReaderNameFemale.lines()
                .toList();
        List<String> nameMales = bufferedReaderNameMale.lines()
                .toList();

        for (int i = 0; i < 10000; i++) {
            int minSalary = random.nextInt(550, 1000);
            int maxSalary = random.nextInt(1100, 6000);
            String[]

        }
    }
}
