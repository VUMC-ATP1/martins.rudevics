package homework.opp_homework;

public class Example {
    public static void main(String[] args) {

        // First customer, is Member , has Premium membership
        Customer customerFirst = new Customer("Martin");
        customerFirst.setMemberType("Premium");
        customerFirst.setMember(true);
        System.out.println("Customer name is - " + customerFirst.getName() + ", customers is a member - " + customerFirst.isMember() + ", he/she has " + customerFirst.getMemberType() + " membership");

        Visit visitFirsCustomerVisitor = new Visit(customerFirst, "2022/06/19");
        visitFirsCustomerVisitor.setProductExpense(75);
        visitFirsCustomerVisitor.setServiceExpense(50);

        System.out.println("Customer " + visitFirsCustomerVisitor.getName() + " spend in total in product and services: " + visitFirsCustomerVisitor.getTotalExpense() + " EUR");

        // Second customer, is Member , has Gold membership
        Customer customerSecond = new Customer("Pete");
        customerSecond.setMemberType("Gold");
        customerSecond.setMember(true);

        System.out.println("Customer name is - " + customerSecond.getName() + ", customers is a member - " + customerSecond.isMember() + ", he/she has " + customerSecond.getMemberType() + " membership");

        Visit visitSecondCustomerVisitor = new Visit(customerSecond, "2022/06/19");
        visitSecondCustomerVisitor.setProductExpense(75);
        visitSecondCustomerVisitor.setServiceExpense(50);

        System.out.println("Customer " + visitSecondCustomerVisitor.getName() + " spend in total in product and services: " + visitSecondCustomerVisitor.getTotalExpense() + " EUR");

        // Third customer, is Member , has Silver membership
        Customer customerThird = new Customer("April");
        customerThird.setMemberType("Silver");
        customerThird.setMember(true);

        System.out.println("Customer name is - " + customerThird.getName() + ", customers is a member - " + customerThird.isMember() + ", he/she has " + customerThird.getMemberType() + " membership");

        Visit visitThirdCustomerVisitor = new Visit(customerThird, "2022/06/19");
        visitThirdCustomerVisitor.setProductExpense(75);
        visitThirdCustomerVisitor.setServiceExpense(50);

        System.out.println("Customer " + visitThirdCustomerVisitor.getName() + " spend in total in product and services: " + visitThirdCustomerVisitor.getTotalExpense() + " EUR");

        // Fourth customer, is not Member , has NO membership
        Customer customerFourth = new Customer("Brenda");
        customerFourth.setMemberType("");
        customerFourth.setMember(false);

        System.out.println("Customer name is - " + customerFourth.getName() + ", customers is a member - " + customerFourth.isMember() + ", he/she has no membership");

        Visit visitFourthCustomerVisitor = new Visit(customerFourth, "2022/06/19");
        visitFourthCustomerVisitor.setProductExpense(75);
        visitFourthCustomerVisitor.setServiceExpense(50);

        System.out.println("Customer " + visitFourthCustomerVisitor.getName() + " spend in total in product and services: " + visitFourthCustomerVisitor.getTotalExpense() + " EUR");
    }
}
