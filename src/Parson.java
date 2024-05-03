public class Parson {
    private String name;
    private int age;


    public Parson(){
        name = "CSE";
        age = 30;
    }

    public Parson(String name, int age){
        this.name  = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
}
