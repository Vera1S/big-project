package Homework20_from_23_10_23;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GeneratorWorker {
    public static void main(String[] args) throws IOException {

        List<Worker> generatorWorker = new ArrayList<>();
        Random random = new Random();

        String generatorFemale = "src/Files/generatorFemale.txt";
        String generatorMale = "src/Files/generatorMale.txt";

        FileReader fileReaderWorkerFemale = new FileReader(generatorFemale);
        FileReader fileReaderWorkerMale = new FileReader(generatorMale);

        BufferedReader bufferedReaderWorkerFemale = new BufferedReader(fileReaderWorkerFemale);
        BufferedReader bufferedReaderWorkerMale = new BufferedReader(fileReaderWorkerMale);


        List<String> workerFemales = bufferedReaderWorkerFemale.lines()
                .toList();

        List<String> workerMales = bufferedReaderWorkerMale.lines()
                .toList();

        System.out.println(workerFemales);
        System.out.println();
        System.out.println(workerMales);

        for (int i = 0; i < workerFemales.size(); i++){
            String worker = workerFemales.get(i);

        }
    }

}
