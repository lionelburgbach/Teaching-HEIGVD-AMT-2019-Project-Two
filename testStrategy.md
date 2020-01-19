# Stratégie de tests

## Tests Cucumber 

Dans les tests cucumber, nous avons créer différents scénario. Un premier pour tester d'ajouter un utilisateur. Un autre pour le supprimer, un autre pour s'authentifier et finalement un dernier pour récupérer un utilisateur. 

Pour les trails nous avons créer un scénario pour montrer que nous ne pouvons pas récupérer un trail sans token.

Nous avons rencontrer des problèmes avec nos tests après l'implémentation de traefik. Comme expliqué dans la partie bugs et limitation de notre rapport.

## Tests JMeter

Notre stratégie pour les tests Jmeter a été de tester la pagination de l'API user. 

asfdélkjsad

## Efficacité de nos tests

Nous avons testé la plus grande partie de notre application avec postman et des tests manuels. Pour la partie automatisé de nos tests, ils sont là pour montrer que nous avons réussi à en créer quelques uns mais ne sont pas suffisant à prouver que notre API fonctionne complètement. Si notre emploi du temps l'avait permis, nous aurions pu approfondir les tests. Par exemple, ajouter un nouvel utilisateur et voir si le nombre d'utilisateur a bien augmenté de 1.