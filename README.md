# Asisten HelpDesk - Sistema de Gestión y Reportes

Proyecto Java desarrollado para **Apache NetBeans 26** con diseñador visual (**Matisse GUI Builder**) habilitado, paleta de componentes Swing, generación de reportes en PDF con **iText 5** y enlace directo con **MySQL Workbench**.

---

## 📁 Ubicación del Proyecto
- **Ruta principal:** `/Users/hd/NetBeansProjects/Asisten HelpDesk`
- **Enlace simbólico:** `/Users/hd/NetBeansProjects/AsistenHelpDesk`

---

## 🎨 Diseñador Visual y Paleta en NetBeans 26 (Cero Interfaces Fantasma)
Ambas interfaces fueron creadas como formularios visuales con sus respectivos archivos `.form` sincronizados con el código Java:

1. **`vista.InterfazPrincipal`** (`InterfazPrincipal.java` y `InterfazPrincipal.form`):
   - Formulario `JFrame Form` que contiene la ventana principal del **Panel Administrativo Help Desk**.
   - Barra superior con Logo, Título en cursiva blanca, Foto y botón Salir.
   - Menú lateral (Sidebar) con botones estilizados en azul marino (`#001F5B`): *Incidencias, Usuarios, Tecnicos, Categorias, Especialidades, Reportes, Asistente IA*.
   - Contenedor con pestañas (`JTabbedPane`) con las 7 secciones del sistema.
2. **`vista.PanelReportes`** (`PanelReportes.java` y `PanelReportes.form`):
   - Formulario `JPanel Form` creado con la paleta de NetBeans.
   - Título `REPORTES DEL SISTEMA HELPDESK`.
   - Filtros de `Estado` y `Categoría` en sus respectivos `JComboBox`.
   - Botones de acción:
     - `Reporte de Incidencias`
     - `Incidencias por Técnico`
     - `Incidencias por Categoría`

> **Para abrir el Diseñador Visual en NetBeans:**
> 1. Abre NetBeans 26 y ve a `File -> Open Project...`
> 2. Selecciona `Asisten HelpDesk` en `/Users/hd/NetBeansProjects`.
> 3. En el árbol de proyectos, despliega `Source Packages -> vista`.
> 4. Haz doble clic en `InterfazPrincipal.java` o en `PanelReportes.java`.
> 5. En la parte superior del editor de código, haz clic en la pestaña **Design** (Diseño).
> 6. Verás la interfaz gráfica interactiva y a la derecha la ventana **Palette** (Swing/AWT Components) con todos los controles listos para editar o arrastrar.

---

## 🗄️ Enlace con MySQL Workbench
La base de datos `bd_helpdesk` (y su alias `helpdesk`) ya se encuentra creada e importada con los 10 registros de incidencias idénticos a los del reporte:

- **Host:** `localhost`
- **Puerto:** `3306`
- **Usuario:** `root`
- **Contraseña:** `Admin26$`
- **Base de Datos:** `bd_helpdesk`
- **Script SQL:** `database/bd_helpdesk.sql`

Puedes abrir este script en cualquier momento en MySQL Workbench para visualizar las tablas `usuario`, `tecnico`, `categoria`, `estado` e `incidencia`.

---

## 🚀 Cómo Ejecutar el Proyecto
- **Desde NetBeans:**
  - Presiona el botón verde de **Play** (Run Project), o
  - Haz clic derecho sobre `InterfazPrincipal.java` -> `Run File` (`Shift + F6`).
- **Desde la Terminal:**
  ```bash
  cd "/Users/hd/NetBeansProjects/Asisten HelpDesk"
  ./run.sh
  ```
