package oops.inheritance;

public class Demo{
    public static void main(String[] args) {
        BusinessLoan businessLoan = new BusinessLoan();

        businessLoan.loanId = 101;
        businessLoan.loanAmount = 1000;

        System.out.println(businessLoan.loanId);
        System.out.println(businessLoan.loanAmount);

    }
}
