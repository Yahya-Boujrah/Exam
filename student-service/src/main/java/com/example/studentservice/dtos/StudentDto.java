package com.example.studentservice.dtos;

import lombok.*;

import java.util.List;
import java.util.UUID;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentDto {

    private UUID id;
    private String firstname;
    private String lastname;

    private List<String> courses;
}
