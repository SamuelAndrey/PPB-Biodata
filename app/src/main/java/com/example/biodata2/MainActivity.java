package com.example.biodata2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnMaps, btnContact, btnEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnMaps = findViewById(R.id.btnMaps);
        btnContact = findViewById(R.id.btnContact);
        btnEmail = findViewById(R.id.btn_email);

        btnContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nomor = "082223393034";
                Intent memangggil = new Intent(Intent.ACTION_DIAL);
                memangggil.setData(Uri.fromParts("tel", nomor, null));
                startActivity(memangggil);
            }
        });
    }

    public void bukamaps(View view) {
        String url = "https://maps.app.goo.gl/jrm7Y5b8rzqi8qc18";
        Intent bukaurl = new Intent(Intent.ACTION_VIEW);
        bukaurl.setData(Uri.parse(url));
        startActivity(bukaurl);
    }

    public void bukaemail(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/html");
        intent.putExtra(android.content.Intent.EXTRA_EMAIL,new String[] { "samuelandrey2021@gmail.com" });
        startActivity(Intent.createChooser(intent, "Send Email"));

    }

}