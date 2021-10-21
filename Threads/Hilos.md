# Threads (Hilos)

Una thread es un único flujo de control dentro de un programa. Algunas veces es llamado contexto de ejecución porque cada thread debe tener sus propios recursos, como el program counter y el stack de ejecución, como el contexto de ejecución. Sin embargo, toda thread en un programa aún comparte muchos recursos, tales como espacio de memoria  y archivos abiertos. Threads también son llamadas procesos livianos (lightweight process).

## Thread Paralelas y Concurrentes

Cuando dos threads corren en paralelo, ambas están siendo corridas al mismo tiempo en diferentes CPUs. Dos thread concurrentes están en progreso, o intentando de obtener tiempo de ejecución de la CPU al mismo tiempo, pero no necesariamente están corriendo en forma simultánea en dos CPUs diferentes.

## Creación y ejecución de Threads

Hay dos formas de hacer una tarea correr concurrentemente con otra: crear una nueva clase como subclase de la clase Thread o declarar una clase e implementar la interfaz Runnable.

### Uso de Subclase

Cuando se crea una subclase de Thread, la subclase debería definir su propio método run() para sobre montar el método run() de la  clase Thread. La tarea concurrente es desarrollada en este método run().

### Ejecución del método run()

Una instancia de la subclase es creada con new, luego llamamos al método start() de la thread para hacer que la máquina virtual Java ejecute el método run(). Ojo para iniciar la concurrencia invocamos a start(), así invocamos a run() en forma indirecta. Si invocamos a run() directamente, se comportará como el llamado a cualquier método llamado dentro de un mismo hilo (sin crear uno independiente).

## Implementación de la Interfaz Runnable

La interfaz Runnable requiere que sólo un método sea implementado, el método run(). Primero creamos una instancia de esta clase con new, luego creamos una instancia de Thread con otra sentencia new y usamos el objeto recién creado en el constructor. Finalmente, llamamos el método start() de la instancia de Thread para iniciar la tarea definida en el método run().

    RunnableThread.java

Una instancia de una clase que defina el método run() - ya sea como subclase de Thread o implementando la interfaz Runnable - debe ser pasada como argumento en la creación de una instancia de Thread. Cuando el método start() de esta instancia es llamado, Java run  time sabe qué método run() ejecutar.
