# 💻 Implementación de los Patrones Iterator y Visitor

Este repositorio contiene una implementación práctica de dos importantes patrones de diseño de software: **Iterator (Iterador)** y **Visitor (Visitante)**, utilizando el lenguaje de programación **Java**.

El objetivo principal es demostrar cómo estos patrones se pueden aplicar para separar la lógica de recorrido y las operaciones que dependen de la estructura de un objeto, haciendo el código más limpio, modular y fácil de mantener y extender.

***

## 📚 Patrones de Diseño Implementados

### 🚶 **Iterator (Iterador)**

El patrón **Iterador** proporciona una manera de acceder secuencialmente a los elementos de un objeto agregado complejo sin exponer su representación subyacente.

En este proyecto, el patrón Iterador se utiliza para:
* Recorrer diferentes estructuras de datos de forma uniforme.
* Ocultar los detalles internos de la colección que se está iterando.


### 👨‍🏫 **Visitor (Visitante)**

El patrón **Visitor** permite definir una nueva operación que se ejecutará en los elementos de una estructura de objetos sin cambiar las clases de los elementos sobre los que opera.

En este proyecto, el patrón Visitante se emplea para:
* Realizar operaciones específicas (visitas) sobre los diferentes tipos de nodos en una estructura.
* Facilitar la adición de nuevas operaciones sin modificar las clases de los elementos (el principio de **Abierto/Cerrado**).


***

## 🛠️ Tecnología

El proyecto fue desarrollado utilizando:

* **Lenguaje de Programación:** Java
* **Entorno de Desarrollo (IDE):** IntelliJ IDEA (inferido por el archivo `.iml` e `.idea`)

***
## 🛠️ Diagrama UML
***

## 🧑‍💻 Autores

Este proyecto fue desarrollado por:

* **David Felipe Gil Laverde**
* **Juan Esteban Cañón**
* **Juan Sebastian Diaz**

***

## 📂 Estructura del Proyecto

La lógica principal se encuentra en la carpeta `src/`. Además, se incluye un diagrama que ilustra la arquitectura de la solución, el cual puede ser útil para comprender la relación entre las clases:

* `IteratorVisitor.dia`: Archivo de diagrama (formato DIA).
* `IteratorVisitor.png`: Imagen del diagrama de clases.
