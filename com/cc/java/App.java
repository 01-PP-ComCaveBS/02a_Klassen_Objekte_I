package com.cc.java;

public class App {
    
    public static void main(String[] args) {


// Cat --> referenztyp (Klasse aus dem das objekt entsteht)
// cat1 --< referenzvariable (Adresse des objekt im RAM)
Cat cat1 = new Cat(); //Instanziierung >>
output("Blick von aussen: " + cat1); // Adresse desObjekts

cat1.sayHi();
output("-----------------");
Cat cat2 = new Cat();

output("Blick von aussen: " + cat2);
cat2.sayHi();

//System.out.println(new Cat());
//System.out.println(new Cat());


output("hi");

    }
// Statische Methode , die in der Klasse ausgeführt wird ...
  public static void output(String outputStr) {
System.out.println(outputStr);

   }





}

