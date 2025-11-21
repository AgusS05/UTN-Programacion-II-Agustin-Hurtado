# Trabajo Final Integrador – Programación 2  
## Aplicación Java – Relación 1:1 Empleado → Legajo + JDBC + DAO + MySQL

---

## Descripción del Proyecto

Este proyecto implementa una aplicación Java de consola que gestiona empleados y sus legajos asociados mediante una **relación unidireccional 1 a 1**:

```
Empleado 1 → 1 Legajo
```

Un **Empleado** puede tener exactamente **un Legajo**, y el **Legajo** existe únicamente asociado a ese empleado.

La aplicación utiliza:

- Java (JDK 17+)
- JDBC (sin ORM)
- MySQL como base de datos
- Patrón DAO + capa Service
- Transacciones con commit/rollback
- Menú de consola con CRUD completo

Este trabajo corresponde al **Trabajo Final Integrador de Programación 2 (UTN)**.

---

## Arquitectura del Proyecto

```
tp-integrador/
│
├── model/           → Clases de dominio (Empleado, Legajo)
├── dao/             → DAO JDBC (CRUD + transacciones)
├── service/         → Reglas de negocio y transacciones
├── config/          → Conexión a MySQL (DatabaseConnection)
├── tpintegrador/    → AppMenu, Handlers y Main
└── sql/             → Scripts de creación y seed
```

---

## Relación del Dominio

### **Empleado (A) → Legajo (B)**  
Relación **1 a 1 unidireccional**  
El Empleado contiene:

```java
private Legajo legajo;
```

Implementada en la base de datos mediante:

```sql
empleado_id BIGINT NOT NULL UNIQUE
```

Garantizando que un Legajo pertenece a un único Empleado.

---

# 🗄 Base de Datos

## **Script de Creación (01_create_empresa_empleados.sql)**

```sql
DROP DATABASE IF EXISTS empresa_empleados;

CREATE DATABASE empresa_empleados;
USE empresa_empleados;

CREATE TABLE empleados (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(80) NOT NULL,
    apellido VARCHAR(80) NOT NULL,
    dni VARCHAR(15) NOT NULL UNIQUE,
    email VARCHAR(120),
    fecha_ingreso DATE,
    area VARCHAR(50),
    eliminado BOOLEAN DEFAULT FALSE
);

CREATE TABLE legajos (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nro_legajo VARCHAR(20) NOT NULL UNIQUE,
    categoria VARCHAR(30),
    estado ENUM('ACTIVO', 'INACTIVO') NOT NULL DEFAULT 'ACTIVO',
    fecha_alta DATE NOT NULL,
    observaciones VARCHAR(255),
    empleado_id BIGINT NOT NULL UNIQUE,
    eliminado BOOLEAN DEFAULT FALSE,
    FOREIGN KEY (empleado_id) REFERENCES empleados(id) ON DELETE CASCADE
);

CREATE INDEX idx_empleado_dni ON empleados(dni);
CREATE INDEX idx_legajo_nro ON legajos(nro_legajo);
```

---

## **Script de Datos Iniciales (02_seed_empresa_empleados.sql)**

```sql
USE empresa_empleados;

INSERT INTO empleados (nombre, apellido, dni, email, fecha_ingreso, area) VALUES
('Juan', 'Pérez', '30123456', 'juan.perez@empresa.com', '2023-01-15', 'Sistemas'),
('María', 'Gómez', '32123456', 'maria.gomez@empresa.com', '2022-03-20', 'RRHH');

INSERT INTO legajos (nro_legajo, categoria, estado, fecha_alta, observaciones, empleado_id) VALUES
('EMP-001', 'Senior', 'ACTIVO', '2023-01-15', 'Empleado modelo', 1),
('EMP-002', 'Junior', 'ACTIVO', '2022-03-20', 'Recién capacitada', 2);
```

---

# Configuración de la Conexión a la BD

Archivo: `config/DatabaseConnection.java`

```java
private static final String URL = "jdbc:mysql://localhost:3306/empresa_empleados?useSSL=false&serverTimezone=UTC";
private static final String USER = "root";
private static final String PASSWORD = ""; // según tu MySQL local
private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
```

---

# Transacciones y Reglas de Negocio

La operación de **crear un empleado con su legajo** es transaccional:

### Flujo:

1. `conn.setAutoCommit(false)`
2. Inserta empleado → `EmpleadoDAO.insertTx`
3. Inserta legajo → `LegajoService.insertTx`
4. Si sale bien → `commit()`
5. Si ocurre error → `rollback()`

Garantizando **atomicidad total**.

---

# Cómo Ejecutar la Aplicación

## Requisitos
- Java 17 o superior
- MySQL/MariaDB (Workbench o XAMPP)
- MySQL Connector/J (JDBC driver)
- NetBeans / IntelliJ / Eclipse

## Pasos
1. Ejecutar `01_create_empresa_empleados.sql`
2. Ejecutar `02_seed_empresa_empleados.sql`
3. Configurar credenciales en `DatabaseConnection.java`
4. Ejecutar desde IDE:

```
Run → Run Project
```

---

# Funciones del Menú

```
1. Crear empleado
2. Listar empleados
3. Actualizar empleado
4. Eliminar empleado
5. Crear legajo independiente
6. Listar legajos
7. Actualizar legajo por ID
8. Eliminar legajo por ID
9. Actualizar legajo por ID de empleado
10. Eliminar legajo por ID de empleado
0. Salir
```

---

# 🧪 Pruebas realizadas

✔ CRUD completo de empleados  
✔ CRUD de legajos  
✔ Relación 1–1 funcionando  
✔ Búsqueda por nombre/apellido  
✔ Baja lógica  
✔ Rollback probado  
✔ Conexión estable con MySQL  

---

# 📎 UML

En informe

---

# 📹 Video

https://drive.google.com/drive/u/0/folders/1AGt46bpNN76pyaj57641Ji5463Tgb36-

---

# 🧑‍💻 Integrantes

Alejandro Pedrosa: Desarrollo general, lógica de negocio, manejo transaccional . 
Agustin Hurtado: Diseño del modelo entidad-relación, scripts SQL y pruebas sobre base de datos.
Luciano de la Rubia: Desarrollo del menú, interacción con usuario y manejo de errores
Bruno Pighin: Testing global, documentación formal e integración del video de presentación

---

# 🏁 Conclusión

El proyecto cumple:

- Arquitectura en capas  
- Patrón DAO + Service  
- JDBC + PreparedStatement  
- Transacciones reales  
- Relación 1–1 garantizada en código y BD  
- CRUD completo  

Este trabajo cumple totalmente con los requisitos del TFI de Programación 2.
