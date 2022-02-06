# Instalacion
> El proyecto debe estar versionado en github.com en las cuentas personales de cada alumno.
> El proyecto debe utilizar java como lenguaje de programación, versión 8 o superior.
> El proyecto debe utilizar maven como herramienta de construcción.
> Utilizar la templeta de proyecto maven-archetype-quickstart.
> Para la publicación del API REST utilizar la librería Spark (https://sparkjava.com/).

> Publicar la ruta GET http://localhost:3456/entornos que retorne la siguiente cadena de caracteres: "En el ambiente <ambiente>", donde el valor de <ambiente> debe venir a partir de una variable de configuración de acuerdo al perfil. (Utilizar resources desde donde se obtendrá los valores de <ambiente>)

> Definir en el archivo pom.xml dos perfiles que servirán para los entornos de pruebas y producción, en ambos perfiles definir la variable "ambiente". (Utilizar la sección de perfiles en el pom.xml)

> Realizar la construcción de la aplicación en un solo archivo jar con todas las dependencias. (Utilizar el plugin maven-assembly-plugin)

> Escribir un archivo INSTALL.md dentro del proyecto con las instrucciones para la construcción de la aplicación utilizando los comandos maven. (Utilizar el parámetro -P en los comandos de maven para cambiar de perfiles)
```
    mvn package -P prod
    java -jar target/exfinal-1.0-SNAPSHOT-jar-with-dependencies.jar

```


> En el archivo INSTALL.md debe tener también las instrucciones para correr la aplicación con el archivo jar. (Por ejemplo en una consola correr el jar y en otra utilizar curl para consumir el API REST)

```
    java -jar target/exfinal-1.0-SNAPSHOT-jar-with-dependencies.jar
```
o
```
    curl http://localhost:4567/entornos

```

> Realizar la automatización de la construcción de la aplicación utilizando github actions de github.

Se realizará la evaluación de la aplicación considerando lo siguiente:

1. Se revisará que haya un commit por las siguientes actividades:
- Commit cuando se suba la aplicación inicial una vez que se crea el proyecto con la templeta.
- Commit con el código que publica el API REST y sus instrucciones de ejecución.
- Commit cuando se integre a github actions de github.
- Pueden existir otros commits adicionales.

2. Se revisará y ejecutará las instrucciones detalladas en el archivo INSTALL.md para comprobar la correcta ejecución de la aplicación.

3. Se revisará que la aplicación tenga la integración con github actions.