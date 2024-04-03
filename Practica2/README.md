Aproximación de Pi mediante el Método de Montecarlo
Este programa Java calcula la aproximación de Pi utilizando el Método de Montecarlo. La aproximación se realiza generando un gran número de puntos aleatorios dentro de un cuadrado unitario y contando cuántos de esos puntos caen dentro de un círculo inscrito en el cuadrado. La relación entre el número de puntos dentro del círculo y el número total de puntos generados se utiliza para calcular una aproximación del valor de Pi.

Cómo utilizar el código
El código se compone de dos clases: Matematicas y Principal. La clase Matematicas contiene los métodos para calcular la aproximación de Pi, mientras que la clase Principal es la clase principal de la aplicación y es el punto de entrada del programa.

Clase Matematicas
La clase Matematicas proporciona un método estático generarNumeroPiRecursivo que calcula la aproximación de Pi utilizando el Método de Montecarlo. El método toma como parámetro el número de pasos o iteraciones a realizar y devuelve una aproximación del valor de Pi.

El método generarNumeroPiRecursivo se implementa recursivamente y genera un punto aleatorio en cada iteración, calcula su distancia al origen y comprueba si el punto cae dentro del círculo inscrito en el cuadrado unitario. Si el punto cae dentro del círculo, se incrementa un contador de puntos dentro del círculo. Después de realizar el número especificado de iteraciones, el método devuelve la aproximación de Pi calculada a partir de la relación entre el número de puntos dentro del círculo y el número total de puntos generados.

Clase Principal
La clase Principal es la clase principal de la aplicación y es el punto de entrada del programa. Contiene un método main que espera un argumento de línea de comandos que representa el número de aproximaciones a utilizar para calcular Pi mediante el Método de Montecarlo. El resultado del cálculo se imprime en la consola.

Cómo ejecutar el programa
Para ejecutar el programa, siga los siguientes pasos:

Clone el repositorio mediante el siguiente comando:
git clone https://github.com/Jaime-Olcina/Progra2.git

Debido a la naturaleza del repositorio, deberá elegir el número de la práctica acorde a lo que esté buscando (en este caso será la Practica2) mediante el siguiente comando:
cd Practica2/

Ejecute el archivo Principal.class con el siguiente comando, especificando el número de aproximaciones como argumento:
java -jar pi.jar <número de aproximaciones>
Donde <número de aproximaciones> es el número de puntos aleatorios que se van a generar para calcular la aproximación de Pi. Cuanto mayor sea este número, más precisa será la aproximación.

Licencia
Este programa se distribuye bajo la Licencia Apache, Versión 2.0. Consulte el archivo LICENSE para obtener más detalles.

Autor
Este programa fue escrito en Java (Ubuntu) por Jaime Olcina Magaz
