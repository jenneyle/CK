package com.example.ck;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ck.R;

public class CountryItemAdapter extends RecyclerView.Adapter<CountryItemAdapter.CountryItemViewHolder> {

    /*private List<Country> countryList;
    private Context mContext;

    public CountryItemAdapter(List<Country> countryList, Context mContext) {
        this.countryList = countryList;
        this.mContext = mContext;
    }*/

    @NonNull
    @Override
    public CountryItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.country_name_item, parent, false);
        final CountryItemViewHolder countryItemViewHolder = new CountryItemViewHolder(v);
        countryItemViewHolder.view_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), FlashCardActivity.class);
                i.putExtra("name", Country.countryList.get(countryItemViewHolder.getAdapterPosition()).getName());
                i.putExtra("capital", Country.countryList.get(countryItemViewHolder.getAdapterPosition()).getCapital());
                i.putExtra("population", Country.countryList.get(countryItemViewHolder.getAdapterPosition()).getPopulation());
                i.putExtra("alpha2Code", Country.countryList.get(countryItemViewHolder.getAdapterPosition()).getAlpha2Code());
                i.putExtra("continent", Country.countryList.get(countryItemViewHolder.getAdapterPosition()).getContinent());
                i.putExtra("flag", Country.countryList.get(countryItemViewHolder.getAdapterPosition()).getFlag());
                v.getContext().startActivity(i);
            }
        });
        return countryItemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CountryItemViewHolder holder, int position) {
        holder.countryName.setText(Country.countryList.get(position).getName());

    }

    @Override
    public int getItemCount() {
        return Country.countryList.size();
        // notifyDataSetChanged();
    }

    public static class CountryItemViewHolder extends RecyclerView.ViewHolder {
        public TextView countryName;
        public TextView countryCapital;
        public TextView countryPopulation;
        public TextView countryContinent;
        public ImageView countryFlag;
        public LinearLayout view_container;

        public CountryItemViewHolder(@NonNull View itemView) {
            super(itemView);
            view_container = itemView.findViewById(R.id.view_container);
            countryName = itemView.findViewById(R.id.country_name_row_item);
            countryCapital = itemView.findViewById(R.id.country_population);
            countryPopulation = itemView.findViewById(R.id.country_population);
            countryContinent = itemView.findViewById(R.id.country_continent);
            countryFlag = itemView.findViewById(R.id.country_flag);

        }
    }
}

