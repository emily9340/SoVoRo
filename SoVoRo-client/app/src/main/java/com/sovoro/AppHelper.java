package com.sovoro;

import android.content.Context;

import com.android.volley.*;
import com.android.volley.toolbox.*;

public class AppHelper {
    public static RequestQueue requestQueue;
    public static String URL="http://13.58.48.132:3000";
    static void setRequestQueue(Context context) {
        requestQueue=Volley.newRequestQueue(context);
    }
    static RequestQueue getRequestQueue() {
        return requestQueue;
    }
    static void requestQueueAdd(Object request, String option) {
        switch (option) {
            case "STRING":
                requestQueue.add((StringRequest)request);
                break;
        }
    }
    static String getURL(String path) {
        return ""+URL+path;
    }
}
