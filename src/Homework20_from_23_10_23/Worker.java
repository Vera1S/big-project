package Homework20_from_23_10_23;

import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class Worker extends Person implements AbleToCalculatePension {

    private static double PERCENT_OF_PENSION = 0.25;
    private static double COEFFICIENT_TO_PROFESSION = 0.05;
    private final static int COUNT_OF_PROFS = 3;
    private int minSalary;
    private int maxSalary;
    private Set<ProfessionsType> professionsTypes;
    private String nameFemale;
    private String nameMale;


    public Worker(String name, int age, double height, double weight, int money) {
        super(name, age, height, weight, money);
    }
    public Worker(String nameFemale, String nameMale){
        this.nameFemale = nameFemale;
        this.nameMale = nameMale;
    }
    public Worker(String strSplit){
        Random ran = new Random();
        String[] arraypersonSplit = strSplit.split(" ");
        this.nameFemale = arraypersonSplit[0];
        this.nameMale = arraypersonSplit[1];
        this.setAge(ran.nextInt(18, 65));
        this.minSalary = Integer.parseInt(arraypersonSplit[3]);
        this.maxSalary = Integer.parseInt(arraypersonSplit[4]);
        this.setIsGender(arraypersonSplit[5].equals("MALE") ? GenderTypes.FEMALE : GenderTypes.MALE);
    }

    public Worker(int minSalary) {
        super();
        this.minSalary = minSalary;
    }

    public Worker(double maxSalary) {
        super();
        this.maxSalary = (int) maxSalary;
    }

    @Override
    public double calculatePension() {
        if (getIsGender() == null && getProfessionsTypes() == null) {
            return 0.0;
        }
        double averageSalary;

        if (getIsGender() == GenderTypes.FEMALE && professionsTypes != null) {
            averageSalary = CalculatorUtils.calculateAverage(minSalary / 2, maxSalary * 2);
        } else {
            averageSalary = CalculatorUtils.calculateAverage(minSalary, maxSalary);
        }
        double experienceMoney = 0.0;

        if (professionsTypes != null) {
            int countProfessionsType = professionsTypes.size();
            experienceMoney = countProfessionsType / COUNT_OF_PROFS * COEFFICIENT_TO_PROFESSION;
        }
        return averageSalary * PERCENT_OF_PENSION * (1 + experienceMoney);
    }


    public int getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(int minSalary) {
        this.minSalary = minSalary;
    }

    public int getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(int maxSalary) {
        this.maxSalary = maxSalary;
    }

    public static double getPercentOfPension() {
        return PERCENT_OF_PENSION;
    }

    public static void setPercentOfPension(double percentOfPension) {
        PERCENT_OF_PENSION = percentOfPension;
    }

    public static double getCoefficientToProfession() {

        return COEFFICIENT_TO_PROFESSION;
    }
    public String getNameFemale() {
        return nameFemale;
    }

    public void setNameFemale(String nameFemale) {
        this.nameFemale = nameFemale;
    }

    public String getNameMale() {
        return nameMale;
    }

    public void setNameMale(String nameMale) {
        this.nameMale = nameMale;
    }

    public static void setCoefficientToProfession(double coefficientToProfession) {
        COEFFICIENT_TO_PROFESSION = coefficientToProfession;
    }

    public Set<ProfessionsType> getProfessionsTypes() {
        return professionsTypes;
    }

    public void setProfessionsTypes(Set<ProfessionsType> professionsTypes) {
        this.professionsTypes = professionsTypes;
    }

    @Override
    public void die() {
        super.die();
        System.out.println("Этот человек не доживет до пенсии");
    }

    @Override
    public void die(int years) {
        System.out.println("Этот человек не доживет до пенсии и умрет через " + years + "лет");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Worker worker = (Worker) o;

        if (minSalary != worker.minSalary) return false;
        if (maxSalary != worker.maxSalary) return false;
        if (!Objects.equals(professionsTypes, worker.professionsTypes))
            return false;
        if (!Objects.equals(nameFemale, worker.nameFemale)) return false;
        return Objects.equals(nameMale, worker.nameMale);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + minSalary;
        result = 31 * result + maxSalary;
        result = 31 * result + (professionsTypes != null ? professionsTypes.hashCode() : 0);
        result = 31 * result + (nameFemale != null ? nameFemale.hashCode() : 0);
        result = 31 * result + (nameMale != null ? nameMale.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "minSalary=" + minSalary +
                ", maxSalary=" + maxSalary +
                ", professionsTypes=" + professionsTypes +
                ", nameFemale='" + nameFemale + '\'' +
                ", nameMale='" + nameMale + '\'' +
                '}';
    }
}

