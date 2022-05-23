public class BmiService {
    public int calculate(int mass, int height) {
        int index = mass / (height * height / 10000);
        return index;
    }
}