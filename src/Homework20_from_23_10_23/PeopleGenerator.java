package Homework20_from_23_10_23;

import java.io.*;
import java.util.List;
import java.util.Random;

public class PeopleGenerator {
    public static void main(String[] args) throws IOException {

        Random random = new Random();

        File nameFemale = new File("src/Files/nameFemale.txt");
        File nameMale = new File("src/Files/nameMale.txt");
        File pensionFund = new File("src/Files/PensionFund.txt");
        File generatorFemale = new File("src/Files/generatorFemale.txt");
        File generatorMale = new File("src/Files/generatorMale.txt");

        FileReader fileReaderForNameFemale = new FileReader(nameFemale);
        FileReader fileReaderForNameMale = new FileReader(nameMale);
        FileReader fileReaderForPensionFund = new FileReader(pensionFund);
        FileWriter fileWriterNameFemale = new FileWriter(generatorFemale);
        FileWriter fileWriterNameMale = new FileWriter(generatorMale);
        //FileWriter fileWriterPensionFund = new FileWriter(pensionFund);

        BufferedReader bufferedReaderNameFemale = new BufferedReader(fileReaderForNameFemale);
        BufferedReader bufferedReaderNameMale = new BufferedReader(fileReaderForNameMale);
        BufferedReader bufferedReaderPensionFund = new BufferedReader(fileReaderForPensionFund);
        BufferedWriter bufferedWriterNameFemale = new BufferedWriter(fileWriterNameFemale);
        BufferedWriter bufferedWriterNameMale = new BufferedWriter(fileWriterNameMale);
        //BufferedWriter bufferedWriterPensionFund = new BufferedWriter(fileWriterPensionFund);

        List<String> nameFemales = bufferedReaderNameFemale.lines()
                .toList();
        List<String> nameMales = bufferedReaderNameMale.lines()
                .toList();

        System.out.println(nameFemales);
        System.out.println("---------");
        System.out.println(nameMales);

        for (int i = 0; i < 10000; i++) {
            int minSalary = random.nextInt(550, 1000);
            int maxSalary = random.nextInt(1100, 6000);

            String generatedFemale = nameFemales.get(random.nextInt(0, 100)) + " " + minSalary + " " + maxSalary + " " + GenderTypes.FEMALE;
            bufferedWriterNameFemale.write(generatedFemale);
            bufferedWriterNameFemale.newLine();

            String generatedMale = nameMales.get(random.nextInt(0, 100)) + " " + minSalary + " " + maxSalary + GenderTypes.MALE + " " + GenderTypes.MALE;
            bufferedWriterNameMale.write(generatedMale);
            bufferedWriterNameMale.newLine();

        }
    }
}
