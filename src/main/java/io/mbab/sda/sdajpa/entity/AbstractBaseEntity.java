package io.mbab.sda.sdajpa.entity;

import javax.persistence.*;

@MappedSuperclass
public abstract class AbstractBaseEntity<ID> {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private ID id;

    @Version
    private Long version;

    public ID getId() {
        return id;
    }

    public void setId(ID id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }
}
