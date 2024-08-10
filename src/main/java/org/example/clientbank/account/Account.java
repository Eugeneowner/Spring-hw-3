package org.example.clientbank.account;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import org.example.clientbank.AbstractEntity;
import org.example.clientbank.account.enums.Currency;
import org.example.clientbank.customer.Customer;

import java.util.UUID;

import static lombok.AccessLevel.PRIVATE;

@Entity
@Table(name = "accounts")
@EqualsAndHashCode(callSuper = true)

@Data
@NoArgsConstructor

public class Account extends AbstractEntity {

    private @Column(nullable = false)
    String number;

    private @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    Currency currency;

    private @Column(nullable = false)
    Double balance;

    private @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
    @JsonIgnore
    @ToString.Exclude
    @JoinColumn
    Customer customer;

    public Account(Currency currency, Customer customer) {
        this.id = null;
        this.number = UUID.randomUUID().toString();
        this.currency = currency;
        this.balance = 0.0;
        this.customer = customer;
    }
}
