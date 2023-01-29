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
<li><a href="#builder">Builder</a></li>
<pre>
<p>
La intención del Patrón Constructor es separar la construcción de un objeto complejo de su representación, para que el mismo
proceso de construcción puede crear diferentes representaciones. Este tipo de separación reduce el tamaño del objeto. El diseño resulta
ser más modular con cada implementación contenida en un objeto constructor diferente. Agregar una nueva implementación (es decir, agregar un
nuevo constructor) se vuelve más fácil. El proceso de construcción del objeto se vuelve independiente de los componentes que forman el objeto.
Esto proporciona más control sobre el proceso de construcción de objetos.
En términos de implementación, cada uno de los diferentes pasos en el proceso de construcción se puede declarar como métodos de un común
Interfaz a implementar por diferentes constructores de hormigón.
</p>
<p>
     Un objeto de cliente puede crear una instancia de un constructor concreto e invocar el conjunto de métodos necesarios para construir diferentes partes de el objeto final. Este enfoque requiere que cada objeto del cliente sea consciente de la lógica de construcción. Siempre que la lógica de construcción sufre un cambio, todos los objetos del cliente deben modificarse en consecuencia.
</p>
<p>
     El patrón Builder introduce otro nivel de separación que aborda este problema. En lugar de hacer que los objetos del cliente invoquen
diferentes métodos de construcción directamente, el patrón de construcción sugiere usar un objeto dedicado denominado Director, que es
responsable de invocar diferentes métodos constructores necesarios para la construcción del objeto final. Diferentes objetos de cliente pueden
hacer uso del objeto Director para crear el objeto requerido. Una vez que se construye el objeto, el objeto del cliente puede solicitar directamente del constructor el objeto completamente construido. Para facilitar este proceso, se puede declarar un nuevo método getObject en el Interfaz de constructor común para ser implementada por diferentes constructores concretos.
</p>
<p>
El nuevo diseño elimina la necesidad de que un objeto del cliente se ocupe de los métodos que constituyen el proceso de construcción del objeto y encapsula los detalles de cómo se construye el objeto desde el cliente.
</p>
</pre>

  <li><a href="#factory-method">Factory Method</a></li>
  <pre>
El patrón de método de fábrica nos brinda una forma de encapsular las instancias de tipos concretos. El patrón del método de fábrica
encapsula la funcionalidad requerida para seleccionar e instanciar una clase apropiada, dentro de un método designado denominado
un método de fábrica. Factory Method selecciona una clase apropiada de una jerarquía de clases basada en el contexto de la aplicación y
otros factores influyentes. Luego crea una instancia de la clase seleccionada y la devuelve como una instancia del tipo de clase principal.
La ventaja de este enfoque es que los objetos de la aplicación pueden hacer uso del método de fábrica para obtener acceso al
instancia de clase. Esto elimina la necesidad de que un objeto de aplicación se ocupe de los distintos criterios de selección de clases.  
  </pre>
<li><a href="#abstract-factory">Abstract Factory</a></li>

<pre>
The Abstract Factory (A.K.A. Kit) es un patrón de diseño que proporciona una interfaz para crear familias de elementos relacionados o dependientes.
objetos sin especificar sus clases concretas. El patrón Abstract Factory toma el concepto del patrón Factory Method al siguiente nivel. 
Una fábrica abstracta es una clase que proporciona una interfaz para producir una familia de objetos. En Java, puede ser
implementado usando una interfaz o una clase abstracta.
El patrón Abstract Factory es útil cuando un objeto cliente quiere crear una instancia de uno de un conjunto de objetos relacionados y dependientes.
clases sin tener que saber qué clase concreta específica se va a instanciar. Distintas fábricas de hormigón implementan el
interfaz de fábrica abstracta. Los objetos de cliente hacen uso de estas fábricas concretas para crear objetos y, por lo tanto, no necesitan
saber qué clase concreta se instancia realmente.
La fábrica abstracta es útil para conectar un grupo diferente de objetos para alterar el comportamiento del sistema. Para cada grupo o
familia, se implementa una fábrica de hormigón que gestiona la creación de los objetos y las interdependencias y consistencia
requisitos entre ellos. Cada fábrica concreta implementa la interfaz de la fábrica abstracta
</pre>

<li><a href="#prototype">Prototype</a></li>
<pre>
El patrón de diseño de prototipo se utiliza para especificar los tipos de objetos que se crearán utilizando una instancia prototípica y crear nuevos objetos.
copiando este prototipo.
El concepto es copiar un objeto existente en lugar de crear una nueva instancia desde cero, algo que puede incluir costosos
operaciones. El objeto existente actúa como un prototipo y contiene el estado del objeto. El objeto recién copiado puede cambiar
Mismas propiedades solo si es necesario. Este enfoque ahorra recursos y tiempo costosos, especialmente cuando la creación de objetos es una tarea pesada.
proceso.
En Java, hay ciertas formas de copiar un objeto para crear uno nuevo. Una forma de lograr esto es usando el Cloneable
interfaz. Java proporciona el método de clonación, que un objeto hereda de la clase Object. Necesitas implementar el
Interfaz clonable y anule este método de "clonación" según sus necesidades.
</pre>
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

<li><a href="#singleton">Flyweight (Peso ligero)</a></li>
<pre>
La intención del patrón Flyweight es usar objetos compartidos para admitir una gran cantidad de objetos de granularidad fina de manera eficiente. 
flyweight es un objeto compartido que se puede usar en múltiples contextos simultáneamente. El peso mosca actúa como un objeto independiente en
cada contexto: es indistinguible de una instancia del objeto que no se comparte. Los Flyweights no pueden hacer suposiciones sobre
el contexto en el que operan. El concepto clave aquí es la distinción entre estado intrínseco y extrínseco. El estado intrínseco es
almacenado en el peso mosca; consiste en información que es independiente del contexto del peso mosca, lo que la hace compartible. Él
el estado extrínseco depende y varía con el contexto del peso mosca y, por lo tanto, no se puede compartir. Los objetos del cliente son responsables por pasar estado extrínseco al peso mosca cuando lo necesita.

Considere un escenario de aplicación que implica la creación de una gran cantidad de objetos que son únicos solo en términos de unos pocos parámetros.
En otras palabras, estos objetos contienen algunos datos intrínsecos e invariantes que son comunes a todos los objetos. Estos datos intrínsecos necesitan ser creado y mantenido como parte de cada objeto que se está creando. La creación y el mantenimiento general de un gran grupo.
de tales objetos puede ser muy costoso en términos de uso de memoria y rendimiento. El patrón Flyweight se puede utilizar en tales
escenarios para diseñar una forma más eficiente de crear objetos.
</pre>

<li><a href="#builder">Decorator (Decorador)</a></li>
<pre>
La intención del patrón de diseño Decorator es adjuntar dinámicamente responsabilidades adicionales a un objeto. Los decoradores ofrecen una
alternativa flexible a la subclasificación para ampliar la funcionalidad.
El patrón Decorator se utiliza para extender la funcionalidad de un objeto dinámicamente sin tener que cambiar la clase original.
fuente o utilizando la herencia. Esto se logra mediante la creación de un envoltorio de objeto denominado Decorador alrededor del objeto real.
objeto.
El objeto Decorator está diseñado para tener la misma interfaz que el objeto subyacente. Esto permite que un objeto cliente interactúe
con el objeto Decorator exactamente de la misma manera que lo haría con el objeto real subyacente. El objeto Decorador
contiene una referencia al objeto real. El objeto Decorator recibe todas las solicitudes (llamadas) de un cliente. A su vez, reenvía
estas llamadas al objeto subyacente. El objeto Decorator agrega alguna funcionalidad adicional antes o después del reenvío
solicitudes al objeto subyacente. Esto asegura que la funcionalidad adicional se pueda agregar a un objeto dado externamente en
tiempo de ejecución sin modificar su estructura.
Decorator evita la proliferación de subclases, lo que reduce la complejidad y la confusión. Es fácil agregar cualquier combinación de
capacidades. La misma capacidad puede incluso agregarse dos veces. Se hace posible tener diferentes objetos decoradores para un determinado
objeto simultáneamente. Un cliente puede elegir qué capacidades quiere enviando mensajes a un decorador apropiado
</pre>


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
<pre>
La intención de este patrón es evitar acoplar al remitente de una solicitud con su receptor dando a más de un objeto la oportunidad de
manejar la solicitud. Encadenamos los objetos receptores y pasamos la solicitud a lo largo de la cadena hasta que un objeto la maneje.
Este patrón se trata de conectar objetos en una cadena de notificación; a medida que una notificación viaja por la cadena, es manejada por el
primer objeto que se configura para tratar con la notificación en particular.
Cuando hay más de un objeto que puede manejar o cumplir con una solicitud del cliente, el patrón recomienda dar a cada uno de estos
objeta la oportunidad de procesar la solicitud en algún orden secuencial. Aplicando el patrón en tal caso, cada uno de estos potenciales los manipuladores se pueden organizar en forma de cadena, en la que cada objeto tiene una referencia al siguiente objeto de la cadena. El primero
El objeto de la cadena recibe la solicitud y decide gestionarla o pasarla al siguiente objeto de la cadena. Él la solicitud fluye a través de todos los objetos de la cadena, uno tras otro, hasta que la solicitud es manejada por uno de los controladores de la cadena
o la solicitud llega al final de la cadena sin ser procesada.
</pre>
<li><a href="#singleton">Memento (Recuerdo)</a></li>
<pre>
La intención del patrón Memento es, sin violar la encapsulación, capturar y externalizar el estado interno de un objeto para que el
el objeto se puede restaurar a este estado más tarde.

• Almacena el estado interno del objeto originador. El memento puede almacenar tanto o tan poco del estado interno del originador como
necesario a discreción de su originador.
• Protege contra el acceso de objetos que no sean el originador. Los recuerdos tienen efectivamente dos interfaces. El cuidador ve un estrecho
interfaz con el recuerdo: solo puede pasar el recuerdo a otros objetos. Originator, por el contrario, ve una interfaz amplia, una que
le permite acceder a todos los datos necesarios para restaurarse a su estado anterior. Idealmente, solo el autor que produjo el recuerdo
se le permitiría acceder al estado interno del recuerdo.

Autor
• Crea un recuerdo que contiene una instantánea de su estado interno actual.
• Utiliza el recuerdo para restaurar su estado interno.

Vigilante
• Es responsable de la custodia del recuerdo.
• Nunca opere ni examine el contenido de un recuerdo.

Cuando un cliente desea guardar el estado del originador, solicita el estado actual del originador. El creador almacena todos
aquellos atributos que se requieren para restaurar su estado en un objeto separado denominado Memento y lo devuelve al cliente.
Por lo tanto, un Memento puede verse como un objeto que contiene el estado interno de otro objeto, en un momento determinado. un recuerdo
El objeto debe ocultar los valores de la variable del originador de todos los objetos excepto del originador. En otras palabras, debe proteger su interior estado contra el acceso de objetos que no sean el originador. Con este fin, se debe diseñar un Memento para proporcionar
acceso a otros objetos mientras que el originador puede acceder a su estado interno.

Cuando el cliente desea restaurar el originador a su estado anterior, simplemente le devuelve el recuerdo al originador.
El creador utiliza la información de estado contenida en el memento y vuelve al estado almacenado en el objeto Memento.
</pre>

<li><a href="#singleton">Template Method (Método plantilla)</a></li>
<pre>
El patrón de plantilla define el esqueleto de un algoritmo en una operación, delegando algunos pasos a las subclases. Método de plantilla
permite que las subclases redefinan ciertos pasos de un algoritmo sin cambiar la estructura del algoritmo.
El patrón del método de plantilla se puede usar en situaciones en las que hay un algoritmo, algunos de los cuales podrían implementarse
de múltiples maneras diferentes. En tales escenarios, el patrón del método de plantilla sugiere mantener el esquema del algoritmo en un
método separado denominado método de plantilla dentro de una clase, que puede denominarse clase de plantilla, omitiendo el
implementaciones específicas de las porciones variantes (pasos que se pueden implementar de múltiples maneras diferentes) del algoritmo para
diferentes subclases de esta clase.
La clase Plantilla no necesariamente tiene que dejar la implementación a las subclases en su totalidad. En cambio, como parte de proporcionar
el esquema del algoritmo, la clase Plantilla también puede proporcionar cierta cantidad de implementación que puede considerarse como
invariable a través de diferentes implementaciones. Incluso puede proporcionar una implementación predeterminada para las piezas variantes, si corresponde. Solo
los detalles específicos se implementarán dentro de diferentes subclases. Este tipo de implementación elimina la necesidad de duplicar
código, lo que significa que se debe escribir una cantidad mínima de código.
</pre>

<li><a href="#singleton">State (Estado)</a></li>
<pre>
El patrón de diseño de estado permite que un objeto altere su comportamiento cuando cambia su estado interno. El objeto parecerá cambiar
su clase
El estado de un objeto se puede definir como su condición exacta en un momento dado, dependiendo de los valores de sus propiedades.
o atributos. El conjunto de métodos implementados por una clase constituye el comportamiento de sus instancias. Siempre que haya un cambio en
los valores de sus atributos, decimos que el estado de un objeto ha cambiado.
El patrón State es útil para diseñar una estructura eficiente para una clase, una instancia típica de la cual puede existir en muchos entornos diferentes.
estados y exhiben un comportamiento diferente dependiendo del estado en el que se encuentre. En otras palabras, en el caso de un objeto de tal clase, algunos
o todo su comportamiento está completamente influenciado por su estado actual. En la terminología de patrones de diseño de estado, dicha clase se denomina
como una clase de contexto. Un objeto de Contexto puede alterar su comportamiento cuando hay un cambio en su estado interno y también es referido
como un objeto con estado.
El patrón State sugiere mover el comportamiento específico del estado fuera de la clase Context a un conjunto de clases separadas a las que se hace referencia
como clases de estado. Cada uno de los muchos estados diferentes en los que puede existir un objeto de contexto se puede asignar a un estado separado
clase. La implementación de una clase State contiene el comportamiento del contexto que es específico de un estado dado, no el comportamiento general.
Patrones de diseño Java 126 / 173
del propio contexto. El contexto actúa como cliente del conjunto de objetos de estado en el sentido de que hace uso de diferentes objetos de estado.
para ofrecer el comportamiento específico del estado necesario a un objeto de aplicación que utiliza el contexto de manera transparente.
Al encapsular el comportamiento específico del estado en clases separadas, la implementación del contexto se vuelve más fácil de leer: libre de demasiado
muchas sentencias condicionales como construcciones if-else o switch-case. Cuando se crea por primera vez un objeto de contexto, se inicializa solo
con su objeto State inicial. Este objeto de estado se convierte en el objeto de estado actual para el contexto. Al reemplazar el estado actual
objeto con un nuevo objeto State, el contexto pasa a un nuevo estado.
La aplicación cliente que utiliza el contexto no es responsable de especificar el objeto de estado actual para el contexto, sino que cada
de las clases de estado que representan estados específicos se espera que proporcionen la implementación necesaria para la transición del contexto
a otros estados. Cuando un objeto de aplicación realiza una llamada a un método de contexto (comportamiento), reenvía la llamada al método a su
objeto de estado actual.
</pre>

<li><a href="#singleton">Strategy (Estrategia)</a></li>
<pre>
El patrón de diseño de estrategia define una familia de algoritmos, encapsula cada uno de ellos y los hace intercambiables. Estrategia
permite que el algoritmo varíe independientemente de los clientes que lo utilicen.
El patrón de estrategia es útil cuando hay un conjunto de algoritmos relacionados y un objeto de cliente debe poder elegir dinámicamente
y elija un algoritmo de este conjunto que se adapte a su necesidad actual. El patrón de Estrategia sugiere mantener la implementación de
cada uno de los algoritmos en una clase separada. Cada algoritmo de este tipo encapsulado en una clase separada se denomina estrategia.
Un objeto que utiliza un objeto de estrategia a menudo se denomina objeto de contexto.
Con diferentes objetos de estrategia en su lugar, cambiar el comportamiento de un objeto de contexto es simplemente una cuestión de cambiar su Str
objeto de estrategia al que implementa el algoritmo requerido. Para habilitar un objeto de contexto para acceder a diferentes estrategias
todos los objetos de estrategia deben estar diseñados para ofrecer la misma interfaz. En la programación Java
lenguaje, esto se puede lograr mediante el diseño de cada objeto de la estrategia, ya sea como un implementador de una interfaz común o como
una subclase de una clase abstracta común que declara la interfaz común requerida.
Una vez que el grupo de algoritmos relacionados se encapsula en un conjunto de clases de estrategia en una jerarquía de clases, un cliente puede elegir entre
entre estos algoritmos seleccionando e instanciando una clase de estrategia apropiada. Para alterar el comportamiento del contexto,
un objeto de cliente necesita configurar el contexto con la instancia de estrategia seleccionada. Este tipo de arreglo completamente
separa la implementación de un algoritmo del contexto que lo usa. Como resultado, cuando se cambia la implementación de un algoritmo existente o se agrega un nuevo algoritmo al grupo, tanto el contexto como el objeto del cliente (que usa el contexto)
permanecer inafectado.
</pre>

<li><a href="#abstract-factory">Command (Orden)</a></li>
<pre>
La intención del patrón de diseño de comando es encapsular una solicitud como un objeto, lo que permite al desarrollador parametrizar
clientes con diferentes solicitudes, solicitudes de cola o registro, y admite operaciones que se pueden deshacer.
En general, una aplicación orientada a objetos consta de un conjunto de objetos que interactúan, cada uno de los cuales ofrece una funcionalidad limitada y enfocada. En
En respuesta a la interacción del usuario, la aplicación lleva a cabo algún tipo de procesamiento. Para ello, la aplicación hace uso de
los servicios de diferentes objetos para el requisito de procesamiento.
En términos de implementación, la aplicación puede depender de un objeto designado que invoca métodos en estos objetos pasando
los datos requeridos como argumentos. Este objeto designado puede denominarse invocador, ya que invoca operaciones en diferentes
objetos. El invocador puede ser tratado como parte de la aplicación cliente. El conjunto de objetos que realmente contienen la implementación.
para ofrecer los servicios necesarios para el procesamiento de solicitudes se pueden denominar objetos receptores.
Usando el patrón de comando, el invocador que emite una solicitud en nombre del cliente y el conjunto de receptores de prestación de servicios
los objetos se pueden desacoplar. El patrón Comando sugiere crear una abstracción para el procesamiento a realizar o la acción
a tomar en respuesta a las solicitudes de los clientes. Esta abstracción se puede diseñar para declarar una interfaz común a implementar
por diferentes implementadores concretos denominados objetos Command. Cada objeto Command representa un tipo diferente de cliente
solicitud y la tramitación correspondiente.
Un objeto Comando dado es responsable de ofrecer la funcionalidad requerida para procesar la solicitud que representa, pero no
no contienen la implementación real de la funcionalidad. Los objetos de comando hacen uso de los objetos de receptor para ofrecer este
funcionalidad
</pre>

<li><a href="#builder">Interpreter (Intérprete)</a></li>
<pre>
Dado un idioma, defina una representación para su gramática junto con un intérprete que use la representación para interpretar
oraciones en el idioma.
En general, los idiomas se componen de un conjunto de reglas gramaticales. Se pueden construir diferentes oraciones siguiendo esta gramática.
normas. A veces, una aplicación puede necesitar procesar instancias repetidas de solicitudes similares que son una combinación de un conjunto de
reglas gramaticales. Estas solicitudes son distintas pero similares en el sentido de que todas están compuestas usando el mismo conjunto de reglas.
Un ejemplo simple de esto sería el conjunto de diferentes expresiones aritméticas enviadas a un programa de calculadora. aunque cada uno
dicha expresión es diferente, todas están construidas utilizando las reglas básicas que componen la gramática del lenguaje de la aritmética
expresiones
En tales casos, en lugar de tratar cada combinación distinta de reglas como un caso separado, puede ser beneficioso para la aplicación
tener la capacidad de interpretar una combinación genérica de reglas. El patrón Intérprete se puede usar para diseñar esta habilidad en un
aplicación para que otras aplicaciones y usuarios puedan especificar operaciones usando un lenguaje simple definido por un conjunto de reglas gramaticales.
Se puede diseñar una jerarquía de clases para representar el conjunto de reglas gramaticales con cada clase en la jerarquía representando un
Regla gramátical. Se puede diseñar un módulo de intérprete para interpretar las oraciones construidas utilizando la jerarquía de clases diseñada
anterior y realiza las operaciones necesarias.
Debido a que una clase diferente representa cada regla gramatical, el número de clases aumenta con el número de reglas gramaticales. A
un lenguaje con reglas gramaticales extensas y complejas requiere un gran número de clases. El patrón Intérprete funciona mejor cuando la gramática es simple. Tener una gramática simple evita la necesidad de tener muchas clases correspondientes al conjunto complejo de reglas
involucrados, que son difíciles de administrar y mantener.
</pre>

<li><a href="#builder">Iterator (Iterador)</a></li>
<bre>
La intención del patrón de diseño de iterador es proporcionar una forma de acceder a los elementos de un objeto agregado secuencialmente sin
exponer su representación subyacente.
El patrón Iterator permite que un objeto cliente acceda al contenido de un contenedor de manera secuencial, sin tener ningún
conocimiento sobre la representación interna de sus contenidos. El término contenedor, utilizado anteriormente, puede definirse simplemente como una colección
de datos u objetos. Los objetos dentro del contenedor podrían a su vez ser colecciones, convirtiéndolo en una colección de colecciones.
El patrón Iterator permite que un objeto cliente atraviese esta colección de objetos (o el contenedor) sin tener la
contenedor para revelar cómo se almacenan los datos internamente. Para lograr esto, el patrón Iterator sugiere que un objeto Container
debe diseñarse para proporcionar una interfaz pública en forma de un objeto Iterator para que diferentes objetos de cliente accedan a su contenido.
Un objeto Iterator contiene métodos públicos para permitir que un objeto de cliente navegue por la lista de objetos dentro del contenedor.
• Define una interfaz para acceder y atravesar elementos.
iterador concreto
• Implementa la interfaz Iterator.
• Realiza un seguimiento de la posición actual en el recorrido del agregado.
Agregar
• Define una interfaz para crear un objeto Iterator.
ConcretoAgregado
• Implementa la interfaz de creación de Iterator para devolver una instancia del ConcreteIterator adecuado.
</pre>
<li><a href="#singleton">Visitor (Visitante)</a></li>
<pre>
La intención del patrón de diseño de visitante es representar una operación que se realizará en los elementos de una estructura de objeto. Visitante
le permite definir una nueva operación sin cambiar las clases de los elementos sobre los que opera.
El patrón Visitor es útil cuando se diseña una operación en una colección heterogénea de objetos de una jerarquía de clases. Él
El patrón Visitor permite definir la operación sin cambiar la clase de ninguno de los objetos de la colección. Cumplir
esto, el patrón Visitor sugiere definir la operación en una clase separada denominada clase visitante. Esto separa la operación
de la colección de objetos en la que opera. Por cada nueva operación que se defina, se crea una nueva clase de visitante. Desde el
se va a realizar una operación en un conjunto de objetos, el visitante necesita una forma de acceder a los miembros públicos de estos objetos.
Este requisito se puede abordar implementando las siguientes dos ideas de diseño

Visitante
• Declara una operación de Visita para cada clase de ConcreteElement en la estructura del objeto. El nombre y la firma de la operación.
identifica la clase que envía la solicitud de visita al visitante. Que permite al visitante determinar la clase concreta de la
elemento que se visita. Entonces el visitante puede acceder al elemento directamente a través de su interfaz particular.
ConcretoVisitante
• Implementa cada operación declarada por el Visitante. Cada operación implementa un fragmento del algoritmo definido para el
correspondiente clase de objeto en la estructura. ConcreteVisitor proporciona el contexto para el algoritmo y almacena su local
Expresar. Este estado a menudo acumula resultados durante el recorrido de la estructura.
Elemento
• Define una operación de Aceptar que toma como argumento a un visitante.
HormigónElemento
• Implementa una operación de Aceptar que toma como argumento a un visitante.
ObjetoEstructura
• Puede enumerar sus elementos.
• Puede proporcionar una interfaz de alto nivel para permitir que el visitante visite sus elementos.
• Puede ser un compuesto o una colección, como una lista o un conjunto
</pre>
</ul>

</article>

