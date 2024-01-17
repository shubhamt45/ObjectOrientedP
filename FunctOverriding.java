
class Company{
    String name;
  

    public void Organization1(String name){
        this.name = name;
    }
    public void print1(){
    System.out.println(name);
    
}

}

class Microsoft extends Company{
int rank;

public void Organization(String name){
this.name = name;

}

public void print(){
    System.out.println(name);
  
}


}




class FunctOverriding{

    public static void main(String args[]){
    Microsoft m1 = new Microsoft();
    m1.Organization("Apple");
    m1.print();

    Company c1 = new Company();
    m1.Organization1("shubtech");
    m1.print1();
    }

    
}