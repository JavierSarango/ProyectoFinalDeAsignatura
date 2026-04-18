# Proyecto Final de Asignatura

Este repositorio contiene el desarrollo del proyecto final para la asignatura de Estructura de Datos. Es una aplicación de escritorio desarrollada en **Java** que integra una base de datos **MySQL** para la gestión de información.

## 🚀 Características
*   **Interfaz Gráfica (GUI):** Desarrollada con Java Swing/AWT.
*   **Persistencia de Datos:** Conexión a base de datos MySQL.
*   **Arquitectura:** Estructura basada en paquetes (MCV - Modelo, Vista, Controlador).
*   **Gestión CRUD:** Operaciones de Crear, Leer, Actualizar y Eliminar registros.

## 🛠️ Tecnologías Utilizadas
*   **Lenguaje:** Java (JDK 8 o superior recomendado).
*   **IDE:** NetBeans (incluye archivos de configuración `.nbproject`).
*   **Base de Datos:** MySQL.
*   **Librerías:** `mysql-connector-java-5.1.16-bin.jar` (incluida en la raíz).

## 📋 Requisitos Previos
Para ejecutar este proyecto, necesitarás tener instalado:
1.  [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/downloads/)
2.  [MySQL Server](https://dev.mysql.com/downloads/mysql/)
3.  [NetBeans IDE](https://netbeans.apache.org/download/index.html) (opcional, pero recomendado)

## 🔧 Configuración e Instalación

### 1. Base de Datos
*   Asegúrate de tener MySQL corriendo.
*   Crea una base de datos con el nombre especificado en las clases de conexión (revisa la carpeta `src` para encontrar la URL de conexión).
*   Crea las tablas necesarias.

### 2. Clonar el repositorio
```bash
git clone https://github.com/JavierSarango/ProyectoFinalDeAsignatura.git
```

### 3. Abrir en NetBeans
1.  Abre NetBeans IDE.
2.  Ve a `File` > `Open Project`.
3.  Selecciona la carpeta donde clonaste el repositorio.
4.  Asegúrate de que la librería `mysql-connector-java-5.1.16-bin.jar` esté agregada al *Classpath* del proyecto.

## 📦 Estructura del Proyecto
```text
├── nbproject/              # Configuraciones específicas de NetBeans
├── src/                    # Código fuente del proyecto (.java)
├── build.xml               # Script de construcción Ant
├── manifest.mf             # Archivo de manifiesto
└── mysql-connector-java... # Conector para la base de datos
```
