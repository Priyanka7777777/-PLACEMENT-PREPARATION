import java.util.*;
public class Hiarachial{
    public static void main(String args[]){
Fish tuna = new Fish();
tuna.eat();
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("animal eats");   
    }
}
class Mammal extends Animal{
    void walk(){
        System.out.println("animal walk");
    }
}
class Aves extends Animal{
    void Fly(){
        System.out.println("bird fly");
    }
}
class Fish extends Animal{
    void swim(){
        System.out.println("fish swim");
    }
}

