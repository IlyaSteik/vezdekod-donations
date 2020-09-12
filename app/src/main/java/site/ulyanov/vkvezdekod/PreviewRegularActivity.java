package site.ulyanov.vkvezdekod;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class PreviewRegularActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regular_preview);

        setSupportActionBar((Toolbar) findViewById(R.id.tool_bar));
    }

    public void back(View v) {
        finish();
    }

}