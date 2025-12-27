public class ClassesAndObjects {
    public static void main(String [] args){
        Person person1 = new Person();
        person1.name = "Roman";
        person1.age = 50;
        person1.seyHello();
        System.out.println("My name is "+person1.name+", "+person1.age+" year");
        Person person2 = new Person();
        person2.name = "Vova";
        person2.age = 20;
        person2.speak();
        System.out.println("My name is "+person2.name+", "+person2.age+" year");

       int year1 = person1.calculateYearsToRetirement();
       int year2 = person2.calculateYearsToRetirement();
        System.out.println("Первому до пенсии "+year1);
        System.out.println("Второму до пенсии "+year2);

    }
}
class Person {
    //у класса могут быть
    //данные (поля)
    //действия которые он может совершать(методы)

    String name;
    int age;

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("My name is " + name + ", " + age + " year");
        }
    }

    void seyHello() {
        System.out.println("Hello");
    }

    int calculateYearsToRetirement() {
        int years = 65 - age;
        return years; //после return метот прекращает работу.Класс main не вызывает метод, а возвращает значение из метода.

    }
}