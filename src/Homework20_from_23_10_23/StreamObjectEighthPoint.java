package Homework20_from_23_10_23;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class StreamObjectEighthPoint {
    public static void main(String[] args) {
        ReaderGeneratorPensionFund readerGeneratorPensionFund = new ReaderGeneratorPensionFund();
        List<PensionFund> moreOfFunds = new ArrayList<>();
        PensionFund mostOfAllDepositors = moreOfFunds.stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparingInt(Fund -> Fund.getPersons().size()))
                .orElse(null);
        System.out.println(moreOfFunds);

        String nameOfThePerson = moreOfFunds.stream()
                .filter(Objects::nonNull)
                        .max(Comparator.comparingDouble(Worker::getMaxSalary))
                .map(pensionFund -> pensionFund.calculatePensionFor(Worker.getPercentOfPension())
                        .toList();

        System.out.println(nameOfThePerson);

        List<Worker> lozers  = moreOfFunds.stream()
                .filter(Objects::nonNull)
                .filter(pensionFund -> pensionFund.isGos())
                .filter(pensionFund -> pensionFund.getPersons().stream())
                .toList();
        System.out.println(lozers.size());


    }


}
