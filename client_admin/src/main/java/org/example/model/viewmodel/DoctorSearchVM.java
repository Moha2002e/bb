package org.example.model.viewmodel;

public class DoctorSearchVM {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String specialtyName;
    private int consultationCount;
    
    public DoctorSearchVM() {}
    
    public DoctorSearchVM(Long id, String firstName, String lastName, String email, 
                         String phone, String specialtyName, int consultationCount) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.specialtyName = specialtyName;
        this.consultationCount = consultationCount;
    }
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getSpecialtyName() {
        return specialtyName;
    }
    
    public void setSpecialtyName(String specialtyName) {
        this.specialtyName = specialtyName;
    }
    
    public int getConsultationCount() {
        return consultationCount;
    }
    
    public void setConsultationCount(int consultationCount) {
        this.consultationCount = consultationCount;
    }
    
    public String getFullName() {
        return firstName + " " + lastName;
    }
}

