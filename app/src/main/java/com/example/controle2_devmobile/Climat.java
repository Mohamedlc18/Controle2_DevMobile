package com.example.controle2_devmobile;

public class Climat {

    private int Id;
    private String Nom_Ville;
    private String Pays;
    private int Température ;
    private int Pourcentage_Nuages ;

    public Climat() {
    }

    public Climat(int id, String nom_Ville, String pays, int température, int pourcentage_Nuages) {
        Id = id;
        Nom_Ville = nom_Ville;
        Pays = pays;
        Température = température;
        Pourcentage_Nuages = pourcentage_Nuages;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNom_Ville() {
        return Nom_Ville;
    }

    public void setNom_Ville(String nom_Ville) {
        Nom_Ville = nom_Ville;
    }

    public String getPays() {
        return Pays;
    }

    public void setPays(String pays) {
        Pays = pays;
    }

    public int getTempérature() {
        return Température;
    }

    public void setTempérature(int température) {
        Température = température;
    }

    public int getPourcentage_Nuages() {
        return Pourcentage_Nuages;
    }

    public void setPourcentage_Nuages(int pourcentage_Nuages) {
        Pourcentage_Nuages = pourcentage_Nuages;
    }
}
