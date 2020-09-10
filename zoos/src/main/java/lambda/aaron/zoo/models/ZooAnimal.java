package lambda.aaron.zoo.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name ="zooanimals")
public class ZooAnimal extends Auditable implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "zooid")
    private Zoo zoo;

    @Id
    @ManyToOne
    @JoinColumn(name = "animalid")
    private Animal animal;

    @Column(name = "incomingzoo")
    private String incomingZoo;

    public ZooAnimal()
    {
    }

    public ZooAnimal(
            Zoo zoo,
            Animal animal,
            String incomingZoo
    )
    {
        this.zoo = zoo;
        this.animal = animal;
        this.incomingZoo = incomingZoo;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getIncomingZoo() {
        return incomingZoo;
    }

    public void setIncomingZoo(String incomingZoo) {
        this.incomingZoo = incomingZoo;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZooAnimal zooAnimal = (ZooAnimal) o;
        return getZoo().equals(zooAnimal.getZoo()) &&
                getAnimal().equals(zooAnimal.getAnimal()) &&
                getIncomingZoo().equals(zooAnimal.getIncomingZoo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getZoo(), getAnimal(), getIncomingZoo());
    }
}
