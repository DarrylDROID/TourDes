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

public class NatureFragment extends Fragment {
    Button btn_rajaampat, btn_pulaukomodo, btn_gunungrinjani, btn_kepulauanbelitung, btn_gunungbromo, btn_danautoba;
    String code = "";
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_nature, container, false);
        initView();
        return view;
    }

    private void initView() {
        btn_rajaampat = view.findViewById(R.id.btn_rajaampat);
        btn_pulaukomodo = view.findViewById(R.id.btn_pulaukomodo);
        btn_gunungrinjani = view.findViewById(R.id.btn_gunungrinjani);
        btn_kepulauanbelitung = view.findViewById(R.id.btn_kepulauanbelitung);
        btn_gunungbromo = view.findViewById(R.id.btn_gunungbromo);
        btn_danautoba = view.findViewById(R.id.btn_danautoba);

        savedestinationlist.add(new Destination(R.drawable.raja_ampat, "Raja Ampat Islands", "Location: Papua", "The Raja Ampat Islands are the number 1 destination that you must visit before deciding to take a vacation abroad. Why is that? This archipelago, which is located at the eastern tip of Indonesia, is the most complete underwater riches paradise on earth. Raja Ampat itself is the name given to the four beautiful islands that come from local myths, namely Waigeo, Salawati, Batanta, and Misool. Tourists from all over the world desperately want to come to this island to enjoy 540 types of coral, 1,511 species of fish, and 700 types of mollusks. Even The Nature Conservancy and Conservation International say that you can find 75% of the worlds marine species on this island. Raja Ampat in Papua is a paradise for diving lovers."));
        savedestinationlist.add(new Destination(R.drawable.pulau_komodo, "Komodo Island", "Location: Nusa Tenggara Islands","If you want to enjoy the real habitat of Indonesian animals, this is the right location. Komodo Island itself consists of several islands and sea waters. One of the famous ones is Loh Liang National Park which is located on Rinca Island, West Manggarai, Labuan Bajo, Flores. Here you can get a close look at how the life of Komodo dragons really is. Komodo Island is also included as a UNESCO World Heritage Site."));
        savedestinationlist.add(new Destination(R.drawable.gunung_rinjani, "Mount Rinjani", "Location: Lombok Island", "Mount Rinjani, many people call this mountain as one of the most beautiful mountains in Indonesia. With a height of 3,726 meters above sea level, Mount Rinjani is the second highest volcano in Indonesia. For the Balinese themselves, this mountain is included in the ranks of three mountains that are consecrated after Mount Semeru and Mount Agung. Climbing Mount Rinjani, you will be treated to exotic views of tropical forests, savanna, and also beautiful hilly areas. Mount Rinjani is one of the mountains that is a favorite of climbers from abroad. From the top of Rinjani, you can enjoy the whole view of the islands of Lombok, Bali and Sumba."));
        savedestinationlist.add(new Destination(R.drawable.kepulauan_belitung, "Belitung Islands", "Location: Bangka Belitung", "The island that rose in popularity after the film Laskar Pelangi does have a perfect beach beauty. The beaches in the Belitung Islands have a different view from other beaches in Indonesia. We should be grateful for the Laskar Pelangi film, because from this film we can know that Indonesia has a hidden paradise on the island of Belitung. Some of the recommended beaches for those of you who visit this island include Tanjung Tinggi Beach, Penyabong Beach, Tanjung Kelayang Beach, Lengkuas Island, and Keramat Beach."));
        savedestinationlist.add(new Destination(R.drawable.gunung_bromo, "Mount Bromo", "Location: East Java", "It can be said that Mount Bromo is the most popular mountain among foreign and domestic tourists. Even Mount Bromo is often used as a location for filming films, one of which is the award-winning film, Pasir Berbisik. Sunrise or sunrise on Mount Bromo is very beautiful. If the weather is favorable, you can see the sun rising against the foreground of Mount Semeru emitting smoke from a distance and the sun shining brightly which slowly rises to the sky. From an altitude of 2,770 meters above sea level in Penanjakan, you can also enjoy the beauty of the sea of the expanse of the ocean. If the sun has started to rise, you can climb the mountain and enjoy the beauty of the crater of Mount Bromo, then continue the journey to take pictures on the Teletubbies hill which is often used as a photo shoot location."));
        savedestinationlist.add(new Destination(R.drawable.danau_toba, "Lake Toba", "Location: North Sumatera", "Lake Toba is one of the famous lakes in Indonesia. Lake Toba is located in North Sumatra. What makes this lake amazing is that in the middle of a stretch of clear lake water, there is an island with an area almost the same as the size of Singapore. The island is called Samosir Island. In the middle of Samosir Island, it turns out that there are still two beautiful lakes, namely Lake Sidihoni and Lake Aek Natonang. Lake Toba has been named the largest lake in Southeast Asia, and is the second largest lake after Lake Victoria in Africa."));

        btn_rajaampat.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                code = "Raja Ampat Islands";
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

        btn_pulaukomodo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code = "Komodo Island";
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

        btn_gunungrinjani.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code = "Mount Rinjani";
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

        btn_kepulauanbelitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code = "Belitung Islands";
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

        btn_gunungbromo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code = "Mount Bromo";
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

        btn_danautoba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code = "Lake Toba";
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