public class Main {
    public static void main(String[] args) {
        Sapi objek = new Sapi();
        Cicak objek2 = new Cicak();
        System.out.println("Informasi seputar sapi");
        System.out.println(objek.makanan());
        System.out.println(objek.berkembangbiak());
        System.out.println("==============================");
        System.out.println("Informasi seputar cicak");
        System.out.println(objek2.makanan());
        System.out.println(objek2.berkembangbiak());
    }
}
