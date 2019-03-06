package com.marion;

public class Strings2 {
    public static void main(String[] args) {
        String mpesa="NBS12MTPK confirmed.Ksh 60000.00 sent to Tom Matista +254723456789 on 28/2/2019 at 6:10pm.New M-PESA balance is Ksh 3400.Transaction cost,Ksh 15.00";

    int pos_ksh =mpesa.indexOf("Ksh");
    int pos_sent = mpesa.indexOf("sent");
    String amount =mpesa.substring(pos_ksh,pos_sent);
        System.out.println(amount);

        int pos_name=mpesa.indexOf( " on ") +3;
        int pos_at = mpesa.indexOf(" at ");
        String date=mpesa.substring(pos_name,pos_at);
        System.out.println(date);

        int pos_amount =mpesa.indexOf(" is ") + 3;
        int pos_stop= mpesa.indexOf("Transaction")-1;
        String balance =mpesa.substring(pos_amount,pos_stop);
        System.out.println(balance);



    }
}
