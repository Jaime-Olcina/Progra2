Aproximación de Pi mediante el Método de Montecarlo
Este programa Java calcula la aproximación de Pi utilizando el Método de Montecarlo. La aproximación se realiza generando un gran número de puntos aleatorios dentro de un cuadrado unitario y contando cuántos de esos puntos caen dentro de un círculo inscrito en el cuadrado. La relación entre el número de puntos dentro del círculo y el número total de puntos generados se utiliza para calcular una aproximación del valor de Pi.

Cómo utilizar el código
El código se compone de dos clases: Matematicas y Principal. La clase Matematicas contiene los métodos para calcular la aproximación de Pi, mientras que la clase Principal es la clase principal de la aplicación y es el punto de entrada del programa.

Clase Matematicas
La clase Matematicas proporciona un método estático generarNumeroPiLambda que calcula la aproximación de Pi utilizando el Método de Montecarlo con expresiones lambda. El método toma como parámetro el número de pasos o iteraciones a realizar y devuelve una aproximación del valor de Pi.

El método generarNumeroPiLambda implementa el Método de Montecarlo utilizando expresiones lambda. Genera un número especificado de puntos aleatorios dentro de un cuadrado unitario, calcula la distancia de cada punto al origen y cuenta cuántos puntos caen dentro del círculo unitario inscrito en ese cuadrado. La relación entre los puntos dentro del círculo y el total de puntos arroja una aproximación del valor de Pi.

Clase Principal
La clase Principal es la clase principal de la aplicación y es el punto de entrada del programa. Contiene un método main que espera un argumento de línea de comandos que representa el número de aproximaciones a utilizar para calcular Pi mediante el Método de Montecarlo. El resultado del cálculo se imprime en la consola.

Cómo ejecutar el programa
Para ejecutar el programa, siga los siguientes pasos:

Clone el repositorio mediante el siguiente comando:
git clone https://github.com/Jaime-Olcina/Progra2.git

Debido a la naturaleza del repositorio, deberá elegir el número de la práctica acorde a lo que esté buscando (en este caso será la Practica2) mediante el siguiente comando:
cd Practica5/

Ejecute el archivo Graph.java con el siguiente comando, especificando el número de aproximaciones como argumento:
java -jar pi.jar <número de aproximaciones>
Donde <número de aproximaciones> es el número de puntos aleatorios que se van a generar para calcular la aproximación de Pi. Cuanto mayor sea este número, más precisa será la aproximación.

Licencia
Este programa se distribuye bajo la Licencia Apache, Versión 2.0. Consulte el archivo LICENSE para obtener más detalles.

Autor
Este programa fue escrito en Java (Ubuntu) por Jaime Olcina Magaz
