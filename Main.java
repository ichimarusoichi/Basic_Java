public class Main{

    public static void main(String[] args) {
        Employee e1=new Employee();
        e1.setID("1");
        e1.setName("Poob");
        e1.setSalary(10000.0);
        System.out.println(e1.getName());
        
        Employee e2=new Employee();
        e2.setID("2");
        e2.setName("Bas");
        e2.setSalary(15000.0);
        System.out.println(e2.getName());
    
    }
}