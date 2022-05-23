public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int mass = 70; //Вес, кг
        int height = 177; //Рост, см
        int index = service.calculate(mass, height);
        System.out.println("Индекс массы тела равен: " + index);
    }
}