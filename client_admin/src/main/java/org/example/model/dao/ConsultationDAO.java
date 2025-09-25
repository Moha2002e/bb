package org.example.model.dao;

import org.example.model.entity.Consultation;
import java.util.List;

public class ConsultationDAO {
    
    public List<Consultation> findAll() {
        // TODO: Implémenter la récupération de toutes les consultations
        return null;
    }
    
    public Consultation findById(Long id) {
        // TODO: Implémenter la récupération d'une consultation par ID
        return null;
    }
    
    public Consultation save(Consultation consultation) {
        // TODO: Implémenter la sauvegarde d'une consultation
        return null;
    }
    
    public void delete(Long id) {
        // TODO: Implémenter la suppression d'une consultation
    }
    
    public List<Consultation> findByPatientId(Long patientId) {
        // TODO: Implémenter la récupération des consultations par patient
        return null;
    }
    
    public List<Consultation> findByDoctorId(Long doctorId) {
        // TODO: Implémenter la récupération des consultations par médecin
        return null;
    }
}

