package guru.springframework.sfgpetclinic.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public class BaseEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // sequence also cool, but your sql choice must implement that
    private Long id; // box type is recommended in hibernate as boxed values can be null

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
