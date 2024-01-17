



class Car{

int speed;

public void speed(int a){
    this.speed = a;
} 

}
class Supercar extends Car{

    String name;

    public void speed(int a,String n){
        this.speed = a;
        this.name = n;
    }

    public void showspeed(){
        System.out.println(speed);
        System.out.println(name);
    }

}

class Fun_Overloading{
    public static void main(String args[]){
        Supercar Jaguar = new Supercar();
        Jaguar.speed = 100;
        Jaguar.name = "x";

        Jaguar.showspeed();
    }
}