package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity{

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView=findViewById(R.id.webviewid);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("http://www.google.co.jp");
    }
}

