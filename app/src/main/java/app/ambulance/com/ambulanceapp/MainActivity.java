package app.ambulance.com.ambulanceapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button btnNational = findViewById(R.id.btn_nation);
        btnNational.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callNational(v);
            }
        });

        final Button btnAmbulance = findViewById(R.id.btn_ambulance);
        btnAmbulance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callAmbulance(v);
            }
        });
    }

    public void reportEmergency(View view) {
        Intent intent = new Intent(this, ReportEmergency.class);
        intent.putExtra("Report Emergency", "Report Emergency");
        startActivity(intent);
    }

    private void callNational(View view) {
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:10111"));
        startActivity(callIntent);
    }

    private void callAmbulance(View view) {
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:10177"));
        startActivity(callIntent);
    }
}
