package com.example.yuya.menusample;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuThanksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_thanks);

        Intent intent = getIntent();
        String menuName = intent.getStringExtra("menuName");
        String menuPrice = intent.getStringExtra("menuPrice");

        TextView tvMenuName = findViewById(R.id.tvMenuName);
        TextView tvMenuPrice = findViewById(R.id.tvMenuPrice);

        tvMenuName.setText(menuName);
        tvMenuPrice.setText(menuPrice);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    public void onBackButtonClick(View view){
        finish();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int itemId = item.getItemId();

        if(itemId == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }




}
