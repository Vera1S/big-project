package Homework20_from_23_10_23;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
public class PensionFund {

    private String pensFundName;
    public boolean gos;
    private String dateOfCreation;
    private List<Worker> persons;

    private Map<DayOfWeek, Boolean> workDays;

    public PensionFund(String pensFundName, String dateOfCreation, boolean gos, List<Worker> persons) {
        this.pensFundName = pensFundName;
        this.gos = gos;
        this.dateOfCreation = dateOfCreation;
        this.persons = persons;
        this.workDays = new HashMap<>();

    }

    public void infoState() {
        System.out.println("Наименование фонда: " + pensFundName);
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
        if (gos) {
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
        if (gos && isWorkDayToday() || workDays == null) {
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

    public String getPensFundName() {
        return pensFundName;
    }

    public boolean isGos() {
        return gos;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setGos(boolean gos) {
        this.gos = gos;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PensionFund that = (PensionFund) o;

        if (gos != that.gos) return false;
        if (!Objects.equals(pensFundName, that.pensFundName)) return false;
        if (!Objects.equals(dateOfCreation, that.dateOfCreation))
            return false;
        if (!Objects.equals(persons, that.persons)) return false;
        return Objects.equals(workDays, that.workDays);
    }

    @Override
    public int hashCode() {
        int result = pensFundName != null ? pensFundName.hashCode() : 0;
        result = 31 * result + (gos ? 1 : 0);
        result = 31 * result + (dateOfCreation != null ? dateOfCreation.hashCode() : 0);
        result = 31 * result + (persons != null ? persons.hashCode() : 0);
        result = 31 * result + (workDays != null ? workDays.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PensionFund{" +
                "pensFundName='" + pensFundName + '\'' +
                ", gos=" + gos +
                ", dateOfCreation='" + dateOfCreation + '\'' +
                ", persons=" + persons +
                ", workDays=" + workDays +
                '}';
    }
}



