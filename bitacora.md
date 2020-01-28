#Bitácora de Cambios

## Implementación del diseño Inicial. ##

Tenemos tres clases
- clase Base Duck con un método abstracto. 
- MallardDuck y RedHead heredan de la clase Duck.
~~~
* Class Duck
 - void quack() 
 - void swim()
 - abstract void display()

* Class MallardDuck extends Duck
 - display()  //tiene su propia implementación. 

* Class RedHeadDuck extends Duck
 - display()  //tiene su propia implementación.
~~~

## Implementación 2. ##

- Se agregó un nuevo tipo de Pato RubberDuck.
- RubberDuck no hace un quack() normal por lo que se tiene que sobreescribir 
~~~
Class Duck
 void quack() 
 void swim()
 abstract void display()

Class MallardDuck extends Duck
  display()  //tiene su propia implementación. 

Class RedHeadDuck extends Duck
  display()  //tiene su propia implementación.

* Class RubberDuck extends Duck
 - display()  //tiene su propia implementación.
 - @Override quack() {
     //override to squeak.
    }
~~~


## Implementación 3. ##

- Se agregó el método fly() en la clase Duck.
~~~
* Class Duck
 void quack() 
 void swim()
 abstract void display()
 - void fly()

Class MallardDuck extends Duck
  display()  //tiene su propia implementación. 

Class RedHeadDuck extends Duck
  display()  //tiene su propia implementación.

Class RubberDuck extends Duck
  display()  //tiene su propia implementación.
  @Override quack() {
     //override to squeak.
    }
~~~

## Implementación 4. ##
- Tener de esta manera la estructura hizo que el código sea frágil por lo que  al agregar el método fly() en Duck hizo que RubberDuck pueda volar lo cual es un error.
- Y para solucionar este error la opción elegida fue sobreescribir fly en RubberDuck.
~~~
Class Duck
 void quack() 
 void swim()
 abstract void display()
 void fly()

Class MallardDuck extends Duck
  display()  //tiene su propia implementación. 

Class RedHeadDuck extends Duck
  display()  //tiene su propia implementación.

* Class RubberDuck extends Duck
  display()  //tiene su propia implementación. 
  @Override quack() {
     //override to squeak.
    }
- @Override fly() {
     //rubber duck can't fly.
    }
~~~

## Implementación 5. ##

- Se agregó un nuevo tipo de Pato DecoyDuck, que tiene un comportamiento similar al de RubberDuck.
- Al agregar el nuevo tipo de Pato hizo que se duplicara el código, lo que va en contra de DRY.
 además del principio de segregación de interfaces, ya que nadie debe estar obligado a implementar.
~~~
Class Duck
 void quack() 
 void swim()
 abstract void display()
 void fly()

Class MallardDuck extends Duck
  display()  //tiene su propia implementación. 

Class RedHeadDuck extends Duck
  display()  //tiene su propia implementación.

Class RubberDuck extends Duck
  display()  //tiene su propia implementación. 
  @Override quack() {
     //override to squeak.
    }

  @Override fly() {
     //rubber duck can't fly.
    }

* Class DecoyDuck extends Duck
 - display()  //tiene su propia implementación. 
 - @Override quack() {
     //don´t quack.
    }
- @Override fly() {
     //decoy duck can't fly.
    }
~~~

## Implementación 6. ##

- Se crearon las interfaces Flyable y Quackable, que hizo que se duplicara el código de fly.  (DRY)
- Se moficaron las clases Duck, quitando los metodos fly() y quack()
- en MallardDuck y en RedHeadDuck se implementó las interfaces Flyable y Quackable y se implementarion los metodos quack() y fly()
- en la clase RubberDuck se implementó la interfaz Quackable y el método quack()
- Se quizo mejorar aplicando ISP.
~~~

* Interfaz Flyable
  void quack()

* Interfaz Quackable
  void quack()

* Class Duck
 void swim()
 abstract void display()

* Class MallardDuck extends Duck implements Quackable, Flyable
 display()  //tiene su propia implementación. 
 - void quack()   //se agregó la implementación de quack 
 - void fly()  //se agregó la implementación de fly 


* Class RedHeadDuck extends Duck  implements Quackable, Flyable
 display()  //tiene su propia implementación.
 - void quack()   //se agregó la implementación de quack 
 - void fly()  //se agregó la implementación de fly 

* Class RubberDuck extends Duck implements Quackable
  display()  //tiene su propia implementación. 
  quack() {
     //override to squeak.
    }

* Class DecoyDuck extends Duck
 display()  //tiene su propia implementación. 
~~~


## Implementación 7. ##

- Se renombró la interfaz Flyable por FlyBehavior
- Se renombró la interfaz Quackable por QuackBehavior
- Se crearon las clases FlyWings y FlyNoWay que implementan FlyBehavior
- Se crearon las clases Quack, Squeak y MuteQuack
- Se agregaron los campos QuackBehavior y FlyBehavior dentro de la clase Duck.
- En los constructores de cada tipo de pato se definió el comportamiento de cada tipo
- En resumen se aplicó 
  ISP al segregar las interfaces
  SRP al tener clases que implementan estas interfaces
  LSP al tener un objeto de la Inteface FlyBehavior y QuackBehavior en la clase Duck
  OCP ya que se puede extender mas de un comportamiento
~~~

* Interfaz FlyBehavior
  void fly()

* Class FlyWings implements FlyBehavior
  - fly() //implementación de fly

* Class FlyNoWay implements FlyBehavior
  - fly() //implementación de No fly

* Interfaz QuackBehavior
  - void quack()

* Class Quack implements QuackBehavior
  - void quack()

* Class Squeak implements QuackBehavior
  - void quack() //squeak

* Class MuteQuack implements QuackBehavior
  - void quack() //don´t quack

* Class Duck
 - FlyBehavior flyBehavior
 - QuackBehavior quackBehavior
 void swim()
 - void performFly()
 - void performQuack()
 abstract void display()

* Class MallardDuck extends Duck
- MallardDuck(){
   flyBehavior = new FlyWings()
   quackBehavior = new Quack()
 }
 display()  //tiene su propia implementación. 
 

* Class RedHeadDuck extends Duck
 - RedHeadDuck(){
   flyBehavior = new FlyWings()
   quackBehavior = new Quack()
 } 
    
    display()  //tiene su propia implementación.
 
* Class RubberDuck extends Duck
 - RedHeadDuck(){
   flyBehavior = new FlyNoWay()
   quackBehavior = new Squeak()
 }       
 display()  //tiene su propia implementación. 
 

* Class DecoyDuck extends Duck
- DecoyDuck(){
   flyBehavior = new FlyNoWay()
   quackBehavior = new MuteQuack()
 }
 display()  //tiene su propia implementación.
~~~


## Implementación 8. ##

- En la clase Duck se agregarón los métodos para poder settear en momento de ejecución los comportamientos de FlyBehavior y QuackBehavior
  Se aplica OCP ya que se puede extender mas de un comportamiento haciendo que el comportamiento sea dinámico
~~~

 Interfaz FlyBehavior
  void fly()

 Class FlyWings implements FlyBehavior
   fly() //implementación de fly

 Class FlyNoWay implements FlyBehavior
   fly() //implementación de No fly

 Interfaz QuackBehavior
   void quack()

 Class Quack implements QuackBehavior
   void quack()

 Class Squeak implements QuackBehavior
   void quack() //squeak

 Class MuteQuack implements QuackBehavior
   void quack() //don´t quack

* Class Duck
  FlyBehavior flyBehavior
  QuackBehavior quackBehavior
 
  void swim()
  void performFly()
  void performQuack()
  abstract void display()
  - setFlyBehavior(newFlyBehavior)
  - setQuackBehavior(newQuackBehavior)

Class MallardDuck extends Duck
 MallardDuck(){
   flyBehavior = new FlyWings()
   quackBehavior = new Quack()
 }
 display()  //tiene su propia implementación. 
 

Class RedHeadDuck extends Duck
  RedHeadDuck(){
   flyBehavior = new FlyWings()
   quackBehavior = new Quack()
 } 
    
    display()  //tiene su propia implementación.
 
Class RubberDuck extends Duck
  RedHeadDuck(){
   flyBehavior = new FlyNoWay()
   quackBehavior = new Squeak()
 }       
 display()  //tiene su propia implementación. 
 

Class DecoyDuck extends Duck
 DecoyDuck(){
   flyBehavior = new FlyNoWay()
   quackBehavior = new MuteQuack()
 }
 display()  //tiene su propia implementación.
~~~


 







# aclaraciones de la bitácora
- Para entender la bitacora, cada seccion tiene un segmento de pseudocódigo
en las clases donde se produjeron algun tipo de cambio se agregó un asterísco * 
y en los métodos un  guión   ¨-¨ 

