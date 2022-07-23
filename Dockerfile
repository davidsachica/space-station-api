# Runtime

#Imagen básica: el almacén es java y la etiqueta es 11-jdk
FROM adoptopenjdk/openjdk17:latest

# Mantenimiento e información de contacto del espejo actual
MAINTAINER stiwardjherikofcr.github.io

# Crear un archivo temporal en el directorio / var / lib / docker de la máquina host y vincularlo al directorio / tmp en el contenedor.
VOLUME /tmp

# El contenedor expone el puerto 8090
EXPOSE 8090

ARG JAR_FILE=build/libs/space-station-0.0.1-SNAPSHOT.jar

# Copiar el programa empaquetado en la ubicación especificada en el contenedor
ADD ${JAR_FILE} app.jar

# Comandos que deben ejecutarse después de que se inicia el contenedor
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]