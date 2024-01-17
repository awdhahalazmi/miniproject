package com.joincoded.banckaccount.Repo;

import com.joincoded.banckaccount.accountData.Transaction;
import com.joincoded.banckaccount.accountData.Type;

import java.util.ArrayList;
import java.util.Date;

public class TransactionRepo {

    private static TransactionRepo instance;
    private TransactionRepo() {

    }


    public static TransactionRepo getInstance() {
        if (instance == null)
            instance = new TransactionRepo();
        return instance;
    }

    public ArrayList<Transaction> dummyData(int numOFItem) {
        ArrayList<Transaction> transactionDetails = new ArrayList<>();

        transactionDetails.add(new Transaction(123,00123,200,Type.WITHDRAWL,300.4,"2023,12,23"));
        transactionDetails.add(new Transaction(123,88779,2000.6,Type.DEPOSIT,3300.4,"2023,12,24"));
        transactionDetails.add(new Transaction(222,88779,100.6,Type.WITHDRAWL,3300.4,"2023,12,24"));
        transactionDetails.add(new Transaction(123,00123,3000.6,Type.DEPOSIT,5300.4,"2023,12,24"));

        return transactionDetails;



    }}


//dummy data for testing

//        for (int i = 0; i < 10; i++) {
//
//            String[] names = {"us dollar: ","euro: ","Japanese Yen: "};
//            Random randomNames = new Random();
//            int randomIndexNames = randomNames.nextInt(names.length);
//
//            String[] codes = {"USD","EUR","YEN"};
//            Random randomCodes = new Random();
//            int randomIndexCodes = randomNames.nextInt(codes.length);
//
//        //    currencyLists.add(new TransactionDetails(names[randomIndexNames],codes[randomIndexCodes] , 0.31*i));
//
//
//        }
//        return currencyLists;







