package Homework20_from_23_10_23;

import java.io.*;
import java.util.List;
import java.util.Random;

public class GeneratorWorker {
    public static void main(String[] args) throws IOException {
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


    }

}
