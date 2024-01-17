//After java 8 --> lamda arrives

@FunctionalInterface
interface I1{

  void show();   

}



class FunctInterface4{
    public static void main(String args[]){
    I1 obj1 =() ->  System.out.println("This is the functional interface");
    obj1.show();


    }
}