# ¡Bievenido al Manual de Usuario!

En este manual, podras saber como utilizar cada característica o detalles sobre nuestro programa.

## ¿Como iniciar el programa?

Primero antes de poder iniciar el programa, deberá seguir los siguientes pasos:

### Vincular el repositorio

- Deberas en tu IDE preferido vincular el repositorio con el proyecto.
- Abrir una nueva terminal

  > preferiblemente tipo BASH

- Luego sencillamente deberás colocar el siguiente comando:
  ```
    git clone https://github.com/DiegoOchoa2005/PROG-UD6-Mercadona.git
  ```
  Una vez colocado ese comando, se creará una copia del respositorio en tu dispositivo. Se te creará una carpeta como la siguiente.

![image](https://github.com/DiegoOchoa2005/PROG-UD6-Mercadona/assets/159430287/ded35ea6-faa4-46b5-abfe-cee5ebd5e2c7)

> [!NOTE]
> Es recomendable que una vez creada esa carpeta, abras el IDE dentro de la misma.

Seguido de estos pasos, ya finalmete podrás ejecutar el programa.

## Iniciando en el programa

Al ejecutar el programa se mostrará la siguiente información en una terminal:

![image](https://github.com/DiegoOchoa2005/PROG-UD6-Mercadona/assets/159430287/62f3337f-4576-40d3-9b96-2cc0f61a48d7)

Como puede observar, en esta terminal tenemos el menú principal del programa, el cual se puede acceder a sus opciones mediante sus indices.

> Por ejemplo, si introduce el **1** se dará con la opción de **Abrir caja**

- Si introduce cualquier otro parametro ya sean letras o números que no esten como índices en el menú, aparecerá el siguiente mensaje

  ![image](https://github.com/DiegoOchoa2005/PROG-UD6-Mercadona/assets/159430287/2f5ef103-2a53-4a74-8101-ec5e4e6cfde9)

## Opciones del programa

## Abrir caja

Esta opcion, como lo dice su nombre, abrirá la caja para poder realizar las otras operaciones junto a un mensaje.

- Si la caja esta cerrada y se abre por primera vez

  ![image](https://github.com/DiegoOchoa2005/PROG-UD6-Mercadona/assets/159430287/c4bb4d91-9021-4f96-a7f1-a089d15d884c)

- Si la caja ya esta abierta y quiere volverla abrir

  ![image](https://github.com/DiegoOchoa2005/PROG-UD6-Mercadona/assets/159430287/318349cb-ce09-4419-b172-98e1114837e7)

> [!NOTE]
> Esto sucederá porque el programa esta basado en una única caja.

## Añadir un nuevo cliente a la cola

Esta opcion como indica su nombre, realizará la operación de añadir un cliente a una cola, indicando un mensaje con el nombre del cliente añadido.

- Si la caja esta abierta

  ![image](https://github.com/DiegoOchoa2005/PROG-UD6-Mercadona/assets/159430287/4a4c03b0-2112-453e-a119-efb9f4fa6099)

- Si la caja esta cerrada

  ![image](https://github.com/DiegoOchoa2005/PROG-UD6-Mercadona/assets/159430287/fcf39dde-3c6c-4e9c-9eb1-b2379f7ee895)

## Atender un cliente a la cola

Esta opcion como indica su nombre, se realizara la operacion de atender al primer cliente que este en la cola.

- Si hay clientes en la cola aparecerá el nombre del cliente atendido.

![image](https://github.com/DiegoOchoa2005/PROG-UD6-Mercadona/assets/159430287/9bb67a5d-8256-42d6-aca4-1ed4b8b6a234)

- Si no hay clientes en la cola aparecerá el siguiente mensaje.

![image](https://github.com/DiegoOchoa2005/PROG-UD6-Mercadona/assets/159430287/18da5299-abed-47a5-889f-51ecb0ff2969)

## Ver clientes pendientes

Esta opcion como lo dice su nombre, nos servirá para ver cuantos clientes restantes hay en la cola actualmente, mostrando incluso el total de clientes que han pasado por la caja, junto con la informacion personal del cliente y su cesta de compras.

- Si hay clientes pendientes se mostrara el siguiente apartado

![image](https://github.com/DiegoOchoa2005/PROG-UD6-Mercadona/assets/159430287/d1b51ebe-b7d8-4b16-b19d-64f6e62018ee)

- Si no hay ningun cliente pendiente se mostrara el siguiente apartado

![image](https://github.com/DiegoOchoa2005/PROG-UD6-Mercadona/assets/159430287/beb1a5d5-2538-4f7a-8075-8525dc670af0)

- Si en tal caso el cliente llega a ser latino, el mensaje que indica si es latino o no, cambia de color

![image](https://github.com/DiegoOchoa2005/PROG-UD6-Mercadona/assets/159430287/dc5530ff-d363-43b6-9cd5-3fb9f9c01e9f)

## Cerrar supermercado

Esta opcion realizará el cierre del supermercado, cerrando primero la caja y luego finalizando el programa.

- Si la caja esta abierta y hay **clientes**, aparecerá el siguiente mensaje

![image](https://github.com/DiegoOchoa2005/PROG-UD6-Mercadona/assets/159430287/95bcd448-5829-4fe9-acaa-bb0e12e1e330)

> [!NOTE]
> Este mensaje de error evitará en absoluto la finalización del programa, pero podrá utilizar las demas opciones sin problema alguno.

- Si la caja esta abierta y no hay **clientes** o esta cerrada, aparecerá el siguiente mensaje

![image](https://github.com/DiegoOchoa2005/PROG-UD6-Mercadona/assets/159430287/6537958b-6560-4ba3-b400-cb9cb28260ff)

[<--Volver](../README.md)
