package org.diego.android.crosswalkdemo;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import org.xwalk.core.XWalkActivity;
import org.xwalk.core.XWalkPreferences;
import org.xwalk.core.XWalkView;


public class MainActivity extends XWalkActivity {
    private XWalkView xWalkWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        xWalkWebView= new XWalkView(this);
        xWalkWebView.setLayoutParams(new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT));

        // turn on debugging
        XWalkPreferences.setValue(XWalkPreferences.REMOTE_DEBUGGING, true);
        setContentView(xWalkWebView);
    }

    @Override
    protected void onXWalkReady() {
        // Do anything with embedding API
        xWalkWebView.load("https://dfx-greeter.dev.unoapp.io/", null);
    }

}
