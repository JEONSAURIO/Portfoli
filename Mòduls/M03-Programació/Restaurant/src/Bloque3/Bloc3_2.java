package Bloque3;

public class Bloc3_2 {

    public static final int clients = 4;
    public static final int platsCarta = 5;

    public static void main(String[] args) {

        String[] plats = {"amanida","bistec","pasta","flam", "tarta"};
        String[] clientela = {"Marina","Isabel","Miquel","LLuis"};
        int[][] control = {
            {0,3,1,7,0},
            {2,4,0,0,6},
            {9,5,0,0,3},
            {3,5,7,1,1}
        };
        
        // Hem de fer un llistat de clients amb els seus plats perferits
        // les files són els clients
        // Les columnes son els plats
        // Realment em demana el màxim de cada fila
        
        int platMax;
        int vegadesPlatMax;
        for (int i = 0; i < clients ; i++) {
            platMax = 0;
            vegadesPlatMax = control[i][0];
            for (int j = 1; j < platsCarta; j++) {
                if ( control[i][j] > vegadesPlatMax) {
                    platMax = j;
                    vegadesPlatMax = control[i][j];
                }
            }
            System.out.println("Pla perferit de " + clientela[i] + " és " 
                    + plats[platMax] + ". L'ha pres " 
                    + vegadesPlatMax + " aquest mes ");
        }
        
        
        
        

        
    }

}
