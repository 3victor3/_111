package how2j_object;

public class Weapon extends Item{
    int damage;

    public static void main(String[] args) {
        Weapon infinityEdge = new Weapon();
        infinityEdge.damage = 65;
        infinityEdge.name = "wujin";
        infinityEdge.price = 3600;
        System.out.println();
    }

}
