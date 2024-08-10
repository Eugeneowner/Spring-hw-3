package org.example.clientbank.employer.api.dto;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;
import org.example.clientbank.customer.api.dto.View;
import org.example.clientbank.dto.AbstractDto;

import static lombok.AccessLevel.PRIVATE;

@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@Data
public class ResponseEmployerDto extends AbstractDto {
    private @JsonView(View.Admin.class) Long id;

    private @JsonView(View.Admin.class) String name;

    private @JsonView(View.Admin.class) String address;
}
