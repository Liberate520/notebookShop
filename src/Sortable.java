import java.util.List;

public interface Sortable <T extends Computer>{
    void sort(List<T> list, TypeForSort typeForSort);
}
