# Laboratorio-05

### 1.¿Qué diferencia existe entre navegar dentro de la aplicación utilizando **Navigation Component** o hacer uso de intents?

Navigation Component es declarativo y maneja automáticamente el ciclo de vida y la navegación en el back stack, lo que reduce la cantidad de código necesario para implementar la navegación en aplicaciones grandes y complejas. Por otro lado, Intents es imperativo y requiere agregar código adicional para cada actividad o fragmento y para manejar el ciclo de vida y el back stack, pero puede ser mejor para una interacción más directa entre actividades.

### 2. Menciona los componentes fundamentales de Navigation Component

**NavController:** es el objeto principal que maneja la navegación en la aplicación, cargando y mostrando pantallas o destinos en la interfaz de usuario, y manteniendo un back stack para permitir la navegación hacia atrás.

**NavGraph:** es una representación visual del flujo de navegación de la aplicación. Define los destinos de navegación, como actividades, fragmentos o puntos de anclaje, y establece las conexiones entre ellos. Un NavGraph puede contener múltiples destinos y puede anidarse para representar flujos más complejos.

**NavHost:** es el contenedor visual donde se muestran los destinos de navegación de la aplicación. Carga y muestra los destinos definidos en el NavGraph y maneja las transiciones de animación entre ellos.

### 3. Mencione algunas de las ventajas del Navigation Graph

Navigation Graph proporciona una solución completa y organizada para la navegación en aplicaciones, lo que puede mejorar la calidad y eficiencia del código y la experiencia del usuario.

# Laboratorio-06

### 1. ¿En qué consiste el patrón de diseño Repository? 

Este consiste en aislar la capa de datos de la aplicaciòn, esta capa es la que hace referencia a la parte que controla los datos y la logica de negocio de nuestra aplicacion. Esta separa los componentes visuales, la UI presenta informaciòn de usuario y la capa de datos 

### 2. ¿Qué es el ViewModel?

Es una lògica de empresarial que expone el estado de la UI y esta encapsula la lògica empresarial relacionada. Una de sus ventajas es que almacena en cachè el estado los cuales se mantendran incluso depspues de los cambios que se puedan realizar en la configuraciòn y tampoco tiene que recuperar datos cuando se navege entr actividades, por ejemplo cuando al usar la aplicaciòn se rota la pantalla. ES el intermediario entre la capa de datos Model y entra la capa View que es la capa de interfaz de usuario

# Laboratorio-07 

### 1. ¿Qué ventajas tiene el utilizar LiveData?

Las actualizaciones en tiempo real, actividades detenidas para evitar las fallas, garantiza que la UI coincida con el estado de los datos, no tiene figas de memoria y no mas control de ciclo de vida,

### 2. ¿Qué patrón de diseño utiliza LiveData?

 Observer

### 3. Menciona que se debe agregar al Gradle para poder implementar DataBinding

dataBinding{
  enabled: true
 }

### 4. ¿Qué es DataBinding? Menciona sus ventajas frente a findViewById

fucion de android que nos permite vincular los elemento de la interfaz de usuari o la UI de una aplicacion directamente a los datos de la aplicacion.
