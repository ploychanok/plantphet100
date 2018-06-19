package com.example.ploychanok.subscriber;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

import com.example.ploychanok.subscriber.FAQ.faqActivity;
import com.example.ploychanok.subscriber.Farmerlist.farmerlistActivity;
import com.example.ploychanok.subscriber.Map.MapActivity;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class homeActivity extends AppCompatActivity {

    private FirebaseAuth auth;
    private FirebaseAuth.AuthStateListener authListener;
    private ImageButton btnProfile,btnFaq,btnFarmer,btnMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        auth = FirebaseAuth.getInstance();

        final FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        authListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user == null) {
                    // user auth state is changed - user is null
                    // launch login activity
                    startActivity(new Intent(homeActivity.this, login.class));
                    finish();
                }
            }
        };

        btnProfile = (ImageButton) findViewById(R.id.profile);
        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homeActivity.this,profileActivity.class);
                startActivity(intent);
            }
        });

        btnFaq = (ImageButton) findViewById(R.id.faq);
        btnFaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homeActivity.this,faqActivity.class);
                startActivity(intent);
            }
        });

        btnFarmer = (ImageButton) findViewById(R.id.list_farmer);
        btnFarmer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homeActivity.this,farmerlistActivity.class);
                startActivity(intent);
            }
        });

        btnMap = (ImageButton)findViewById(R.id.map);
        btnMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(homeActivity.this,MapActivity.class);
                startActivity(intent);
            }
        });

    }
}
