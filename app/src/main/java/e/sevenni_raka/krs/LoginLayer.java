package e.sevenni_raka.krs;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginLayer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_layer);

        final EditText username = (EditText) findViewById(R.id.inuser);
        final EditText password = (EditText) findViewById(R.id.inpass);
        Button login = (Button) findViewById(R.id.button_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user_name = username.getText().toString();
                String pass = password.getText().toString();
                if(user_name.equals("Admin") && pass.equals("Admin")) {
                    Intent i = new Intent(getApplicationContext(), VisiMisi.class);
                    startActivity(i);
                    //Toast.makeText(getApplicationContext(), "Berhasil Login", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(getApplicationContext(), "Gagal Login username dan password tidak sesuai", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
