INSERT INTO customers (name, email, age, password, phone, created_date, last_modified_date)
VALUES ('Eugene', 'eugene@gmail.com', 35, 'qWerty', '+1234567890', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
       ('Tanya', 'tanya@gmail.com', 34, 'qWerty', '+0987654321', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
       ('Nikita', 'nikita@gmail.com', 35, 'qWerty', '+1122334455', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO accounts (number, currency, balance, customer_id, created_date, last_modified_date)
VALUES ('0123456789', 'USD', 100.0, 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
       ('1234567890', 'USD', 50.0, 2, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO employers (name, address, created_date, last_modified_date)
VALUES ('Facebook', 'California, USA', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
       ('LinkedIn', 'California, USA', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
       ('Apple', 'California, USA', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO customers_employers (customer_id, employer_id)
VALUES (1, 1),
       (2, 2),
       (3, 1);