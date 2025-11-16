package ex_30_Collection_Framework.CF_01_LIST;

import java.util.Arrays;
import java.util.List;

public class Lab_ConvertArrayToList {
    public static void main(String[] args) {
        String arr[] = {"Java","Python","C#"};
        List<String> list = Arrays.asList(arr);
        System.out.println(list);
    }
}
