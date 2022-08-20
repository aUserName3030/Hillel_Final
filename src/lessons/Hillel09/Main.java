package lessons.Hillel09;

import java.util.*;

public class Main {
    private static LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<>();

    public static void main(String[] args) {
        linkedHashMap.put("Undercity","Windrunner");
        linkedHashMap.put("Stormwind","Wryn");
        linkedHashMap.put("Orgrimmar","Hellscream");
        linkedHashMap.put("Darnassus","Whisperwind");

        searchEngine();
    }

    public static void searchEngine(){
        System.out.println("Давайте поищем кто где живёт в Азероте! Список доступных мест: ");
        int i = 0;
        for (String key : linkedHashMap.keySet()) {
            System.out.println(++i + ") " + key);
        }

        System.out.println("Выберите город - введя его номер в списке");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt()-1;

        Object[] familyList = linkedHashMap.values().toArray();
        Object[] cityList = linkedHashMap.keySet().toArray();

        System.out.println("В выбранном городе " + cityList[input] + " проживает семья " + familyList[input]);
        System.out.println("Продолжать будем Y/N");

        Scanner scanner1 = new Scanner(System.in);
        String isContinue = scanner1.next();

        switch (isContinue.toLowerCase(Locale.ROOT)) {
            case "y":
                System.out.println("Значит продолжаем!");
                searchEngine();
                break;
            default:
                System.out.println("Ну и не хотелось особо");
                break;
        }

    }
}
