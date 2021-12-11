package sm.uok.cooking;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

import java.net.URL;
import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private RecyclerView recyclerMainList;
    private DrawerLayout drawer;
    private int selectedTheme;
    private SharedPreferences sharedPreferences;
    private SharedPreferences.Editor editor;
    public static int selectUserTheme;
    private boolean doubleback=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sharedPreferences=getSharedPreferences("myData",MODE_PRIVATE);
        selectUserTheme=sharedPreferences.getInt("SelectedTheme",0);
        switch (selectUserTheme){
            case 0:
                setTheme(R.style.MainActivityTheme);
                break;
            case 1:
                setTheme(R.style.MainActivityThemeDark);
                break;
        }
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this,drawer,toolbar,R.string.open,R.string.close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView  = findViewById(R.id.navigation);

        recyclerMainList = (RecyclerView) findViewById(R.id.recycleMainList);
        recyclerMainList.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<objectOfList> list = new ArrayList<objectOfList>();
        list.add(new objectOfList("لیست علاقه مندی ها", R.drawable.book));
        list.add(new objectOfList("غذاهای  ایرانی", R.drawable.ghazayeirani));
        list.add(new objectOfList("غذاهای فست فود", R.drawable.ghazayekhareji));
        list.add(new objectOfList("غذاهای چینی", R.drawable.china));
        list.add(new objectOfList("غذاهای مکزیکی", R.drawable.mexico));
        list.add(new objectOfList("غذاهای مدیترانه ای", R.drawable.mediterranean));
        list.add(new objectOfList("غذاهای عربی", R.drawable.arabic));

        myAdapter adapter = new myAdapter(list, this);
        recyclerMainList.setAdapter(adapter);

        navigationView.setNavigationItemSelectedListener(this);


    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.search:
                //search
                Intent intent2=new Intent(MainActivity.this,Search.class);
                MainActivity.this.startActivity(intent2);
                break;


            case R.id.changeTheme:
                //changeTheme
               CharSequence[] charSequences= new CharSequence[]{"main","dark"};
                AlertDialog.Builder builder=new AlertDialog.Builder(this);
                builder.setTitle("تم خود را انتخاب کنید");
                builder.setSingleChoiceItems(charSequences, -1, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                     selectedTheme=which;
                    }
                });
                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        editor=sharedPreferences.edit();
                        editor.putInt("SelectedTheme",selectedTheme);
                        editor.apply();

                        Intent intentTheme=new Intent(MainActivity.this,SplashActivity.class);
                        MainActivity.this.startActivity(intentTheme);
                        finishAffinity();
                    }
                });
                builder.setNegativeButton("cancel",null);
                builder.show();

                break;
            case R.id.likeUs:
                Uri uri=Uri.parse("https://google.com");
                Intent intentlikeus=new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intentlikeus);
                break;


            case R.id.aboutUs:
                Intent intent = new Intent(MainActivity.this,AboutUs.class);
                MainActivity.this.startActivity(intent);
                break;

            case R.id.Exit:
                finishAffinity();
                break;

        }
        drawer.closeDrawer(GravityCompat.START);
        return false;
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)){
                drawer.closeDrawer(GravityCompat.START);
                
        }else {


            if(doubleback){
                finishAffinity();
                return;
            }
            doubleback=true;
            Toast.makeText(this,"برای خروج دوباره کلیک کنید",Toast.LENGTH_SHORT).show();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    doubleback=false;

                }
            },2000);
        }
    }
}
