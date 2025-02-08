# Assistant IoT pour Développeur 🚀

## 📌 Description
L'**Assistant IoT pour Développeur** est un projet qui permet de contrôler un environnement de développement via des commandes vocales envoyées à une API REST. Il utilise **Spring Boot** pour exécuter des actions sur un ordinateur, comme ouvrir IntelliJ, compiler un projet Maven ou gérer des conteneurs Docker.

## ⚙️ Fonctionnalités
- Exécution de commandes système via une API REST
- Sécurisation avec une clé API
- Commandes disponibles (Pour le moment) :
    - `open_intellij` → Ouvre IntelliJ IDEA
    - `build_project` → Exécute `mvn clean package`
    - `start_docker` → Lance `docker-compose up`
    - `stop_docker` → Arrête `docker-compose down`
    - `open_github` → Ouvre GitHub dans le navigateur

## 🛠️ Pré-requis
- Java 21+ (Vérifier avec `java -version`)
- Maven (Vérifier avec `mvn -version`)
- IntelliJ IDEA installé (ou modifier la commande pour un autre IDE)
- Docker installé (si utilisation des commandes Docker)

## 🚀 Installation et Exécution

1️⃣ **Cloner le projet**
```sh
git clone https://github.com/djibril62/assistant-iot.git
cd assistant-iot
```

2️⃣ **Configurer Java 21 si nécessaire**
```sh
export JAVA_HOME=$(/usr/libexec/java_home -v 21)
```

3️⃣ **Lancer le projet**
```sh
mvn spring-boot:run
```
Une fois démarré, l'API sera accessible à :
```
http://localhost:8080
```

## 📡 Tester l'API

Tester l'API avec `curl` :
```sh
curl -X POST "http://localhost:8080/api/assistant/execute?command=open_intellij" -H "X-API-KEY: SECRET_KEY_123"
```
Réponse attendue :
```
Commande exécutée avec succès : open_intellij
```

## 🔧 Configuration
Si tu veux changer le **port de l'API**, modifie `src/main/resources/application.properties` :
```
server.port=9090
```

## 🔜 Étapes suivantes
- Intégration avec l'ESP32 pour envoyer des commandes via WiFi
- Ajout de la reconnaissance vocale
- Extension avec d'autres commandes utiles pour le développement

---
📌 **Développé par Djibril Ndiaye**
