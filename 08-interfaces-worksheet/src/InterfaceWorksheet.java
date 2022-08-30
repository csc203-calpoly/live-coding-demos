import java.util.ArrayList;
import java.util.List;

public class InterfaceWorksheet {

    public static void main(String[] args) {
        Movable movable = new Potion("asdasd"); 

        worksheet(movable, null, null, new Potion("sadsa"));
    }

    public static void worksheet(Movable movable, Weapon weapon, Sword sword, Potion potion) {
        // potion.mix((Potion) movable);

 //       sword = weapon;

//        weapon = new Sword();

//        weapon = (Sword) potion;

//        weapon.sharpen();

        ((Sword) movable).sharpen();

//        movable = sword;

//        potion.mix(movable);

//        movable = new Weapon();

//        sword.strike();
    }
}
