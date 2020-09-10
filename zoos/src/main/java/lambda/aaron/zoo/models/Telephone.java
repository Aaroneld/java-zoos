package lambda.aaron.zoo.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "telephones")
public class Telephone extends Auditable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "phoneid")
    private long phoneId;

    @Column(name = "phonenumber")
    private String phoneNumber;

    @Column(name = "phonetype")
    private String phoneType;

    @ManyToOne
    @JoinColumn( name = "zooid",
                 nullable = false)
    private Zoo zoo;

    public Telephone()
    {
    }

    public long getPhoneid() {
        return phoneId;
    }

    public void setPhoneid(long phoneid) {
        this.phoneId = phoneid;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneType() {
        return phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    public Zoo getZoo() {
        return zoo;
    }

    public void setZoo(Zoo zoo) {
        this.zoo = zoo;
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
