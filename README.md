# Aplicación de Citas Médicas
## Descripción del Proyecto
La Aplicación de Citas Médicas es una herramienta para la gestión de citas entre pacientes y médicos. Utiliza la arquitectura Modelo-Vista-Controlador (MVC) en Java, lo que facilita la separación de preocupaciones y la mantenibilidad del código. XML se utiliza para la configuración y almacenamiento de datos.

##Arquitectura y Tecnologías
Lenguaje de Programación: Java
Patrón de Diseño: MVC
Almacenamiento y Configuración: XML
Frameworks y Librerías:
JavaFX para la interfaz gráfica
JDOM para manipulación de XML

## Estructura del Proyecto

/CitasMedicas
│
├── /src
│   ├── /controller
│   │   └── CitaController.java
│   │   └── PacienteController.java
│   │   └── MedicoController.java
│   │
│   ├── /model
│   │   └── Cita.java
│   │   └── Paciente.java
│   │   └── Medico.java
│   │
│   ├── /view
│   │   └── CitaView.java
│   │   └── PacienteView.java
│   │   └── MedicoView.java
│   │
│   └── /util
│       └── XMLUtil.java
│
├── /data
│   └── citas.xml
│   └── pacientes.xml
│   └── medicos.xml
│
├── /docs
│   └── README.md
│
└── pom.xml
