public class Popugay {
    private int age;
    private String color;
    private  boolean fealsee;
    private int calmagy;

    public Popugay(int age, String color, boolean fealse, int calmagy) {
        this.age = age;
        this.color = color;
        this.fealsee = fealse;
        this.calmagy = calmagy;
    }

    public int getCalmagy() {
        return calmagy;
    }

    public void setCalmagy(int calmagy) {
        this.calmagy = calmagy;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }



    @Override
    public String toString() {
        return "\nage: " + age +
                "\n color: " + color +
                " \nuy janybaryby: : " + true +"\n" +
                "calmagy: " + calmagy;
    }
}
