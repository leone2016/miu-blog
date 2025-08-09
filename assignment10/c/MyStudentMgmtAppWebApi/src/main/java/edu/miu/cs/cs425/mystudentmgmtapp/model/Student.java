package edu.miu.cs.cs425.mystudentmgmtapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    @NotBlank
    @Column(nullable = false, unique = true, length = 20)
    private String studentNumber;

    @NotBlank
    @Column(nullable = false, length = 30)
    private String firstName;

    @Column(length = 30)
    private String middleName;

    @NotBlank
    @Column(nullable = false, length = 30)
    private String lastName;

    @DecimalMin("0.0")
    @DecimalMax("4.0")
    private Double cgpa;

    @NotNull
    private LocalDate enrollmentDate;

    @Column(nullable = false)
    private boolean international;
}
