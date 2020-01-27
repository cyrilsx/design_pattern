package iterator;

import java.util.Iterator;

public class HouseRepository implements Iterable<String> {

    private String[] inventory;
    private int currentIndex = 0;

    public HouseRepository() {
        this.inventory = new String[5];
    }

    void addObject(String objectName) {
        if (inventory.length <= currentIndex) {
            final String[] newStrings = new String[inventory.length + 5];
            System.arraycopy(this.inventory, 0, newStrings, 0, this.inventory.length);
            this.inventory = newStrings;
        }

        this.inventory[currentIndex] = objectName;
        currentIndex++;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<>() {

            private int iteratorIndex = 0;

            @Override
            public boolean hasNext() {
                return inventory.length > iteratorIndex && inventory[iteratorIndex] != null;
            }

            @Override public String next() {
                final String currentObj = inventory[iteratorIndex];
                iteratorIndex++;
                return currentObj;
            }
        };
    }
}
