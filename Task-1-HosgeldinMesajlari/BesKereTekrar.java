En basit — doğrudan 5 println:

public class Main {
    public static void main(String[] args) {
        System.out.println("java");
        System.out.println("java");
        System.out.println("java");
        System.out.println("java");
        System.out.println("java");
    }
}


Kısa ve temiz — String.repeat (Java 11+):

public class Main {
    public static void main(String[] args) {
        System.out.print(("java\n").repeat(5));
    }
}


Örnek olarak özyineleme (recursion) — döngü yok, fonksiyon çağrılarıyla tekrar:

public class Main {
    public static void main(String[] args) {
        printJava(5);
    }

    static void printJava(int n) {
        if (n <= 0) return;
        System.out.println("java");
        printJava(n - 1);
    }
}
