import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Shop<T extends Computer> implements Iterable<T>{

    private List<T> list;

    public List<T> getList() {
        return list;
    }

    public Shop() {
        this.list = new ArrayList<>();
    }

    public void add(T item){
        list.add(item);
    }

    public T get(int i){
        return list.get(i);
    }

    @Override
    public Iterator<T> iterator() {
        return new ShopIterator();
    }

    class ShopIterator implements Iterator<T>{
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < list.size();
        }

        @Override
        public T next() {
            return list.get(index++);
        }
    }
}
