
# Interfaces Listener

El concepto de Interface lleva un paso más adelante la idea de las clases abstractas. En Java una interface es una clase abstracta pura, es decir una clase donde todos los métodos son abstractos (no se implementa ninguno). Permite al diseñador de clases establecer la forma de una clase (nombres de métodos, listas de argumentos y tipos de retorno, pero no bloques de código). Una interface puede también contener datos miembro, pero estos son siempre static y final. Una interface sirve para establecer un 'protocolo' entre clases.

Para crear una interface, se utiliza la palabra clave interface en lugar de class. La interface puede definirse public o sin modificador de acceso, y tiene el mismo significado que para las clases. Todos los métodos que declara una interface son siempre public.

Para indicar que una clase implementa los métodos de una interface se utiliza la palabra clave implements. El compilador se encargará de verificar que la clase efectivamente declare e implemente todos los métodos de la interface. Una clase puede implementar más de una interface.

## Declaración y Uso

Una interface se declara:

    **interface** *nombre_interface* {
        *tipo_retorno* *nombre_retorno* ( *lista_argumentos* ) ;
        . . .
    }

Por ejemplo:

    interface InstrumentoMusical{
        void tocar ();
        void afinar ();
        String tipoInstrumento ();
    }

Y una clase que implementa la interface:

    class InstrumentoViento extends Object implements InstrumentoMusical {
        void tocar() { . . . };
        void afinar() { . . .};
        String tipoInstrumento() {}
    }

    class Guitarra extends InstrumentoViento {
        String tipoInstrumento() {
            return "Guitarra";
        }
    }   

### ActionListener

Se produce al hacer click sobre un componenteo si hacemos enter cuando éste tiene el foco

**Métodos:**

> public void actionPerformed(ActionEvent e)

**Eventos:**

- **JButton:** Click o pulsar Enter con el foco activado en el
- **JList:** Doble click en un elemento de la lista
- **JMenuItem:** Selecciona una opción del menú
- **JTextField:** Al pulsar Enter con el foco activado

### KeyListener

Se produce al pulsar una tecla, segun el método cambiara la forma de pulsar la tecla

**Métodos:**

> public void keyTyped(KeyEvent e)
> public void keyPressed(KeyEvent e)
> public void keyReleased(KeyEvent e)

**Eventos:**

Cuando pulsamos una tecla, según el Listener:

- **keyTyped:** Al pulsar y soltar la telca
- **keyPressed:** Al pulsar la tecla
- **keyReleased:** Al soltar la tecla

### FocusListener

Se produce cuando un componente gana o pierde el foco, es decir, que está seleccionado

**Métodos:**

> public void focusGained(FocusEvent e)
> public void focusLost(FocusEvent e)

### MouseListener

**Métodos:**

> public void mouseClicked(MouseEvent e)
> public void mouseEntered(MouseEvent e)
> public void mouseExited(MouseEvent e)
> public void mousePressed(MouseEvent e)

**Eventos:**

Según el Listener:

- **mouseClicked:** Clickear y soltar
- **mouseEntered:** Entrar en un componente con el puntero
- **mouseExited:** Salir de un componente con el puntero
- **mousePressed:** Presionar el botón
- **mouseReleased:** Soltar el botón

### MouseMotionListener

Se produce con el movimiento del mouse

**Métodos:**

> public void mouseDragged(MouseEvent e)
> public void mouseMoved(MouseEvent e)

**Eventos:**

Según el Listener:

- **mouseDragged:** Click y arrastrar un componente
- **mouseMoved:** Al mover el puntero sobre el elemento

#### Fuentes

- Galache, L. F. (s. f.). Eventos y listeners en Java Swing. SlideShare. Recuperado 29 de septiembre de 2021, de **<https://es.slideshare.net/laurafolgadogalache/eventos-y-listeners-en-java-swing>**
- Listener en Java - PROGRAMACIÓN JAVA GRUPO SAN VALERO 2012 2013. (s. f.). Programación Java Grupo San Valero. Recuperado 29 de septiembre de 2021, de **<https://sites.google.com/a/svalero.com/programacion-java-grupo-san-valero-2012-2013/calendario-tareas-2a-evaluacion/listener-enjava>**
