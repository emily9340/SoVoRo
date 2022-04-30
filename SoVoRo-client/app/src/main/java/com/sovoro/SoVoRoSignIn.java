package com.sovoro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;

import com.android.volley.*;
import com.android.volley.toolbox.*;

import java.util.*;

public class SoVoRoSignIn extends AppCompatActivity {
    private RequestQueue queue=Volley.newRequestQueue(this);
    private EditText sovoroId;
    private EditText sovoroPassword;
    private Button sovoroSignIn;
    private Button sovoroSignUp;

    private static final String URL="http://127.0.0.1:3000";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sovoro_signin);

        sovoroId=findViewById(R.id.sovoro_id);
        sovoroPassword=findViewById(R.id.sovoro_password);
        sovoroSignIn=findViewById(R.id.sovoro_signin);
        sovoroSignUp=findViewById(R.id.sovoro_signup);
        
        final StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(SoVoRoSignIn.this, response, Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(SoVoRoSignIn.this, error.toString(), Toast.LENGTH_SHORT).show();
            }
        }) {
            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> params = new HashMap<String, String>();
                params.put("id", sovoroId.getText().toString());
                params.put("password", sovoroPassword.getText().toString());
                return params;
            }
        };

    }
}