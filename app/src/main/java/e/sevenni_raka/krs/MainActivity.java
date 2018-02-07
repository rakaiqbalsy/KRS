package e.sevenni_raka.krs;

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

        final Button visimisi = (Button) findViewById(R.id.visimisi);
        Button kurikulum4 = (Button) findViewById(R.id.kurikulum);
        Button webif = (Button) findViewById(R.id.web);

        visimisi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), VisiMisi.class);
                startActivity(i);
            }
        });

        kurikulum4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Kurikulum.class);
                startActivity(i);
            }
        });

        webif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW);
                String urllink = "http://if.uinsgd.ac.id/";
                browserIntent.setData(Uri.parse(urllink));
                startActivity(browserIntent);
            }
        });
    }
}
