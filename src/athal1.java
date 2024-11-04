import java.util.ArrayList;

public class athal1 {
    public static void main(String[] args) {
        String[] array1 = {"sula", "kalu"};
        /*System.out.println(array1[1]);*/
        ArrayList array = new ArrayList();
        array.add("sula");
        array.add("jula");
        array.add(9);
        String name = (String) array.get(2);
        System.out.println(array.get(2));
        System.out.println(array.size());

    }
}
