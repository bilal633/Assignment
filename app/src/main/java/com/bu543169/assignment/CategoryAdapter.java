package com.bu543169.assignment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CategoryAdapter extends BaseAdapter {
    private Context context;
    private List<Category> categoryList;
    private LayoutInflater layoutInflater;

    public CategoryAdapter(Context context, List<Category> categoryList) {
        this.context = context;
        this.categoryList = categoryList;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return categoryList == null ? 0 : categoryList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.item_grid, parent, false);
        Category category = categoryList.get(position);

        //Initializing View
        ImageView imgCategory = convertView.findViewById(R.id.imgCategory);
        TextView txtCategoryName = convertView.findViewById(R.id.txtCategoryName);
        TextView txtCategoryDetails = convertView.findViewById(R.id.txtCategoryDetails);

        imgCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context,MainActivity2.class);
                intent.putExtra("CATEGORY",category.getTxtCategoryName());
                intent.putExtra("DETAILS",category.getTxtCategoryDetails());
                context.startActivity(intent);

            }
        });
        //Setting Data Into Views
        imgCategory.setImageResource(category.getImgCategory());
        txtCategoryName.setText(category.getTxtCategoryName());
        txtCategoryDetails.setText(category.getTxtCategoryDetails());

        return convertView;
    }
}