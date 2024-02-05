public class Animal 
{ 
   // code here 
   public void greet(Animal a) 
   { 
      System.out.println("Sniffff"); 
   } 
   public static void main(String[] args)
   {
      Mammal rex = new Cat(); 
      Cat fuzzy = new Cat();
      
      rex.greet(fuzzy);
      fuzzy.greet(rex);
      

   }
}