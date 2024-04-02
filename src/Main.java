public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.eat();
        dog.sound();
        dog.play();

        cat.eat();
        cat.sound();
        cat.play();
    }
}

interface Animal {
    void eat();
    void sound();
}

interface Pet extends Animal {
    void play();
}

class Dog implements Pet {
    public void eat() {
        System.out.println("Собака ест грушу");
    }

    public void sound() {
        System.out.println("Гав");
    }

    public void play() {
        System.out.println("Собака играет с носком");
    }
}

class Cat implements Pet {
    public void eat() {
        System.out.println("Кошка ест кукурузу");
    }

    public void sound() {
        System.out.println("Мяу");
    }

    public void play() {
        System.out.println("Кошка играет с хвостом");
    }
}
