public class Driver {
    public static void main(String[] args){

        SalesPerson[] salesPeople = new SalesPerson[10];

        salesPeople[0] = new SalesPerson("100");

        salesPeople[1] = new SalesPerson("101");

        salesPeople[2] = new SalesPerson("102");

        salesPeople[0].setSalesHistory(new Sales("A100",300.00,10));

        salesPeople[0].setSalesHistory(new Sales("A200",1000.00,2));

        salesPeople[1].setSalesHistory(new Sales("A300",2550.40,10));

        System.out.println(salesPeople[2].getId());

        System.out.println(salesPeople[0].getCount());

        System.out.println(salesPeople[1].getSalesHistory(0).getValue());

        System.out.println(salesPeople[0].calcTotalSales());

        String highestSalesPersonId = highest(salesPeople);
        System.out.println("Salesperson with highest sales: " + highestSalesPersonId);

        Sales newSale = new Sales("A400", 500.50, 5);
        System.out.println(addSales(newSale, "100", salesPeople));

//        if (saleAdded) {
//            System.out.println("Sale added successfully");
//        } else {
//            System.out.println("Failed to add sale");
//        }
    }
    public static String highest(SalesPerson[] salesPeople) {
        String index = salesPeople[0].getId();
        double maxSales = salesPeople[0].calcTotalSales();
        for (int i = 1; i < salesPeople.length; i++) {
            SalesPerson person = salesPeople[i];
            if (person == null) {
                continue; // Skip null objects
            }
            double sales = person.calcTotalSales();
            if (sales > maxSales) {
                maxSales = sales;
                index = person.getId();
            }
        }
        return index;
    }

    public static boolean addSales(Sales sale, String id, SalesPerson[] salesPeople) {
        for (SalesPerson person : salesPeople) {
            if (person != null && person.getId().equals(id)) {
                person.setSalesHistory(sale);
                return true;
            }
        }
        return false;
    }
}
