package com.sandovalfrancisco.adminsmanager.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Admin implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String nombre;
    private String email;
    private String jobTitle;
    private String telefono;
    private String imageURL;
    @Column(nullable = false, updatable = false)
    private String adminCode;

    public Admin() {
    }

    public Admin(String nombre, String email, String jobTitle, String telefono, String imageURL, String adminCode) {
        this.nombre = nombre;
        this.email = email;
        this.jobTitle = jobTitle;
        this.telefono = telefono;
        this.imageURL = imageURL;
        this.adminCode = adminCode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getAdminCode() {
        return adminCode;
    }

    public void setAdminCode(String adminCode) {
        this.adminCode = adminCode;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", telefono='" + telefono + '\'' +
                ", imageURL='" + imageURL + '\'' +
                ", adminCode='" + adminCode + '\'' +
                '}';
    }
}
