package repository;

import entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *  Created by Anton Muzhytskyi 01/03/2023.
 */

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
    //sql
    @Query (value ="SELECT * FROM PATIENT WHERE NAME = ?1 AND SURNAME=?2", nativeQuery = true)
    Patient findByNamePatientAndSurnamePatient(String namePatient, String surnamePatient);

    //hql?
    Patient findBySurnamePatient(String surnamePatient);
}
