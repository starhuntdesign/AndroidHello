package starhuntdesign.android.hello;

import android.app.Activity;
import android.app.AlertDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
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
		tv.setText("Hello World!");
		tv.setTextColor(Color.WHITE);
		tv.setBackgroundColor(Color.GREEN);
		tv.setPadding(10, 20, 10, 20);
		// setContentView(tv);
		layout.addView(tv);

		// テキスト入力
		EditText et = new EditText(this);
		layout.addView(et);

		// ボタン
		Button bu = new Button(this);
		bu.setText("Button!");
		bu.setOnClickListener(this);
		layout.addView(bu);
	}

	/**
	 * ボタンOnClickLisnerを実装
	 */
	public void onClick(View v) {
		AlertDialog.Builder dialog = new AlertDialog.Builder(this);
		dialog.setTitle("title!");
		dialog.setMessage("message!");
		// 肯定ボタン
		dialog.setPositiveButton("OK", null);
		// 否定ボタン
		dialog.setNegativeButton("NO", null);
		// ダイアログ表示
		dialog.create().show();
	}
}