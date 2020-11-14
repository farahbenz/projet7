# PROJET  - Développez le nouveau système d’information de la bibliothèque d’une grande ville

## Présentation de l'application. 

Réalisation d'un site web pour une bibliothèque.Le site web permettra aux usagers de suivre les prêts de leurs ouvrages.  

 ### 1. Objectif  
  	
  Réaliser une application web pour les usagers.   
  Réaliser API web en REST et une application web batch pour l'envoi des mails de retard.						
	
 ### 2. Fonctionnalités attendues  
  
Rechercher des ouvrages et voir le nombre d’exemplaires disponibles.  
Consulter leurs prêts en cours. Les prêts sont pour une période de 4 semaines.  
Prolonger un prêt en cours. Le prêt d’un ouvrage n’est prolongeable qu’une seule fois. La prolongation ajoute une nouvelle période de prêt (4 semaines).  

## Démarrage de l'application  

-> À l'aide d'un serveur d'application lancer les fichiers WAR.    
-> Pour le deployement de la base de données:      
	- Installer MySQL.   
	- Creer la base de données avec   
	nom d'utilisateur : root  
	                                    mot de passe  : 123  
	                                    port          : 3306  
	- Creer les differents schémas pour chacun des microservices   
	- Copier le contenu des fichiers ScriptSQL (disponible ci-dessus) dans chaque schémas, pensez bien à selectionner les bon schemas.    
	- Inserer ensuite le contenu des fichiers demoProjet (disponible ci-dessus).   

