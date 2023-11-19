package Homework20_from_23_10_23;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PensionFund {

    private String namePensionFund;
    public boolean isGos;
    private String dateOfCreation;
    private List<Worker> persons;

    private Map<DayOfWeek, Boolean> workDays;

    public PensionFund(String namePensionFund, String dateOfCreation, boolean isGos, List<Worker> persons) {
        this.namePensionFund = namePensionFund;
        this.isGos = isGos;
        this.dateOfCreation = dateOfCreation;
        this.persons = persons;
        this.workDays = new HashMap<>();
    }
    public PensionFund(String strPension){
        String[] arrayPensionFund = strPension.split(" ");
        this.namePensionFund = arrayPensionFund[0];
        this.isGos = Boolean.parseBoolean(arrayPensionFund[1]);
        this.dateOfCreation = arrayPensionFund[2];
//        this.persons = arrayPensionFund[3];
    }

    public void infoState() {
        System.out.println("Наименование фонда: " + namePensionFund);
        // 1 вариант
//        if (persons == null){
//            return;
        // 2 вариант
        int count;
        if (persons != null) {
            count = persons.size();
        } else {
            count = 0;
        }
        // 3 вариант
//        int count = (persons != null) ? persons.size() : 0;
//        }
        if (isGos) {
            System.out.println("Государственный фонд: " + count / 1000 + " тысяч человек используют фонд");
        } else {
            System.out.println("Негосударственный фонд: " + count + " человек используют фонд");
        }
    }

    //Если фонд не государственный, то результат всегда равен 0 (деньги из фонда украли)
    public double calculatePensionFor(AbleToCalculatePension obj) {
        if (obj == null) {
            return 0.0;
        }
        if (isGos && isWorkDayToday() || workDays == null) {
            // Государственный фонд, используем метод calculatePension() объекта
            return obj.calculatePension() * 0.8;
        } else {
            System.out.println("Деньги из фонда украли");
            return 0.0;
        }
    }

    private boolean isWorkDayToday() {
        LocalDate localDate = LocalDate.now();
        DayOfWeek dayOfWeekNow = localDate.getDayOfWeek();

        if (workDays == null) {
            return false;
        }

        Boolean isWorkDay = workDays.get(dayOfWeekNow);
        if (isWorkDay == null) {
            return false;
        }
        return isWorkDay;
    }

    public double calculateMedianPension() {
        if (persons == null || persons.size() == 0) {
            return 0.0;
        }
        double sum = 0.0;
        for (Worker worker : persons) {
            sum += calculatePensionFor(worker);
        }
        return sum / persons.size();
    }

    public String getNamePensionFund() {
        return namePensionFund;
    }

    public boolean isGos() {
        return isGos;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setGos(boolean gos) {
        this.isGos = gos;
    }

    public List<Worker> getPersons() {
        return persons;
    }

    public void setPersons(List<Worker> persons) {
        this.persons = persons;
    }

    public Map<DayOfWeek, Boolean> getWorkDays() {
        return workDays;
    }

    public void setWorkDays(Map<DayOfWeek, Boolean> workDays) {
        this.workDays = workDays;
    }


}



