from random import randint
import hashlib
import names
from faker import Faker
fake = Faker()

fichier = open("b_trailer.sql", "a")

#ICI POUR CHANGER LE NOMBRE DE USER ET DE TRAIL
nbUser = 100
nbTrail = 500


count = 0
#header
fichier.write("/* -- Query:\n-- Date: 2019-10-17 15:44\n*/\n\nSET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;\nSET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;\nSET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';\n\nUSE amt_21;\n\n")

fichier.write("SET AUTOCOMMIT=0;\nINSERT INTO user_entity VALUES (1,'Lionel','Burgbacher','lionel.burgbacher@heig-vd.ch','lionel','05-03-1989');\nINSERT INTO user_entity VALUES (2,'Guillaume','Blanco','guillaume.blanco@heig-vd.ch','guillaume','25-05-1993');\n")
#Generate user
tablEndMail = ['@heig-vd.ch', '@gamil.com', '@trail.com', '@amtseeyounextyear.com', '@amtsucced.com', '@bestcoursever.ch', '@aaa.ch', '@aab.ch', '@aac.ch', '@aad.ch', '@aaf.ch', '@aag.ch', '@aah.ch', '@aai.ch', '@aaj.ch', '@aak.ch', '@aal.ch', '@aam.ch',]
tabMois = ['01','02','03','04','05','06','07','08','09','10','11','12']
tabJours = ['01','02','03','04','05','06','07','08','09','10','11','12','13','14','15','16','17','18','19','20','21','22','23','24','25','26','27','28','29','30']


for i in range(3, nbUser):
    count += 1
    strVal = "INSERT INTO user_entity VALUES ("
    firstname = names.get_first_name()
    lastname = names.get_last_name()
    mois = tabMois[randint(0,len(tabMois)-1)]
    if mois == '02':
        mois = '01'
    strVal += str(i) + "," + "'" +firstname+ "','" +lastname+ "','" +firstname.lower()+ "." +lastname.lower()+""+tablEndMail[i%(len(tablEndMail)-1)]+ "','" +firstname+ "','" + tabJours[randint(0,len(tabJours)-1)] + "-" + mois + "-" + str(randint(1950,2017)) + "');\n"
    fichier.write(strVal)


fichier.write("COMMIT;\n\nSET AUTOCOMMIT=0;\n")

#Generete trail
tabDescri = ['Trop easy AMT','AMTs Hell','See you next Year!','Tres beau trail','Le trail de la mort qui tue','Le trail de quand tu rentres chez toi t es dans le dur','Champion trail','Trail de a peu pres quelques kil','El trailo de la muerte peluda','Trail 2.0 sisi','Trail de on est la !']

for i in range(1,nbTrail):
    count += 1
    mois = tabMois[randint(0,len(tabMois)-1)]
    if mois == '02':
        mois = '01'
    strVal = "INSERT INTO trail_entity VALUES ("
    strVal += str(i) + "," + "'" + fake.city() + "'," + str(randint(1000,4000)) + ",'" + tabDescri[randint(0,len(tabDescri)-1)] + "','" + tabJours[randint(0,len(tabJours)-1)] + "-" + mois + "-" + str(randint(2020,2025)) + "'," + str(randint(20,60)) + ");\n"
    fichier.write(strVal)

fichier.write("COMMIT;\n\nSET AUTOCOMMIT=0;\n")

#Generate reg
index = 1
for i in range(1,nbTrail):
    
    min = randint(1, nbUser)
    max = randint(1, nbUser)
    while (min > max) and (max-min>50):
            min = randint(1, nbUser)
            max = randint(1, nbUser)
    
    for j in range(min,max):
        count += 1
        strVal = "INSERT INTO registration_entity VALUES ("
        strVal += str(index) + ","+ str(j)+","+str(i)+");\n"
        fichier.write(strVal)
        index += 1

print(count)
fichier.write("COMMIT;\n")
fichier.close()
