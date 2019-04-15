package com.example.yuya.menusample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MenuListActivity extends AppCompatActivity {

    private ListView _lvMenu;
    private List<Map<String,Object>> _menuList;
    private static final String[] FORM = {"name","price"};
    private static final int[] TO = {R.id.tvMenuName,R.id.tvMenuPrice};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_list);

        _lvMenu = findViewById(R.id.lvMenu);

    }

    private List<Map<String,Object>> createTeisyokuList(){
        List<Map<String,Object>> menuList = new ArrayList<>();
        Map<String,Object> menu = new HashMap<>();
        menu.put("name","唐揚げ定食");
        menu.put("price","700");
        menu.put("desc","から揚げ６個、サラダ、味噌汁");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","ハンバーグ定食");
        menu.put("price","850");
        menu.put("desc","デミグラスソースハンバーグ、サラダ、味噌汁");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","生姜焼き定食");
        menu.put("price","800");
        menu.put("desc","生姜焼き、サラダ、味噌汁");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","ステーキ定食");
        menu.put("price","1050");
        menu.put("desc","牛ステーキ150g、サラダ、味噌汁");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","野菜炒め定食");
        menu.put("price","750");
        menu.put("desc","野菜炒め、漬物、味噌汁");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","とんかつ定食");
        menu.put("price","850");
        menu.put("desc","ヒレカツ、サラダ、味噌汁");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","ミンチかつ定食");
        menu.put("price","850");
        menu.put("desc","メンチカツ、サラダ、味噌汁");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","チキンカツ定食");
        menu.put("price","950");
        menu.put("desc","チキンカツ、サラダ、味噌汁");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","コロッケ定食");
        menu.put("price","650");
        menu.put("desc","コロッケ、サラダ、味噌汁");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","焼き魚定食");
        menu.put("price","800");
        menu.put("desc","アジの開き、おひたし、味噌汁");
        menuList.add(menu);

        menu = new HashMap<>();
        menu.put("name","焼肉定食");
        menu.put("price","850");
        menu.put("desc","焼肉200g、サラダ、味噌汁");
        menuList.add(menu);

        return menuList;
    }

    private class ListItemClickListener implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Map<String,Object> item = (Map<String, Object>) parent.getItemAtPosition(position);
            String menuName =(String) item.get("name");
            Integer menuPrice =(Integer) item.get("price");

            Intent intent = new Intent(MenuListActivity.this,MenuThanksActivity.class);
            intent.putExtra("menuName",menuName);
            intent.putExtra("menuPrice",menuPrice +"円");
            startActivity(intent);
        }
    }

}