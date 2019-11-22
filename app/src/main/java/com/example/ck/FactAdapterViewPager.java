package com.example.ck;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class FactAdapterViewPager extends PagerAdapter {
    private LayoutInflater layoutInflater;
    Context context;
    Facts[] factList;

    public FactAdapterViewPager(Context context, Facts[] factList) {
        this.context = context;
        this.factList = factList;
    }

    @Override
    public int getCount() {
        return factList.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.fact_item, container, false);
        TextView factCountry;
        TextView factText;
        ImageView factImage;

        factCountry = view.findViewById(R.id.dash_country_name);
        factText = view.findViewById(R.id.dash_country_fact);
        factImage = view.findViewById(R.id.dash_country_image);

        factCountry.setText(factList[position].getDash_country_name());
        factImage.setImageResource(factList[position].getDash_country_image());
        factText.setText("Did you know that " + factList[position].getDash_country_fact());

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }


}