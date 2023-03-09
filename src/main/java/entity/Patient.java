package entity;

import jakarta.persistence.*;
import java.util.Set;

/**
 *  Created by Anton Muzhytskyi 01/03/2023.
 */

@Entity
@Table(name="PATIENT")
public class Patient {

    @Id //Primary Key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String namePatient;

    @Column(name = "SURNAME")
    private String surnamePatient;

    @Column(name = "TELEPHONE", length=13 )
    private String telephone;

    @OneToOne(cascade = CascadeType.ALL)
    private Ward ward;

    @ManyToMany( cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(
            name="PAT_DOC",
            joinColumns = @JoinColumn(name= "PATIENT_ID"),
            inverseJoinColumns = @JoinColumn(name = "DOCTOR_ID")
    )
    private Set<Doctor> doctors;

    public Patient(){}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNamePatient() { return namePatient; }
    public void setNamePatient(String namePatient) { this.namePatient = namePatient; }

    public String getSurnamePatient() { return surnamePatient; }
    public void setSurnamePatient(String surnamePatient) { this.surnamePatient = surnamePatient; }

    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }

    public Ward getWard() { return ward; }
    public void setWard(Ward ward) { this.ward = ward; }

    public Set<Doctor> getDoctors() { return doctors; }
    public void setDoctors(Set<Doctor> doctors) { this.doctors = doctors; }

    @Override
    public String toString() {
        return "Patient{" +
                "id=" + id +
                ", namePatient='" + namePatient + '\'' +
                ", surnamePatient='" + surnamePatient + '\'' +
                ", telephone='" + telephone + '\'' +
                ", ward=" + ward +
                ", doctors=" + doctors +
                '}';
    }
}
