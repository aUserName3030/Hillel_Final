package lessons.forth;

public class Main {
    public static void main(String[] args) {
        Phone<String,Boolean> phone1 = new Phone();
        phone1.setPhone("Nokia", "Тысяча девятсот девяносто девятого", false);
        phone1.displaySettings();

        Phone<Integer,String> phone2 = new Phone();
        phone2.setPhone(7210, 2022, "это смартфон");
        phone2.displaySettings();
    }
}
