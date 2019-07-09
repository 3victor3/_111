package exercise;

public class CalSuffix {
    private MyIntStack stack;//定义一个方法内使用的栈
    private String input;//定义方法入口的参数

    public CalSuffix(String input){
        this.input = input;//入口参数传给方法
        stack = new MyIntStack(input.length());//初始化一个相应的栈
    }

     public int doCalc(){//计算方法
        int num1, num2, result;//定义操作数1,2和结果数result
        for (int i=0; i<input.length(); i++){//遍历整个栈
            char c = input.charAt(i);//charAt方法获取栈中对应的元素，是char类
            System.out.println("依次取出的char："+c);
            if (c>='0' && c<='9'){//如果c是一个数字，那么久将其压入栈中
                stack.push((int)(c-'0'));//将其转换成整数型
            }else {
                num2 = stack.pop();//弹出栈顶操作数
                num1 = stack.pop();
                switch (c){//如果判定c是一个符号
                    case '+':
                        result = num1+num2;
                        break;
                    case '-':
                        result = num1-num2;
                        break;
                    case '*':
                        result = num1*num2;
                        break;
                    case '/':
                        result = num1/num2;
                        break;
                    default:
                        result = 0;
                        break;
                }//
                stack.push(result);//将计算过的result在此加入栈中参与运算
            }//
        }//
         result = stack.pop();//最后的结果就是栈顶的元素
        return result;
     }

    public static void main(String[] args) {
        //infix:1*(2+3)-5/(2+3) = 4
        //
        CalSuffix cs = new CalSuffix("123+*523+/-");
        System.out.println(cs.doCalc());
    }
}
