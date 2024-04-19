### Arquitectura Hexagonal
La arqui. Hexagonal, es también conocida como arquitectura de puertos y adaptadores, 
tiene como principal motivación separar nuestra aplicación en distintas capas o regiones con su propia responsabilidad. 
De esta manera consigue desacoplar capas de nuestra aplicación permitiendo que evolucionen de manera aislada. Además, 
tener el sistema separado por responsabilidades nos facilitará la reutilización.

La Arquitectura Hexagonal propone que nuestro dominio sea el núcleo de las capas y que este no se acople a nada externo. 
En lugar de hacer uso explícito y mediante el principio de inversión de dependencias nos acoplamos a contratos (interfaces o puertos) y no a implementaciones concretas.

- propone es el uso de forma escrupulosa de los principios SOLID que nos guían para construir mejor software.

- Obliga a que nuestro dominio no esté acoplado a nada externo mediante el uso de interfaces propias de nuestro dominio que son implementadas por elementos externos.

[![diagrama-Arqui-Hexagonal.png](https://i.postimg.cc/G2qcWdzc/diagrama-Arqui-Hexagonal.png)](https://postimg.cc/xJNDHrW7)
