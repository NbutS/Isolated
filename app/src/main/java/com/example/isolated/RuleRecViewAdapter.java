package com.example.isolated;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RuleRecViewAdapter extends  RecyclerView.Adapter<RuleRecViewAdapter.ViewHolder>{
    private static final String TAG = "RuleRecViewAdapter";
    private ArrayList<Rule> rules = new ArrayList<>();
    private Context mContext;

    public RuleRecViewAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {




        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.file_list,parent,false);
        //ViewHolder holder = new ViewHolder(view);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder,  int position) {
        Log.d(TAG,"onBindViewHolder: Call");
        holder.txtName.setText(rules.get(position).getName());
        Glide.with(mContext)
                .asBitmap()
                .load(rules.get(position).getImgUrl())
                .into(holder.imgRule);

    }

    @Override
    public int getItemCount() {
        return rules.size();
    }


    public void setRules(ArrayList<Rule> rules) {
        this.rules = rules;
        notifyDataSetChanged();

    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        private CardView parent;
        private ImageView imgRule;
        private TextView txtName;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            parent = itemView.findViewById(R.id.parent);
            imgRule = itemView.findViewById(R.id.imgRule);
            txtName = itemView.findViewById(R.id.txtName);
        }
    }
}
