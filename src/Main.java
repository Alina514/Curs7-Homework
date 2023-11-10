
import Animals.*;
import Bank.BRDBank;
import Bank.BTBank;
import Bank.INGBank;
import Interface.Advertisement;
import Advertisement.EmailAdvertisement;
import Advertisement.FacebookAdvertisement;
import Advertisement.PrintAdvertisement;
import Student.Student;


public class Main {
    public static  void main(String[] args) {
// Exercitiul 1------------------------------------------------------------
        Advertisement facebookAd = new FacebookAdvertisement("Let's see what the New Feed on Facebook");
        Advertisement emailAd = new EmailAdvertisement("Portect your email using our policy.");
        Advertisement printAd = new PrintAdvertisement("Catch up our new offer,free print.", 100);

        facebookAd.createAdvertisement();
        facebookAd.displayAdvertisement();

        emailAd.createAdvertisement();
        emailAd.displayAdvertisement();

        printAd.createAdvertisement();
        printAd.displayAdvertisement();

//Exercitiul 2---------------------------------------------------------
        INGBank ingBank = new INGBank();
        ingBank.deposit(1000);
        ingBank.withdraw(500);

        BTBank btBank = new BTBank();
        btBank.deposit(1500);
        btBank.withdraw(700);

        BRDBank brdBank = new BRDBank();
        brdBank.deposit(2000);
        brdBank.withdraw(300);


// Exercitiul 3--------------------------------------------------------
        Cat cat = new Cat();
        Dog dog =  new Dog();
        Mouse mouse = new Mouse();
        Chicken chicken = new Chicken();
        Duck duck = new Duck();

        System.out.println(cat.walk());
        System.out.println(cat.talk());
        System.out.println(cat.eat());

        System.out.println(dog.walk());
        System.out.println(dog.talk());
        System.out.println(dog.eat());

        System.out.println(mouse.walk());
        System.out.println(mouse.talk());
        System.out.println(mouse.eat());

        System.out.println(chicken.walk());
        System.out.println(chicken.talk());
        System.out.println(chicken.eat());

        System.out.println(duck.walk());
        System.out.println(duck.talk());
        System.out.println(duck.eat());

   //Exercitiul 4---------------------------------------------------------------------------------
         Student student1 = new Student("Mihai", 65.5);
         Student student2 = new Student("Ioana", 89.0);

        System.out.println("Student1: " + student1.getName() + "Grade:" + student1.getGrade());
        System.out.println("Student2: "+ student2.getName() + "Grade: " + student2.getGrade());
        System.out.println("Average grade:" + Student.calculateAverageGrade());

    }
}