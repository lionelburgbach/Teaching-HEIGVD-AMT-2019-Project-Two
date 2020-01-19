# Build, Run & Test

### Build & Run 

Pour construire et lancer notre application, il faut vous rendre dans le dossier `Teaching-HEIGVD-AMT-2019-Project-Two/docker/docker-comp-prod`. Vous allez ensuite lancer le script suivant : `up.sh `. Entre deux utilisation il est conseillé d'utiliser de script `dockerclean.sh` qui permet d'arrêter les différents container.

Ensuite vous pouvez vous rendre, dans votre navigateur préféré, aux adresses suivantes, http://worldtrails.ch/auth/swagger-ui.html (pour l'authentification) http://worldtrails.ch/trails/swagger-ui.html (pour les trails) , pour accéder à nos deux APIs. 

Pour que la résolution de DNS puisse se faire, il faut changer le fichier situé `hosts` situé dans `/etc`.  Il vous faut remplacer la ligne `127.0.0.1 localhost` par `127.0.0.1  www.worldtrail.ch`. 

Nous n'avons pas utilisé un wait-for-it script mais seulement un restart, si le container n'arrive pas à démarrer, dans le cas où la base de données n'est pas up.

### **Compte** :

Deux comptes de tests sont disponibles, il existe aussi des centaines d'autres comptes fictifs utilisés pour les différents tests.

**Admin** : lionel.burgbacher@heig-vd.ch, **mot de passe** : Lionel

**User** : guillaume.blanco@heig-vd.ch, **mot de passe** : Guillaume

### **Scripts :**

Deux scripts ont été utilisés (trailUserReg.py & users.py) pour générer les données, vous pouvez les retrouver à chemin suivant : `Teaching-HEIGVD-AMT-2019-Project-Two/docker/images/python`.

Pour les lancer, il vous suffit de lancer la commande : `python <fileName>`

De toutes façons les bases de données sont déjà peuplées.

### **Tests:**

Pour tester notre application, il faut vous rendre à la racine du projet (`Teaching-HEIGVD-AMT-2019-Project-Two`) et lancer les scripts trail_test.sh & user_test.sh.

