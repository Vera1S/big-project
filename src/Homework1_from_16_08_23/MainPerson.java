package Homework1_from_16_08_23;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.*;

//        задание № 4 от 28.08.2023г
// 1) Создайте метод public void die(int years) в классе Person, сделайте его абстрактным.
// Этот метод будет отличаться от обычного die() тем, что человек будет умирать не сразу, а через некоторое количество
// лет (которые и будут передаваться в параметре метода). Реализуйте этот метод для  Pensioner и Worker таким образом:
//а) для Worker просто вывести на экран "Этот человек не доживет до пенсии и умрет через " + years + "лет"
//б) Для Pensioner пишем на экран "Этот пенсионер умрет через" + years + "лет"
//2) Все классы, которые созданы, снабжаем собственными реализациями методов equals, hashCode и toString
//3) Добавить для класса Worker несколько конструкторов (перегрузка)
public class MainPerson {
    public static void main(String[] args) {

        Person person1 = new Worker("Vera", 17, 170, 65, 800);
        Person person2 = new Worker("Nikolai", 42, 180, 80.5, 2500);
        Person person3 = new Pensioner("Svetlana", 72, 165, 65.8, 6500, 365);

        PensionFund stateFund = new PensionFund("Ромашка", "2000 years", true, new ArrayList<>());
        PensionFund noStateFund = new PensionFund("Ромашка", "2015 год", false, new ArrayList<>());

        Pensioner pensioner = new Pensioner("Anton", 55, 175, 75, 150000, 365);
        Worker worker1 = new Worker("Katerina", 35, 175, 65, 4500);
        Worker worker2 = new Worker("Konstantin", 37, 176, 70, 4500);
        Worker maria = new Worker("Maria", 40, 173, 68, 4500);

        person1.infoOfPerson();
        person2.infoOfPerson();
        person3.infoOfPerson();
        System.out.println();
        System.out.println(person1.getName() + " я учусь и получаю степендию - " + person1.getMoney(9600) + "$ в год");
        System.out.println(person2.getName() + " " + person2.goToWent() + " как проклятый до пенсии долеко - " + person2.getMoney(30000) + "$ в год");
        System.out.println(maria.getName() + " " + person3.goToWent() + " моя пенсия - " + person3.getMoney(18000) + "$ в год");
        System.out.println();
//        stateFund.getPersons();
        System.out.println(stateFund.getPersons());
        System.out.println();
        pensioner.getPension();
        pensioner.die();
        pensioner.die(50);
        worker1.die();
        worker2.die(55);

        worker1.setIsGender(GenderTypes.FEMALE);
        worker2.setIsGender(GenderTypes.MALE);
        maria.setMaxSalary(2000);
        maria.setMinSalary(1000);
        worker1.setMaxSalary(5000);
        worker1.setMinSalary(3000);
        worker2.setMaxSalary(7000);
        worker2.setMinSalary(1000);

        double result = stateFund.calculatePensionFor(maria);
        System.out.println(result);

        GenderTypes worker1Gender = worker1.getIsGender();
        GenderTypes worker2Gender = worker2.getIsGender();

        System.out.println(worker1Gender);
        System.out.println(worker2Gender);

        System.out.println(stateFund);
        List<Worker> personsStateFund = new ArrayList<>();
        personsStateFund.add(worker1);
        personsStateFund.add(worker2);
        personsStateFund.add(maria);
        stateFund.setPersons(personsStateFund);
        System.out.println(stateFund);
        System.out.println(stateFund.calculateMedianPension());

        Set<ProfessionsType> professionsTypes = new HashSet<>();
        professionsTypes.add(ProfessionsType.MANAGER);
        professionsTypes.add(ProfessionsType.PROGRAMMER);
        professionsTypes.add(ProfessionsType.SELLER);
        professionsTypes.add(ProfessionsType.BUILDER);
        professionsTypes.add(ProfessionsType.ANALYST);

        System.out.println(professionsTypes);

        Map<String, String> map = new HashMap<>();
        LocalDate localDate = LocalDate.now();
        int dayOfMonth = localDate.getDayOfMonth();
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(localDate);
        System.out.println(dayOfWeek);


    }
}
