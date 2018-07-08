CREATE TABLE users (
  username                 VARCHAR(64) PRIMARY KEY,
  password                 VARCHAR(300)       NOT NULL,
  enabled                  BOOLEAN            NOT NULL,
  real_name                VARCHAR(30),
  mobile                   VARCHAR(15) UNIQUE NOT NULL,
  avatar                   VARCHAR(500),
  verify_mailbox           BOOLEAN,
  mailbox_verify_code      VARCHAR(20),
  password_reset_key       VARCHAR(20),
  mailbox_verify_valid     DATETIME,
  password_reset_key_valid DATETIME,
  lang_key                 VARCHAR(20),
  join_date                DATE
);