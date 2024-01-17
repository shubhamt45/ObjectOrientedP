//before java 8

@FunctionalInterface
interface I1{

  void show();   

}



class FunctInterface3{
    public static void main(String args[]){
    I1 obj1 =new I1(){

      public void show(){
          System.out.println("This is the functional interface");
      }
  
   };
    obj1.show();
    }
}