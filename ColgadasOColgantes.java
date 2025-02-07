public class ColgadasOColgantes {
    public static void main() {
        int casos = Main.scan.nextInt();
        Main.scan.nextLine();
        for (int i = 0; i < casos; i++) {
            String s = Main.scan.nextLine().toLowerCase();
            if (s.equals("colgadas")) System.out.println("BIEN");
            else System.out.println("MAL");
        }
    }
}