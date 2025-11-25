) Implementaciones recursivas e iterativas
En este trabajo implementé varios métodos usando dos enfoques: recursivo e iterativo. La idea fue comparar cómo se resuelve un mismo problema de dos maneras diferentes.

En la parte recursiva, usé métodos que se llaman a sí mismos. Por ejemplo, un método que recorre una lista de elementos pasando de uno a otro sin usar bucles, o uno que calcula algo dividiendo el problema en partes pequeñas hasta llegar a un caso base.

En la parte iterativa hice lo mismo, pero usando estructuras como “for” o “while”. El resultado final es el mismo, pero la forma de llegar es distinta.

2) Ventajas y desventajas de cada enfoque
Después de implementarlos, las diferencias se notan bastante:

Ventajas de la recursividad:
- El código queda más corto y más fácil de leer.
- Es muy útil cuando el problema se puede dividir naturalmente (como recorrer jerarquías o estructuras tipo árbol).
- Permite expresar algunas soluciones de forma más elegante.

Desventajas de la recursividad:
- Consume más memoria porque cada llamada se guarda en la pila.
- Es más lenta en la mayoría de los casos.
- Si la recursión es muy profunda, puede romper el programa con un error de StackOverflow.

Ventajas de lo iterativo:
- Es más eficiente tanto en tiempo como en memoria.
- No corre riesgo de desbordar la pila.
- Suele ser la forma más segura y estándar de resolver problemas simples.

Desventajas de lo iterativo:
- El código puede quedar más largo o más “duro” de leer.
- Algunos problemas que son naturales de resolver recursivamente se vuelven complicados al hacerlos iterativos.

3) Implementación y uso del algoritmo de ordenamiento
Para el ordenamiento usé un algoritmo simple (por ejemplo Selection Sort o Bubble Sort). La idea fue recorrer los elementos, comparar uno con otro e ir acomodándolos hasta que toda la lista quede ordenada.

Este método se integra al resto del programa permitiendo ordenar objetos según algún criterio, como un nombre, un número o cualquier atributo que se necesite.

4) Implementación y uso del algoritmo de búsqueda
También implementé un algoritmo de búsqueda. En mi caso usé un método que recorre la estructura buscando un valor específico. Dependiendo de si la estructura está ordenada, se puede usar búsqueda secuencial o búsqueda binaria.

La búsqueda sirve para localizar elementos dentro del sistema sin tener que revisar todo manualmente. En el programa se utiliza para encontrar registros de forma más eficiente.

Conclusión
La práctica sirvió para comparar directamente la forma recursiva y la iterativa, y también para entender dónde conviene usar cada una. Además, los algoritmos de ordenamiento y búsqueda complementan el funcionamiento general del programa, permitiendo trabajar con los datos de una manera más organizada y eficiente.
