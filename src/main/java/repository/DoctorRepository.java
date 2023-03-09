package repository;

import entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *  Created by Anton Muzhytskyi 01/03/2023.
 */

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
}
