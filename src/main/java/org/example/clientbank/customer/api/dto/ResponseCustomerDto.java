package org.example.clientbank.customer.api.dto;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.FieldDefaults;
import org.example.clientbank.dto.AbstractDto;

import java.time.LocalDateTime;

import static lombok.AccessLevel.PRIVATE;


@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@Data
public class ResponseCustomerDto extends AbstractDto {
    private @JsonView(View.Base.class)
    Long id;

    private @JsonView(View.Base.class)
    String name;

    private @JsonView(View.Admin.class)
    String email;

    private @JsonView(View.Admin.class)
    Integer age;

    private @JsonView(View.Admin.class)
    String phone;

    @JsonView(View.Admin.class)
    LocalDateTime createdDate;

    @JsonView(View.Admin.class)
    LocalDateTime lastModifiedDate;
}
