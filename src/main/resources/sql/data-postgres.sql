INSERT INTO customers (name, email, age, password, phone, created_date, last_modified_date)
VALUES ('Eugene', 'eugene@gmail.com', 35, 'qWerty', '+1234567890', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
       ('Tanya', 'Tanya@gmail.com', 34, 'qWerty', '+0987654321', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
       ('Den', 'den@gmail.com', 35, 'qWerty', '+1122334455', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),


INSERT INTO accounts (number, currency, balance, customer_id, created_date, last_modified_date)
VALUES (uuid_generate_v4(), 'USD', 100.0, 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
       (uuid_generate_v4(), 'USD', 50.0, 2, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO employers (name, address, created_date, last_modified_date)
VALUES ('Amazon', 'Seattle, USA', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
       ('Apple', 'California, USA', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
       ('Google', 'California, USA', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO customers_employers (customer_id, employer_id)
VALUES (1, 1),
       (2, 2),
       (3, 1);