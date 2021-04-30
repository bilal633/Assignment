package com.bu543169.assignment;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.GridView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private GridView gridCategories;
    private CategoryAdapter categoryAdapter;
    private List<Category> categoryList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridCategories = findViewById(R.id.gridCategories);



        toolbar = findViewById(R.id.myToolBar);


        setSupportActionBar(toolbar);
        loadCategories();
    }

    public void onBackPressed() {
        MaterialAlertDialogBuilder dialogBuilder=new MaterialAlertDialogBuilder(MainActivity.this);
        dialogBuilder.setTitle("Close Application");
        dialogBuilder.setMessage("Do you really want to close this activity" +
                "");
        dialogBuilder.setCancelable(false);
        dialogBuilder.setNeutralButton("Dismiss", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        dialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        dialogBuilder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                MainActivity.super.onBackPressed();
                dialog.dismiss();
            }
        });
        AlertDialog dialog=dialogBuilder.create();
        dialog.show();


    }

    private void loadCategories() {
        categoryList = new ArrayList<>();

        categoryList.add(new Category(R.drawable.ic_files, "Logos", ""));
        categoryList.add(new Category(R.drawable.ic_files, "Project", "Proposal"));
        categoryList.add(new Category(R.drawable.ic_files, "My Photos", ""));
        categoryList.add(new Category(R.drawable.ic_files, "Whatsapp", ""));
        categoryList.add(new Category(R.drawable.ic_files, "Videos", ""));
        categoryList.add(new Category(R.drawable.ic_files, "Facebook", ""));
        categoryList.add(new Category(R.drawable.ic_files, "Downloads", ""));
        categoryList.add(new Category(R.drawable.ic_files, "browser", ""));
        categoryList.add(new Category(R.drawable.ic_files, "Downloads", ""));
        categoryList.add(new Category(R.drawable.ic_files, "Trash", ""));
        categoryList.add(new Category(R.drawable.ic_files, "Private", ""));
        categoryList.add(new Category(R.drawable.ic_files, "Music", ""));

        categoryAdapter = new CategoryAdapter(MainActivity.this, categoryList);
        gridCategories.setAdapter(categoryAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.menu,menu);
        return true;
    }
}



