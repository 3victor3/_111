package book.Chapter_seventeen;

public class EnumIndexTest {
    enum Constants2{
        Constants_A("我是枚举成员A"),
        Constants_B("我是枚举成员B"),
        Constants_C("我是枚举成员C"),
        Constants_D(3);
        private String description;
        private int i = 4;
        private Constants2(){
            //
        }
        //
        private Constants2(String description){
            this.description = description;
        }
        private Constants2(int i){
            this.i = this.i+i;
        }

        public String getDescription() {
            return description;
        }

        public int getI() {
            return i;
        }
    }

    public static void main(String[] args) {
        for (int i=0; i<Constants2.values().length; i++){
            System.out.println(Constants2.values()[i]+"调用了description方法"+Constants2.values()[i].getDescription());
            System.out.println(Constants2.values()[i]+"调用了getI方法"+Constants2.values()[i].getI());
            System.out.println();
        }
    }
}
