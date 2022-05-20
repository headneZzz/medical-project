package ru.tfs.spring.web.model.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class VaccinationDto {

    private LocalDate vaccinationDate;
    private String fullName;
    private String passportNumber;
    private VaccinationPointDto vaccinationPoint;
    private VaccineDto vaccine;
}
