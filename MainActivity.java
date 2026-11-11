package com.infiniteuniverse.wallpaper;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends Activity {
    private WebView view;
    @Override public void onCreate(Bundle state) {
        super.onCreate(state);
        view = new WebView(this);
        view.setBackgroundColor(0xff080d1c);
        view.getSettings().setJavaScriptEnabled(true);
        view.getSettings().setDomStorageEnabled(true);
        view.getSettings().setAllowFileAccess(true);
        view.getSettings().setCacheMode(WebSettings.LOAD_DEFAULT);
        view.setWebChromeClient(new WebChromeClient());
        setContentView(view);
        view.loadUrl("file:///android_asset/index.html");
    }
    @Override protected void onDestroy() {
        if (view != null) { view.destroy(); view = null; }
        super.onDestroy();
    }
}
