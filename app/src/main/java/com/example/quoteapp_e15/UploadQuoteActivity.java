package com.example.quoteapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class UploadQuoteActivity extends AppCompatActivity {

    EditText quoteText, quoteFrom, quoteDate;
    Button btnSubmit, btnCancel;
    public static ArrayList<String> quoteList = new ArrayList<>(); // In-memory storage

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_quote);

        quoteText = findViewById(R.id.editQuote);
        quoteFrom = findViewById(R.id.editFrom);
        quoteDate = findViewById(R.id.editDate);
        btnSubmit = findViewById(R.id.btnSubmit);
        btnCancel = findViewById(R.id.btnCancel);

        btnSubmit.setOnClickListener(v -> {
            String quote = quoteText.getText().toString().trim();
            String from = quoteFrom.getText().toString().trim();
            String date = quoteDate.getText().toString().trim();

            if (quote.isEmpty()) {
                Toast.makeText(this, "Please enter a quote", Toast.LENGTH_SHORT).show();
                return;
            }

            String fullQuote = "\"" + quote + "\"\n- " + from + " (" + date + ")";
            quoteList.add(fullQuote);
            Toast.makeText(this, "Quote uploaded!", Toast.LENGTH_SHORT).show();
            finish(); // return to Home
        });

        btnCancel.setOnClickListener(v -> finish());
    }
}
