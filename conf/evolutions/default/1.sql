# --- !Ups

INSERT INTO gressy."user" (id,role,email,password) VALUES (9000,'admin','gressy.project@gmail.com','$2a$10$aAtDb.ep6bWDDDy28bQiWeRZKhlvBpFBB/ht8.FtS0E99oV1N5r9K');

# --- !Downs

DELETE FROM gressy.user WHERE email='gressy.project@gmail.com';
