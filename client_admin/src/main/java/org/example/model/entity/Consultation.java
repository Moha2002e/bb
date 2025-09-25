package org.example.model.entity;

import java.time.LocalDateTime;

public class Consultation implements Entity {
    private Long id;
    private LocalDateTime dateTime;
    private String description;
    private String diagnosis;
    private String prescription;
    private Long patientId;
    private Long doctorId;
    
    public Consultation() {}
    
    public Consultation(Long id, LocalDateTime dateTime, String description, 
                       String diagnosis, String prescription, Long patientId, Long doctorId) {
        this.id = id;
        this.dateTime = dateTime;
        this.description = description;
        this.diagnosis = diagnosis;
        this.prescription = prescription;
        this.patientId = patientId;
        this.doctorId = doctorId;
    }
    
    @Override
    public Long getId() {
        return id;
    }
    
    @Override
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
    
    public String getPrescription() {
        return prescription;
    }
    
    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }
    
    public Long getPatientId() {
        return patientId;
    }
    
    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }
    
    public Long getDoctorId() {
        return doctorId;
    }
    
    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }
}
