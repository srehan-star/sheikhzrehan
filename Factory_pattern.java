//Factory Pattern

//FirstShipTesting

package factory;

import java.util.Scanner;

 

public class FirstShipTesting {

 

    public static void main(String[] args){

         


        FirstShipFactory shipFactory = new FirstShipFactory();

   
         

        FirstShip theFirst = null;

         

        Scanner userInput = new Scanner(System.in);

         

        System.out.print("What type of ship? (U / R / B)");

         

        if (userInput.hasNextLine()){

             
            String typeOfShip = userInput.nextLine();

         

            theFirst = shipFactory.makeFirstShip(typeOfShip);

             

            if(theFirst != null){

                
                doStuffFirst(theFirst);

            } else System.out.print("Please enter U, R, or B next time");
        }
        
    }
    public static void doStuffFirst(FirstShip anFirstShip){
        anFirstShip.displayFirstShip();
        anFirstShip.followHeroShip();
        anFirstShip.FirstShipShoots();
    }

}

//BigUFOFirstShip
package factory;

public class BigUFOFirstShip extends UFOFirstShip {

     

    public BigUFOFirstShip(){

         

        setName("Big UFO First Ship");

         

        setDamage(40.0);

         

    }

     

}

//FirstShip

package factory;

public class FirstShip {



private String name;
   private double speed;
   private double directionX;
   private double directionY;
   private double amtDamage;
   public String getName() { return name; }
   public void setName(String newName) { name = newName; }
   public double getDamage() { return amtDamage; }
   public void setDamage(double newDamage) { amtDamage = newDamage; }
   public void followHeroShip(){
       System.out.println(getName() + " is following the hero");
   }
   public void displayFirstShip(){
       System.out.println(getName() + " is on the screen");

   }

   public void FirstShipShoots() {

       System.out.println(getName() + " attacks and does " + getDamage() + " damage to hero");

   }
public double getDirectionX() {
	return directionX;
}
public void setDirectionX(double directionX) {
	this.directionX = directionX;
}
public double getSpeed() {
	return speed;
}
public void setSpeed(double speed) {
	this.speed = speed;
}
public double getDirectionY() {
	return directionY;
}
public void setDirectionY(double directionY) {
	this.directionY = directionY;
}

}

//FirstShipFactory 


package factory;

 

public class FirstShipFactory{

    
     

    public FirstShip makeFirstShip(String newShipType){

         

        FirstShip newShip = null;

         

        if (newShipType.equals("U")){

             

            return new UFOFirstShip();

             

        } else

         

        if (newShipType.equals("R")){

             

            return new RocketFirstShip();

             

        } else

         

        if (newShipType.equals("B")){

             

            return new BigUFOFirstShip();

             

        } else return null;

         

    }

     

}

//RocketFirstShip 

package factory;

public class RocketFirstShip extends FirstShip {
    public RocketFirstShip(){
        setName("Rocket First Ship");
        setDamage(10.0);

    }
}

UFOFirstShip
package factory;

public class UFOFirstShip extends FirstShip {
    public UFOFirstShip(){
        setName("UFO First Ship");
        setDamage(20.0);

    }

}


