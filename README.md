# 🎯 Gomoku Java Edition

Proyecto académico desarrollado como introducción a la **Programación Orientada a Objetos (POO)** en Java. Implementa el clásico juego de Gomoku (cinco en línea) con una interfaz gráfica creada con **AWT/Swing** y lógica modular basada en objetos.

---

## 📚 ¿Qué aprendí con este proyecto?

Este fue uno de mis primeros acercamientos prácticos a la **POO en Java**. Durante su desarrollo aprendí a:

- Aplicar principios fundamentales como **encapsulamiento, herencia y composición**.
- Separar la lógica del juego de la interfaz gráfica usando paquetes (`dominio` y `presentacion`).
- Manejar **eventos gráficos** con `MouseListener` para capturar interacciones del usuario.
- Crear **interfaces gráficas personalizadas** con imágenes y estilos.
- Implementar una **IA básica** para automatizar decisiones del juego.

Fue también una oportunidad para fortalecer habilidades como:
- Organización del código en múltiples clases.
- Manejo de estructuras de control y colecciones.
- Depuración de errores relacionados con lógica y GUI.

---

## 🛠️ Tecnologías y herramientas

- **Java 8+**
- **AWT/Swing** para interfaz gráfica
- **POO (Programación Orientada a Objetos)**

---

## 🎮 Modos de juego

- 🧑‍🤝‍🧑 Jugador vs Jugador  
- 🧠 Jugador vs Máquina  
- 🤖 Máquina vs Máquina  

---

## 📂 Estructura del proyecto

```

ProyectoFinal/
├── src/
│   ├── dominio/        # Lógica del juego y validación
│   └── presentacion/   # Interfaz gráfica (GUI principal)
├── boardBackground.png # Imagen de fondo del tablero
├── gomokuTitle.png     # Título del juego
└── ProyectoFinal.zip   # Backup del proyecto

````

---

## 🚀 Instalación y ejecución

1. Clona el repositorio:
   ```bash
   git clone https://github.com/marzo245/ProyectoFinal.git
   cd ProyectoFinal
   ````

2. Compila la interfaz gráfica principal:

   ```bash
   javac src/presentacion/GomokuGUI.java
   ```

3. Ejecuta el juego:

   ```bash
   java -cp src presentacion.GomokuGUI
   ```

---

## ⚙️ Funcionalidad destacada

* ✅ Lógica automática de verificación de ganador.
* 🤖 IA básica para partidas contra la máquina.
* 🎨 Interfaz gráfica interactiva y personalizada con imágenes.
* 🖱️ Control mediante clics para colocar fichas.

---

## 🧾 Información académica

* Asignatura: **POOB - Programación Orientada a Objetos**
* Universidad: Universidad de los Andes
* Autores:

  * **Diego Chicuazuque**
  * **Yeltzyn Sierra**

---

## 🔗 Enlaces útiles

* Repositorio: [marzo245/ProyectoFinal](https://github.com/marzo245/ProyectoFinal)
* GitHub: [marzo245](https://github.com/marzo245)
* LinkedIn: [diegochicuazuque](https://www.linkedin.com/in/diegochicuazuque)

---

## 📌 Reflexión final

Este proyecto marcó un antes y un después en mi camino como desarrollador. Aprender a organizar ideas en objetos, diseñar la lógica del juego y enfrentarme a problemas de interfaz gráfica me dio una base sólida para proyectos más complejos.


