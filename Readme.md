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

He decidido crea una app para el control y gestión de la flota de vehículos de una empresa de alquiler. Para ello establezco creo una clase
por cada tipo de vehículo que alquilan (Coche, Moto, Bicicleta y Patinete) y una clase de la que heredan las anteriores, Vehiculo, ya que todos los vehículos tiene atributos en común.
He creado ya cada clase con su correspondiente atributos y su constructor, así como su correspondiente método toString para obtener información de cada objeto.
También he implementado el método equals, usando para ello la librería Commons-lang, que ya nos ayuda a generar el método equals

Por otro lado en mi aplicación para gestionar dicha aplicación crearemos una clase llamada gestión, en donde crearemos el menú para poder ver, crear o
modificar vehículos.
Siguiendo la buena práctica del profesor las clases de vehículos estarán alojadas en un paquete llamado domain, y en el paquete principal crearemos 
la clase con el método main que solo ordenará ejecutarse al programa, y la clase gestión que será la que contenga toda la funcionalidad de menú y acciones
a desarrollar en los vehículos.

He desarrollado ya los menús para crear nuevos objetos de las distintas clases y poder visualizar los vehículos, podemos listarlos todos o buscar uno
concreto o bien buscar por todos los de una misma marca.

En el menú de crear objetos no permite que se añada un nuevo vehículo, si el número de bastidor o la matrícula es la misma, de este modo evitamos duplicados 
y errores. Para ello he redefinido el método equals en las clases que lo necesitaba.

