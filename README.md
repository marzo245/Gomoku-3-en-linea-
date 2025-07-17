# 🎯 Gomoku Java Edition

Proyecto académico en Java que implementa el clásico Gomoku (tres/cinco en línea) con interfaz gráfica AWT/Swing y soporte para múltiples modos de juego: Jugador vs Jugador, Jugador vs Máquina y Máquina vs Máquina.

---

## 🛠️ Tecnologías y herramientas

- **Java** 8+
- **AWT/Swing** para interfaz gráfica
- **POO** (Programación Orientada a Objetos)

---

## 🎮 Modos de juego

- **Jugador vs Jugador**  
- **Jugador vs Máquina**  
- **Máquina vs Máquina**

---

## 📂 Estructura del proyecto

Basado en los archivos visibles en el repositorio `ProyectoFinal`:

```

ProyectoFinal/
├── src/
│   ├── dominio/        # Lógica del juego
│   └── presentacion/   # Interfaz gráfica (GomokuGUI)
├── boardBackground.png # Imagen de fondo del tablero
├── gomokuTitle.png     # Título o splash del juego
└── ProyectoFinal.zip   # Snapshot del proyecto

````

:contentReference[oaicite:1]{index=1}

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

## ⚙️ Funcionalidad

* **Lógica de ganador** automática para tablero Gomoku.
* **IA básica** para modos Jugador vs Máquina y Máquina vs Máquina.
* **Gráficos** con imágenes de fondo (`boardBackground.png`) y título (`gomokuTitle.png`).
* **Interacción** mediante clics de mouse.

---

## 🧾 Información adicional

* Proyecto para el curso **POOB (Programación Orientada a Objetos)**.
* Autores: **Diego Chicuazuque** y **Yeltzyn Sierra**.

---

## 🔗 Enlaces útiles

* Repositorio: [marzo245/ProyectoFinal](https://github.com/marzo245/ProyectoFinal)
  ([GitHub][3], [GitHub][2])
* Perfil GitHub: [marzo245](https://github.com/marzo245) ([GitHub][4])
* LinkedIn: [diegochicuazuque](https://www.linkedin.com/in/diegochicuazuque)

---

## 🔍 Próximos pasos (opcional)

* Documentación técnica (`docs/`) o **Javadoc** para clases clave (`dominio`, `presentacion`).
* Crear paquete `.jar` ejecutable para distribución.
* Agregar sección “Cómo contribuir” o **LICENSE** si quieres liberarlo.


