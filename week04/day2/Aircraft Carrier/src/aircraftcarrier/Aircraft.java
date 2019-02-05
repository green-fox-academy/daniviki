package aircraftcarrier;

import javax.xml.bind.SchemaOutputResolver;

public class Aircraft {
    String type;
    int currentAmmo;
    int maxAmmo;
    int baseDamage;

    public Aircraft() {
        currentAmmo = 0;
    }

    public int fight() {
        currentAmmo = 0;
        int damage = maxAmmo * baseDamage;
        return damage;
    }

    public int refill (int add) {
        int remainingAmmo = 0;
        remainingAmmo = add - maxAmmo;
        currentAmmo = add - remainingAmmo;
        System.out.println("Remaining ammo : " + remainingAmmo);
        return remainingAmmo;
    }

    public void getType() {
        System.out.println(type);
    }

    public void getStatus() {
        System.out.println("Type: " + type + ", Ammo: " + maxAmmo + ", Base Damage: " + baseDamage +
                ", All Damage: " + (baseDamage*maxAmmo));
    }

    public boolean isPriority() {
        if (type == "F35") {
            return true;
        }else {
            return false;
        }
    }
}
