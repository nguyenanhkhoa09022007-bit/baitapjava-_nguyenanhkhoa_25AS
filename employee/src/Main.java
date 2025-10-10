public class Main {
    public static  void  main(String[] args){
        Employee e1 = new Employee(8,"peter","tan",300);
        System.out.println(e1);
        System.out.println("id la " + e1.getId());
        System.out.println("ten la " + e1.getFirstname());
        System.out.println("họ la " + e1.getLatename());
        System.out.println("tien luong " + e1.getSalary());

        System.out.println("ten la " + e1.getName());
        System.out.println("luong hang nam "+ e1.getAnnualsalary());

        // kiem tra tien
        System.out.println(e1.raisesalary(10));
        System.out.println(e1);

    }
}
