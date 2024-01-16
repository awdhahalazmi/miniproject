package com.joincoded.banckaccount;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.joincoded.banckaccount.Adapter.TransactionAdapter;
import com.joincoded.banckaccount.Repo.TransactionRepo;
import com.joincoded.banckaccount.accountData.TransactionDetails;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView RecyclerViewTransaction;
    ArrayList<TransactionDetails> transactionDetails;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        transactionDetails = TransactionRepo.getInstance().dummyData(1);

        RecyclerViewTransaction = findViewById(R.id.RecyclerViewTransaction);
        RecyclerViewTransaction.setLayoutManager(new LinearLayoutManager(this));
        TransactionAdapter transactionAdapt = new TransactionAdapter(transactionDetails);
        RecyclerViewTransaction.setAdapter(transactionAdapt);
    }
}