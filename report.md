# Rapport : Projet N°2 - API Trail

## Description globale

Nous avons créer deux API. La première permettant de s’authentifier (à l'aide d'un token) et la deuxième de gérer des trails. Notre première API ne sert qu'à s'authentifier, ce qui permettra au client d'utiliser la deuxième API. Grâce à la première API, un utilisateur peut modifier son mot de passe 

## Implémentation



## Description des entités

Comme pour le premier projet nous avons trois entités. La première est l'entité **user **, la seconde est l'entité **trail** et la troisième, l'entité **Registration**. Les entités changent suivant les APIs, dans 

#### User :

L'entité user représente un utilisateur caractérisé par un ID unique généré automatiquement par la base de données. Des informations personnelles tel que le nom, le prénom, la date de naissance et une photo de profil. L’émail est aussi unique et sert d'identifiant pour l'utilisateur. Il possède finalement un mot de passe pour pouvoir s'authentifier.

#### Trail :

L'entité trail représente une randonnées, elle possède elle aussi un ID unique généré automatiquement par la base de données. Elle possède ensuite toutes les informations nécessaire à sa définition tel que son nom, sa distance, sa dénivellation, sa description et sa date.

#### Registration :

L'entité registration est le lien entre nos deux première entités. Elle est composé d'un ID unique généré automatiquement par la base de données, de l'ID d'un utilisateur et de l'ID du trail auquel ce dernier souhaite s'inscrire.

## Bugs & Limitations