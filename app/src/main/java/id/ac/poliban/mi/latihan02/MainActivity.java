package id.ac.poliban.mi.latihan02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menggunakan lamda untuk menulis event listener dan event handler
        Button btReaLMadrit = findViewById(R.id.btRealMadrit);
        Button btFiorenta = findViewById(R.id.btFiorentina);
        Button btLeicester = findViewById(R.id.btLeicester);
        Button btBarcelona = findViewById(R.id.btBarcelona);

        //lamda
        btReaLMadrit.setOnClickListener(View -> {
            Toast.makeText(this, "Ente Musuh ana", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Gue Barcelona", Toast.LENGTH_SHORT).show();

        });
        btBarcelona.setOnClickListener(View -> Toast.makeText(this, "iam barcelona", Toast.LENGTH_SHORT).show());
        btLeicester.setOnClickListener(View -> Toast.makeText(this, "iam Leicester", Toast.LENGTH_SHORT).show());
        btFiorenta.setOnClickListener(View -> Toast.makeText(this, "iam Fiorenta", Toast.LENGTH_SHORT).show());
        }


    }

