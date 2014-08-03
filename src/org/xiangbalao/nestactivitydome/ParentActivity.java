package org.xiangbalao.nestactivitydome;

import android.app.ActivityGroup;
import android.app.LocalActivityManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;


public class ParentActivity extends ActivityGroup {
	private LinearLayout workSpace;
	
	private LocalActivityManager mLocalActivityManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLocalActivityManager= getLocalActivityManager();
        initView();
        andActivity();
    }
	private void andActivity() {
		Intent itt=new Intent(this,SonActivity.class);
	
		ViewGroup view=(ViewGroup) (mLocalActivityManager.startActivity("String_id", itt)).getDecorView();
		//其实这个String id只是一个标识，自己随便起个不重样的名字就好了，作用就是系统看到id一样的activity时会把两个activity当作一个处理，不会弄出平行的两个来，
		
		// 承载Activity的View
		workSpace.addView(view);
		
		
	}
	private void initView() {
		workSpace=(LinearLayout) findViewById(R.id.workspace);
		
	}


}
