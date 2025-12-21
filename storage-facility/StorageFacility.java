import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    private HashMap<String, ArrayList<String>> storage;

    public StorageFacility() {
        this.storage = new HashMap<>();
    }

    public void add(String unit, String item) {
        // initialize values array if key doesn't exist yet
        this.storage.putIfAbsent(unit, new ArrayList<>());

        // add value
        this.storage.get(unit).add(item);
    }

    public ArrayList<String> contents(String storageUnit) {
        return this.storage.get(storageUnit);
    }

    public void remove(String storageUnit, String item) {
        ArrayList<String> items = this.storage.get(storageUnit);

        // if key doesn't exist
        if (items == null) {
            System.out.println(storageUnit + " doesn't exist on the storage");
            return;
        }

        // remove item
        items.remove(item);

        // remove key-value pair if it's array becomes empty
        if (items.size() == 0) {
            this.storage.remove(storageUnit);
        }
    }

    public ArrayList<String> storageUnits() {
        return new ArrayList<>(this.storage.keySet());
    }
}
