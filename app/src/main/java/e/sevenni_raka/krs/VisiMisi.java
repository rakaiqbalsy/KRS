package e.sevenni_raka.krs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class VisiMisi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visi_misi);

        WebView webView = (WebView) findViewById(R.id.isivisi);
        String text = "Menjadi Salah Satu Penyelenggara Program Studi Teknik Informatika yang Unggul dan Kompetitif di Indonesia pada Tahun 2020 dalam Bingkai Akhlak Karimah.";

        webView.loadData("<p style=\"text-align: justify\">"+text+"</p>","text/html", "UTF-8");

        WebView webView1 = (WebView) findViewById(R.id.isimisi);

        String text1 = "1. Menyelenggarakan dan mengelola program studi yang profesional, akuntabel, dan berdaya saing untuk memperkuat pengembangan ilmu pengetahun dan teknologi bidang informatika pada tingkat nasional maupun internasional berbasis wahyu memandu ilmu." +
                "2. Menyelenggarakan pendidikan tinggi bidang informatika yang mampu menciptakan lulusan yang terampil, profesional, berjiwa entrepreneurship dan berakhlak karimah."+
                "3. Menyelenggarakan penelitian guna mengembangkan dan menerapkan ilmu pengetahuan dan teknologi bidang informatika yang dilandasi nilai Islami." +
                "4. Menyelenggarakan pengabdian kepada masyarakat, untuk menyebarluaskan pengetahuan dan teknologi bidang informatika, guna mengembangkan potensi dan daya saing masyarakat yang berakar pada nilai Islami.";

        webView1.loadData("<p style=\"text-align: justify\">"+text1+"</p>","text1/html", "UTF-8");
    }
}
