package lessons.Hillel04;

public class Phone <T,E>{
    private T model;
    private T year;
    private E smart;

    public void setPhone(T model, T year, E smart) {
        this.model = model;
        this.year = year;
        this.smart = smart;
    }

    public void displaySettings() {
        System.out.println("Модель " + model + ", " + year + " года. Смартфон ли это? Я думаю " + smart);
    }
}
