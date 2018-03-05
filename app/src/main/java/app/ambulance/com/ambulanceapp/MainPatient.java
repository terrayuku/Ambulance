package app.ambulance.com.ambulanceapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by simthembile on 2018/03/05.
 */

public class MainPatient extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_patien);

    }

    public void cancelPatientRequest(View view) {
        Intent intent = new Intent(this, ReportEmergency.class);
        intent.putExtra("Report Emergency", "Report Emergency");
        startActivity(intent);
    }
}
