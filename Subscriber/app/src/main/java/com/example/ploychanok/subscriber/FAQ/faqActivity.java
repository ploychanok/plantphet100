package com.example.ploychanok.subscriber.FAQ;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.ploychanok.subscriber.R;

public class faqActivity extends AppCompatActivity {

    private Button manual,faq,about,contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faq);

        faq = (Button) findViewById(R.id.faq);
        faq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(faqActivity.this,faqInvestorActivity.class);
                startActivity(intent);
            }
        });

        manual = (Button) findViewById(R.id.manual);
        manual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(faqActivity.this,manualActivity.class);
                startActivity(intent);
            }
        });

        about = (Button) findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(faqActivity.this,aboutActivity.class);
                startActivity(intent);
            }
        });

        contact = (Button) findViewById(R.id.contact);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(faqActivity.this,contactActivity.class);
                startActivity(intent);
            }
        });

    }

}
