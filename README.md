# HTTP Server (es)

Este proyecto implementa un servidor HTTP simple en Java. El servidor escucha en el puerto 8080 y procesa solicitudes entrantes, respondiendo con la fecha y hora actuales.

## Estructura del Proyecto

El proyecto contiene los siguientes archivos:

- `main.java`: Contiene el punto de entrada del programa y la lógica principal del servidor.
- `Server.java`: Define la interfaz `Server` con los métodos `processRequest` y `sendResponse`.
- `ServerImpl.java`: Implementa la interfaz `Server` y proporciona la funcionalidad para procesar solicitudes y enviar respuestas.
- `README.md`: Este archivo, que proporciona información sobre el proyecto.

## Cómo Ejecutar el Servidor

Para ejecutar el servidor, sigue estos pasos:

1. Compila los archivos Java:
    ```sh
    javac main.java Server.java ServerImpl.java
    ```

2. Ejecuta la clase principal:
    ```sh
    java main
    ```

El servidor comenzará a escuchar en el puerto 8080 y estará listo para procesar solicitudes HTTP.

## Ejemplo de Uso

Una vez que el servidor esté en ejecución, puedes probarlo utilizando un navegador web o una herramienta como `curl`. Por ejemplo:
    ```sh 
    curl http://localhost:8080
    ```

El servidor responderá con un mensaje HTTP que incluye la fecha y hora actuales.

## Autor
Adrian Martinez Fuentes

## Licencia
Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo LICENSE para obtener más detalles.



# HTTP Server (en)
This project implements a simple HTTP server in Java. The server listens on port 8080 and processes incoming requests, responding with the current date and time.

## Project Structure
The project contains the following files:

main.java: Contains the program's entry point and the main server logic.
Server.java: Defines the Server interface with the processRequest and sendResponse methods.
ServerImpl.java: Implements the Server interface and provides functionality 
README.md: This file, which provides information about the project.

## How to Run the Server
To run the server, follow these steps:

Compile the Java files:
    ```sh
    javac main.java Server.java ServerImpl.java
    ```

Run the main class:
    ```sh
    java main
    ```

The server will start listening on port 8080 and will be ready to process HTTP requests.

## Usage Example
Once the server is running, you can test it using a web browser or a tool like curl. 
For example:
    ```sh 
    curl http://localhost:8080
    ```

The server will respond with an HTTP message that includes the current date and time.

## Author
Adrian Martinez Fuentes

## License
This project is licensed under the MIT License. See the LICENSE file for more details.

