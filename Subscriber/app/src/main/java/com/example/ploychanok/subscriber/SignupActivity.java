package com.example.ploychanok.subscriber;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class SignupActivity extends AppCompatActivity {

    private EditText inputEmail,inputPassword,inputFirstname,inputLastname,inputAddress,inputDistrict,inputZipcode,inputProvince,inputPhone,inputCompany;
    private RadioButton company_private,company_partnership,company_company,rbtn_mr,rbtn_mrs,rbtn_ms,gender_female,gender_male,gender_nottell;
    private Button btnSignup;
    private ProgressBar progressBar;
    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);

        auth = FirebaseAuth.getInstance();

        btnSignup = (Button) findViewById(R.id.btnSignup);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        inputEmail = (EditText) findViewById(R.id.inputEmail);
        inputPassword = (EditText) findViewById(R.id.inputPassword);
        inputFirstname = (EditText) findViewById(R.id.inputFirstname);
        inputLastname = (EditText) findViewById(R.id.inputLastname);
        inputAddress = (EditText) findViewById(R.id.inputAddress);
        inputZipcode = (EditText) findViewById(R.id.inputZipcode);
        inputProvince = (EditText) findViewById(R.id.inputProvince);
        inputPhone = (EditText) findViewById(R.id.inputPhone);
        inputCompany = (EditText) findViewById(R.id.inputCompany);


        btnSignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = inputEmail.getText().toString().trim();
                String password = inputPassword.getText().toString().trim();
                String firstname = inputFirstname.getText().toString().trim();
                String lastname = inputLastname.getText().toString().trim();
                String address = inputAddress.getText().toString().trim();
                String zipcode = inputZipcode.getText().toString().trim();
                String province = inputProvince.getText().toString().trim();
                String phone = inputPhone.getText().toString().trim();
                String company = inputCompany.getText().toString().trim();


                if (TextUtils.isEmpty(email)){
                    Toast.makeText(getApplicationContext(),"กรุณาระบุอีเมล",Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(password)){
                    Toast.makeText(getApplicationContext(),"กรุณาระบุข้อมูล",Toast.LENGTH_SHORT).show();
                }

                if (password.length()<6){
                    Toast.makeText(getApplicationContext(),"รหัสของคุณสั้นเกินไป",Toast.LENGTH_SHORT).show();
                }

                if (TextUtils.isEmpty(firstname)){
                    Toast.makeText(getApplicationContext(),"กรุณาระบุชื่อต้นของคุณ",Toast.LENGTH_SHORT).show();
                }

                if (TextUtils.isEmpty(lastname)){
                    Toast.makeText(getApplicationContext(),"กรุณาระบุนามสกุลของคุณ",Toast.LENGTH_SHORT).show();
                }

                if (TextUtils.isEmpty(address)){
                    Toast.makeText(getApplicationContext(),"กรุณาระบุข้อมูล",Toast.LENGTH_SHORT).show();
                }


                if (TextUtils.isEmpty(zipcode)){
                    Toast.makeText(getApplicationContext(),"กรุณาระบุข้อมูล",Toast.LENGTH_SHORT).show();
                }

                if (TextUtils.isEmpty(province)){
                    Toast.makeText(getApplicationContext(),"กรุณาระบุข้อมูล",Toast.LENGTH_SHORT).show();
                }

                if (TextUtils.isEmpty(phone)){
                    Toast.makeText(getApplicationContext(),"กรุณาระบุเบอร์โทรศัพท์",Toast.LENGTH_SHORT).show();
                }

                if (TextUtils.isEmpty(company)){
                    Toast.makeText(getApplicationContext(),"กรุณาระบุข้อมูล",Toast.LENGTH_SHORT).show();
                }

                progressBar.setVisibility(View.VISIBLE);

                auth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(SignupActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressBar.setVisibility(View.GONE);

                        if (!task.isSuccessful()){
                            Toast.makeText(SignupActivity.this,"การสมัครไม่สำเร็จ"+task.getException(),Toast.LENGTH_SHORT).show();
                        }else
                            Toast.makeText(SignupActivity.this,"สำเร็จ! ขอบคุณที่เข้าร่วมกับเรา"+task.getException(),Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(SignupActivity.this,login.class));
                        finish();
                    }
                });
            }
        });

    }

    protected void onResume(){
        super.onResume();
        progressBar.setVisibility(View.GONE);
    }
}
