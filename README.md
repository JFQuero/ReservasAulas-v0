# Tarea Reservas de Aulas
## Profesor: JosÃ© RamÃ³n JimÃ©nez Reyes
## Alumno: Juan Fernandez Quero

La tarea va a consistir en modelar la gestiÃ³n de reservas de aulas del IES Al-Ã�ndalus. DespuÃ©s de todas las especificaciones y requerimientos anotados, en ese primer spring de la aplicaciÃ³n se ha decidido abarcar los siguientes:

- Hay unas aulas que se pueden reservar, aunque en este primer spring sÃ³lo contemplaremos la reserva del salÃ³n de actos. Por tanto, un **aula** serÃ¡ identificada por su **nombre**, el cuÃ¡l no puede estar vacÃ­o y tampoco se puede modificar dicho nombre una vez creada. Podremos crear nuevas aulas (siempre que no exista otra aula con el mismo nombre), borrarlas, buscar aulas por su nombre y listar las aulas.
- Los profesores podrÃ¡n realizar reservas. Un **profesor** se identifica por su **nombre**, su **correo electrÃ³nico** (que debe ser correcto) y su **telÃ©fono**. El telÃ©fono puede proporcionarlo el profesor o no. Si lo indica serÃ¡ una cadena de 9 dÃ­gitos y siempre debe comenzar por 6 o 9. Si no lo indica, no se asociarÃ¡ ningÃºn telÃ©fono a dicho profesor. Una vez creado un profesor no se le podrÃ¡ cambiar el nombre, pero sÃ­ se podrÃ¡ cambiar su correo o su telÃ©fono, pudiendo ser este Ãºltimo vacÃ­o. Podremos aÃ±adir nuevos profesores (siempre que no exista otro profesor con el mismo nombre), borrarlos, buscar profesores por su nombre y listar los profesores dados de alta.
- Como en este primer spring sÃ³lo contemplamos la reserva del salÃ³n de actos, Ã©ste se podrÃ¡ reservar para una **permanencia** de un **dÃ­a** y para el **tramo** de maÃ±ana o tarde.
- Un **profesor** podrÃ¡ **reservar** un **aula** para una **permanencia** dada. No se llevarÃ¡ a cabo la reserva si para dicha permanencia y aula ya hay otra reserva dada de alta. TambiÃ©n podremos anular una reserva, buscar una reserva para un aula  permanencia dada y listar todas las reservas existentes. TambiÃ©n podremos listar las reservas que ha realizado un profesor, listar las reservas de un aula dada y listar las reservas para una permanencia concreta. CÃ³mo no, tambiÃ©n podremos consultar la disponibilidad de un aula para una permanencia dada.

Tu tarea consiste en realizar una aplicaciÃ³n para gestionar la reserva de aulas para el IES Al-Ã�ndalus. Con los conocimientos adquiridos hasta el momento realizaremos una implementaciÃ³n basada en arrays para gestionar las colecciones. Aunque aÃºn no tenemos los conocimientos necesarios para aplicar el patrÃ³n MVC, sÃ­ haremos una distinciÃ³n entre la vista (encargada de interaccionar con el usuario) y el modelo (encargado de gestionar los datos) que dividiremos entre clases del dominio y las clases DAO que nos permiten interactuar con las colecciones.

Debes tener en cuenta el problema existente con las referencias, por lo que para cada clase que sea cliente de otra deberÃ¡s devolver referencias a objetos nuevos en los mÃ©todos de acceso y tambiÃ©n crear nuevas referencias a nuevos objetos cuando los vayamos a asignar a atributos. En los mÃ©todos de las clases DAO tambiÃ©n deberÃ¡s devolver una copia profunda de los elementos de la colecciÃ³n en dicho mÃ©todo de acceso.

TambiÃ©n siempre se deben validar todas los valores que se intentan asignar y si no lanzar una excepciÃ³n adecuada para evitar inconsistencias en el estado de los objetos.

Para ello te pongo un diagrama de clases para el mismo y poco a poco te irÃ© explicando los diferentes pasos a realizar:

![Diagrama de clases para reservasaulas](src/main/resources/reservasAulas.png)

He subido a GitHub un esqueleto de proyecto gradle que ya lleva incluidos todos los test necesarios que el programa debe pasar. Dichos test estÃ¡n todos comentados y deberÃ¡s ir descomentÃ¡ndolos conforme vayas avanzando con la tarea. La URL del repositorio es en la que te encuentras.

Por tanto, tu tarea va a consistir en completar los siguientes apartados:

1. Lo primero que debes hacer es realizar un **fork** del repositorio donde he colocado el proyecto gradle con la estructura del proyecto y todos los test necesarios.
2. Clona tu repositorio remoto reciÃ©n copiado en github a un repositorio local que serÃ¡ donde irÃ¡s realizando lo que a continuaciÃ³n se te pide. AÃ±ade tu nombre al fichero `README.md` en el apartado "Alumno". Haz tu primer commit.
3. Crea el enumerado `Tramo` con las siguientes constantes: `MANANA` y `TARDE`, en este orden. Haz un commit.
4. Crea la clase `Permanencia` con sus atributos especificados, los mÃ©todos de acceso y modificaciÃ³n con su visibilidad adecuada y el constructor con dos parÃ¡metros y copia tal y como se indica en el diagrama de clases. El formato de un dÃ­a debe ser "dd/mm/aaaa".  Crea tambiÃ©n los mÃ©todos `equals`, `hashCode` y `toString`, teniendo en cuenta que dos permanencias serÃ¡n iguales si son para el mismo dÃ­a y para el mismo tramo. Haz un commit.
5. Crea la clase `Aula` con los atributos indicados, los mÃ©todos de acceso y modificaciÃ³n con su visibilidad adecuada y el constructor con un parÃ¡metro y copia tal y como se indica en el diagrama de clases. Crea tambiÃ©n los mÃ©todos `equals`, `hashCode` y `toString`, teniendo en cuenta que dos aulas serÃ¡n iguales si sus nombres son los mismos. Haz un commit.
6. Crea la clase `Profesor` con los atributos indicados, los mÃ©todos de acceso y modificaciÃ³n con su visibilidad adecuada y el constructor con dos o tres parÃ¡metros y el constructor copia. Crea tambiÃ©n los mÃ©todos `equals`, `hashCode` y `toString`, teniendo en cuenta que dos profesores serÃ¡n iguales si su nombre es el mismo. Haz un commit.
7. Crea la clase `Reserva` con los atributos indicados, los mÃ©todos de acceso y modificaciÃ³n con su visibilidad adecuada y el constructor con tres parÃ¡metros y copia tal y como se indica en el diagrama de clases. Crea tambiÃ©n los mÃ©todos `equals`, `hashCode` y `toString`, teniendo en cuenta que dos reservas serÃ¡n iguales si el aula y la permanencia son iguales, independientemente del profesor. Haz un commit.
8. Crea la clase `Aulas` con los atributos indicados, los mÃ©todos de acceso y modificaciÃ³n con su visibilidad adecuada y el constructor por defecto y copia. Crea los mÃ©todos `insertar`, `buscar`, `borrar` y `representar apoyÃ¡ndote en los mÃ©todos privados que se exponen en el diagrama de clases. Haz un commit.
9. Crea la clase `Profesores` con los atributos indicados, los mÃ©todos de acceso y modificaciÃ³n con su visibilidad adecuada y el constructor por defecto y copia. Crea los mÃ©todos `insertar`, `buscar`, `borrar` y `representar` apoyÃ¡ndote en los mÃ©todos privados que se exponen en el diagrama de clases. Haz un commit.
10. Crea la clase `Reservas` con los atributos indicados, los mÃ©todos de acceso y modificaciÃ³n con su visibilidad adecuada y el constructor por defecto y copia. Crea los mÃ©todos `insertar`, `buscar`, `borrar`, `representar`, `getReservasAula`, `getReservasProfesor`, `getReservasPermanencia` y `consultarDisponibilidad` apoyÃ¡ndote en los mÃ©todos privados que se exponen en el diagrama de clases. Haz un commit.
11. Crea la clase `ModeloReservasAulas` con los atributos indicados, los mÃ©todos que se especifican en el diagrama y que simplemente llamarÃ¡n a cada uno de los mÃ©todos de la clase DAO implicada. Haz un commit.
12. Crea el enumerado `Opcion` que serÃ¡ el encargado de representar el menÃº de opciones de nuestra aplicaciÃ³n y que se adecue al diagrama de clases expuesto. Haz un commit.
13. Crea la clase `Consola` de ayuda, que serÃ¡ la encargada de realizar las diferentes lecturas de los objetos desde la consola. Recuerda evitar que se cree el constructor por defecto. Haz un commit.
14. Crea la clase `IUTextual` con los mÃ©todos que se especifican y que serÃ¡ la encargada de ejecutar cada una de las opciones del menÃº de nuestra aplicaciÃ³n. Haz un commit.
15. Crea una clase llamada `MainApp` que incluya un mÃ©todo `main`. El mÃ©todo `main` deberÃ¡ mostrarnos un menÃº con las diferentes opciones y actuar en consecuencia. El menÃº se repetirÃ¡ mientras no elijamos la opciÃ³n salir. Haz un commit.



###### Se valorarÃ¡:
- La nomenclatura del repositorio de GitHub y del archivo entregado sigue las indicaciones de entrega.
- La indentaciÃ³n debe ser correcta en cada uno de los apartados.
 -El nombre de las variables debe ser adecuado..- Se debe utilizar la clase Entrada para realizar la entrada por teclado..- El proyecto debe pasar todas las pruebas que van en el esqueleto del mismo y toda entrada del programa serÃ¡ validada para evitar que el programa termine abruptamente debido a una excepciÃ³n..- Se deben utilizar los comentarios adecuados..- Se valorarÃ¡ la correcciÃ³n ortogrÃ¡fica tanto en los comentarios como en los mensajes que se muestren al usuario,.

