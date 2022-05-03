package com.sovoro;

import android.content.Context;

import com.android.volley.*;
import com.android.volley.toolbox.*;

// 프로젝트 내부 중복되는 작업들을 위한 정적 메소드들이 포함된 클래스
public class AppHelper {
    // 리퀘스트 큐
    // 추후 싱글톤으로 리팩토링
    public static RequestQueue requestQueue;
    // 리퀘스트 url의 기본 경로(서버 경로)
    public static String URL="http://13.58.48.132:3000";
    // 특정 액티비티를 리퀘스트 큐에 등록
    static void setRequestQueue(Context context) {
        requestQueue=Volley.newRequestQueue(context);
    }
    // 리퀘스트 큐 객체 반환
    static RequestQueue getRequestQueue() {
        return requestQueue;
    }
    // 리퀘스트 큐에 리퀘스트 할당
    static void requestQueueAdd(Object request, String option) {
        // 편의상 STRING리퀘스트만 존재
        switch (option) {
            case "STRING":
                requestQueue.add((StringRequest)request);
                break;
        }
    }
    // 리퀘스트를 보내고자 하는 경로 설정
    static String getURL(String path) {
        return ""+URL+path;
    }
}
