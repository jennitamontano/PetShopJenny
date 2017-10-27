package mx.jennifermontano.otropetshopjenny;

//import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Jennifer on 22/10/2017.
 */

public class PetsAdapter extends RecyclerView.Adapter<PetsAdapter.PetsViewHolder> {

    ArrayList<Pets> pets;
    Activity activity;

    public PetsAdapter(ArrayList<Pets> pets,Activity activity){
        this.pets   =   pets;
        this.activity=activity;
    }

    @Override
    public PetsAdapter.PetsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v  = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_pet,parent,false);
        return new PetsViewHolder(v);
    }

    @Override
    public void onBindViewHolder(PetsAdapter.PetsViewHolder petsViewHolder, int position) {
        final Pets pet = pets.get(position);
        petsViewHolder.imgFoto.setImageResource(pet.getFoto());
        petsViewHolder.tvNombreCV.setText(pet.getNombre());
        petsViewHolder.tvLikesCV.setText(pet.getLikes());
        petsViewHolder.imgBone.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                Toast.makeText(activity, "LIKE  "+pet.getNombre(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return pets.size();
    }

    public static class PetsViewHolder extends RecyclerView.ViewHolder {

        private ImageView imgFoto;
        private TextView tvNombreCV;
        private TextView tvLikesCV;
        private ImageButton imgBone;
        private ImageButton btnLikeYellow;


        public PetsViewHolder(View itemView) {
            super(itemView);
            imgFoto     =   (ImageView) itemView.findViewById(R.id.imgFoto);
            tvNombreCV  =   (TextView) itemView.findViewById(R.id.tvNombreCV);
            tvLikesCV   =   (TextView) itemView.findViewById(R.id.tvLikesCV);
            btnLikeYellow     =   (ImageButton) itemView.findViewById(R.id.btnLikeYellow);
            imgBone     =   (ImageButton) itemView.findViewById(R.id.imgBone);
        }
    }
}
