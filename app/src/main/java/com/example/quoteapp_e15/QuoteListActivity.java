package com.example.quoteapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;

public class QuoteListActivity extends AppCompatActivity {

    ListView listView;
    Button btnHome, btnUpload;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote_list);

        listView = findViewById(R.id.listQuotes);
        btnHome = findViewById(R.id.btnHome);
        btnUpload = findViewById(R.id.btnUploadFromList);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                UploadQuoteActivity.quoteList
        );
        listView.setAdapter(adapter);

        btnHome.setOnClickListener(v -> {
            Intent intent = new Intent(QuoteListActivity.this, HomeActivity.class);
            startActivity(intent);
        });

        btnUpload.setOnClickListener(v -> {
            Intent intent = new Intent(QuoteListActivity.this, UploadQuoteActivity.class);
            startActivity(intent);
        });
    }
}
