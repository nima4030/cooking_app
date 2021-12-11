package sm.uok.cooking;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class StudyActivity extends AppCompatActivity {

    private TextView txt_explain;
    private TextView txt_title;
    private ImageView img_study;
    private ToggleButton tgl;
    private SharedPreferences mydatasaved;
    private SharedPreferences.Editor editor;

    @SuppressLint("ClickableViewAccessibility")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        switch (MainActivity.selectUserTheme){

            case 0:
                setTheme(R.style.AppThemeMain);
                break;
            case 1:
                setTheme(R.style.AppThemeDark);
                break;
        }
        setContentView(R.layout.activity_study);
        txt_explain= findViewById(R.id.txt_explain);
        txt_title = findViewById(R.id.txt_title);
        img_study= findViewById(R.id.img_study);
        tgl= findViewById(R.id.tgl);




      final String stringData= getIntent().getStringExtra("data");

       mydatasaved= getSharedPreferences("myData",MODE_PRIVATE);
       boolean toggleMode=mydatasaved.getBoolean(stringData,false);
       if(toggleMode){
           tgl.toggle();
       }
        tgl.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(tgl.getText().equals("جزو علاقه مندی ها")){
                    editor=mydatasaved.edit();
                    editor.putBoolean(stringData,true);
                    editor.apply();
                    Toast.makeText(StudyActivity.this,"به لیست علاقه مندی ها اضافه شد",Toast.LENGTH_SHORT).show();

                }else {
                    editor=mydatasaved.edit();
                    editor.putBoolean(stringData,false);
                    editor.apply();
                    Toast.makeText(StudyActivity.this,"از لیست علاقه منذی ها حذف شد",Toast.LENGTH_SHORT).show();
                    ForwardList.reCreate=true;
                }


                return false;
            }
        });



        switch (stringData){
            //irani:
            case "reshte":
                txt_title.setText("رشته پلو");
                img_study.setImageResource(R.drawable.reshtepolo);
                txt_explain.setText(R.string.reshtepolo);
                break;

            case "fesn":
                txt_title.setText("فسنجون");
                img_study.setImageResource(R.drawable.fesenjun);
                txt_explain.setText(R.string.fesenjun);
                break;
                //khareji
            case "pit":
                txt_title.setText("پیتزا");
                img_study.setImageResource(R.drawable.pitza);
                txt_explain.setText(R.string.pitza);
                break;
    ////////////////mediterranean foods/////////////////////////////
            case "mt_1":
                txt_title.setText("ژیرو");
                img_study.setImageResource(R.drawable.d8);
                txt_explain.setText(R.string.pitza);
                break;
            case "mt_2":
                txt_title.setText("سوولاکی");
                img_study.setImageResource(R.drawable.d9);
                txt_explain.setText(R.string.pitza);
                break;
            case "mt_3":
                txt_title.setText("اسفوگاتا");
                img_study.setImageResource(R.drawable.pitza);
                txt_explain.setText(R.string.pitza);
                break;
            case "mt_4":
                txt_title.setText("موساکا");
                img_study.setImageResource(R.drawable.pitza);
                txt_explain.setText(R.string.pitza);
                break;
            case "mt_5":
                txt_title.setText("تیروپیتس");
                img_study.setImageResource(R.drawable.pitza);
                txt_explain.setText(R.string.pitza);
                break;
            case "mt_6":
                txt_title.setText("تزاتزیکی");
                img_study.setImageResource(R.drawable.pitza);
                txt_explain.setText(R.string.pitza);
                break;
            case "mt_7":
                txt_title.setText("کانولی");
                img_study.setImageResource(R.drawable.pitza);
                txt_explain.setText(R.string.pitza);
                break;
            case "mt_8":
                txt_title.setText("پیده");
                img_study.setImageResource(R.drawable.pitza);
                txt_explain.setText(R.string.pitza);
                break;
            case "mt_9":
                txt_title.setText("کومپیر");
                img_study.setImageResource(R.drawable.pitza);
                txt_explain.setText(R.string.pitza);
                break;
            case "mt_10":
                txt_title.setText("بورک");
                img_study.setImageResource(R.drawable.pitza);
                txt_explain.setText(R.string.pitza);
                break;
      /////////////END/////////////////////////////////////
      /////////////china foods////////////////////////////////
            case "ch_1":
                txt_title.setText("دامپلینگ چینی");
                img_study.setImageResource(R.drawable.d4);
                txt_explain.setText(R.string.pitza);
                break;
            case "ch_2":
                txt_title.setText("وونتون");
                img_study.setImageResource(R.drawable.d5);
                txt_explain.setText(R.string.pitza);
                break;
            case "ch_3":
                txt_title.setText("ایکسایو لانگ بائو");
                img_study.setImageResource(R.drawable.pitza);
                txt_explain.setText(R.string.pitza);
                break;
            case "ch_4":
                txt_title.setText("اردک کبابی");
                img_study.setImageResource(R.drawable.pitza);
                txt_explain.setText(R.string.pitza);
                break;
            case "ch_5":
                txt_title.setText("چیکن کونگ پائو");
                img_study.setImageResource(R.drawable.pitza);
                txt_explain.setText(R.string.pitza);
                break;
            case "ch_6":
                txt_title.setText("سیب زمینی رنده شده سرخ شده");
                img_study.setImageResource(R.drawable.pitza);
                txt_explain.setText(R.string.pitza);
                break;
            case "ch_7":
                txt_title.setText("ماپو توفو");
                img_study.setImageResource(R.drawable.pitza);
                txt_explain.setText(R.string.pitza);
                break;
            case "ch_8":
                txt_title.setText("نودل ژاجیانگ می ین");
                img_study.setImageResource(R.drawable.pitza);
                txt_explain.setText(R.string.pitza);
                break;
            case "ch_9":
                txt_title.setText("نودل چومین");
                img_study.setImageResource(R.drawable.pitza);
                txt_explain.setText(R.string.pitza);
                break;
            case "ch_10":
                txt_title.setText("چائو فان");
                img_study.setImageResource(R.drawable.pitza);
                txt_explain.setText(R.string.pitza);
                break;
////////////////////////////END/////////////////////////////////
///////////////////////////mexico foods/////////////////////////
            case "mx_1":
                txt_title.setText("چیلاکیله");
                img_study.setImageResource(R.drawable.d6);
                txt_explain.setText(R.string.mx_1);
                break;
            case "mx_2":
                txt_title.setText("پوزوله");
                img_study.setImageResource(R.drawable.d7);
                txt_explain.setText(R.string.mx_2);
                break;
            case "mx_3":
                txt_title.setText("تاکو الپاستور");
                img_study.setImageResource(R.drawable.pitza);
                txt_explain.setText(R.string.mx_3);
                break;
            case "mx_4":
                txt_title.setText("توستادا");
                img_study.setImageResource(R.drawable.pitza);
                txt_explain.setText(R.string.mx_4);
                break;
            case "mx_5":
                txt_title.setText("چیلی نوگادا");
                img_study.setImageResource(R.drawable.pitza);
                txt_explain.setText(R.string.mx_5);
                break;
            case "mx_6":
                txt_title.setText("ایلوته");
                img_study.setImageResource(R.drawable.pitza);
                txt_explain.setText(R.string.mx_6);
                break;
            case "mx_7":
                txt_title.setText("انچیلادا");
                img_study.setImageResource(R.drawable.pitza);
                txt_explain.setText(R.string.mx_7);
                break;
            case "mx_8":
                txt_title.setText("موله");
                img_study.setImageResource(R.drawable.pitza);
                txt_explain.setText(R.string.mx_8);
                break;
            case "mx_9":
                txt_title.setText("گواکاموله");
                img_study.setImageResource(R.drawable.pitza);
                txt_explain.setText(R.string.mx_9);
                break;
            case "mx_10":
                txt_title.setText("تاماله");
                img_study.setImageResource(R.drawable.pitza);
                txt_explain.setText(R.string.mx_10);
                break;

///////////////////////////END////////////////////////////////////
/////////////////////////arabic foods/////////////////////////////
            case "ar_1":
                txt_title.setText("شاورما");
                img_study.setImageResource(R.drawable.d);
                txt_explain.setText(R.string.ar_1);
                break;
            case "ar_2":
                txt_title.setText("فلافل عربی");
                img_study.setImageResource(R.drawable.d3);
                txt_explain.setText(R.string.ar_2);
                break;
            case "ar_3":
                txt_title.setText("حمص");
                img_study.setImageResource(R.drawable.d2);
                txt_explain.setText(R.string.ar_3);
                break;
            case "ar_4":
                txt_title.setText("مجبوس");
                img_study.setImageResource(R.drawable.pitza);
                txt_explain.setText(R.string.ar_4);
                break;
            case "ar_5":
                txt_title.setText("کوشاری");
                img_study.setImageResource(R.drawable.pitza);
                txt_explain.setText(R.string.ar_5);
                break;
            case "ar_6":
                txt_title.setText("سالاد تبوله");
                img_study.setImageResource(R.drawable.pitza);
                txt_explain.setText(R.string.ar_6);
                break;
            case "ar_7":
                txt_title.setText("لحم عجین");
                img_study.setImageResource(R.drawable.pitza);
                txt_explain.setText(R.string.ar_7);
                break;
            case "ar_8":
                txt_title.setText("کبه");
                img_study.setImageResource(R.drawable.pitza);
                txt_explain.setText(R.string.ar_8);
                break;
            case "ar_9":
                txt_title.setText("مندی مرغ");
                img_study.setImageResource(R.drawable.pitza);
                txt_explain.setText(R.string.ar_9);
                break;
            case "ar_10":
                txt_title.setText("شیش کباب");
                img_study.setImageResource(R.drawable.pitza);
                txt_explain.setText(R.string.ar_10);
                break;


///////////////////////////END////////////////////////////////////

        }
    }
}