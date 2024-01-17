
@FunctionalInterface
interface I1{

  void show();   

}
 class Abc implements I1{

    public void show(){
        System.out.println("This is the functional interface");
    }

 }


class FunctInterface{
    public static void main(String args[]){
    Abc obj1 =new Abc();
    obj1.show();
    }
}