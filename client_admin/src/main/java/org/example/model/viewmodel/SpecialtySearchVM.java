package org.example.model.viewmodel;

public class SpecialtySearchVM {
    private Long id;
    private String name;
    private String description;
    private int doctorCount;
    private int consultationCount;
    
    public SpecialtySearchVM() {}
    
    public SpecialtySearchVM(Long id, String name, String description, 
                           int doctorCount, int consultationCount) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.doctorCount = doctorCount;
        this.consultationCount = consultationCount;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public int getDoctorCount() {
        return doctorCount;
    }
    
    public void setDoctorCount(int doctorCount) {
        this.doctorCount = doctorCount;
    }
    
    public int getConsultationCount() {
        return consultationCount;
    }
    
    public void setConsultationCount(int consultationCount) {
        this.consultationCount = consultationCount;
    }
}
