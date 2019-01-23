package how2j_object;

public class ADHero extends Hero {
    public void attack(){
        System.out.println(name + "进行了一次攻击但是不知道打谁");
    }

    public void attack(Hero...heroes){
        for(int i = 0;i < heroes.length;i++){
            System.out.println(name + "攻击了" +heroes[i].name);
        }
    }

    public static void main(String[] args) {
        ADHero bh = new ADHero();
        bh.name = "赏金猎人";

        Hero h1 = new Hero();



    }
}
