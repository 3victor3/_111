package how2j_object;

public class Hero {
    String name;
    float hp;
    float armor;
    int moveSpeed;

    public static void Print(Hero a){
        System.out.println("name:"+a.name);
        System.out.println("hp:"+a.hp);
        System.out.println("armor:"+a.armor);
        System.out.println("moveSpeed:"+a.moveSpeed);
    }

    void keng(){
        System.out.println("坑队友");
    }

    void legendary(){
        System.out.println("legendary");
    }

    float getHp(){
        return hp;
    }

    float getArmor(){
        return armor;
    }

    void recovery(float blood){
        System.out.println("本次恢复血量"+blood);
    }

    void addSpeed(int speed){
        moveSpeed = moveSpeed + speed;
    }

    public static void main(String[] args) {
        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.hp = 616.28f;
        garen.armor = 27.536f;
        garen.moveSpeed = 350;
        
        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;

//        Print(teemo);
        garen.getArmor();
        garen.addSpeed(100);
        Print(garen);
    }
}
