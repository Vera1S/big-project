package Homework20_from_23_10_23;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class PeopleGenerator {
    public static void main(String[] args) throws FileNotFoundException {
        File firstFile = new File("name_Female.txt");
        File secondFile = new File("nameMale.txt");
        File tirdFile = new File("PensionFund.txt");

        FileReader fileReaderNameFemale = new FileReader(firstFile);
        FileReader fileReaderNameMale = new FileReader(secondFile);
        FileReader fileReaderPensionFund = new FileReader(tirdFile);

        BufferedReader bufferedReader = new BufferedReader(fileReaderNameFemale);
        BufferedReader bufferedReaderNameMale = new BufferedReader(fileReaderNameMale);
        BufferedReader bufferedReaderPensionFund = new BufferedReader(fileReaderPensionFund);
        List<String> people = bufferedReader.lines()
                .toList();
    }
}
