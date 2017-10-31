package com.example.whddu.project01.core;


import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebViewClientClass extends WebViewClient {
    @Override
    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}
