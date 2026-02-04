import java.util.*;

abstract class WarehouseItem{
    abstract void display();
    static void displayItems(List<? extends WarehouseItem> items){
        for(WarehouseItem item: items){
            item.display();
        }
    }
}
class Electronics extends WarehouseItem{
    public void display(){
        System.out.println("Electronics item");
    }
}
class Groceries extends WarehouseItem{
    public void display(){
        System.out.println("Groceries item");
    }
}
class Furniture extends WarehouseItem{
    public void display(){
        System.out.println("Furniture item");
    }
}

class Storage<T extends WarehouseItem>{
    List<T> list=new ArrayList<>();

    void addItem(T item){
        list.add(item);
    }
    List<T> getItem(){
        return list;
    }
    public static void main(String[] args){
        Storage<Electronics> eItems=new Storage<>();
        eItems.addItem(new Electronics());

        Storage<Groceries> gItems=new Storage<>();
        gItems.addItem(new Groceries());

        Storage<Furniture> fItems=new Storage<>();
        fItems.addItem(new Furniture());

        WarehouseItem.displayItems(eItems.getItem());
        WarehouseItem.displayItems(gItems.getItem());
        WarehouseItem.displayItems(fItems.getItem());
    }
}
