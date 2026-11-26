
package de.pizzamanager;

public enum Pizza {

 MARGHERITA(
         "Margherita",
         "Tomatensauce, Mozzarella, Basilikum",
         8.50,
         "margherita.png"
 ),

 SALAMI(
         "Salami",
         "Tomatensauce, Mozzarella, Salami",
         8.90,
         "salami.png"
 ),

 TONNO(
         "Tonno",
         "Tomatensauce, Mozzarella, Thunfisch, Zwiebeln",
         9.50,
         "tonno.png"
 ),

 VEGETARIA(
         "Vegetaria",
         "Tomatensauce, Mozzarella, Paprika, Champignons",
         10.50,
         "vegetaria.png"
 ),

 LAVA(
         "Lava",
         "Chilli, Zwiebeln, Paprika, Lammfleisch, Soja Sauce",
         98.50,
         "Lava.jpg"
 ),

 DOENER(
         "Kalbfleisch",
         "Tomatensauce, Kalbfleisch, Hollandaisesuace",
         12.50,
         "Dönerpizza.png"
 );

 public final String title, description, image;
 public final double price;

 Pizza(String t, String d, double p, String i) {
  title = t;
  description = d;
  price = p;
  image = i;
 }
}
