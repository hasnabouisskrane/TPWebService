TPWebService

Cette activité se déroule sur les web services qui sont des applications qui permettent d’échanger des données avec d’autres applications web. Même si ces dernières sont construites dans des langages de programmation différents. Parmi les Web Services les plus connus on peut citer SOAP, REST ou HTTP.
Alors dans ce Tp on va créer un web service un Web service qui permet de convertir un montant de l'auro en DH, consulter un compte et renvoyer une liste des comptes.
Dans cette création de web service (BanqueWS) en utilisant les annotations JaxWS, et on a le déployer avec un simple serveur JaxWS. Après l'execution de code le serveur http va démarrer en localhost sur le porte 8686.



![serweb](https://user-images.githubusercontent.com/61788817/163653866-41e8b0d0-ef39-4c05-9249-eb3c90ff8d82.PNG)

Maintenant on va afficher WSDL (Web Services Description Language) est un langage de description fondé sur XML (Extensible Markup Language). Il a été soumis au W3C (World Wide Web Consortium) comme standard industriel pour la description des services Web.
Cnsultation de WSDL de notre projet avec un Browser HTTP.

![CaptureXMLBanq](https://user-images.githubusercontent.com/61788817/163654012-0e1955d7-fa9c-465a-8266-9214aec6b85d.PNG)


Enfin, on va tester les méthode de web service on utilisant SaopUI SoapUI qui est une application open source permettant le test de web service dans une architecture orientée services. Ses fonctionnalités incluent l'inspection des web service, l'invocation, le développement, la simulation, le mocking, les tests fonctionnels, les tests de charge et de conformité.

Les méthodes qui se trouvent dans web service 

![image](https://user-images.githubusercontent.com/61788817/163654532-a9792bac-5107-48d1-9e1e-0a5d95ab16c5.png)

Le test de la méthode conversionEuroToDH 

![1](https://user-images.githubusercontent.com/61788817/163654464-7383a0a8-31e8-4764-b75d-5f31286f7721.PNG)


Le test de la méthode getCompte 



![2](https://user-images.githubusercontent.com/61788817/163654474-36aafe6d-0aad-4a6c-988b-0f172890de75.PNG)


Le test de la méthode listCompte

![3](https://user-images.githubusercontent.com/61788817/163654479-c4c43dcc-55eb-4540-b754-1143ffa3eb83.PNG)

Ensuite a partir de WSDL on va générer le proxy qui est un composant logiciel informatique qui joue le rôle d'intermédiaire en se plaçant entre deux hôtes pour faciliter ou surveiller leurs échanges.

![11](https://user-images.githubusercontent.com/61788817/163654789-797411eb-f16a-4f21-b9cf-5cf3bf4eb5aa.PNG)


![12](https://user-images.githubusercontent.com/61788817/163654779-7bb6ed94-edc4-4798-815f-6aaa84da20c1.PNG)

On peut aussi Générer un proxy par une linge de commande(wsimport -s . http://localhost:8686/BanqueWS?wsdl)

Création d'un client avec une application dot Net en utilisant l'environment visual studio.

![image](https://user-images.githubusercontent.com/61788817/163654980-38fd2542-03dc-4413-b820-15af75bc8dc7.png)

L'éxécution de code:

![Capturevs](https://user-images.githubusercontent.com/61788817/163654995-0fd91188-13c3-46ad-8bf7-6b8a61d84f5c.PNG)












 

