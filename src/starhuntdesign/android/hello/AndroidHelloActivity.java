package starhuntdesign.android.hello;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Hellow Application for Android.
 *
 * @author kutami
 */
public class AndroidHelloActivity extends Activity implements
		View.OnClickListener {
	@Override
	protected void onRestart() {
		// TODO 自動生成されたメソッド・スタブ
		super.onRestart();
	}
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// レイアウト
		LinearLayout layout = new LinearLayout(this);
		layout.setOrientation(LinearLayout.VERTICAL);
		setContentView(layout);

		// テキスト
		TextView tv = new TextView(this);
		tv.setText("Hello World");
		tv.setTextColor(Color.WHITE);
		tv.setBackgroundColor(Color.RED);
		tv.setPadding(10, 20, 10, 20);
		tv.setId(100);
		// setContentView(tv);
		layout.addView(tv);

		// テキスト入力
		EditText et = new EditText(this);
		layout.addView(et);

		// ボタン
		Button bu = new Button(this);
		bu.setText("next");
		bu.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent intent = new Intent(AndroidHelloActivity.this, SecondActivity.class);
				startActivity(intent);
			}
		});
		layout.addView(bu);
	}

	/**
	 * ボタンOnClickLisnerを実装
	 */
	public void onClick(View v) {
//		AlertDialog.Builder dialog = new AlertDialog.Builder(this);
//		dialog.setTitle("title!");
//		dialog.setMessage("message!");
//		// 肯定ボタン
//		dialog.setPositiveButton("OK", null);
//		// 否定ボタン
//		dialog.setNegativeButton("NO", null);
//		// ダイアログ表示
//		dialog.create().show();

//		View w = ((ViewGroup)this.getWindow().getDecorView()).getChildAt(0).findViewById(100);
		View w = this.findViewById(100);

        AlphaAnimation animation = new AlphaAnimation(1f, 0.2f);
        animation.setInterpolator(new AccelerateInterpolator());
        animation.setDuration(1000);
        animation.setStartOffset(1000);

        AlphaAnimation animation2 = new AlphaAnimation(0.5f, 1f);
        animation2.setInterpolator(new AccelerateInterpolator());
        animation2.setDuration(1000);

        AnimationSet set = new AnimationSet(false);
        set.setFillEnabled(true);
        set.setFillAfter(true);
        set.addAnimation(animation);
//        set.addAnimation(animation2);
        ScaleAnimation scale = new ScaleAnimation(1,0.7f,1,0.7f);
        scale.setInterpolator(new AccelerateInterpolator());
        scale.setDuration(1000);
        set.addAnimation(scale);


        v.startAnimation(set);
	}
}