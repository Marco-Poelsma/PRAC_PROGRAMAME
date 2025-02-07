public class AnillamientoEnLaAlbufera {
    public static void main() {
        int casos = 0;
        do { 
            casos = Main.scan.nextInt();
            if (casos == 0) break;
            int avesTotales = 0;
            int yaEstabanAnilladas = 0;
            for (int i = 0; i < casos; i++) {
                avesTotales += Main.scan.nextInt();
                yaEstabanAnilladas += Main.scan.nextInt();
            }
            System.out.println(avesTotales-yaEstabanAnilladas);
        } while (casos >= 1 && casos <= 10000);
    }
}
