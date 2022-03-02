
package herentzia.abstraktoak;

public abstract class Monster {
   // private instance variable
   private String name;

   /** Constructs a Monster instance with the given name */
   public Monster(String name) {
      this.name = name;
   }

   /** Defines a common behavior called attack() for all its subclasses */
   public abstract String attack(); 
}