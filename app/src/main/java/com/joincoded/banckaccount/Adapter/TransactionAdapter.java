package com.joincoded.banckaccount.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.joincoded.banckaccount.R;
import com.joincoded.banckaccount.TransactionInterface.TransactionClickListner;
import com.joincoded.banckaccount.accountData.Transaction;

import java.util.ArrayList;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.TransactionHolder> {
    private static ArrayList<Transaction> transactionDetails;

    private static TransactionClickListner transactionClickListner;

    public TransactionAdapter(ArrayList<Transaction> transactionDetails, TransactionClickListner transactionClickListner) {
        this.transactionDetails = transactionDetails;
        this.transactionClickListner = transactionClickListner;
    }

    @NonNull
    @Override
    public TransactionHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        TransactionHolder holder = new TransactionHolder(view);


        return new TransactionHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionHolder holder, int position) {


        holder.transactionTextView.setText(String.valueOf(transactionDetails.get(position).getType()));
        holder.amountTextView.setText(String.valueOf(transactionDetails.get(position).getAmount()) + " KWD");

    }

    @Override
    public int getItemCount() {
        return transactionDetails.size();
    }

    public static class TransactionHolder extends RecyclerView.ViewHolder {


        TextView amountTextView;

        TextView transactionTextView;


        public TransactionHolder(@NonNull View itemView) {
            super(itemView);
            itemView.setOnClickListener(v -> {
                transactionClickListner.onDetailClicked(transactionDetails.get(getAdapterPosition()));


            });

            transactionTextView = itemView.findViewById(R.id.transactionTextView);
            amountTextView = itemView.findViewById(R.id.amount_textView);


        }
    }

}

