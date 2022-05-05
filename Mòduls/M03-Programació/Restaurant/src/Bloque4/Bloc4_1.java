package Bloque4;

public class Bloc4_1 {

    private String nom;
    private String nif;
    private String correu;
    private Double despesaFeta;
    private int descompte;

    public Bloc4_1() {
    }

    public Bloc4_1(String nom, String nif, String correu, Double despesaFeta, int descompte) {
        this.nom = nom;
        this.nif = nif;
        this.correu = correu;
        this.despesaFeta = despesaFeta;
        this.descompte = descompte;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getCorreu() {
        return correu;
    }

    public void setCorreu(String correu) {
        this.correu = correu;
    }

    public Double getDespesaFeta() {
        return despesaFeta;
    }

    public void setDespesaFeta(Double despesaFeta) {
        this.despesaFeta = despesaFeta;
    }

    public int getDescompte() {
        return descompte;
    }

    public void setDescompte(int descompte) {
        this.descompte = descompte;
    }

    @Override
    public String toString() {
        return "Bloc4_1{" + "nom=" + nom + ", nif=" + nif + ", correu=" + correu + ", despesaFeta=" + despesaFeta + ", descompte=" + descompte + '}';
    }

  
    
    
    
    
    

}
