package com.shripalsoni.natiescriptwebviewinterface;

import android.webkit.JavascriptInterface;

/**
 * A class to handle events from webView.
 */
public class WebViewInterface {

    private String _id = null;

    public WebViewInterface(String id){
        this._id = id;
    }

    @JavascriptInterface
    public void handleEventFromWebView(String eventName, String jsonData){
        this.onWebViewEvent(this._id, eventName, jsonData);
    }

    public void onWebViewEvent(String webViewId, String eventName, String jsonData){

    }
}
