import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class NotebookService implements Sortable<Notebook> {

    @Override
    public void sort(List<Notebook> list, TypeForSort typeForSort) {
        switch (typeForSort){
            case RAM:
                Collections.sort(list, new NotebookComparatorByRam());
                break;
        }
    }

    class NotebookComparatorByRam implements Comparator<Notebook>{
        @Override
        public int compare(Notebook notebook, Notebook t1) {
            return Integer.compare(notebook.getRAM(), t1.getRAM());
        }
    }
}
