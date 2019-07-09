package exercise;

public class InfixToSuffix {
    private MyCharStack s1;//
    private MyCharStack s2;//
    private String input;

    //
    public InfixToSuffix(String in) {
        input = in;
        s1 = new MyCharStack(input.length());
        s2 = new MyCharStack(input.length());
    }

    //
    public MyCharStack doTrans() {
        for (int j = 0; j < input.length(); j++) {
            System.out.println("s1栈元素为：");
            s1.displayStack();
            System.out.println("s2栈元素为：");
            s2.displayStack();
            char ch = input.charAt(j);
            System.out.println("解析当前的字符" + ch);
            switch (ch) {
                case '+':
                case '-':
                    gotOper(ch, 1);
                    break;
                case '*':
                case '/':
                    gotOper(ch, 2);
                    break;
                case '(':
                    s1.push(ch);//
                    break;
                case ')':
                    gotParen(ch);
                    break;
                default:
                    //
                    //
                    s2.push(ch);
                    break;
            }//
        }//

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        return s2;
    }

    public void gotOper(char opThis, int perc1) {
        while (!s1.isEmpty()) {
            char opTop = s1.pop();
            if (opTop == '(') {//
                s1.push(opTop);
                break;
            } else {
                int perc2;
                if (opTop == '+' || opTop == '-') {
                    perc2 = 1;
                } else {
                    perc2 = 2;
                }
                if (perc2 < perc1) {
                    s1.push(opTop);
                    break;
                } else {//
                    s2.push(opTop);
                }
            }

        }//
        //
        s1.push(opThis);
    }

    //
    public void gotParen(char ch){
        while (!s1.isEmpty()){
            char chx = s1.pop();
            if (chx == '('){
                break;
            }else {
                s2.push(chx);
            }
        }
    }
}
