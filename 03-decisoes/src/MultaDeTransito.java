import java.util.Scanner;

public class MultaDeTransito {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Limite de velocidade da via (km/h): "); int limVel = in.nextInt();
        System.out.print("Velocidade do veículo (km/h): ");       int velMed = in.nextInt();
        double velConsiderada;
        if (velMed <= 100)
           velConsiderada = velMed - 7;
        else
           velConsiderada = velMed * 0.93;
        if (velConsiderada <= limVel) {
           System.out.println("SEM multa.");
        }
        else if (velConsiderada > limVel * 1.5) {
           System.out.println("Multa de R$880,41, infração gravíssima, 7 pontos.");
        }
        else if (velConsiderada > limVel * 1.2) {
           System.out.println("Multa de R$195,23, infração grave, 5 pontos.");
        }
        else {
           System.out.println("Multa de R$130,16, infração média, 4 pontos.");
        }
    }
}
