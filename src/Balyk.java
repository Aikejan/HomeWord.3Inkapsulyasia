public class Balyk {
    private  int age;
    private String color;
    private boolean fealse;
    private  int calmahy;

    public Balyk(int age, String color, boolean fealse, int calmahy) {
        this.age = age;
        this.color = color;
        this.fealse = fealse;
        this.calmahy = calmahy;
    }

    public int getCalmahy() {
        return calmahy;
    }

    public void setCalmahy(int calmahy) {
        this.calmahy = calmahy;
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

    public boolean isCalmagy() {
        return fealse;
    }

    public void setCalmagy(boolean calmagy) {
        this.fealse = fealse;
    }

    @Override
    public String toString() {
        return "\nage: " + age +
                "\n color: " + color +
                " uy janybaryby: " + fealse+ "\n" + "calmagy: " + calmahy ;
    }
}
