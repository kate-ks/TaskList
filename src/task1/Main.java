package task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Teacher 1");
        list.add("Teacher 2");
        list.add("Teacher 3");
        list.add("Teacher 4");

        list.indexOf("Teacher 1");
        list.indexOf("Teacher 4");
        System.out.println(list);

    }
}
