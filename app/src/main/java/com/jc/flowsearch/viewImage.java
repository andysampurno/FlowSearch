package com.jc.flowsearch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;


public class viewImage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_image);

        WebView web = (WebView) findViewById(R.id.web_view);
        web.loadUrl("https://images.google.com/searchbyimage?image_url=");
        web.setWebViewClient(new WebViewClient());


    }
}
