package io.mbab.sda.sdajpa.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@Entity
@Component
public class Project extends AbstractBaseEntity<Long> {

    @Size(max = 255)
    private String name;
    @Size(max = 31)
    private  String type;
    @Size(max = 255)
    private String client;
}
