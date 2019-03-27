CREATE TABLE category (

id IDENTITY,
name VARCHAR(50),
description VARCHAR(255),
image_url VARCHAR(50),
is_active BOOLEAN,

CONSTRAINT pk_category_id PRIMARY KEY (id)

);

INSERT INTO CATEGORY(name,description,image_url,is_active) values('panipuri','this is a description of panipuri','CAT_1.png',true);
INSERT INTO CATEGORY(name,description,image_url,is_active) values('bhelpuri','this is a description of bhelpuri','CAT_2.png',true);
INSERT INTO CATEGORY(name,description,image_url,is_active) values('sevpuri','this is a description of sevpuri','CAT_3.png',true);