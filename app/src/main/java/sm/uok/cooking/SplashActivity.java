package sm.uok.cooking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;

public class SplashActivity extends AppCompatActivity {


    private ProgressBar prg;
    Handler handler;
    int counter=0;
    private SharedPreferences splashpref;
    private int splashtheme;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        splashpref=getSharedPreferences("myData",MODE_PRIVATE);
       splashtheme= splashpref.getInt("SelectedTheme",0);
        switch (splashtheme){

            case 0:
                setTheme(R.style.splashstyle);
                setContentView(R.layout.activity_splash);
                break;
            case 1:
                setTheme(R.style.splashstyleDark);
                setContentView(R.layout.activity_splashdark);
                break;
        }

       prg= findViewById(R.id.prg);
       handler=new Handler();
       new Thread(new Runnable() {
           @Override
           public void run() {
               while (counter != 100) {
                   try {

                       counter += 1;
                       handler.post(new Runnable() {
                           @Override
                           public void run() {
                               prg.setProgress(counter);
                               if (counter == 100) {
                                   Intent intent = new Intent(SplashActivity.this, MainActivity.class);
                                   SplashActivity.this.startActivity(intent);
                                   finish();
                               }

                           }
                       });
                       Thread.sleep(20);

                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
               }
           }


       }).start();
    }
}