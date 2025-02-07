import java.util.ArrayList;
import java.util.HashMap;
public class NinotsIndultados {
    public static void main() {
        while (true) { 
            int votos = Main.scan.nextInt();
            if (votos == 0) break;
            HashMap<String, Integer> adultos = new HashMap<>();
            HashMap<String, Integer> jovenes = new HashMap<>();
            Main.scan.nextLine();
            int i = 0;
            while (i < votos) {
                String[] ninotets = Main.scan.nextLine().split(" ");
                for (String ninot : ninotets) {
                    if (ninot.charAt(0)-90 <= 0) {
                        adultos.put(ninot, adultos.getOrDefault(ninot, 0)+1);
                        i++;
                    }
                    else {
                        jovenes.put(ninot, jovenes.getOrDefault(ninot, 0)+1);
                        i++;
                    }
                }
            }
            int maxAdultos = 0;
            int maxJovenes = 0;
            for (String ninot : adultos.keySet()) {
                if (adultos.get(ninot) > maxAdultos) {
                    maxAdultos = adultos.get(ninot);
                }
            }
            for (String ninot : jovenes.keySet()) {
                if (jovenes.get(ninot) > maxJovenes) {
                    maxJovenes = jovenes.get(ninot);
                }
            }

            ArrayList<String> ganadores = new ArrayList<>();
            for (String ninot : jovenes.keySet()) {
                if (jovenes.get(ninot) == maxJovenes) {
                    ganadores.add(ninot);
                }
            }
            if (ganadores.size() == 1) {
                System.out.print(ganadores.get(0));
            }
            else {
                System.out.print("empate");
            }

            ganadores.clear();
            System.out.print(" ");
            for (String ninot : adultos.keySet()) {
                if (adultos.get(ninot) == maxAdultos) {
                    ganadores.add(ninot);
                }
            }
            if (ganadores.size() == 1) {
                System.out.println(ganadores.get(0));
            }
            else {
                System.out.println("EMPATE");
            }
        }
    }
}
