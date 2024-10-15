public class Tulostin {
    public static void main(String[] args) {
        
        String tekija = "Kalle"; 

        
        double luku1 = 5;
        double luku2 = 2;

        
        double tulo;
        double erotus;
        double summa;
        double jako;

         
         System.out.println("Hei olen Tulostin-ohjelma");

         
         System.out.print("Ohjelman tekijä: ");
         System.out.println(tekija);
 
         System.out.println("Luku1-muuttujan arvo on " + luku1);
 
       
         System.out.println("Luku2-muuttujan arvo on " + luku2);
 
        
         tulo = luku1 * luku2;

        System.out.println(luku1 + " * " + luku2 + " = " + tulo);

        summa = luku1 + luku2;
        erotus = luku1 - luku2;
        jako = luku1 / luku2;

        System.out.println(luku1 + " + " + luku2 + " = " + summa);

        System.out.println(luku1 + " - " + luku2 + " = " + erotus);

        System.out.println(luku1 + " / " + luku2 + " = " + jako);
    }

}



