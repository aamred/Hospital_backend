package entity;

import jakarta.persistence.*;
import java.util.Set;

/**
 *  Created by Anton Muzhytskyi 01/03/2023.
 */

@Entity
@Table(name="DOCTOR")
public class Doctor {

    @Id //primary Key
    private Long id;

    @Column(name = "NAME")
    private String nameDoctor;

    @Column(name = "SURNAME")
    private String surnameDoctor;

    @Column(name = "SPECIALITY")
    private String speciality;

    @ManyToMany(mappedBy = "doctors")
    private Set<Patient> patients;

    public Doctor(){}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNameDoctor() { return nameDoctor; }
    public void setNameDoctor(String nameDoctor) { this.nameDoctor = nameDoctor; }

    public String getSurnameDoctor() { return surnameDoctor; }
    public void setSurnameDoctor(String surnameDoctor) { this.surnameDoctor = surnameDoctor; }

    public String getSpeciality() { return speciality; }
    public void setSpeciality(String speciality) { this.speciality = speciality; }

    public Set<Patient> getPatients() { return patients; }
    public void setPatients(Set<Patient> patients) { this.patients = patients; }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", nameDoctor='" + nameDoctor + '\'' +
                ", surnameDoctor='" + surnameDoctor + '\'' +
                ", speciality='" + speciality + '\'' +
                ", patients=" + patients +
                '}';
    }
}
