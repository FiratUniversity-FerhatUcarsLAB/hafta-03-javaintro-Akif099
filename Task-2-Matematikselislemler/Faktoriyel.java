public class Main {
    public static void main(String[] args) {
        int n = 5;
        int sonuc = 1;

        System.out.println(n + "! = " + n + " × 4 × 3 × 2 × 1");

        sonuc = 5 * 4;
        System.out.println("5 × 4 = " + sonuc);

        sonuc = sonuc * 3;
        System.out.println("20 × 3 = " + sonuc);

        sonuc = sonuc * 2;
        System.out.println("60 × 2 = " + sonuc);

        sonuc = sonuc * 1;
        System.out.println("120 × 1 = " + sonuc);

        System.out.println("Sonuç: " + n + "! = " + sonuc);
    }
}
