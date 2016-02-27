INSERT INTO "users" (id,email,password_hash) VALUES (1,'admin@gmail.com','$2a$10$5V4NTnkcZ6vbTWkJXbQHReVLtxFxVuu5UXiaC93/MSJHDLx9rKJPO');
INSERT INTO "users" (id,email,password_hash) VALUES (2,'user@gmail.com','$2a$10$9CKjSd2ViSyWsEa6xBFK7egCuP98yWwgBv5ESei9S8758S4COsTlq');

INSERT INTO "user_roles" (user_id,roles) VALUES (1,'USER');
INSERT INTO "user_roles" (user_id,roles) VALUES (1,'ADMIN');
INSERT INTO "user_roles" (user_id,roles) VALUES (2,'USER');

