package com.example.msiraider.newproject.FAQ;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.msiraider.newproject.R;

public class FaqHomeActivity extends AppCompatActivity {
    Button manual, faq, about, contact;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faq_home);

        manual = (Button)findViewById(R.id.manual);
        faq = (Button)findViewById(R.id.faq);
        about = (Button)findViewById(R.id.about);
        contact = (Button)findViewById(R.id.contact);

        manual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FaqHomeActivity.this,UserManualActivity.class);
                startActivity(intent);
            }
        });

        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FaqHomeActivity.this,FaqActivity.class);
                startActivity(intent);
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FaqHomeActivity.this,AboutActivity.class);
                startActivity(intent);
            }
        });

        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FaqHomeActivity.this,ContactActivity.class);
                startActivity(intent);
            }
        });
    }
}
