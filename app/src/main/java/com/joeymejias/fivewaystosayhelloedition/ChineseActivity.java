package com.joeymejias.fivewaystosayhelloedition;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Joey Mejias on 9/10/15.
 */
public class ChineseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese);

        String url = "http://www.wikihow.com/Say-Hello-in-Chinese";
        WebView view = (WebView) this.findViewById(R.id.chineseWebView);
        view.getSettings().setJavaScriptEnabled(true);
        view.setWebViewClient(new Callback());
        view.loadUrl(url);
    }

    private class Callback extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return (false);
        }

    }
}