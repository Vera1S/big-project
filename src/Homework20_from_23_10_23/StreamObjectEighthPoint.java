package Homework20_from_23_10_23;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

import static java.util.stream.Collectors.toList;

public class StreamObjectEighthPoint {
    public static void main(String[] args) throws FileNotFoundException {
        ReaderGeneratorPensionFund readerGeneratorPensionFund = new ReaderGeneratorPensionFund();

        List<PensionFund> moreOfFunds = readerGeneratorPensionFund.findPensionFund();

        PensionFund mostOfAllDepositors = moreOfFunds.stream()
                .filter(Objects::nonNull)
                .filter(fund -> fund.getPersons() != null)
                .max(Comparator.comparingInt(Fund -> Fund.getPersons().size()))
                .orElse(null);
        System.out.println(mostOfAllDepositors);

       // String nameOfThePerson = moreOfFunds.stream()
       //         .filter(Objects::nonNull)
       //                 .max(Comparator.comparingDouble(Worker::getMaxSalary))
       //         .map(pensionFund -> pensionFund.calculatePensionFor(Worker.getPercentOfPension())
       //                 .toList();

       // System.out.println(nameOfThePerson);

      // List<Worker> lozers  = moreOfFunds.stream()
      //         .filter(Objects::nonNull)
      //         .filter(pensionFund -> pensionFund.isGos())
      //         .filter(pensionFund -> pensionFund.getPersons().stream())
      //         .toList();
      // System.out.println(lozers.size());

      // List<Double> victimOfNonFunds = moreOfFunds.stream()
      //         .filter(Objects::nonNull)
      //         .map(pensionFund -> pensionFund.calculatePensionFor(getPersons()).stream())
      // .toList();
      // System.out.println(victimOfNonFunds);

        //readerGeneratorPensionFund avgPension
    }
}
