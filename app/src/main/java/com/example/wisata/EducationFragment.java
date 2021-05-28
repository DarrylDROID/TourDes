package com.example.wisata;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import model.ArrayDestination;
import model.Destination;

import static model.ArrayDestination.savedestinationlist;


public class EducationFragment extends Fragment {
    Button btn_museumangkut, btn_kotatua, btn_tamanpintar, btn_kidzania, btn_tamanmini, btn_jatimpark;
    String code = "";
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_education, container, false);
        initView();
        return view;
    }

    private void initView() {
        btn_museumangkut = view.findViewById(R.id.btn_museumangkut);
        btn_kotatua = view.findViewById(R.id.btn_kotatua);
        btn_tamanpintar = view.findViewById(R.id.btn_tamanpintar);
        btn_kidzania = view.findViewById(R.id.btn_kidzania);
        btn_tamanmini = view.findViewById(R.id.btn_tamanmini);
        btn_jatimpark = view.findViewById(R.id.btn_jatimpark);

        savedestinationlist.add(new Destination(R.drawable.museum_angkut, "Museum Angkut", "Location: Malang", "If you are on vacation in Malang, it's a shame if you don't stop by the Museum of Transport. This vacation spot as well as educational tourism in Indonesia has indeed been very popular in recent years."));
        savedestinationlist.add(new Destination(R.drawable.kota_tua, "Kota Tua", "Location: Jakarta", "Even though it is famous for its very developed city, Jakarta also has many historical destinations that are suitable for educational tours that are a pity to miss. One of the most popular vacation spots and is still favored by many tourists today is Kota Tua, Jakarta. Located in the West Jakarta area, this educational tourist attraction in Indonesia will provide an in-depth historical experience about Batavia in the past. There are lots of interesting spots that you can explore in this educational tourism area in Indonesia, starting from the Fatahillah Museum, Bank Indonesia Museum, Jakarta Kota Station which has been open since 1929, Sunda Kelapa Harbor which is a witness to the history of the glory of Sunda Kelapa, Wayang Museum to the Museum Maritime and various other interesting educational tourist destinations."));
        savedestinationlist.add(new Destination(R.drawable.taman_pintar, "Taman Pintar", "Location: Yogyakarta", "Yogyakarta is not only popular for its culture and natural scenery. Educational tourism as a vacation spot is also very much. One of the most popular is Taman Pintar. This educational tourist attraction in Indonesia is located on Jalan Panembahan Senopati number 1-3, close to the Vredeburg Fort area. This park is managed directly by the local government as a learning tool for students and people who want to deepen their knowledge in an exciting way.This educational tourist attraction in Indonesia is divided into several zones and rides. Each vehicle has a special theme such as the automotive zone, replica zone, oil and petroleum processing zone and so on. Even though it provides many rides, the entrance fee to Taman Pintar is very affordable."));
        savedestinationlist.add(new Destination(R.drawable.kidzania, "Kidzania", "Location: Jakarta", "If you are looking for educational tours that are suitable for children's learning media while on vacation, Kidzania is one option that is no less interesting. This educational tourist attraction in Indonesia is located in a shopping center so that the whole family can visit and do various other activities."));
        savedestinationlist.add(new Destination(R.drawable.taman_mini, "Taman Mini Indonesia", "Location: Jakarta", "This educational tourism destination in Indonesia, which is more popularly known as TMII, is also still in Jakarta. As one of the attractions that has been in operation for a long time, TMII is a favorite educational holiday location not only for locals but also those from outside the city. In this place, visitors can learn about the diversity of customs that Indonesia has."));
        savedestinationlist.add(new Destination(R.drawable.jatim_park, "Jatim Park 2", "Location: Batu", "As the name suggests, Jatim Park is located in East Java, precisely in the city of Batu. This educational tourist spot consists of the Animal Museum, Batu Secret Zoo and Eco Green Park, which each location has its own peculiarities. With these various rides, in Jatim Park 2 you can learn a variety of knowledge related to animals to replicas of Stegosaurus and Tyrannosaurus. Not only that, you can also enjoy a zoo with a modern concept."));

        btn_museumangkut.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                code = "Museum Angkut";
                for (int i = 0; i < ArrayDestination.savedestinationlist.size(); i++) {
                    Destination tempUser = ArrayDestination.savedestinationlist.get(i);
                    if ((tempUser.getMaintext().equalsIgnoreCase(code))) {
                        Intent intent = new Intent(getActivity(), Display.class);
                        intent.putExtra("Display", tempUser);
                        startActivity(intent);
                    }
                }
            }
        });

        btn_kotatua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code = "Kota Tua";
                for (int i = 0; i < ArrayDestination.savedestinationlist.size(); i++) {
                    Destination tempUser = ArrayDestination.savedestinationlist.get(i);
                    if ((tempUser.getMaintext().equalsIgnoreCase(code))) {
                        Intent intent = new Intent(getActivity(), Display.class);
                        intent.putExtra("Display", tempUser);
                        startActivity(intent);
                    }
                }
            }
        });

        btn_tamanpintar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code = "Taman Pintar";
                for (int i = 0; i < ArrayDestination.savedestinationlist.size(); i++) {
                    Destination tempUser = ArrayDestination.savedestinationlist.get(i);
                    if ((tempUser.getMaintext().equalsIgnoreCase(code))) {
                        Intent intent = new Intent(getActivity(), Display.class);
                        intent.putExtra("Display", tempUser);
                        startActivity(intent);
                    }
                }
            }
        });

        btn_kidzania.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code = "Kidzania";
                for (int i = 0; i < ArrayDestination.savedestinationlist.size(); i++) {
                    Destination tempUser = ArrayDestination.savedestinationlist.get(i);
                    if ((tempUser.getMaintext().equalsIgnoreCase(code))) {
                        Intent intent = new Intent(getActivity(), Display.class);
                        intent.putExtra("Display", tempUser);
                        startActivity(intent);
                    }
                }
            }
        });

        btn_tamanmini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code = "Taman Mini Indonesia";
                for (int i = 0; i < ArrayDestination.savedestinationlist.size(); i++) {
                    Destination tempUser = ArrayDestination.savedestinationlist.get(i);
                    if ((tempUser.getMaintext().equalsIgnoreCase(code))) {
                        Intent intent = new Intent(getActivity(), Display.class);
                        intent.putExtra("Display", tempUser);
                        startActivity(intent);
                    }
                }
            }
        });

        btn_jatimpark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code = "Jatim Park 2";
                for (int i = 0; i < ArrayDestination.savedestinationlist.size(); i++) {
                    Destination tempUser = ArrayDestination.savedestinationlist.get(i);
                    if ((tempUser.getMaintext().equalsIgnoreCase(code))) {
                        Intent intent = new Intent(getActivity(), Display.class);
                        intent.putExtra("Display", tempUser);
                        startActivity(intent);
                    }
                }
            }
        });
    }
}