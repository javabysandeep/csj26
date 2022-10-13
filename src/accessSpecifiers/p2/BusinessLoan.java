package accessSpecifiers.p2;

import accessSpecifiers.p1.Loan;

public class BusinessLoan extends Loan {
    public static void main(String[] args) {
        Loan loan = new Loan();
//        System.out.println(loan.a);
        System.out.println(loan.b);
       // System.out.println(loan.c);
//        System.out.println(loan.d);

        BusinessLoan businessLoan = new BusinessLoan();
//        System.out.println(businessLoan.a);//private
        System.out.println(businessLoan.b);//public
        System.out.println(businessLoan.c);
//        System.out.println(businessLoan.d);//default
    }
}
