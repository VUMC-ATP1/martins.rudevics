package homework.opp_homework;

public class Customer {


    private static String name;
    private static boolean member = false;
    private String memberType;

    public Customer(String name) {
        this.name = name;
    }

    public static String getName() {
        return name;
    }

    public boolean isMember() {
        return member;
    }

    public static void setMember(boolean member) {
        Customer.member = member;
    }

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "memberType='" + memberType + '\'' +
                '}';
    }
}
