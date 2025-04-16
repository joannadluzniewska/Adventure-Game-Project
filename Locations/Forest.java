package Project.Locations;
import Project.Items.Item;
import Project.Items.Weapon;
import Project.Items.Consumable;
import Project.Characters.Enemy;

public class Forest<T> extends Location<T> {
    public Forest() {
        super("Dark Forest");

        for (int i = 0; i < (Math.random() * 2) + 1; i++) {
            Item<?> randomWeapon = Weapon.getRandomWeapon();
            Item<?> randomConsumable = Consumable.getRandomCons();

            //zeby się nie powtarzały
            if (!this.getItems().contains(randomWeapon)) {
                this.addItem(randomWeapon);
            }
            if (!this.getItems().contains(randomConsumable)) {
                this.addItem(randomConsumable);
            }
        }

        this.addCharacter(new Enemy("Dragon", 50));  // Dragon blokuje path
        this.addCharacter(new Enemy("Old Wizard", 30));  // Wizard oferuje treasure chest
    }
}



/*
package Project.Locations;

import Project.Items.Consumable;
import Project.Items.Weapon;

public class Forest<T> extends Location<T> {
    public Forest() {
        super("Forest");

        int numItems = 1 + (int)(Math.random() * 2); // 1 or 2
        for (int i = 0; i < numItems; i++) {
            this.addItem(Consumable.getRandomCons());
            this.addItem(Weapon.getRandomWeapon());
        }
    }
}
*/


/*package Project.Locations;

import Project.Items.Consumable;
import Project.Items.Weapon;

public class Forest<T> extends Location<T> {

    public Forest() {
        for (int i = 0; i < (Math.random() * 2) + 1; i++) {
            this.addItem(Consumable.getRandomCons());
            this.addItem(Weapon.getRandomWeapon());
        }
    }



    @Override
    public String getName(){
        return "Forest";
    }
}*/
