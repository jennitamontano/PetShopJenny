package mx.jennifermontano.otropetshopjenny;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class FavoritePets extends AppCompatActivity {

    ArrayList<Pets> favoritePets;
    private RecyclerView petList;
    public PetsAdapter petsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favorite_pets);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        petList = (RecyclerView) findViewById(R.id.rvFavoPets);

        LinearLayoutManager linlama = new LinearLayoutManager(this);
        linlama.setOrientation(LinearLayoutManager.VERTICAL);
        petList.setLayoutManager(linlama);
        startPetList();
        startPetAdapter();
    }

    public void startPetAdapter(){
        PetsAdapter petsAdapter = new PetsAdapter(favoritePets,this);
        petList.setAdapter(petsAdapter);
    }

    public void startPetList(){
        favoritePets = new ArrayList<Pets>();

        //Lista de Mascotas Favoritas:
        favoritePets.add(new Pets(R.drawable.perro2,"Tuxie","6"));
        favoritePets.add(new Pets(R.drawable.perro5,"Chiquis","9"));
        favoritePets.add(new Pets(R.drawable.perro6,"Kiwi","10"));
        favoritePets.add(new Pets(R.drawable.perro8,"Shoko","12"));
        favoritePets.add(new Pets(R.drawable.perro10,"kiara","15"));
    }
}
