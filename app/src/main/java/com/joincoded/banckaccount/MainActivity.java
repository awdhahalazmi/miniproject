package com.joincoded.banckaccount;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.joincoded.banckaccount.Adapter.TransactionAdapter;
import com.joincoded.banckaccount.Repo.TransactionRepo;
import com.joincoded.banckaccount.TransactionInterface.TransactionClickListner;
import com.joincoded.banckaccount.accountData.Transaction;

public class MainActivity extends AppCompatActivity implements TransactionClickListner {
    RecyclerView RecyclerViewTransaction;

public static final String TRANSACTION_KEY ="Transaction";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getSupportActionBar().setTitle("Transactions");



        RecyclerViewTransaction = findViewById(R.id.RecyclerViewTransaction);
        RecyclerViewTransaction.setLayoutManager(new LinearLayoutManager(this));
        TransactionAdapter transactionAdapt = new TransactionAdapter(TransactionRepo.getInstance().dummyData(1), this);

        RecyclerViewTransaction.setAdapter(transactionAdapt);


    }

    @Override
    public void onDetailClicked(Transaction transaction) {
        Intent intent = new Intent(MainActivity.this, TransactionDetailActivity.class);
        intent.putExtra(TRANSACTION_KEY, transaction);
        startActivity(intent);
    }


}


