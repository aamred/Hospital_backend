package repository;

import entity.Ward;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *  Created by Anton Muzhytskyi 01/03/2023.
 */

@Repository
public interface WardRepository extends JpaRepository<Ward, Long> {
}
