CREATE DATABASE IF NOT EXISTS cat_api;

USE cat_api;

CREATE TABLE CAT (
    id int PRIMARY KEY AUTO_INCREMENT,
    name varchar(100),
    open_api_id varchar(255) NOT NULL,
    url varchar(255) NOT NULL,
    width int UNSIGNED NOT NULL,
    height int UNSIGNED NOT NULL,
    temperament varchar(255),
    origin varchar(255)
);