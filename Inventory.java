import java.util.HashMap;

public class Inventory {

    HashMap<String, Item> list = new HashMap<>();

    public void add(Item i) {
        list.put(i.id, i);
        System.out.println("Added");
    }

    public void remove(String id) {
        list.remove(id);
        System.out.println("Removed");
    }

    public void show() {
        for (Item i : list.values()) {
            System.out.println(i);
        }
    }
}

