package entity;

import jakarta.persistence.*;

/**
 *  Created by Anton Muzhytskyi 01/03/2023.
 */

@Entity
@Table(name="WARD")
public class Ward {   //palata

    @Id //primary Key
    private Long id;

    @Column(name = "WARD")
    private String ward;

    public Ward(){}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getWard() { return ward; }
    public void setWard(String ward) { this.ward = ward; }

    @Override
    public String toString() {
        return "Ward{" +
                "id=" + id +
                ", ward='" + ward + '\'' +
                '}';
    }
}
