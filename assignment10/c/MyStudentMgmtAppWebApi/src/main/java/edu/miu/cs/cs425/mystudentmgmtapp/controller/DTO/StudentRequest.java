package edu.miu.cs.cs425.mystudentmgmtapp.controller.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;


public record StudentRequest(@NotBlank String studentNumber, @NotBlank String firstName, String middleName,
                             @NotBlank String lastName, @DecimalMin("0.0") @DecimalMax("4.0") Double cgpa,
                             @NotNull LocalDate enrollmentDate,
                             @JsonProperty("isInternational") boolean isInternational) {
}
