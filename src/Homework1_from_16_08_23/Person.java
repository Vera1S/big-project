package Homework1_from_16_08_23;

import java.util.Objects;

public abstract class Person  {

    private String name;
    private int age;
    private double height;
    private double weight;
    private int money;
    private GenderTypes isGender;

    //Конструктор с 4 аргументами
    public Person(String name, int age, double height, double weight, int money) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.money = money;
    }

    public Person() {

    }

    public void infoOfPerson() {
        System.out.println("Имя: " + name + ", Возраст: " + age + " лет" + ", Рост: " + height + " см" + ", Вес: " + weight + " кг");
        System.out.println("Ежемесячная сумма: " + money + "$");
    }
    public String goToWent() {
        if (age < 18 || age > 70) {
            return "Отдыхаю дома";
        } else {
            return "Работаю";
        }
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getMoney(int money) {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public GenderTypes getIsGender() {

        return isGender;
    }

    public void setIsGender(GenderTypes isGender) {

        this.isGender = isGender;
    }

    public void die(){
        System.out.println("Человек погиб");
           }
           public abstract void die(int years);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (Double.compare(person.height, height) != 0) return false;
        if (Double.compare(person.weight, weight) != 0) return false;
        if (money != person.money) return false;
        if (!Objects.equals(name, person.name)) return false;
        return isGender == person.isGender;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        temp = Double.doubleToLongBits(height);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + money;
        result = 31 * result + (isGender != null ? isGender.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", money=" + money +
                ", isGender=" + isGender +
                '}';
    }


}
