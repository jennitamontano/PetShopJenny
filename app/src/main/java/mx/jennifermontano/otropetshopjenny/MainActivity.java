package mx.jennifermontano.otropetshopjenny;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Pets> pets;
    private RecyclerView petList;
    public PetsAdapter petadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar miActionBar = (Toolbar) findViewById(R.id.miActionBar);
        setSupportActionBar(miActionBar);

        ActionBar actionBar = getSupportActionBar();//
        getSupportActionBar().setCustomView(R.layout.actionbar);
        actionBar.setDisplayHomeAsUpEnabled(true);//
                //setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM|ActionBar.DISPLAY_SHOW_HOME);//

        petList = (RecyclerView) findViewById(R.id.rvPets);
        //Forma cómo se mostrará el RecyclerView:
        LinearLayoutManager linlama= new LinearLayoutManager(this);
        linlama .setOrientation(LinearLayoutManager.VERTICAL);
        petList.setLayoutManager(linlama);
        beginPetList();
        beginAdapter();
    }
    public void beginAdapter(){
        PetsAdapter petadapter = new PetsAdapter(pets,this);
        petList.setAdapter(petadapter);
    }
    public void beginPetList(){
        pets = new ArrayList<Pets>();
        //Se crea lista de mascotas:
        pets.add(new Pets(R.drawable.perro,"Doki","4"));
        pets.add(new Pets(R.drawable.perro2,"Tuxie","6"));
        pets.add(new Pets(R.drawable.perro3,"Príncipe","3"));
        pets.add(new Pets(R.drawable.perro4,"Lucky","3"));
        pets.add(new Pets(R.drawable.perro5,"Chiquis","9"));
        pets.add(new Pets(R.drawable.perro6,"Kiwi","10"));
        pets.add(new Pets(R.drawable.perro7,"Ronny","4"));
        pets.add(new Pets(R.drawable.perro8,"Shoko","12"));
        pets.add(new Pets(R.drawable.perro9,"Scottie","3"));
        pets.add(new Pets(R.drawable.perro10,"Kiara","15"));
    }
    public void showFavoritePets(View v){
        //getSupportActionBar().setCustomView(R.layout.activity_favorite_pets);
        Intent intent = new Intent(this,FavoritePets.class);
        startActivity(intent);
    }
}
