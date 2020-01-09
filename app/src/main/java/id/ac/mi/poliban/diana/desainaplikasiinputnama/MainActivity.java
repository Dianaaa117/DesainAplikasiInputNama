package id.ac.mi.poliban.diana.desainaplikasiinputnama;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etText = findViewById(R.id.editText);
        Button btTampilan = findViewById(R.id.btTampilan);

        btTampilan.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ShowToast")
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Selamat Datang" + etText.getText().toString(), Toast.LENGTH_LONG);
            }
        });
}
}