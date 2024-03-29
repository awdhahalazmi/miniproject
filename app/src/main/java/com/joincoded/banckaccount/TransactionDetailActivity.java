package com.joincoded.banckaccount;


import static com.joincoded.banckaccount.MainActivity.TRANSACTION_KEY;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.joincoded.banckaccount.accountData.Transaction;

public class TransactionDetailActivity extends AppCompatActivity {


    private TextView id;
    private TextView type;
    private TextView date;
    private TextView amount;
    private TextView balance;
    private TextView account;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.transaction_details_layout);

        Transaction transactionname = getIntent().getSerializableExtra(TRANSACTION_KEY, Transaction.class);

        type = findViewById(R.id.typetextView);
        date = findViewById(R.id.datetextView);
        amount = findViewById(R.id.amount_textView);
        balance = findViewById(R.id.balance_textView);
        account = findViewById(R.id.account_textView);


        type.setText(String.valueOf(transactionname.getType()));

        date.setText(String.valueOf(transactionname.getDate()));

        amount.setText("Amount: " + String.valueOf(transactionname.getAmount()) + " KWD");
        balance.setText("Total Balance: \n" + String.valueOf(transactionname.getBalance()) + " KWD");
        account.setText("Account Number: " + String.valueOf(transactionname.getAccount()));


    }
}

