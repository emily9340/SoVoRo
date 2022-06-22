package com.sovoro;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class SoVoRoSignup extends AppCompatActivity {

    // 입력 레이아웃 내부
    private EditText sovoroSignUpId;
    private EditText sovoroSignUpPassword;
    private EditText sovoroSignUpNickName;
    private EditText sovoroSignUpSmsInput;
    private EditText sovoroSignUpSmsConfirm;

    // SMS발송 버튼
    private Button sovoroSignUpSmsSendButton;
    // SMS 인증번호 확인 버튼
    private Button sovoroSignUpSmsConfirmButton;
    // 회원가입 버튼
    private Button sovoroSignUp;

    // POST메소드 경
    private final String PATH="/signup";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sovoro_signup);

        // RequestQueue의 context를 signup activity에 맞춘다
        // 요청을 보낼 리퀘스트 큐가 어느 액티비티에서 요청을 받있는지 구분
        AppHelper.setRequestQueue(this);

        // AppHelper의 getURL메소드를 통해 post요청을 보낼 url 생성
        // PATH는 /signup
        final String URL=AppHelper.getURL(PATH);

        // xml레이아웃과 자바 코드의 연결

        // 입력 레이아웃 내부
        sovoroSignUpId=findViewById(R.id.sovoro_signup_id);
        sovoroSignUpPassword=findViewById(R.id.sovoro_signup_password);
        sovoroSignUpNickName=findViewById(R.id.sovoro_signup_nickname);
        sovoroSignUpSmsInput=findViewById(R.id.sovoro_signup_sms_send_input);
        sovoroSignUpSmsConfirm=findViewById(R.id.sovoro_sms_confirm_input);

        // SMS발송 버튼
        sovoroSignUpSmsSendButton=findViewById(R.id.sovoro_signup_sms_send);
        // SMS 인증번호 확인 버튼
        sovoroSignUpSmsConfirmButton=findViewById(R.id.sovoro_signup_sms_confirm);
        // 회원가입 버튼
        sovoroSignUp=findViewById(R.id.sovoro_signup);


        // sms인증
        // 지금은 구현하지 않음
        sovoroSignUpSmsSendButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 추후 네이버 api를 이용한 sms인증 서비스 구현
            }
        });
        sovoroSignUpSmsConfirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 추후 네이버 api를 이용한 sms인증 서비스 구현
            }
        });


        // 버튼 클릭 시 로그인 버튼 구현
        // 버튼 클릭 완료 시 로그인 완료 메세지와 함께 초기 signin 액티비티로 이동
        sovoroSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // 구현해야 할 부분
            }
        });


    }
}