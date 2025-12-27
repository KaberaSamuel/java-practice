import java.util.ArrayList;

public class Hideout<T> {
    private ArrayList<T> items;

    public Hideout() {
        this.items = new ArrayList<>();
    }

    public void putIntoHideout(T toHide) {
        if (items.contains(toHide)) {
            items.remove(toHide);
        } else {
            items.add(toHide);
        }
    }

    public T takeFromHideout() {
        if (items.size() == 0) {
            return null;
        }

        T toRemove = items.get(0);
        items.remove(toRemove);
        return toRemove;
    }

    public boolean isInHideout() {
        return items.size() > 0;
    }

}