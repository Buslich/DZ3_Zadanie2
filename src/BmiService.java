public class BmiService {
    public int calculate(double weight, double height) {
        double bmi = weight / (height * height); // Расчет BMI: вес / (рост * рост)
        return (int) bmi;
    }
}
