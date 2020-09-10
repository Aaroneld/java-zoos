package lambda.aaron.zoo.models;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "zoos")
public class Zoo extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "zooid")
    private long zooId;

    @Column(name = "zooname")
    private String zooName;

    @OneToMany( mappedBy = "zoo",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    private List<Telephone> telephones = new ArrayList<>();

    @OneToMany(mappedBy = "zoo",
                cascade = CascadeType.ALL)
    Set<ZooAnimal> zooAnimals = new HashSet<>();

    public long getZooId() {
        return zooId;
    }

    public List<Telephone> getTelephones() {
        return telephones;
    }

    public void setTelephones(List<Telephone> telephones) {
        this.telephones = telephones;
    }

    public void setZooId(long zooId) {
        this.zooId = zooId;
    }

    public String getZooName() {
        return zooName;
    }

    public void setZooName(String zooName) {
        this.zooName = zooName;
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
