package app.ambulance.com.ambulanceapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by simthembile on 2018/03/05.
 */

public class ReportEmergency extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.report_emergency);

        final Button btnPatient = findViewById(R.id.btnPatient);
        btnPatient.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loadMainPaitient(v);
            }
        });

    }

    public void loadMainPaitient(View view) {
        Intent intent = new Intent(this, MainPatient.class);
        intent.putExtra("Main Patient", "Main Patient");
        startActivity(intent);
    }
}
