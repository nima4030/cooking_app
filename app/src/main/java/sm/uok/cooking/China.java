package sm.uok.cooking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class China extends AppCompatActivity {
    private RecyclerView recyclerListChina;
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
        setContentView(R.layout.activity_china);

        recyclerListChina=findViewById(R.id.recyclerListChina);
        recyclerListChina.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<objectOfList> list=new ArrayList<objectOfList>();
        list.add(new objectOfList("دامپلینگ چینی",R.drawable.d4));
        list.add(new objectOfList("وونتون",R.drawable.d5));
        list.add(new objectOfList("ایکسایو لانگ بائو",R.drawable.empty));
        list.add(new objectOfList("اردک کبابی",R.drawable.empty));
        list.add(new objectOfList("چیکن کونگ پائو",R.drawable.empty));
        list.add(new objectOfList("سیب زمینی رنده شده سرخ شده",R.drawable.empty));
        list.add(new objectOfList("ماپو توفو",R.drawable.empty));
        list.add(new objectOfList("نودل ژاجیانگ می ین",R.drawable.empty));
        list.add(new objectOfList("نودل چومین",R.drawable.empty));
        list.add(new objectOfList("چائو فان",R.drawable.empty));














        myAdapter adapter=new myAdapter(list,this);
        recyclerListChina.setAdapter(adapter);

    }
}