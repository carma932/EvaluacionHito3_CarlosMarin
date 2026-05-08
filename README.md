# EDA-111 — Hito 3  
## Estructuras de Datos con Java y Spring Boot

Este proyecto reúne tres ejercicios prácticos usando Java y Spring Boot:

- **Arreglo unidimensional** para guardar calificaciones de estudiantes
- **Arreglo bidimensional** para representar los asientos de un aula
- **Lista enlazada simple** para registrar estudiantes y ordenarlos por puntaje

---

## Qué incluye el proyecto

### Parte 1 — Calificaciones
Se usa un arreglo fijo de **110 posiciones** para almacenar notas de estudiantes.

Se puede:

- agregar una calificación
- mostrar todas
- ver solo aprobados
- calcular promedio
- obtener nota máxima y mínima

---

### Parte 2 — Aula
Se usa una matriz de **5 filas por 15 columnas** para representar los asientos.

Valores:

- **0** → asiento ocupado
- **1** → asiento libre

Se puede:

- ocupar asiento
- liberar asiento
- ver la matriz completa
- contar ocupados y libres

---

### Parte 3 — Estudiantes
Se implementa una **lista enlazada simple**.

Cada estudiante tiene:

- **id**
- **nombre**
- **puntaje**

# Cómo ejecutar

En Linux o macOS:

```bash
./mvnw spring-boot:run


En Windows:

```bash
mvnw.cmd spring-boot:run



## Endpoints


/notas/agregar?valor=85  agrega una nota
/notas  muestra todas 
/notas/aprobados  muestra notas mayores o iguales a 51 
/notas/promedio  calcula promedio 
/notas/max |muestra la nota más alta 
/notas/min  muestra la nota más baja 
## Ejemplos

http://localhost:8080/notas/agregar?valor=90
http://localhost:8080/notas/agregar?valor=45
http://localhost:8080/notas
http://localhost:8080/notas/promedio
http://localhost:8080/notas/max
http://localhost:8080/notas/min


## Endpoints

/aula  muestra la matriz 
/aula/ocupados  muestra cantidad de ocupados y libres 
/aula/ocupar?fila=1&columna=2  ocupa un asiento 
/aula/liberar?fila=1&columna=2 | libera un asiento 

## Ejemplos

http://localhost:8080/aula
http://localhost:8080/aula/ocupar?fila=0&columna=0
http://localhost:8080/aula/ocupar?fila=2&columna=3
http://localhost:8080/aula/liberar?fila=2&columna=3
http://localhost:8080/aula/ocupados


## Endpoints

/estudiantes/agregar?id=1&nombre=Ana&puntaje=95  agrega estudiante 
/estudiantes  muestra todos 
/estudiantes/ordenados  muestra aprobados ordenados por puntaje 
/estudiantes/buscar/Ana busca estudiante por nombre 

## Ejemplos

http://localhost:8080/estudiantes
http://localhost:8080/estudiantes/ordenados
http://localhost:8080/estudiantes/buscar/Ana



# Notas importantes

- El arreglo de calificaciones tiene capacidad máxima para 110 estudiantes
- Un estudiante aprueba con 51 o más
- El aula usa índices desde 0
- La lista enlazada se implementó manualmente con Nodo Estudiante
Se puede:

- insertar estudiantes
- mostrarlos
- ordenarlos por puntaje de mayor a menor (solo aprobados)
- buscarlos por nombre
