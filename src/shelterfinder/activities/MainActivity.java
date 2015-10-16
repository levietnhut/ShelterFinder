package shelterfinder.activities;



import com.shelterfinder.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void login(View v) {
		Intent loginIntent = new Intent(MainActivity.this, LoginActivity.class);
		startActivity(loginIntent);
	}

}
