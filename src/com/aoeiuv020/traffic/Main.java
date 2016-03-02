package com.aoeiuv020.traffic;
import com.aoeiuv020.widget.*;

import android.app.Activity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.view.Gravity;

public class Main extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
		setTheme(android.R.style.Theme_Holo_Wallpaper);
		LinearLayout mainLayout=new LinearLayout(this);
		LinearLayout.LayoutParams match=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,LinearLayout.LayoutParams.WRAP_CONTENT);
		LinearLayout.LayoutParams wrap=new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT,LinearLayout.LayoutParams.WRAP_CONTENT);
		mainLayout.setOrientation(mainLayout.VERTICAL);
		mainLayout.setGravity(Gravity.CENTER);
		mainLayout.addView(new SimpleButton(this),match);
		mainLayout.addView(new SimpleButton(this),wrap);
		mainLayout.addView(new SettingButton(this),match);
		mainLayout.addView(new AboutButton(this),wrap);
		mainLayout.addView(new SimpleButton(this),match);
        setContentView(mainLayout);
    }
}
