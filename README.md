# Agenda-de-contactos
Agenda de contactos online creada con Mysql, Spring Boot yThymeleaf

Agenda de Contactos en Java con Spring Boot, Thymeleaf, JPA y MySQL
Este proyecto es una aplicación de agenda de contactos desarrollada en Java utilizando Spring Boot, Thymeleaf, JPA (Java Persistence API) y MySQL como base de datos. Permite a los usuarios gestionar su lista de contactos, realizar operaciones de Crear, Leer, Actualizar y Borrar (CRUD).

Características
Crear, leer, actualizar y borrar contactos.
Almacenamiento de contactos en una base de datos MySQL.
Interfaz de usuario basada en Thymeleaf para una experiencia de usuario amigable.
Requisitos
Java JDK
Spring Boot
MySQL
Maven
Configuración
Clona este repositorio:

shell
Copy code
git clone https://github.com/tuusuario/agenda-de-contactos.git
Importa el proyecto en tu entorno de desarrollo preferido (por ejemplo, Eclipse o IntelliJ IDEA).

Configura la conexión a la base de datos MySQL en src/main/resources/application.properties.

properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/nombre_de_tu_bd
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
Ejecuta la aplicación:

shell
Copy code
mvn spring-boot:run
Abre un navegador web y visita http://localhost:8080 para acceder a la aplicación.

Uso
Crear un nuevo contacto: Haz clic en el botón "Crear Contacto" y completa el formulario.
Ver detalles de un contacto: Haz clic en el nombre de un contacto en la lista.
Actualizar un contacto: Haz clic en "Editar" en la página de detalles del contacto.
Eliminar un contacto: Haz clic en "Eliminar" en la página de detalles del contacto.
Contribuciones
¡Las contribuciones son bienvenidas! Si deseas mejorar esta aplicación, por favor:

Haz un fork del repositorio.
Crea una nueva rama para tus cambios.
Realiza tus modificaciones y asegúrate de seguir las convenciones de código y estilo.
Crea una solicitud de extracción (Pull Request) con una descripción clara de tus cambios.
Licencia
Este proyecto está licenciado bajo la Licencia MIT. Para obtener más detalles, consulta el archivo LICENSE.

Contacto
Si tienes alguna pregunta o comentario, no dudes en ponerte en contacto con el desarrollador:

Nombre: Marlon Franco
Correo electrónico: marlonfrancolynx@mail.com
