package com.joincoded.banckaccount.Repo;

import com.joincoded.banckaccount.accountData.TransactionDetails;
import com.joincoded.banckaccount.accountData.Type;

import java.util.ArrayList;

public class TransactionRepo {

    private static TransactionRepo instance;
    private TransactionRepo() {

    }


    public static TransactionRepo getInstance() {
        if (instance == null)
            instance = new TransactionRepo();
        return instance;
    }

    public ArrayList<TransactionDetails> dummyData(int numOFItem) {
        ArrayList<TransactionDetails> transactionDetails = new ArrayList<>();
        transactionDetails.add(new TransactionDetails(123,"456", Type.withdrawl,90,200,7));

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







