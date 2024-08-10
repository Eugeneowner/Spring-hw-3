INSERT INTO customers (name, email, age, password, phone, created_date, last_modified_date)
VALUES ('Eugene', 'eugene@gmail.com', 35, 'qWerty', '+380662224499', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
       ('Tanya', 'nanya@gmail.com', 34, 'qWerty', '+380987773344', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
       ('Nikita', 'nikita@gmail.com', 35, 'qWerty', '+38677777777', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);


INSERT INTO accounts (number, currency, balance, customer_id, created_date, last_modified_date)
VALUES (uuid_generate_v4(), 'USD', 100.0, 1, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
       (uuid_generate_v4(), 'USD', 50.0, 2, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO employers (name, address, created_date, last_modified_date)
VALUES ('Facebook', 'California, USA', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
       ('LinkedIn', 'California, USA', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP),
       ('Apple', 'California, USA', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP);

INSERT INTO customers_employers (customer_id, employer_id)
VALUES (1, 1),
       (2, 2),
       (3, 1);