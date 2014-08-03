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
		//��ʵ���String idֻ��һ����ʶ���Լ������������������־ͺ��ˣ����þ���ϵͳ����idһ����activityʱ�������activity����һ����������Ū��ƽ�е���������
		
		// ����Activity��View
		workSpace.addView(view);
		
		
	}
	private void initView() {
		workSpace=(LinearLayout) findViewById(R.id.workspace);
		
	}


}
