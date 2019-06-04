package book.Chapter_sixteen;

import java.lang.reflect.Method;

public class Main_03 {
    public static void main(String[] args) {
        Example_03 example03 = new Example_03();
        Class example03C = example03.getClass();
        //获得example_03的所有方法
        Method[] declaredMethods = example03C.getDeclaredMethods();
        for (int i=0; i<declaredMethods.length; i++){
            Method method = declaredMethods[i];
            System.out.println("方法名称为"+method.getName());
            System.out.println("方法是否允许带有可变数量的参数"+method.isVarArgs());
            System.out.println("参数入口类型依次为：");
            //
            Class[] parameterTypes = method.getParameterTypes();
            for (int j=0; j<parameterTypes.length; j++){
                System.out.println(parameterTypes[j]);
            }
            //
            System.out.println("返回值类型为："+method.getReturnType());
            //
            System.out.println("可能抛出的异常有");
            Class[] exceptionTypes = method.getExceptionTypes();
            for (int j=0; j<exceptionTypes.length; j++){
                System.out.println(exceptionTypes[j]);
            }
            boolean isTurn = true;
            while (isTurn){//
                try{
                    isTurn = false;
                    if("staticMethod".equals(method.getName())){
                        method.invoke(example03);//
                    }else if ("publicMethod".equals(method.getName())){
                        System.out.println("返回值为"+method.invoke(example03,168));//
                    }else if ("protectedMethod".equals(method.getName())){
                        System.out.println("返回值为"+method.invoke(example03,"7",5));//
                    }else if ("privateMethod".equals(method.getName())){
                        Object[] parameters = new Object[]{new String[]{"M","W","Q"}};//
                        System.out.println("返回值为"+method.invoke(example03,parameters));
                    }
                }catch (Exception e){
                    System.out.println("在执行方法的时候抛出了异常，"+"执行方法");
                    method.setAccessible(true);
                    isTurn = true;
                }
            }
            System.out.println();
        }
    }
}
