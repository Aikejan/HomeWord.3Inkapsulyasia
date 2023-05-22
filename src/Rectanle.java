import java.util.Scanner;

public class Rectanle {
    private  int lenght;
    private  int burstLenght;

    public Rectanle(int lenght, int burstLenght) {
        this.lenght = lenght;
        this.burstLenght = burstLenght;
    }

    public int getLenght() {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int a = sc.nextInt();
        return s+a;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getBurstLenghnt( ) {
        Scanner sc = new Scanner(System.in);
      int w =  sc.nextInt();
      int f = sc.nextInt();
        return w - f ;
    }

    public void setBurstLenght(int burstLenght) {
        this.burstLenght = burstLenght;
    }


}
