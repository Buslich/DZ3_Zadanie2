public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 89; // Вес в кг
        double height = 1.78; // Рост
        int bmi = service.calculate(weight, height);
        System.out.println("BMI: " + bmi);
    }
}
