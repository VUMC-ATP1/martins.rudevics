package homework.opp_homework;


public class Visit {

    private Customer customer;
    private String date;
    private double serviceExpense;
    private double productExpense;

    public Visit(Customer customer, String date) {
        this.customer = customer;
        this.date = date;
    }

    public String getName() {
        return customer.getName();
    }

    public double getServiceExpense() {
        return serviceExpense;
    }

    public void setServiceExpense(double serviceExpense) {
        this.serviceExpense += serviceExpense;
    }

    public double getProductExpense() {
        return productExpense;
    }

    public void setProductExpense(double productExpense) {
        this.productExpense += productExpense;
    }

    public double getTotalExpense() {
        return ((serviceExpense - (serviceExpense * DiscountRate.getServiceDiscountRate(customer.getMemberType()))) +
                (productExpense - (productExpense * DiscountRate.getProductDiscountRate(customer.getMemberType()))));
    }

    @Override
    public String toString() {
        return "Visit{" +
                "customer=" + customer +
                ", date=" + date +
                ", serviceExpense=" + serviceExpense +
                ", productExpense=" + productExpense +
                '}';
    }
}
