package book.Chapter_sixteen;

public class Example_01 {
    String S;
    int a,b,c;

    private Example_01(){
        //
    }

    protected Example_01(String s, int a){
        this.S = s;
        this.a = a;
    }

    public Example_01(String... strings)throws NumberFormatException{
        if (0<strings.length){
            a = Integer.valueOf(strings[0]);
        }
        if (1<strings.length){
            b = Integer.valueOf(strings[1]);
        }
        if (2<strings.length){
            c = Integer.valueOf(strings[2]);
        }
    }
    public void print(){
        System.out.println("s="+S);
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }
}
