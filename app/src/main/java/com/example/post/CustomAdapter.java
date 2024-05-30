package com.example.post;


import android.content.Context;

import android.net.Uri;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    List<People> people;

    Context context;

    public CustomAdapter(List<People> people, Context context) {
        this.people = people;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.post_item, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        People person = people.get(position);
        holder.titleTextView.setText(person.getTitle());
        holder.discTextView.setText(person.getDescription());
        List<String> imagePaths = person.getBitmaps();
        Log.d("TAG", "onBindViewHolder: " + imagePaths);
if(imagePaths.size()==1){
    Uri imagePath = Uri.parse(imagePaths.get(0));
    Glide.with(context)
            .load(imagePath)
            .into(holder.img1);

} else if (imagePaths.size()==2) {
    holder.layout2.setVisibility(View.VISIBLE);
    Uri imagePath = Uri.parse(imagePaths.get(0)); Uri imagePath1 = Uri.parse(imagePaths.get(1));
    Glide.with(context).load(imagePath).into(holder.imageView);
    Glide.with(context).load(imagePath1).into(holder.imageView2);
    holder.img1.setVisibility(View.GONE);
}
else if (imagePaths.size()==3) {
    holder.layout_3.setVisibility(View.VISIBLE);
    Uri imagePath = Uri.parse(imagePaths.get(0)); Uri imagePath1 = Uri.parse(imagePaths.get(1));
    Uri imagePath2 = Uri.parse(imagePaths.get(2));
    Glide.with(context).load(imagePath).into(holder.img3_1);
    Glide.with(context).load(imagePath1).into(holder.img3_2);
    Glide.with(context).load(imagePath2).into(holder.img3_3);
    holder.img1.setVisibility(View.GONE);
}else if (imagePaths.size()==4) {
    holder.layout_4.setVisibility(View.VISIBLE);
    Uri imagePath = Uri.parse(imagePaths.get(0)); Uri imagePath1 = Uri.parse(imagePaths.get(1));
    Uri imagePath2 = Uri.parse(imagePaths.get(2));Uri imagePath3 = Uri.parse(imagePaths.get(3));
    Glide.with(context).load(imagePath).into(holder.img4_1);
    Glide.with(context).load(imagePath1).into(holder.img4_2);
    Glide.with(context).load(imagePath2).into(holder.img4_3);
    Glide.with(context).load(imagePath3).into(holder.img4_4);
    holder.img1.setVisibility(View.GONE);
}
else if (imagePaths.size()==5) {
    holder.layout_5.setVisibility(View.VISIBLE);
    Uri imagePath = Uri.parse(imagePaths.get(0)); Uri imagePath1 = Uri.parse(imagePaths.get(1));
    Uri imagePath2 = Uri.parse(imagePaths.get(2));Uri imagePath3 = Uri.parse(imagePaths.get(3));
    Uri imagePath4 = Uri.parse(imagePaths.get(4));
    Glide.with(context).load(imagePath).into(holder.img5_1);
    Glide.with(context).load(imagePath1).into(holder.img5_2);
    Glide.with(context).load(imagePath2).into(holder.img5_3);
    Glide.with(context).load(imagePath3).into(holder.img5_4);
    Glide.with(context).load(imagePath4).into(holder.img5_5);
    holder.img1.setVisibility(View.GONE);
}else if (imagePaths.size()==6) {
    holder.layout_6.setVisibility(View.VISIBLE);
    Uri imagePath = Uri.parse(imagePaths.get(0)); Uri imagePath1 = Uri.parse(imagePaths.get(1));
    Uri imagePath2 = Uri.parse(imagePaths.get(2));Uri imagePath3 = Uri.parse(imagePaths.get(3));
    Uri imagePath4 = Uri.parse(imagePaths.get(4)); Uri imagePath5 = Uri.parse(imagePaths.get(5));
    Glide.with(context).load(imagePath).into(holder.img6_1);
    Glide.with(context).load(imagePath1).into(holder.img6_2);
    Glide.with(context).load(imagePath2).into(holder.img6_3);
    Glide.with(context).load(imagePath3).into(holder.img6_4);
    Glide.with(context).load(imagePath4).into(holder.img6_5);
    Glide.with(context).load(imagePath5).into(holder.img6_6);
    holder.img1.setVisibility(View.GONE);
}else if (imagePaths.size()==7) {
    holder.layout_7.setVisibility(View.VISIBLE);
    Uri imagePath = Uri.parse(imagePaths.get(0)); Uri imagePath1 = Uri.parse(imagePaths.get(1));
    Uri imagePath2 = Uri.parse(imagePaths.get(2));Uri imagePath3 = Uri.parse(imagePaths.get(3));
    Uri imagePath4 = Uri.parse(imagePaths.get(4)); Uri imagePath5 = Uri.parse(imagePaths.get(5));
    Uri imagePath6 = Uri.parse(imagePaths.get(6));
    Glide.with(context).load(imagePath).into(holder.img7_1);
    Glide.with(context).load(imagePath1).into(holder.img7_2);
    Glide.with(context).load(imagePath2).into(holder.img7_3);
    Glide.with(context).load(imagePath3).into(holder.img7_4);
    Glide.with(context).load(imagePath4).into(holder.img7_5);
    Glide.with(context).load(imagePath5).into(holder.img7_6);
    Glide.with(context).load(imagePath6).into(holder.img7_7);
    holder.img1.setVisibility(View.GONE);
}else if (imagePaths.size()==8) {
    holder.layout_8.setVisibility(View.VISIBLE);
    Uri imagePath = Uri.parse(imagePaths.get(0)); Uri imagePath1 = Uri.parse(imagePaths.get(1));
    Uri imagePath2 = Uri.parse(imagePaths.get(2));Uri imagePath3 = Uri.parse(imagePaths.get(3));
    Uri imagePath4 = Uri.parse(imagePaths.get(4)); Uri imagePath5 = Uri.parse(imagePaths.get(5));
    Uri imagePath6 = Uri.parse(imagePaths.get(6)); Uri imagePath7 = Uri.parse(imagePaths.get(7));
    Glide.with(context).load(imagePath).into(holder.img8_1);
    Glide.with(context).load(imagePath1).into(holder.img8_2);
    Glide.with(context).load(imagePath2).into(holder.img8_3);
    Glide.with(context).load(imagePath3).into(holder.img8_4);
    Glide.with(context).load(imagePath4).into(holder.img8_5);
    Glide.with(context).load(imagePath5).into(holder.img8_6);
    Glide.with(context).load(imagePath6).into(holder.img8_7);
    Glide.with(context).load(imagePath7).into(holder.img8_8);
    holder.img1.setVisibility(View.GONE);
}else if (imagePaths.size()==9) {
    holder.layout_9.setVisibility(View.VISIBLE);
    Uri imagePath = Uri.parse(imagePaths.get(0)); Uri imagePath1 = Uri.parse(imagePaths.get(1));
    Uri imagePath2 = Uri.parse(imagePaths.get(2));Uri imagePath3 = Uri.parse(imagePaths.get(3));
    Uri imagePath4 = Uri.parse(imagePaths.get(4)); Uri imagePath5 = Uri.parse(imagePaths.get(5));
    Uri imagePath6 = Uri.parse(imagePaths.get(6)); Uri imagePath7 = Uri.parse(imagePaths.get(7));
    Uri imagePath8= Uri.parse(imagePaths.get(8));
    Glide.with(context).load(imagePath).into(holder.img9_1);
    Glide.with(context).load(imagePath1).into(holder.img9_2);
    Glide.with(context).load(imagePath2).into(holder.img9_3);
    Glide.with(context).load(imagePath3).into(holder.img9_4);
    Glide.with(context).load(imagePath4).into(holder.img9_5);
    Glide.with(context).load(imagePath5).into(holder.img9_6);
    Glide.with(context).load(imagePath6).into(holder.img9_7);
    Glide.with(context).load(imagePath7).into(holder.img9_8);
    Glide.with(context).load(imagePath8).into(holder.img9_9);
    holder.img1.setVisibility(View.GONE);
}

    }

    @Override
    public int getItemCount() {
        Log.d("TAG", "getItemCount_size: " + people.stream());
        return people.size();
    }
    public void updateData(List<People> newPeople) {
        this.people = newPeople;
        notifyDataSetChanged();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView titleTextView;
        public TextView discTextView;
        ImageView imageView,imageView2,img1,img3_1,img3_2,img3_3,img4_1,img4_2,img4_3,img4_4,img5_1,img5_2,img5_3,img5_4,img5_5,img6_1,img6_2,img6_3,img6_4,img6_5,img6_6,img7_1,img7_2,img7_3,img7_4,img7_5,img7_6,img7_7,img8_1,img8_2,img8_3,img8_4,img8_5,img8_6,img8_7,img8_8,img9_1,img9_2,img9_3,img9_4,img9_5,img9_6,img9_7,img9_8,img9_9;

        ConstraintLayout layout_3,layout2;
        ConstraintLayout layout_4,layout_5,layout_6,layout_7,layout_8,layout_9;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.title);
            discTextView = itemView.findViewById(R.id.description);
            imageView=itemView.findViewById(R.id.imageView);
            imageView2=itemView.findViewById(R.id.imageView2);
            img1=itemView.findViewById(R.id.imqe_1);
            img3_1=itemView.findViewById(R.id.image_3_1);
            img3_2=itemView.findViewById(R.id.image_3_2);
            img3_3=itemView.findViewById(R.id.image_3_3);
            img4_1=itemView.findViewById(R.id.image_4_1);
            img4_2=itemView.findViewById(R.id.image_4_2);
            img4_3=itemView.findViewById(R.id.image_4_3);
            img4_4=itemView.findViewById(R.id.image_4_4);
            img5_1=itemView.findViewById(R.id.image_5_1);
            img5_2=itemView.findViewById(R.id.image_5_2);
            img5_3=itemView.findViewById(R.id.image_5_3);
            img5_4=itemView.findViewById(R.id.image_5_4);
            img5_5=itemView.findViewById(R.id.image_5_5);
            img6_1=itemView.findViewById(R.id.image_6_1);
            img6_2=itemView.findViewById(R.id.image_6_2);
            img6_3=itemView.findViewById(R.id.image_6_3);
            img6_4=itemView.findViewById(R.id.image_6_4);
            img6_5=itemView.findViewById(R.id.image_6_5);
            img6_6=itemView.findViewById(R.id.image_6_6);
            img7_1=itemView.findViewById(R.id.image_7_1);
            img7_2=itemView.findViewById(R.id.image_7_2);
            img7_3=itemView.findViewById(R.id.image_7_3);
            img7_4=itemView.findViewById(R.id.image_7_4);
            img7_5=itemView.findViewById(R.id.image_7_5);
            img7_6=itemView.findViewById(R.id.image_7_6);
            img7_7=itemView.findViewById(R.id.image_7_7);
            img8_1=itemView.findViewById(R.id.image_8_1);
            img8_2=itemView.findViewById(R.id.image_8_2);
            img8_3=itemView.findViewById(R.id.image_8_3);
            img8_4=itemView.findViewById(R.id.image_8_4);
            img8_5=itemView.findViewById(R.id.image_8_5);
            img8_6=itemView.findViewById(R.id.image_8_6);
            img8_7=itemView.findViewById(R.id.image_8_7);
            img8_8=itemView.findViewById(R.id.image_8_8);
            img9_1=itemView.findViewById(R.id.image_9_1);
            img9_2=itemView.findViewById(R.id.image_9_2);
            img9_3=itemView.findViewById(R.id.image_9_3);
            img9_4=itemView.findViewById(R.id.image_9_4);
            img9_5=itemView.findViewById(R.id.image_9_5);
            img9_6=itemView.findViewById(R.id.image_9_6);
            img9_7=itemView.findViewById(R.id.image_9_7);
            img9_8=itemView.findViewById(R.id.image_9_8);
            img9_9=itemView.findViewById(R.id.image_9_9);
            layout2=itemView.findViewById(R.id.layout1);
            layout_3=itemView.findViewById(R.id.layout_3);
            layout_4=itemView.findViewById(R.id.layout_4);layout_7=itemView.findViewById(R.id.layout_7);
            layout_5=itemView.findViewById(R.id.layout_5);layout_9=itemView.findViewById(R.id.layout_9);
            layout_6=itemView.findViewById(R.id.layout_6);layout_8=itemView.findViewById(R.id.layout_8);
        }



    }
}