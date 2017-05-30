DROP TABLE IF EXISTS contact;
CREATE TABLE contact(
  id INT AUTO_INCREMENT,
  name VARCHAR(255),
  first_name VARCHAR(100),
  last_name VARCHAR(100),
  position VARCHAR(100),
  phone VARCHAR(50),
  email VARCHAR(255)
);
