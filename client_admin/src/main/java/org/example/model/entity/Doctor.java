package org.example.model.entity;

public class Doctor implements Entity {
    private Integer id;
    private String last_name;
    private String first_name;


    public Doctor() {}
    public Doctor(Integer id, String last_name, String first_name) {
        this.id = id;
        this.last_name = last_name;
        this.first_name = first_name;
    }
    @Override
    public Integer getId() {
        return id;
    }
    @Override
    public void setId(Integer id) {
        this.id = id;
    }
    public String getLast_name() {
        return last_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getFirst_name() {
        return first_name;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", last_name='" + last_name + '\'' +
                ", first_name='" + first_name + '\'' +
                '}';
    }

    

}

