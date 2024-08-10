package org.example.clientbank.account.api.dto;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.example.clientbank.customer.api.dto.View;
import org.example.clientbank.dto.AbstractDto;


@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@Data
public class ResponseAccountDto extends AbstractDto {

    private @JsonView(View.Admin.class) Long id;

    private @JsonView(View.Admin.class) String number;

    private @JsonView(View.Admin.class) String currency;

    private @JsonView(View.Admin.class) Double balance;
}
