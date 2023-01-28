# design-pattern
Patrones de Diseño
<article class="markdown-body entry-content container-lg" itemprop="text"><h1 dir="auto"><a id="user-content-design-pattern" class="anchor" aria-hidden="true" href="#design-pattern"><svg class="octicon octicon-link" viewBox="0 0 16 16" version="1.1" width="16" height="16" aria-hidden="true"><path fill-rule="evenodd" d="M7.775 3.275a.75.75 0 001.06 1.06l1.25-1.25a2 2 0 112.83 2.83l-2.5 2.5a2 2 0 01-2.83 0 .75.75 0 00-1.06 1.06 3.5 3.5 0 004.95 0l2.5-2.5a3.5 3.5 0 00-4.95-4.95l-1.25 1.25zm-4.69 9.64a2 2 0 010-2.83l2.5-2.5a2 2 0 012.83 0 .75.75 0 001.06-1.06 3.5 3.5 0 00-4.95 0l-2.5 2.5a3.5 3.5 0 004.95 4.95l1.25-1.25a.75.75 0 00-1.06-1.06l-1.25 1.25a2 2 0 01-2.83 0z"></path></svg></a>design-pattern</h1>
<p dir="auto">Patrones de Diseño</p>


<h2><p dir="auto">Creational -creacionales </p></h2>


<ul dir="auto">
<li><a href="#singleton">Singleton</a></li>
<pre>
<p>
A veces es importante que algunas clases tengan exactamente una instancia. Hay muchos objetos, solo necesitamos una instancia.
de ellos y si instanciamos más de uno, nos encontraremos con todo tipo de problemas como el comportamiento incorrecto del programa, el uso excesivo de
recursos o resultados inconsistentes.
Puede requerir solo un objeto de una clase, por ejemplo, cuando está creando el contexto de una aplicación o un hilo
grupo manejable, configuraciones de registro, un controlador para conectarse a la consola de entrada o salida, etc. Más de un objeto de ese tipo
claramente causará inconsistencia en su programa.
El patrón Singleton garantiza que una clase tenga solo una instancia y proporciona un punto de acceso global a ella. Sin embargo aunque
Singleton es el más simple en términos de su diagrama de clases porque solo hay una sola clase, su implementación es un poco más complicada.
</p>
</pre>
<li><a href="#factory-method">Factory Method</a></li>
<li><a href="#abstract-factory">Abstract Factory</a></li>
<li><a href="#builder">Builder</a></li>
<li><a href="#prototype">Prototype</a></li>
</ul>



<h2><p dir="auto">Structural - estructurales </p></h2>



<ul dir="auto">
<!--adapter-->
<li><a href="#factory-method">Adapter o Wrapper</a></li>
<pre>
<p dir="auto">El patrón adaptador se utiliza para transformar una interfaz en otra, de tal modo que una clase que no pueda utilizar la primera haga uso de ella a través de la segunda.</p>
Proposito
<p dir="auto">Convierte la interfaz de una clase en otra interfaz que el cliente espera. El adaptador permite a las clases trabajar juntas, lo que de otra manera no podría hacerse debido a sus interfaces incompatibles.</p>
</pre>
<li><a href="#prototype">Facade (Fachada)</a></li>
<pre>
Fachada (Facade) es un tipo de patrón de diseño estructural. Viene motivado por la necesidad de estructurar un entorno de programación y reducir su complejidad con la división en subsistemas, minimizando las comunicaciones y dependencias entre estos.
</pre>
<li><a href="#builder">Composite (Objeto compuesto)</a></li>
<pre>
<p>
La definición formal del patrón compuesto dice que le permite componer objetos en estructuras de árbol para representar jerarquías parciales y completas. Composite permite a los clientes tratar objetos individuales y composiciones de objetos de manera uniforme.
Si está familiarizado con una estructura de datos de árbol, sabrá que un árbol tiene padres y sus hijos. Puede haber varios niños para
un padre, pero sólo un padre por hijo. En el patrón compuesto, los elementos con hijos se denominan nodos y los elementos sin
los niños se llaman como Leafs.
El Patrón Compuesto nos permite construir estructuras de objetos en forma de árboles que contienen tanto composición de objetos como
objetos individuales como nodos. Usando una estructura compuesta, podemos aplicar las mismas operaciones tanto sobre compuestos como individuales.
objetos. En otras palabras, en la mayoría de los casos podemos ignorar las diferencias entre composiciones de objetos y objetos individuales.
El Patrón Compuesto tiene cuatro participantes:
</p>
• Component
• Leaf
• Composite
• Client
</pre>

<li><a href="#abstract-factory">Bridge (Puente)</a></li>

<pre>
<p>
Los componentes del Patrón Puente comprenden una abstracción, una abstracción refinada, un implementador y un implementador concreto.
Una abstracción define la interfaz de la abstracción y también mantiene una referencia a un objeto de tipo implementador y el enlace
entre la abstracción y el implementador se llama puente.
La abstracción refinada amplía la interfaz definida por la abstracción.
El Implementador proporciona la interfaz para las clases de implementación (implementadores concretos).
Y el Implementador concreto implementa la interfaz del Implementador y define su implementación concreta.
El Bridge Pattern desacopla la interfaz y la implementación. Como resultado, una implementación no está ligada permanentemente a
una interfaz La implementación de una abstracción se puede configurar en tiempo de ejecución. También elimina las dependencias en tiempo de compilación.
sobre la implementación. Cambiar una clase de implementación no requiere volver a compilar la clase de abstracción y sus clientes. Él
El cliente solo necesita saber sobre la abstracción y puede ocultarles la implementación.
</p>

<b>Solución al Problema</b>
<p>
En lugar de crear una subclase para cada producto por modelo de automóvil en el problema discutido anteriormente, podemos separar el diseño en dos
diferentes jerarquías. Una interfaz es para el producto que se utilizará como implementador y la otra será una abstracción.
de tipo coche. El implementador será implementado por los implementadores concretos y proporciona una implementación para ello. Sobre el
Por otro lado, la abstracción se ampliará con una abstracción más refinada.
</p>
</pre>

<li><a href="#singleton">Proxy</a></li>
<pre>
El Patrón Proxy se usa para crear un objeto representativo que controla el acceso a otro objeto, que puede ser remoto, costoso
para crear o en necesidad de ser asegurado.
Una razón para controlar el acceso a un objeto es diferir el costo total de su creación e inicialización hasta que realmente necesitemos
úsalo Otra razón podría ser actuar como representante local de un objeto que vive en una JVM diferente. El Proxy puede ser muy
útil para controlar el acceso al objeto original, especialmente cuando los objetos deben tener diferentes derechos de acceso.
En el Proxy Pattern, un cliente no habla directamente con el objeto original, delega sus llamadas al objeto proxy que llama al
métodos del objeto original. El punto importante es que el cliente no sabe sobre el proxy, el proxy actúa como un original
objeto para el cliente. Pero hay muchas variaciones de este enfoque que veremos pronto.
</pre>
<li><a href="#builder">Decorator (Decorador)</a></li>
<li><a href="#singleton">Flyweight (Peso ligero)</a></li>
<li><a href="#singleton">Module</a></li>
</ul>


<h2><p dir="auto">Behavioral - comportamiento </p></h2>


<ul dir="auto">
<li><a href="#singleton">Observer (Observador)</a></li>
<pre>
<p> Observer es un patrón de diseño de software que define una dependencia del tipo uno a muchos entre objetos, de manera que cuando uno de los objetos cambia su estado, notifica este cambio a todos los dependientes. Se trata de un patrón de comportamiento </p>
<p>Veamos cómo usar el patrón de observador para desarrollar la función para Sport Lobby. Alguien actualizará el hormigón.
objeto del sujeto y su trabajo es actualizar el estado del objeto registrado con el objeto sujeto concreto. Entonces, siempre que haya
un cambio en el estado del objeto del sujeto concreto, todos sus objetos dependientes deben ser notificados y luego actualizados.</p>
</pre>

<li><a href="#prototype">Mediator (Mediador)</a></li>
<pre>
El patrón de mediador define un objeto que encapsula cómo interactúa un conjunto de objetos. El mediador promueve el acoplamiento flojo al
evita que los objetos se refieran entre sí explícitamente y le permite variar su interacción de forma independiente.
En lugar de interactuar directamente entre sí, los objetos le piden al Mediador que interactúe en su nombre, lo que da como resultado la reutilización.
y acoplamiento flojo. Encapsula la interacción entre los objetos y los hace independientes entre sí. Esto permite
les permite variar su interacción con otros objetos de una manera totalmente diferente mediante la implementación de un mediador diferente. el mediador
ayuda a reducir la complejidad de las clases. Cada objeto ya no tiene que saber en detalle cómo interactuar con el otro
objetos. El acoplamiento entre objetos va de apretado y quebradizo a suelto y ágil.
Antes de Mediator, la interacción entre las clases podría verse así, con referencias entre sí
</pre>
<li><a href="#factory-method">Chain of Responsibility (Cadena de responsabilidad)</a></li>
<li><a href="#abstract-factory">Command (Orden)</a></li>
<li><a href="#builder">Interpreter (Intérprete)</a></li>
<li><a href="#builder">Iterator (Iterador)</a></li>
<li><a href="#singleton">Memento (Recuerdo)</a></li>
<li><a href="#singleton">State (Estado)</a></li>
<li><a href="#singleton">Strategy (Estrategia)</a></li>
<li><a href="#singleton">Template Method (Método plantilla)</a></li>
<li><a href="#singleton">Visitor (Visitante)</a></li>
</ul>

</article>

