package book.Chapter_fourteen;

public class Emp {
    private String e_id;
    private String e_name;
    public Emp(String e_id, String e_name){
        this.e_id = e_id;
        this.e_name = e_name;
    }
    //省略了属性的set和get方法
    public String setId(String e_id){
         return this.e_id = e_id;
    }

    public String getId(){
        return e_id;
    }

    public String getName(){
        return e_name;
    }

    public String setName(String e_name){
        return this.e_name = e_name;
    }

}
