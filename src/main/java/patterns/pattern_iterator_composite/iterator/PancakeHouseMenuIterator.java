package patterns.pattern_iterator_composite.iterator;

import java.util.ArrayList;

/**
 * Concrete Iterator of the UML diagram
 */
public class PancakeHouseMenuIterator implements Iterator {

    ArrayList<MenuItem> arrayList;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList<MenuItem> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public boolean hasNext() {
        if (position < arrayList.size())
            return true;
        else
            return false;
    }

    @Override
    public Object next() {
        MenuItem item = arrayList.get(position);
        position += 1;
        return item;
    }
}
