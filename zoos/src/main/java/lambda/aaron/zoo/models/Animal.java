package lambda.aaron.zoo.models;

import javax.persistence.*;
import java.util.*;

@Entity
@Table( name = "animals")
public class Animal extends Auditable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "animalid")
    private long animalId;

    @Column(name = "animaltype")
    private String animalType;

    @OneToMany(mappedBy = "animal",
               cascade = CascadeType.ALL)
    Set<ZooAnimal> zooAnimals = new HashSet<>();

    public Animal()
    {
    }

    public long getAnimalId() {
        return animalId;
    }

    public void setAnimalId(long animalId) {
        this.animalId = animalId;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public Set<ZooAnimal> getZooAnimals() {
        return zooAnimals;
    }

    public void setZooAnimals(Set<ZooAnimal> zooAnimals) {
        this.zooAnimals = zooAnimals;
    }

    public String getCreatedBy()
    {
        return createdBy;
    }

    public Date getCreatedDate()
    {
        return createdDate;
    }

    public String getLastModifiedBy()
    {
        return lastModifiedBy;
    }

    public Date getLastModifiedDate()
    {
        return lastModifiedDate;
    }
}
