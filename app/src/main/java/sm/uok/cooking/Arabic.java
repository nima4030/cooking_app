package sm.uok.cooking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Arabic extends AppCompatActivity {
    private RecyclerView recyclerListArabic;

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

        setContentView(R.layout.activity_arabic);
        recyclerListArabic=findViewById(R.id.recyclerListArabic);
        recyclerListArabic.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<objectOfList> list=new ArrayList<objectOfList>();
        list.add(new objectOfList("شاورما",R.drawable.d));
        list.add(new objectOfList("فلافل عربی",R.drawable.d3));
        list.add(new objectOfList("حمص",R.drawable.d2));
        list.add(new objectOfList("مجبوس",R.drawable.empty));
        list.add(new objectOfList("کوشاری",R.drawable.empty));
        list.add(new objectOfList("سالاد تبوله",R.drawable.empty));
        list.add(new objectOfList("لحم عجین",R.drawable.empty));
        list.add(new objectOfList("کبه",R.drawable.empty));
        list.add(new objectOfList("مندی مرغ",R.drawable.empty));
        list.add(new objectOfList("شیش کباب",R.drawable.empty));






        myAdapter adapter=new myAdapter(list,this);
        recyclerListArabic.setAdapter(adapter);

    }
}