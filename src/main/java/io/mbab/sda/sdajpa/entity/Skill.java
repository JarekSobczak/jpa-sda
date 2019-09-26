package io.mbab.sda.sdajpa.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@Entity
@Component
public class Skill extends AbstractBaseEntity<Long> {

    @Size(max = 255)
    private String name;
}
