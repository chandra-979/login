CREATE TABLE user(
   user_id   BIT  NOT NULL PRIMARY KEY
  ,name     VARCHAR(6) NOT NULL
  ,mail_id   VARCHAR(16) NOT NULL
  ,password DATE  NOT NULL
  ,phone_no  INTEGER  NOT NULL
  ,location VARCHAR(9) NOT NULL
);
INSERT INTO user(user_id,name,mail_id,password,phone_no,location) VALUES (1,'Rajesh','rajesh@gmail.com','rajesh@123',1234567890,'Anantapur');