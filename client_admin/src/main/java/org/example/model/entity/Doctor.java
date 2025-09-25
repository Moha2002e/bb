package org.example.model.entity;

public class Doctor implements Entity {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Long specialtyId;
    
    public Doctor() {}
    
    public Doctor(Long id, String firstName, String lastName, String email, 
                 String phone, Long specialtyId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.specialtyId = specialtyId;
    }
    
    @Override
    public Long getId() {
        return id;
    }
    
    @Override
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
    
    public Long getSpecialtyId() {
        return specialtyId;
    }
    
    public void setSpecialtyId(Long specialtyId) {
        this.specialtyId = specialtyId;
    }
    
    public String getFullName() {
        return firstName + " " + lastName;
    }
}
