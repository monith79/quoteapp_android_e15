package com.example.quoteapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    Button btnUpload, btnList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnUpload = findViewById(R.id.btnUpload);
        btnList = findViewById(R.id.btnList);

        btnUpload.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, UploadQuoteActivity.class);
            startActivity(intent);
        });

        btnList.setOnClickListener(v -> {
            Intent intent = new Intent(HomeActivity.this, QuoteListActivity.class);
            startActivity(intent);
        });
    }
}
