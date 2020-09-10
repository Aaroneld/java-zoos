package lambda.aaron.zoo.models;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class Auditable {

    @CreatedBy
    @Column(name = "createdby")
    protected String createdBy;

    @CreatedDate
    @Temporal(value = TemporalType.DATE)
    @Column(name = "createddate")
    protected Date createdDate;

    @LastModifiedBy
    @Column(name = "lastmodifiedby")
    protected String lastModifiedBy;

    @LastModifiedDate
    @Column(name = "lastmodifieddate")
    @Temporal(value = TemporalType.DATE)
    protected Date lastModifiedDate;

}
