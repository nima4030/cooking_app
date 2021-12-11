package sm.uok.cooking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class ForwardList extends AppCompatActivity {

    private RecyclerView listForward;
    private SharedPreferences dataSaved;
    public static boolean reCreate=false;

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
        setContentView(R.layout.activity_forward_list);

        dataSaved=getSharedPreferences("myData",MODE_PRIVATE);
        boolean reshtepolo=dataSaved.getBoolean("reshte",false);
        boolean fesnjun=dataSaved.getBoolean("fesn",false);
        boolean pitza=dataSaved.getBoolean("pit",false);

        boolean ch_1=dataSaved.getBoolean("ch_1",false);
        boolean ch_2=dataSaved.getBoolean("ch_2",false);

        boolean mx_1=dataSaved.getBoolean("mx_1",false);
        boolean mx_2=dataSaved.getBoolean("mx_2",false);

        boolean mt_1=dataSaved.getBoolean("mt_1",false);
        boolean mt_2=dataSaved.getBoolean("mt_2",false);

        boolean ar_1=dataSaved.getBoolean("ar_1",false);
        boolean ar_2=dataSaved.getBoolean("ar_2",false);

        listForward=findViewById(R.id.listForward);
        listForward.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<objectOfList> list=new ArrayList<objectOfList>();

        if(reshtepolo){
            list.add(new objectOfList("رشته پلو",R.drawable.reshtepolo));
        }
        if(fesnjun){
            list.add(new objectOfList("فسنجون",R.drawable.ghazayekhareji));
        }
        if(pitza){
            list.add(new objectOfList("پیتزا",R.drawable.pitza));
        }
        if (ch_1) {
            list.add(new objectOfList("دامپلینگ چینی",R.drawable.d4));

        }
        if (ch_2) {
            list.add(new objectOfList("وونتون",R.drawable.d5));

        }
        if (mx_1) {
            list.add(new objectOfList("چیلاکیله",R.drawable.d6));

        }
        if (mx_2) {
            list.add(new objectOfList("پوزوله",R.drawable.d7));

        }
        if (mt_1) {
            list.add(new objectOfList("ژیرو",R.drawable.d8));

        }
        if (mt_2) {
            list.add(new objectOfList("سوولاکی",R.drawable.d9));

        }
        if (ar_1) {
            list.add(new objectOfList("شاورما",R.drawable.d));

        }
        if (ar_2) {
            list.add(new objectOfList("فلافل عربی",R.drawable.d3));

        }
        myAdapter adapter=new myAdapter(list,this);
        listForward.setAdapter(adapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        if(reCreate){
            recreate();
            reCreate=false;
        }
    }
}