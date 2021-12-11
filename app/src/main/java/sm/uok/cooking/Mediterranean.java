package sm.uok.cooking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class Mediterranean extends AppCompatActivity {
    private RecyclerView recyclerListMediterranean;

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
        setContentView(R.layout.activity_mediterranean);

        recyclerListMediterranean=findViewById(R.id.recyclerListMediterranean);
        recyclerListMediterranean.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<objectOfList> list=new ArrayList<objectOfList>();
        list.add(new objectOfList("ژیرو",R.drawable.d8));
        list.add(new objectOfList("سوولاکی",R.drawable.d9));
        list.add(new objectOfList("اسفوگاتا",R.drawable.empty));
        list.add(new objectOfList("موساکا",R.drawable.empty));
        list.add(new objectOfList("تیروپیتس",R.drawable.empty));
        list.add(new objectOfList("تزاتزیکی",R.drawable.empty));
        list.add(new objectOfList("کانولی",R.drawable.empty));
        list.add(new objectOfList("پیده",R.drawable.empty));
        list.add(new objectOfList("کومپیر",R.drawable.empty));
        list.add(new objectOfList("بورک",R.drawable.empty));






        myAdapter adapter=new myAdapter(list,this);
        recyclerListMediterranean.setAdapter(adapter);
    }
}