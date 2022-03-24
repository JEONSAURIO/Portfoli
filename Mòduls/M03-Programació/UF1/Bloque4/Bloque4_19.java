package Bloque4;

import java.util.Scanner;

public class Bloque4_19 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int horasT = 0, salario = 30, turno, repes;
        double total = 0;
        boolean repe = true;

        while (repe == true) {
            System.out.println("Cuantas horas ha trabajado?");
            horasT = in.nextInt();

            System.out.println("1.Mañana \n2.Tarde \n3.Noche. \n Indica el número de tu turno");
            turno = in.nextInt();
            switch (turno) {
                case 1:
                    System.out.println("Turno de Mañana");
                    total = salario * horasT;
                    break;
                case 2:
                    System.out.println("Turno de Tarde");
                    total = ((salario * 1.2) * horasT);
                    break;
                case 3:
                    System.out.println("Turno de Noche");
                    total = ((salario * 1.5) * horasT);
                    break;
                default:
                    break;
            }

            if (total < 700) {
                total = total * 0.92;

            } else if (total <= 1100) {
                total = total * 0.90;

            } else {
                total = total * 0.88;

            }
            System.out.println("El total es " + total);
            System.out.println("Quieres añadir otro trabajador?\n 1.Si \n 2.No");
            repes = in.nextInt();
            if (repes == 2) {
                repe = false;
                break;
            }
        }
    }
}
