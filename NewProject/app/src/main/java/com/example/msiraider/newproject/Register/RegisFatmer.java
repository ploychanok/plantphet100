package com.example.msiraider.newproject.Register;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.msiraider.newproject.HomeActivity;
import com.example.msiraider.newproject.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class RegisFatmer extends AppCompatActivity {

    private EditText firstname,lastname,inputPhone,email,password,inputAddress,inputDistrict,inputZipcode,inputProvince,farmer_product,farmer_area,farmer_harvest;
    private Button btn_register;
    private ProgressBar progressBar;
    private FirebaseAuth auth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.regis_farmer_regis);

        auth = FirebaseAuth.getInstance();

        btn_register = (Button) findViewById(R.id.btn_register);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);

        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);
        firstname = (EditText) findViewById(R.id.firstname);
        lastname = (EditText) findViewById(R.id.lastname);
        inputAddress = (EditText) findViewById(R.id.inputAddress);
        inputDistrict = (EditText) findViewById(R.id.inputDistrict);
        inputZipcode = (EditText) findViewById(R.id.inputZipcode);
        inputProvince = (EditText) findViewById(R.id.inputProvince);
        inputPhone = (EditText) findViewById(R.id.inputPhone);
        farmer_product = (EditText) findViewById(R.id.farmer_product);
        farmer_area = (EditText) findViewById(R.id.farmer_area);
        farmer_harvest = (EditText) findViewById(R.id.farmer_harvest);

        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputemail = email.getText().toString().trim();
                String inputpassword = password.getText().toString().trim();
                String inputfirstname = firstname.getText().toString().trim();
                String inputlastname = lastname.getText().toString().trim();
                String address = inputAddress.getText().toString().trim();
                String district = inputDistrict.getText().toString().trim();
                String zipcode = inputZipcode.getText().toString().trim();
                String province = inputProvince.getText().toString().trim();
                String phone = inputPhone.getText().toString().trim();
                String product = farmer_product.getText().toString().trim();
                String area = farmer_area.getText().toString().trim();
                String harvest = farmer_harvest.getText().toString().trim();

                if (TextUtils.isEmpty(inputemail)){
                    Toast.makeText(getApplicationContext(),"กรุณาระบุอีเมล",Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(inputpassword)){
                    Toast.makeText(getApplicationContext(),"กรุณาระบุข้อมูล",Toast.LENGTH_SHORT).show();
                }

                if (inputpassword.length()<6){
                    Toast.makeText(getApplicationContext(),"รหัสของคุณสั้นเกินไป",Toast.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(inputfirstname)){
                    Toast.makeText(getApplicationContext(),"กรุณาระบุชื่อต้นของคุณ",Toast.LENGTH_SHORT).show();
                }

                if (TextUtils.isEmpty(inputlastname)){
                    Toast.makeText(getApplicationContext(),"กรุณาระบุนามสกุลของคุณ",Toast.LENGTH_SHORT).show();
                }

                if (TextUtils.isEmpty(address)){
                    Toast.makeText(getApplicationContext(),"กรุณาระบุข้อมูล",Toast.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(district)){
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
                if (TextUtils.isEmpty(product)){
                    Toast.makeText(getApplicationContext(),"กรุณาระบุข้อมูล",Toast.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(area)){
                    Toast.makeText(getApplicationContext(),"กรุณาระบุข้อมูล",Toast.LENGTH_SHORT).show();
                }
                if (TextUtils.isEmpty(harvest)){
                    Toast.makeText(getApplicationContext(),"กรุณาระบุข้อมูล",Toast.LENGTH_SHORT).show();
                }

                progressBar.setVisibility(View.VISIBLE);

                auth.createUserWithEmailAndPassword(inputemail,inputpassword).addOnCompleteListener(RegisFatmer.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressBar.setVisibility(View.GONE);

                        if (!task.isSuccessful()){
                            Toast.makeText(RegisFatmer.this,"การลงทะเบียนไม่สำเร็จ"+task.getException(),Toast.LENGTH_SHORT).show();
                        }else
                            Toast.makeText(RegisFatmer.this,"สำเร็จ! ขอบคุณที่เข้าร่วมกับเรา"+task.getException(),Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(RegisFatmer.this,HomeActivity.class));
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
