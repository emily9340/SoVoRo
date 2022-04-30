package com.sovoro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

import com.android.volley.*;
import com.android.volley.toolbox.*;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

import java.util.*;

public class SoVoRoSignIn extends AppCompatActivity {
    private TextInputLayout sovoroId;
    private TextInputLayout sovoroPassword;
    private TextInputEditText sovoroIdText;
    private TextInputEditText sovoroPasswordText;
    private Button sovoroSignIn;
    private Button sovoroSignUp;

    private final String PATH="/signin";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sovoro_signin);

        AppHelper.setRequestQueue(this);
        final String URL=AppHelper.getURL(PATH);

        sovoroId=findViewById(R.id.sovoro_id_layout);
        sovoroPassword=findViewById(R.id.sovoro_password_layout);
        sovoroSignIn=findViewById(R.id.sovoro_signin);
        sovoroSignUp=findViewById(R.id.sovoro_signup);
        sovoroIdText=findViewById(R.id.sovoro_id);
        sovoroPasswordText=findViewById(R.id.sovoro_password);

        final StringRequest stringRequest = new StringRequest(
                Request.Method.POST,
                URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        switch (response) {
                            case "0":
                                Intent intent = new Intent(getApplicationContext(), SoVoRoMain.class);
                                startActivity(intent);
                                break;
                            case "-1":
                                sovoroIdText.setText("");
                                sovoroPasswordText.setText("");
                                Toast.makeText(
                                        getApplicationContext(),"Wrong Id or Password", Toast.LENGTH_LONG).show();
                                break;
                        }
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        System.out.println(error.toString());
                    }
                }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<String, String>();
                params.put("userid", sovoroIdText.getText().toString());
                params.put("password", sovoroPasswordText.getText().toString());
                return params;
            }
        };
        sovoroSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sovoroIdText.getText().toString().isEmpty()||sovoroPasswordText.getText().toString().isEmpty())
                    Toast.makeText(getApplicationContext(),"ID or Password is empty",Toast.LENGTH_LONG).show();
                else
                    AppHelper.requestQueueAdd(stringRequest,"STRING");
            }
        });
    }
}