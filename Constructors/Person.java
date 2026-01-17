public class Person {
    String name;
    int age;
    Person(String name, int age){
        this.name=name;
        this.age=age;
    }
    Person(Person p){
        this.name=p.name;
        this.age=p.age;
    }
    void display(){
        System.out.println(name+" is "+age);
    }
    public static void main(String[] args){
        Person p1=new Person("abc",22);
        p1.display();
        Person p2=new Person(p1);
        p2.display();
    }
}
