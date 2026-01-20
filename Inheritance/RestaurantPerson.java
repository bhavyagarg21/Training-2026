interface Worker{
    void performDuties();
}
public class RestaurantPerson {
    String name;
    int id;
    RestaurantPerson(String name,int id){
        this.name=name;
        this.id=id;
    }
    public static void main(String[] args){
        Worker c1=new Chef("abc", 101);
        c1.performDuties();

        Worker c2=new Waiter("xyz",150);
        c2.performDuties();
    }
}
class Chef extends RestaurantPerson implements Worker{
    Chef(String name,int id){
        super(name, id);
    }
    @Override
    public void performDuties(){
        System.out.println("Duty as a chef");
    }
}

class Waiter extends RestaurantPerson implements Worker{
    Waiter(String name,int id){
        super(name, id);
    }
    @Override
    public void performDuties(){
        System.out.println("Duty as a waiter");
    }
}