/* ***************************************************
	^> File Name: SettingButton.java
	^> Author: AoEiuV020
	^> Mail: 490674483@qq.com
	^> Created Time: 2016/03/02 - 17:05:03
*************************************************** */
package com.aoeiuv.traffic;
import com.aoeiuv020.widget.*;
import android.view.ViewGroup;
import android.view.View;
import android.content.Context;
public class SettingButton extends SimpleButton
{
	public SettingButton(Context context)
	{
		super(context);
		setText("设置");
	}
	@Override
	public void onClick(View view)
	{

	}
	@Override
	public boolean onLongClick(View view)
	{
		return true;
	}
}
