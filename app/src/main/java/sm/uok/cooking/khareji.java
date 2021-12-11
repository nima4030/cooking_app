package sm.uok.cooking;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class khareji extends AppCompatActivity {

    private RecyclerView recyclerListKhareji;

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
        setContentView(R.layout.activity_khareji);


        recyclerListKhareji=findViewById(R.id.recyclerListKhareji);
        recyclerListKhareji.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<objectOfList> list=new ArrayList<objectOfList>();
        list.add(new objectOfList("پیتزا",R.drawable.pitza));
        list.add(new objectOfList("استیک",R.drawable.ghazayekhareji));
        list.add(new objectOfList("empty",R.drawable.empty));
        list.add(new objectOfList("empty",R.drawable.empty));
        list.add(new objectOfList("empty",R.drawable.empty));
        list.add(new objectOfList("empty",R.drawable.empty));
        list.add(new objectOfList("empty",R.drawable.empty));
        list.add(new objectOfList("empty",R.drawable.empty));
        list.add(new objectOfList("empty",R.drawable.empty));
        list.add(new objectOfList("empty",R.drawable.empty));






        myAdapter adapter=new myAdapter(list,this);
        recyclerListKhareji.setAdapter(adapter);

    }
}