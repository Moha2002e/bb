package org.example.model.viewmodel;

import java.time.LocalDateTime;

public class ConsultationSearchVM {
    private Long id;
    private LocalDateTime dateTime;
    private String description;
    private String diagnosis;
    private String patientName;
    private String doctorName;
    private String specialtyName;
    
    public ConsultationSearchVM() {}
    
    public ConsultationSearchVM(Long id, LocalDateTime dateTime, String description, 
                               String diagnosis, String patientName, String doctorName, String specialtyName) {
        this.id = id;
        this.dateTime = dateTime;
        this.description = description;
        this.diagnosis = diagnosis;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.specialtyName = specialtyName;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public LocalDateTime getDateTime() {
        return dateTime;
    }
    
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public String getDiagnosis() {
        return diagnosis;
    }
    
    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    
    public String getPatientName() {
        return patientName;
    }
    
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    
    public String getDoctorName() {
        return doctorName;
    }
    
    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    
    public String getSpecialtyName() {
        return specialtyName;
    }
    
    public void setSpecialtyName(String specialtyName) {
        this.specialtyName = specialtyName;
    }
}
