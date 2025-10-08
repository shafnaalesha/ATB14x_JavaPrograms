package ex_16_Arrays;

public class Lab_03_Arrays_Part2 {
    public static void main(String[] args) {
        String[] names = {"pramod", "amit", "lucky"};
        System.out.println(names.length);
        System.out.println(names[0]);
        System.out.println(names[2]);
        System.out.println(names[1]);

        String[] name_Shafna = new String[3];
        name_Shafna[0] ="Ajeesh";
        name_Shafna[1] ="Alesha";
        name_Shafna[2] ="Ayzan";

        System.out.println(name_Shafna.length);
        System.out.println(name_Shafna[0]);
        System.out.println(name_Shafna[2]);
        System.out.println(name_Shafna[1]);

        boolean[] is_male_data =  new boolean[2];
        is_male_data[0] = true;
        is_male_data[1] = false;
    }
}
