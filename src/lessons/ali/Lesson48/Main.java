package lessons.ali.Lesson48;

public class Main {
    //private static final int DOG = 0;
    //private static final int CAT = 1;
    //private static final int FROG = 2;

    public static void main(String[] args) {
        //int animal = FROG;
        Animal animal = Animal.FROG;
        switch (animal) {
            case DOG:
                System.out.println("Woof");
                break;
            case CAT:
                System.out.println("Meow");
                break;
            case FROG:
                System.out.println("It is Wednesday my dudes!");
                break;
            default:
                System.out.println("Nani?");
                break;
        }

        Season season = Season.SUMMER;

        switch (season) {
            case SUMMER:
                System.out.println("SUMMER");
                break;
            case SPRING:
                System.out.println("SPRING");
                break;
            case WINTER:
                System.out.println("WINTER");
                break;
            case FALL:
                System.out.println("FALL");
                break;
            default:
                System.out.println("APOCALIPSIS");
                break;

        }

        System.out.println(season instanceof Season);

        System.out.println(animal.getId());
        System.out.println(animal.name());
        System.out.println(animal);
        System.out.println(season.getTemperature());

        Animal frog = Animal.valueOf("FROG");
        System.out.println(frog.getId());
        System.out.println(frog.ordinal());

    }
}
