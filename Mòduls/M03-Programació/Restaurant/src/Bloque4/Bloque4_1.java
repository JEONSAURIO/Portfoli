package Bloque4;

import java.util.Scanner;

public class Bloque4_1 {

    public static final int CLIENTE = 4;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        classA clientes[] = new classA[CLIENTE];

        clientes[0] = new classA("Jeon", "123456", "jeonr@gmail.com", 50.25, 0);
        clientes[1] = new classA("Aiman", "789012", "aimanb@gmail.com", 27.50, 0);
        clientes[2] = new classA("Adria", "987654", "aferrer@gmail.com", 62.18, 0);
        clientes[3] = new classA("Emira", "102938", "emirab@gmail.com", 46.79, 0);

        int opcion = 0;
        while (opcion != 7) {
            distribuidor(opcion, in, clientes);

        }

    }

    public static void distribuidor(int opcion, Scanner in, classA[] clientes) {
        System.out.println("Escoge una opción");
        System.out.println("1. Buscar cliente");
        System.out.println("2. Calcular despesa");
        System.out.println("3. Muestra cliente con más despesa");
        System.out.println("4. Modifica el correo ");
        System.out.println("5. Modificar el descuento");
        System.out.println("6. Salir");
        opcion = in.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Busca cliente");
                buscaCliente(clientes);
                break;
            case 2:
                System.out.println("Calcula despesa");
                calcDespesa(clientes);
                break;
            case 3:
                System.out.println("Muestra cliente con más despesa");
                muestraCliente(clientes);
                break;
            case 4:
                System.out.println("Modifica el correo");
                modifCorreo(clientes);
                break;
            case 5:
                System.out.println("Modificar el descuento");
                modifDescuento(clientes);
                break;
            case 6:
                System.out.println("Salir");
                Salir(clientes);
                break;
        }

    }

    public static void buscaCliente(classA[] clientes) {

    }

    public static void calcDespesa(classA[] clientes) {

    }

    public static void muestraCliente(classA[] clientes) {

    }

    public static void modifCorreo(classA[] clientes) {

    }

    public static void modifDescuento(classA[] clientes) {

    }

    public static void Salir(classA[] clientes) {

    }

    private static int menus(Scanner in) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
