class Animal{
    String name;
    int age;
    void makeSound(){
        System.out.println("Animal's sound");
    }
    public static void main(String[] args){
        Animal a=new Animal();
        a.makeSound();
        Animal d=new Dog();
        d.makeSound();
    }
}
class Dog extends Animal{
    @Override
    void makeSound(){
        System.out.println("Dog's sound");
    }
}
class Cat extends Animal{
    @Override
    void makeSound(){
        System.out.println("Cat's sound");
    }
}
class Bird extends Animal{
    @Override
    void makeSound(){
        System.out.println("Bird's sound");
    }
}