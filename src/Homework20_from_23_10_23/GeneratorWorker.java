package Homework20_from_23_10_23;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneratorWorker {
    public static void main(String[] args) throws IOException {

        List<Worker> generatorWorker = new ArrayList<>();
        Random random = new Random();

        File workerFemale = new File("src/Files/generatorFemale.txt");
        File workerMale = new File("src/Files/generatorMale.txt");

        File generatorWorkerFemale = new File("src/Files/workerFemale.txt");
        File generatorWorkerMale = new File("src/Files/workerMale.txt");

        FileReader fileReaderWorkerFemale = new FileReader(workerFemale);
        FileReader fileReaderWorkerMale = new FileReader(workerMale);

        FileWriter fileWriterWorkerFemale = new FileWriter(generatorWorkerFemale);
        FileWriter fileWriterWorkerMale = new FileWriter(generatorWorkerMale);

        BufferedReader bufferedReaderWorkerFemale = new BufferedReader(fileReaderWorkerFemale);
        BufferedReader bufferedReaderWorkerMale = new BufferedReader(fileReaderWorkerMale);

        BufferedWriter bufferedWriterWorkerFemale = new BufferedWriter(fileWriterWorkerFemale);
        BufferedWriter bufferedWriterWorkerMale = new BufferedWriter(fileWriterWorkerMale);

        List<String> workerFemales = bufferedReaderWorkerFemale.lines()
                .toList();

        List<String> workerMales = bufferedReaderWorkerMale.lines()
                .toList();

        System.out.println(workerFemales);
        System.out.println();
        System.out.println(workerMales);

for (int i = 0; i < 5000; i++){
    int minSalary = random.nextInt(550, 1000);
    int maxSalary = random.nextInt(1100, 6000);

    String generatedFemale = workerFemales.get(random.nextInt(0, 100)) + " " + minSalary + " " + maxSalary + " " + GenderTypes.FEMALE;
    bufferedWriterWorkerFemale.write(generatorWorkerFemale);
    bufferedWriterWorkerFemale.newLine();
    bufferedWriterWorkerFemale.flush();

    String generatedMale = workerMales.get(random.nextInt(0, 100)) + " " + minSalary + " " + maxSalary + " " + GenderTypes.MALE;
    bufferedWriterWorkerMale.write(generatedMale);
    bufferedWriterWorkerMale.newLine();
    bufferedWriterWorkerMale.flush();
}
    }

}
