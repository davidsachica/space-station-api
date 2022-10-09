# Runtime

#Imagen básica: el almacén es java y la etiqueta es 17-jdk
FROM eclipse-temurin:17-jdk-focal

# Mantenimiento e información de contacto del espejo actual
MAINTAINER stiwardjherikofcr.github.io

# Crear un archivo temporal en el directorio / var / lib / docker de la máquina host y vincularlo al directorio / tmp en el contenedor.
VOLUME /tmp

# El contenedor expone el puerto 8091
EXPOSE 8091

WORKDIR /app
COPY . .

RUN ls

ARG JAR_FILE=docs/libs/space-station-0.0.1-SNAPSHOT.jar

ADD --chown=gradle:gradle . /app
RUN ./gradlew build --stacktrace

# Copiar el programa empaquetado en la ubicación especificada en el contenedor
ADD ${JAR_FILE} app.jar

# Comandos que deben ejecutarse después de que se inicia el contenedor
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app/app.jar"]
