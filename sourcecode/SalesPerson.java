public class SalesPerson {

    // Attributes (Each object contains details of one salesperson)
    private String id;

    private Sales[] salesHistory; // Details of the different sales

    private int count = 0; // Number of sales made

    // Constructor for a new salesperson
    public SalesPerson(String id){
        this.id = id;
        this.salesHistory = new Sales[100]; // Default size = 100
        this.count = 0;
    }

    // Constructor for a salesperson transferred (together with their sales details) from another branch
    public SalesPerson(String id, Sales[] s, int c){
        this.id = id;
        this.salesHistory = s;
        this.count = c;
    }

    // Methods
    public int getCount(){return count;}

    public String getId() {return id;}

    public void setSalesHistory(Sales s){
        salesHistory[count] = s;
        count++;
    }

    public Sales getSalesHistory(int i) {
        return salesHistory[i];
    }

    public double calcTotalSales(){
        // Calculates total sales for the salesperson
        double total = 0;
        for (Sales sale : salesHistory) {
            if (sale != null) {
                total += sale.getValue() * sale.getQuantity();
            }
        }
        return total;
    }

    public Sales largestSale(){
        // Calculates the sale with the largest value
        double total = 0;
        int index = 0;
        for (int i = 0; i < count; i++) {
            if (salesHistory[i].getValue() * salesHistory[i].getQuantity() > total) {
                total = salesHistory[i].getValue() * salesHistory[i].getQuantity();
                index = i - 1;
            }
        }
        return salesHistory[index];

    }

}
