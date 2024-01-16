package com.joincoded.banckaccount.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.joincoded.banckaccount.R;
import com.joincoded.banckaccount.accountData.TransactionDetails;

import java.util.ArrayList;

public class TransactionAdapter extends RecyclerView.Adapter<TransactionAdapter.TransactionHolder>{
    ArrayList<TransactionDetails> transactionDetails;
    public TransactionAdapter(ArrayList<TransactionDetails> transactionDetails) {
        this.transactionDetails = transactionDetails;
    }

    @NonNull
    @Override
    public TransactionHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.transaction_details_layout,parent ,false);

        return new TransactionHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TransactionHolder holder, int position) {
        TransactionDetails transactionDetailsData = transactionDetails.get(position);
        holder.idTextView.setText(String.valueOf(transactionDetails.get(position).getId()));
        holder.typeTextView.setText(String.valueOf(transactionDetails.get(position).getType()));
        holder.dateTextView.setText(String.valueOf(transactionDetails.get(position).getDate() ));
        holder.amountTextView.setText(String.valueOf(transactionDetails.get(position).getAmount() ));
        holder.balanceTextView.setText(String.valueOf(transactionDetails.get(position).getBalance() ));
        holder.accountTextView.setText(String.valueOf(transactionDetails.get(position).getAccount()));

    }

    @Override
    public int getItemCount() {
        return transactionDetails.size() ;
    }
    public static class TransactionHolder extends  RecyclerView.ViewHolder {
        TextView idTextView;
        TextView accountTextView;
        TextView dateTextView;
        TextView amountTextView;
        TextView balanceTextView;
        TextView typeTextView;



        public TransactionHolder(@NonNull View itemView) {
            super(itemView);

            idTextView = itemView.findViewById(R.id.transactionIdtextView);
            typeTextView = itemView.findViewById(R.id.typetextView2);
            dateTextView = itemView.findViewById(R.id.datetextView3);
            amountTextView = itemView.findViewById(R.id.amount_textView4);
            balanceTextView =itemView.findViewById(R.id.balance_textView5 );
            accountTextView = itemView.findViewById(R.id.account_textView6);


        }
    }
}
