package model.entity;

public class Patient {
    private int id;
    private String prenom;
    private String nom;
    private String datenaissance;

    public Patient() {}
    public Patient(int id, String prenom, String nom, String datenaissance) {
        this.id = id;
        this.prenom = prenom;
        this.nom = nom;
        this.datenaissance = datenaissance;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getDatenaissance() {
        return datenaissance;
    }
    public void setDatenaissance(String datenaissance) {
        this.datenaissance = datenaissance;
    }

}
