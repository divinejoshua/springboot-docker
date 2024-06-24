## Springboot at scale
This is a Java Springboot project that has docker



## Project setup - Overall
mac:
```
sh startup.sh
```

## Build project with Maven
```
mvn clean install
```

## Run Docker with current Maven build
```
docker-compose up --build -d
```

### NOTE:
Build project with Maven before running docker compose in order to include any updates that was made in your project.