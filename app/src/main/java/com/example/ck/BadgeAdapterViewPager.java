package com.example.ck;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.bumptech.glide.Glide;

import java.util.List;

public class BadgeAdapterViewPager extends PagerAdapter {

    private List<Badge> badgeList;
    private LayoutInflater layoutInflater;
    private Context context;
    private User currentUser;

    public BadgeAdapterViewPager(List<Badge> badgeList, Context context, User currentUser) {
        this.badgeList = badgeList;
        this.context = context;
        this.currentUser = currentUser;
    }


    @Override
    public int getCount() {
        return badgeList.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.badge_item, container, false);

        TextView badgeName;
        ImageView badgeImage;
        TextView badgeDesc;

        badgeName = view.findViewById(R.id.badge_name);
        badgeImage = view.findViewById(R.id.badge_image);
        badgeDesc = view.findViewById(R.id.badge_desc);

        badgeName.setText(badgeList.get(position).getName());
        badgeDesc.setText(badgeList.get(position).getDescription());
        Glide.with(context).load(badgeList.get(position).getIcon()).into(badgeImage);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View) object);
    }
}