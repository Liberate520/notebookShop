import java.util.*;

public class Main {
    public static void main(String[] args) {
//        String[] modelIs = new String[]{"Asus", "Dell", "HP", "Acer"};
//        String[]processorIs = new String[]{"Intel", "AMD"};
//        int[] ramIs = new int[]{8, 16, 32};
//        int[] hardDriveVolume = new int[]{512, 1024, 2048};
//        double[] diagonalIs = new double[]{14, 16.5, 17};

        Shop<Notebook> list = new Shop<>();
        list.add(new Notebook("Asus", "Intel", 16, 512, 14));
        list.add(new Notebook("HP", "Intel", 32, 512, 14));
        list.add(new Notebook("HP", "Intel", 8, 512, 14));
        for (Notebook notebook: list){
            System.out.println(notebook);
        }

        NotebookService service = new NotebookService();
        service.sort(list.getList(), TypeForSort.RAM);

        for (Notebook notebook: list){
            System.out.println(notebook);
        }

        for (int i = 0; i < 10; i++) {
            list.get(i);
        }
    }
}
