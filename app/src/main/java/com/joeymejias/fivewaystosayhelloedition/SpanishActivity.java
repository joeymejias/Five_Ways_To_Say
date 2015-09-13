package com.joeymejias.fivewaystosayhelloedition;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by Joey Mejias on 9/12/15.
 */
public class SpanishActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_spanish);

            String url = "http://www.wikihow.com/Say-Hello-in-Spanish";
            WebView view = (WebView) this.findViewById(R.id.spanishWebView);
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
