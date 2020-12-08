public class Main {
    public static void main(String[] args) {
        BmiService ind = new BmiService();
        double bmi = ind.calculate(86, 1.86);
        System.out.printf("Ваш индекс массы тела: " + "%.2f",bmi);
    }
}
