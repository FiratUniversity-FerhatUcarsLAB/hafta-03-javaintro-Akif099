public class Main {
    public static void main(String[] args) {
        double a = 3;
        double b = 4;
        double c = 5;

        double s = (a + b + c) / 2; // çevrenin yarısı
        double alan = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("s = " + s);
        System.out.println("Alan = " + alan);
    }
}
