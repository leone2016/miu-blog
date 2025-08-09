package edu.miu.cs.cs425.mystudentmgmtapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Transcript {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String degreeTitle;


    public Transcript(String degreeTitle) {
        this.degreeTitle = degreeTitle;
    }

}
