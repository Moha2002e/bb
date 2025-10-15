package model.entity;

public class Doctor {
    private int id;
    private int specialityId;
    private String nom;
    private String prenom;

    public Doctor() {}

    public Doctor(int specialityId, String nom, String prenom) {
        this.specialityId = specialityId;
        this.nom = nom;
        this.prenom = prenom;
        this.id = specialityId;

    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getSpecialityId() {
        return specialityId;
    }
    public void setSpecialityId(int specialityId) {
        this.specialityId = specialityId;
    }
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
