package app.ambulance.com.ambulanceapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void reportEmergency(View view) {
        Intent intent = new Intent(this, ReportEmergency.class);
        intent.putExtra("Report Emergency", "Report Emergency");
        startActivity(intent);
    }
}
