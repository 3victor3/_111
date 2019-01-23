package how2j_object;

public class Item {
    String name;
    int price;

    public static void main(String[] args) {
        Item blood_vial = new Item();
        blood_vial.name = "xueping";
        blood_vial.price = 50;
        System.out.println(blood_vial.name+"____"+blood_vial.price);
        System.out.println(blood_vial.name+"____"+blood_vial.price);
        System.out.println(blood_vial.name+"____"+blood_vial.price);

        Item shoes = new Item();
        shoes.name = "caoxie";
        shoes.price = 300;

        Item yataghan = new Item();
        yataghan.name = "长剑";
        yataghan.price = 350;


    }
}
