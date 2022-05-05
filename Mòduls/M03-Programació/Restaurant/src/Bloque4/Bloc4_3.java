package Bloque4;

import java.util.Scanner;

public class Bloc4_3 {

    public static final int CLIENTS = 5;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner inStr = new Scanner(System.in);
        Bloc4_1[] clientela = new Bloc4_1[CLIENTS];

        clientela[0] = new Bloc4_1("Joan", "123456", "joan@joan.com", 125.25, 10);
        clientela[1] = new Bloc4_1("Joana", "158964", "joana@joan.com", 15.25, 10);
        clientela[2] = new Bloc4_1("Maria", "458263", "maria@joan.com", 25.25, 15);
        clientela[3] = new Bloc4_1("Luci", "123444", "luci@joan.com", 54.45, 15);
        clientela[4] = new Bloc4_1("Mario", "166456", "mario@joan.com", 75.00, 20);


        int opcio = 0;
        while (opcio != 6) {
            opcio = menu(in);
            distribuidor(opcio, inStr, clientela);
        }

    }

    public static void distribuidor(int opcio, Scanner in, Bloc4_1[] clientela) {
        switch (opcio) {
            case 1:
                cercaClient(clientela, in);
                break;
            case 2:
                despesaGlobal(clientela);
                break;
            case 3:
                millorClient(clientela);
                break;
            case 4:
                modificaCorreu(clientela, in);
                break;
            case 5:
                modificaDescompte(clientela, in);
                break;

        }
    }

    public static void cercaClient(Bloc4_1[] clientela, Scanner in) {
        
        System.out.println("Cerca client per NIF i mostra la seva informació");
        System.out.println("Intro NIF client: ");
        String nif = in.nextLine();
        for (int i = 0; i < CLIENTS; i++) {
            if ( nif.equals(clientela[i].getNif())){
                System.out.println(clientela[i].toString());
            }
        }
    }

    public static void despesaGlobal(Bloc4_1[] clientela) {
        System.out.println("Mostra la despesa global de tots els clients");
        double sumaDespesa = 0 ;
        for (int i = 0; i < CLIENTS; i++) {
            sumaDespesa += clientela[i].getDespesaFeta();
        }
        System.out.println("La despesa total és:" + sumaDespesa + " €");
    }

    public static void millorClient(Bloc4_1[] clientela) {
        System.out.println("Mostra la info del millor client");
        int millorClient = 0;
        double despesaMax = clientela[0].getDespesaFeta();
        for (int i = 1; i < CLIENTS; i++) {
            if ( clientela[i].getDespesaFeta() > despesaMax){
                millorClient = i;
                despesaMax = clientela[i].getDespesaFeta();
            }
        }
        System.out.println("El millor client: " + clientela[millorClient].getNom());
        System.out.println("Despesa feta: " + clientela[millorClient].getDespesaFeta());
    }

    public static void modificaCorreu(Bloc4_1[] clientela, Scanner in) {
        System.out.println("Modifica correu de client introduit per teclat");
        System.out.println("Cerca client per NIF i modifica correu");
        System.out.println("Intro NIF client: ");
        String nif = in.nextLine();
        for (int i = 0; i < CLIENTS; i++) {
            if ( nif.equals(clientela[i].getNif())){
                System.out.println("Consta el correu: " + clientela[i].getCorreu());
                System.out.println("Intro nou correu: ");
                String nouCorreu = in.nextLine();
                clientela[i].setCorreu(nouCorreu);
                
            }
        }        
    }

    public static void modificaDescompte(Bloc4_1[] clientela, Scanner in) {
        System.out.println("Modifica descompte de client introduit per teclat");
        System.out.println("Modifica correu de client introduit per teclat");
        System.out.println("Cerca client per NIF i modifica correu");
        System.out.println("Intro NIF client: ");
        String nif = in.nextLine();
        for (int i = 0; i < CLIENTS; i++) {
            if ( nif.equals(clientela[i].getNif())){
                System.out.println("Consta el descompte: " + clientela[i].getDescompte());
                System.out.println("Intro nou descompte: ");
                int nouDescompte = in.nextInt();
                clientela[i].setDescompte(nouDescompte);
                
            }
        }        
    }

    public static int menu(Scanner in) {
        int opcio;

        do {
            System.out.println("Selecciona una opció");
            System.out.println("1. Cerca client");
            System.out.println("2. Despesa global");
            System.out.println("3. Millor client");
            System.out.println("4. Modifica correu");
            System.out.println("5. Modifica descompte");
            System.out.println("6. sortir");
            opcio = in.nextInt();
        } while ((opcio <= 0) || (opcio > 6));
        return opcio;

    }
}
