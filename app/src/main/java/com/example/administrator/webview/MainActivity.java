package com.example.administrator.webview;

import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class MainActivity extends AppCompatActivity  {
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        webView=findViewById(R.id.mywebView);
        webView.setWebViewClient(new WebViewClient());
        Intent intent=getIntent();
        Bundle bundle=intent.getExtras();
        if(bundle!=null){
            String address=bundle.getString("address");
            webView.loadUrl(address);
        }
    }
}
