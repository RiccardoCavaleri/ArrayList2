//creo una classe Students dichiarando il field con 'name' e 'age'
public class Students {
    private String name;
    private Integer age;
    //creo costruttore che inizializza 'name' e 'age'
    public Students (String name, Integer age){
        this.name = name;
        this.age = age;
    }
    //creo getter e setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    //faccio override to string
    @Override
    public String toString() {
        return "Students{" +
                "name= " + name +
                ", age=" + age +
                '}';
    }
}
