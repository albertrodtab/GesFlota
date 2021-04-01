**GesFlota**
Actividad de la asignatura de entornos de desarrollo.
Esta Actividad de Aprendizaje consiste en el desarrollo de una aplicación sencilla orientada a objetos sobre la que practicaremos la integración continua.

    Almacenando el código en un repositorio en GitHub y trabajando con el modelo Git Flow
    Lanzando automáticamente los test unitarios con ayuda de Jenkins cada vez que se suba una nueva funcionalidad al repositorio
    Comprobando la calidad del código con SonarQube

Debes idear una aplicación orientada a objetos compuesta de al menos 3 clases y donde cada una de esas clases tenga al menos 5 atributos
(con al menos los tipos String, int y float) con, al menos, un constructor y sus correspondientes getters y setters. Implementa también, 
para cada clase, el método equals según convenga.
Además, tendrás que crear, en otra clase, un menú principal desde el cual el usuario podrá escoger crear objetos de las tres clases y 
visualizar cualquiera de los objetos creados.
Se proponen una serie de Requisitos obligatorios que deben ser implementados y otra serie de funcionalidades de entre las que se pueden elegir hasta 5.
Requisitos (1 pto cada uno, obligatorios)
Crea un repositorio en GitHub para almacenar el código del proyecto de forma que dispongan de las ramas master y develop. Configura también 
el fichero README.md del repositorio para que explique en que consiste la aplicación y enumere los puntos que has realizado.
Para cada nueva funcionalidad se creará una nueva rama feature y se fusionará con develop mediante Pull Request:
    Crear las 3 clases
    Crear las opciones de menú para registrar objetos de las 3 clases
    Crear las opciones de menú para visualizar los objetos creados
Configura un Jenkins para que cada vez que realiza una Pull Request se lance un Job que compile y empaquete el proyecto
Añade al Job la configuración necesaria para que el código del proyecto sea analizado por un SonarQube
Instala y ejecuta VisualVM y monitoriza el rendimiento y el uso de memoria de tu aplicación
