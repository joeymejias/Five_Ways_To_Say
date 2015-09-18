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
        setContentView(R.layout.activity_chinese); //Setting view to activity_chinese.xml

        String url = "http://www.wikihow.com/Say-Hello-in-Chinese"; //URL of the web page that contains the Chinese content
        WebView view = (WebView) this.findViewById(R.id.chineseWebView); //Setting the WebView to chineseWebView
        view.getSettings().setJavaScriptEnabled(true); //Enabling JavaScript on the web page in the event the user browses content that requires JavaScript
        view.setWebViewClient(new Callback()); //Setting the webview to open natively
        view.loadUrl(url); //Loading the URL
    }

    /*
    ** Setting the webViewClient to open natively
    */
    private class Callback extends WebViewClient {

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            return (false);
        }

    }
}