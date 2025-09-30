package org.example.model.entity;

import java.time.LocalDateTime;

public class Consultation implements Entity {
    private Integer id;
    private Integer doctorId;
    private Integer patientId;
    private java.sql.Date date;
    private LocalDateTime dateTime;
    private String reason;

    public Consultation() {}

    public Consultation(Integer id, Integer doctorId, Integer patientId, java.sql.Date date,
                        LocalDateTime dateTime, String reason) {
        this.id = id;
        this.doctorId = doctorId;
        this.patientId = patientId;
        this.date = date;
        this.dateTime = dateTime;
        this.reason = reason;

    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Integer doctorId) {
        this.doctorId = doctorId;
    }

    public Integer getPatientId() {
        return patientId;
    }

    public void setPatientId(Integer patientId) {
        this.patientId = patientId;
    }

    public java.sql.Date getDate() {
        return date;
    }

    public void setDate(java.sql.Date date) {
        this.date = date;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Consultation{" +
                "id=" + id +
                ", doctorId=" + doctorId +
                ", patientId=" + patientId +
                ", date=" + date +
                ", dateTime=" + dateTime +
                ", reason='" + reason + '\'' +
                '}';
    }
}

