##Arquitectura Hexagonal
Es ttambién conocida como arquitectura de puertos y adaptadores., 
tiene como principal motivación separar nuestra aplicación en distintas capas o regiones con su propia responsabilidad. 
De esta manera consigue desacoplar capas de nuestra aplicación permitiendo que evolucionen de manera aislada. Además, 
tener el sistema separado por responsabilidades nos facilitará la reutilización.

La Arquitectura Hexagonal propone que nuestro dominio sea el núcleo de las capas y que este no se acople a nada externo. 
En lugar de hacer uso explícito y mediante el principio de inversión de dependencias nos acoplamos a contratos (interfaces o puertos) y no a implementaciones concretas.


