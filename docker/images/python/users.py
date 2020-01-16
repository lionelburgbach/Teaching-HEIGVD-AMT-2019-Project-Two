from random import randint
import hashlib
import names
from faker import Faker
fake = Faker()

fichier = open("b_users.sql", "a")

nbUser = 1000

#header
fichier.write("/* -- Query:\n-- Date: 2019-10-17 15:44\n*/\n\nSET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;\nSET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;\nSET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';\n\nUSE amt_2;\n\n")

fichier.write("SET AUTOCOMMIT=0;\nINSERT INTO users_entity VALUES (1,'admin','lionel.burgbacher@heig-vd.ch','$2a$10$oC3vF0CQY9l3xl/LBw7hQ.RAUaZkRDBcK1e54hLzbSCUb70tVECqe');\nINSERT INTO users_entity VALUES (2,'admin','guillaume.blanco@heig-vd.ch','$2a$10$Vfj9knlD54qvUpSu2BpAjeynFVZTu3JNIxmqsq1Hl6lwK8gDcY9Gy');\n")
#Generate user
tablEndMail = ['@heig-vd.ch', '@gamil.com', '@trail.com', '@amtseeyounextyear.com', '@amtsucced.com', '@bestcoursever.ch', '@aaa.ch', '@aab.ch', '@aac.ch', '@aad.ch', '@aaf.ch', '@aag.ch', '@aah.ch', '@aai.ch', '@aaj.ch', '@aak.ch', '@aal.ch', '@aam.ch']

role = ['admin','regular']


for i in range(3, nbUser):
    strVal = "INSERT INTO users_entity VALUES ("
    firstname = names.get_first_name()
    lastname = names.get_last_name()
    role = 'regular'
    if i%100==0:
        role = 'admin'
    strVal += str(i) + "," + "'" +role+ "','" +firstname.lower()+ "." +lastname.lower()+""+tablEndMail[i%(len(tablEndMail)-1)]+ "','" +firstname+ "');\n"
    fichier.write(strVal)
    
fichier.write("COMMIT;\n")
fichier.close()
