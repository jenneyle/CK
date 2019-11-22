package com.example.ck;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class FlagItemAdapter extends RecyclerView.Adapter<FlagItemAdapter.FlagItemViewHolder> implements Filterable {

    private List<Country> countryList;
    private List<Country> countryListFull;

    public FlagItemAdapter(List<Country> countryList) {
        this.countryList = countryList;
        countryListFull = new ArrayList<>(countryList);

    }


    public FlagItemAdapter.FlagItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.country_flag_item, parent, false);
        final FlagItemAdapter.FlagItemViewHolder flagItemViewHolder = new FlagItemAdapter.FlagItemViewHolder(v);
        flagItemViewHolder.flag_flashcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), FlashCardActivity.class);
                i.putExtra("name", countryList.get(flagItemViewHolder.getAdapterPosition()).getName());
                i.putExtra("capital", countryList.get(flagItemViewHolder.getAdapterPosition()).getCapital());
                i.putExtra("population", countryList.get(flagItemViewHolder.getAdapterPosition()).getPopulation());
                i.putExtra("alpha2Code", countryList.get(flagItemViewHolder.getAdapterPosition()).getAlpha2Code());
                i.putExtra("continent", countryList.get(flagItemViewHolder.getAdapterPosition()).getContinent());
                i.putExtra("flag", countryList.get(flagItemViewHolder.getAdapterPosition()).getFlag());
                i.putExtra("subregion", countryList.get(flagItemViewHolder.getAdapterPosition()).getSubregion());
                i.putExtra("area", countryList.get(flagItemViewHolder.getAdapterPosition()).getArea());

                v.getContext().startActivity(i);
            }
        });
        return flagItemViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FlagItemAdapter.FlagItemViewHolder holder, int position) {
        holder.countryName.setText(countryList.get(position).getName());
        String imageUrl = "https://www.countryflags.io/" + countryList.get(position).getAlpha2Code() + "/shiny/64.png";
        Glide.with(holder.flag_flashcard.getContext()).load(imageUrl).into(holder.countryFlag);
        Country.countryList.addAll(countryList);

    }

    @Override
    public int getItemCount() {
        return countryList.size();
        // notifyDataSetChanged();
    }

    @Override
    public Filter getFilter() {


        return countryFlagFilter;
    }
    private Filter countryFlagFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<Country> filteredList = new ArrayList<>();

            if (constraint == null || constraint.length() == 0){
                filteredList.addAll(countryListFull);
            } else {
                String filterPattern = constraint.toString().toLowerCase().trim();
                for (Country item : countryListFull){
                    if (item.getName().toLowerCase().contains(filterPattern)){
                        filteredList.add(item);
                    }
                }
            }
            FilterResults results = new FilterResults();
            results.values = filteredList;

            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            countryList.clear();
            countryList.addAll((List) results.values);
            notifyDataSetChanged();

        }
    };

    public static class FlagItemViewHolder extends RecyclerView.ViewHolder {
        public TextView countryName;
        private ImageView countryFlag;
        private View flag_flashcard;

        public FlagItemViewHolder(@NonNull View itemView) {
            super(itemView);
            flag_flashcard = itemView.findViewById(R.id.flag_flashcard);
            countryName = itemView.findViewById(R.id.countryname);
            countryFlag = itemView.findViewById(R.id.countryflag);

        }
    }
}