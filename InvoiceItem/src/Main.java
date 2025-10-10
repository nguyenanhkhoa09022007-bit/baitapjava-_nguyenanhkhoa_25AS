public class Main {
    public static void main(String[] args){
        InvoiceItem item1 = new InvoiceItem("A101", "Bút đỏ", 888, 2000);
        System.out.println(item1);

        // Bộ thiết lập và bộ lấy thử nghiệm
        item1.setQty(999);
        item1.setUnitPrice(0.99);
        System.out.println(item1);   // toString();
        System.out.println("id là: " + item1.getId());
        System.out.println("desc là: " + item1.getDesc());
        System.out.println("số lượng là: " + item1.getQty());
        System.out.println("unitPrice là: " + item1.getUnitPrice());

        // Kiểm tra getTotal()
        System.out.println("Tổng số là: " + item1.getTotal());
    }
}