# Cambiar  Layout con botones
Como navegar entre varios Layout con botones en Android Studios

## Creación de un `Splash Screen`
Un Splash Screen consiste en una pantalla inicial que muestra el logotipo de la aplicación durante uno o varios segundos y que puede o no realizar ciertas operaciones, como, por ejemplo, la carga de datos durante ese tiempo, para posteriormente realizar una transición hacia la aplicación en sí.

Para empezar debemos crear un `Empty Activity`, lo cual hacemos de esta forma:

![Crear un Empty ACtivity](\Escritorio/emptyactivity.png)

Dentro del `OnCreate` del `Activity` creado debemos crear una clase `Handler` con el método `postDelayed`.

```java
new Handler().postDelayed(new Runnable() {
    @Override
    public void run() {
        Intent intent = new Intent(splash.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
    },2000);
```

De esta manera estamos indicandole al programa que pasado los 2 segundos (ya que el tiempo se define en ms) ejecute lo que contiene dentro del método creado (un `Intent` para cambiar de layout).

## `Intent`
En Android, la habilidad de enviar mensajes es posible por el objeto Intent. Con la ayuda de los intents, los componentes de Android pueden solicitar funcionalidad de otros componentes Android. Todos los componentes (aplicaciones y pantallas) del dispositivo Android están aisladas. La única manera de comunicarse entre ellas es a través de intents.

[Documentación Intent y filtros Intent](https://developer.android.com/guide/components/intents-filters?hl=es-419 "Documentación Intent")

### Código para ejecutar un Intent 
Como todo objeto, es necesario crearlo, inicializarlo y ejecutarlo.
```java
//Creamos e inicializamos el Intent indicando la acción que realiza, en este caso es redirigir al usuario a otro Activity, indicando que lo va a hacer desde MainActivity a InformationFields
Intent intent = new Intent(MainActivity.this, InformationFields.class);
//ejecutamos el Intent
startActivity(intent);
```
Otra forma que podemos utilizar para realizar la misma acción es:
```java
startActivity(new Intent(MainActivity.this, InformationFields.class));
```
