public class MathTest {
    public static void main(String[] args) {
        double number = 40;
        double number2 = 20.2;
        
        double sqrtValue = Math.sqrt(number);
        System.out.println("SQRT: " + sqrtValue);
        
        double sinValue = Math.sin(number);
        System.out.println("SIN: " + sinValue);
        
        double cosValue = Math.cos(number);
        System.out.println("COS: " + cosValue);
        
        double floorValue = Math.floor(number2);
        System.out.println("FLOOR: " + floorValue);
        
        double ceilValue = Math.ceil(number2);
        System.out.println("CEIL: " + ceilValue);
        
        long roundValue = Math.round(number2);
        System.out.println("ROUND: " + roundValue);
        
        int maxValue = Math.max(71, 68);
        System.out.println("MAX: " + maxValue);
        
        int minValue = Math.min(71, 68);
        System.out.println("MIN: " + minValue);
        
        double randomValue = Math.random() * 100;
        System.out.println("RANDOM: " + randomValue);
    }
}