package org.example.clientbank.employer.api.dto;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;

import static lombok.AccessLevel.PRIVATE;


@EqualsAndHashCode
@AllArgsConstructor
@Data
public class RequestPatchEmployerDto {

    private @Size(min = 3, max = 100, message = "Name must be between 3 and 100 characters")
    String name;

    private @Size(min = 3, max = 100, message = "Address must be between 3 and 100 characters")
    String address;
}
