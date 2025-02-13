
import java.util.Arrays;

public class RepartiendoHorchata {
    private static class Fallero implements Comparable<Fallero> {
        public int trabajo;
        public int horchata;
        public Fallero(int trabajo, int horchata) {
            this.trabajo = trabajo;
            this.horchata = horchata;
        }
        @Override
        public int compareTo(Fallero o) {
            if (this.trabajo != o.trabajo) {
                return Integer.compare(o.trabajo, this.trabajo);
            }
            return Integer.compare(this.horchata, o.horchata);
        }
    }
    public static void main() {
        while (true) { 
            
            int horchataDisponible = Main.scan.nextInt();
            int numFalleros = Main.scan.nextInt();
            if (horchataDisponible == 0 && numFalleros == 0) break;
            Fallero[] falleros = new Fallero[numFalleros];
            for (int i = 0; i < numFalleros; i++) {
                falleros[i] = new Fallero(Main.scan.nextInt(), Main.scan.nextInt());
            }
            Arrays.sort(falleros);
            int fallerosAmbOrxata = 0;
            for (Fallero fallero : falleros) {
                if (horchataDisponible >= fallero.horchata) {
                    horchataDisponible -= fallero.horchata;
                    fallerosAmbOrxata++;
                } else {
                    System.out.println(fallerosAmbOrxata + " " + horchataDisponible);
                }
            }
        }
        }

}
