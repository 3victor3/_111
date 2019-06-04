package book.Chapter_sixteen;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import com.sun.xml.internal.ws.server.provider.SyncProviderInvokerTube;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main_record {
    public static void main(String[] args) {
        Record record = new Record();
        Class recordC = record.getClass();//获得类名

        Constructor[] declaredConstructor = recordC.getDeclaredConstructors();
        for (int i=0; i<declaredConstructor.length; i++){
            Constructor constructor = declaredConstructor[i];//遍历所有的构造器
            if (constructor.isAnnotationPresent(Constructor_Annotation.class)){//构造器是否有指定类型的注解
                //获得指定类型的注解
                Constructor_Annotation ca = (Constructor_Annotation)constructor.getAnnotation(Constructor_Annotation.class);
                System.out.println(ca.value());
            }
            Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();//
            for (int j=0; j<parameterAnnotations.length; j++){//获得指定参数注释的长度
                int length = parameterAnnotations[j].length;
                if (length==0)//长度为零则没有注释
                    System.out.println("未添加Annotation的参数");
                else
                    for (int k=0; k<length; k++){
                        Field_Method_Parameter_Annotation pa = (Field_Method_Parameter_Annotation)parameterAnnotations[j][k];//获得参数的注释
                        System.out.println("   "+pa.describe());//获得参数描述
                        System.out.println("   "+pa.type());//获得参数类型
                    }
            }
            System.out.println();
        }

        Field[] declaredFields = recordC.getDeclaredFields();//获得所有字段
        for (int i=0; i<declaredFields.length; i++){
            Field field = declaredFields[i];//遍历字段
            //查看是否具有指定类型的注释
            if (field.isAnnotationPresent(Field_Method_Parameter_Annotation.class)){
                Field_Method_Parameter_Annotation fa = field.getAnnotation(Field_Method_Parameter_Annotation.class);
                System.out.println("   "+fa.describe());//获得方法的描述
                System.out.println("   "+fa.type());//获得方法的返回值类型
            }
            System.out.println();
        }

        Method[] declaredMethods = recordC.getDeclaredMethods();//
        for (int i=0; i<declaredMethods.length; i++){
            Method method = declaredMethods[i];//
            if (method.isAnnotationPresent(Field_Method_Parameter_Annotation.class)){//
                Field_Method_Parameter_Annotation ma = method.getAnnotation(Field_Method_Parameter_Annotation.class);
                System.out.println("   "+ma.describe());
                System.out.println("   "+ma.type());
            }
            Annotation[][] parameterAnnotations = method.getParameterAnnotations();//
            for (int j=0; j<parameterAnnotations.length; j++){
                int length = parameterAnnotations.length;
                if (length==0)
                    System.out.println("未添加annotation的参数");
                else
                    for (int k=0; k<length; k++){
                        Field_Method_Parameter_Annotation pa = (Field_Method_Parameter_Annotation)parameterAnnotations[j][k];//
                        System.out.println("  "+pa.describe());//
                        System.out.println("  "+pa.type());//
                    }
            }
            System.out.println();
        }
    }
}
