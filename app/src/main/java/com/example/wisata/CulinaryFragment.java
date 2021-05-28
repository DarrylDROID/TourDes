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


public class CulinaryFragment extends Fragment {
    Button btn_durianmedan, btn_satepadang, btn_gudeg, btn_rendang, btn_ayambetutu, btn_bebekgoreng, back;
    String code="";
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_culinary, container, false);
        initView();
        return view;
    }

    private void initView() {
        btn_durianmedan = view.findViewById(R.id.btn_durianmedan);
        btn_satepadang = view.findViewById(R.id.btn_satepadang);
        btn_gudeg = view.findViewById(R.id.btn_gudeg);
        btn_rendang = view.findViewById(R.id.btn_rendang);
        btn_ayambetutu = view.findViewById(R.id.btn_ayambetutu);
        btn_bebekgoreng = view.findViewById(R.id.btn_bebekgoreng);

        savedestinationlist.add(new Destination(R.drawable.durian_medan, "Durian Medan", "Location: Medan, North Sumatera", "Durian fruit lovers must know Medan well. This city, which is a paradise for durian fruit lovers, is also a favorite culinary tourism destination in Indonesia. Besides being able to taste durian directly on the side of the road and its interesting preparations (durian pankuk), this city has a number of iconic culinary delights. Among them are bika Ambon, meranti cake, Medan noodle, Soto Kesawan, passion fruit syrup, gomak noodles, Medan rice cake, and duck rice vermicelli!"));
        savedestinationlist.add(new Destination(R.drawable.sate_padang, "Satay Padang", "Location: Padang, West Sumatera", "The city of Padang in West Sumatra is one of the favorite culinary tourism destinations in Indonesia and is well known by domestic tourists. Apart from being the area of origin for the iconic rendang food that is recognized by the world and often dominating the list of the tastiest foods according to the foreign media, the city of Padang also has several other culinary delights with interesting flavors that would be a pity if you miss it. Starting from balado dendeng, chicken curry, goldfish head curry, batokok dendeng, daka-daka, to balado chips and sanjai chips guaranteed to shake your tongue and make you addicted!"));
        savedestinationlist.add(new Destination(R.drawable.gudeg, "Gudeg", "Location: Yogyakarta, Central Java", "Apart from being famous for its historical and cultural tourism, Yogyakarta is also known as a culinary destination in Indonesia whose name resonates quite well among tourists. Visiting the city of Yogyakarta, you will be treated to a variety of culinary delights with sweet and savory flavors such as gudeg which is usually eaten with various kinds, Javanese noodles, curry, tongseng, satay, pecel rice, the famous klathak satay. While you are in Yogyakarta, don't miss tasting the angkringan that are scattered all over the city. Besides that, you can also taste Javanese beer and joss coffee and buy special souvenirs such as bakpia, various jenangs, getuk, diamonds, and yangko."));
        savedestinationlist.add(new Destination(R.drawable.rendang, "Rendang", "Location: West Sumatera", "Rendang is a meat dish originating from the Minangkabau tribe in West Sumatra. This dish is known for its spiciness and lengthy cooking procedure. It is often compared to Indian curries for its consistency and unique taste."));
        savedestinationlist.add(new Destination(R.drawable.ayam_betutu, "Chicken Betutu", "Location: Bali", "The Balinese dish that appears at this ceremony comes in two versions: the chicken-based betutu chicken, or the traditional duck version called the duck betutu. All the animals are covered and filled with a mixture of local spices such as turmeric, ginger, pepper, chili and shrimp paste."));
        savedestinationlist.add(new Destination(R.drawable.bebek_goreng, "Fried Duck", "Location: Madura", "Fried duck is a typical Indonesian food that is appreciated for its crispiness and soft and delicious meat. Duck is usually cut into pieces, boiled or steamed, then fried until crispy. Before frying, the pieces are coated with spices such as garlic, ginger, turmeric, galangal, or coriander. Fried duck is eaten all over the country - but the famous one comes from Madura - and is traditionally served alongside rice, fresh vegetables such as cucumber or cabbage, and hot chili sauce."));

        btn_durianmedan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code = "Durian Medan";
                for (int i = 0; i < ArrayDestination.savedestinationlist.size(); i++) {
                    Destination tempUser = ArrayDestination.savedestinationlist.get(i);
                    if ((tempUser.getMaintext().equalsIgnoreCase(code))){
                        Intent intent = new Intent(getActivity(), Display.class);
                        intent.putExtra("Display", tempUser);
                        startActivity(intent);
                    }
                }
            }
        });

        btn_satepadang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code = "Satay Padang";
                for (int i = 0; i < ArrayDestination.savedestinationlist.size(); i++) {
                    Destination tempUser = ArrayDestination.savedestinationlist.get(i);
                    if ((tempUser.getMaintext().equalsIgnoreCase(code))){
                        Intent intent = new Intent(getActivity(), Display.class);
                        intent.putExtra("Display", tempUser);
                        startActivity(intent);
                    }
                }
            }
        });

        btn_gudeg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code = "Gudeg";
                for (int i = 0; i < ArrayDestination.savedestinationlist.size(); i++) {
                    Destination tempUser = ArrayDestination.savedestinationlist.get(i);
                    if ((tempUser.getMaintext().equalsIgnoreCase(code))){
                        Intent intent = new Intent(getActivity(), Display.class);
                        intent.putExtra("Display", tempUser);
                        startActivity(intent);
                    }
                }
            }
        });

        btn_rendang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code = "Rendang";
                for (int i = 0; i < ArrayDestination.savedestinationlist.size(); i++) {
                    Destination tempUser = ArrayDestination.savedestinationlist.get(i);
                    if ((tempUser.getMaintext().equalsIgnoreCase(code))){
                        Intent intent = new Intent(getActivity(), Display.class);
                        intent.putExtra("Display", tempUser);
                        startActivity(intent);
                    }
                }
            }
        });

        btn_ayambetutu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code = "Chicken Betutu";
                for (int i = 0; i < ArrayDestination.savedestinationlist.size(); i++) {
                    Destination tempUser = ArrayDestination.savedestinationlist.get(i);
                    if ((tempUser.getMaintext().equalsIgnoreCase(code))){
                        Intent intent = new Intent(getActivity(), Display.class);
                        intent.putExtra("Display", tempUser);
                        startActivity(intent);
                    }
                }
            }
        });

        btn_bebekgoreng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code = "Fried Duck";
                for (int i = 0; i < ArrayDestination.savedestinationlist.size(); i++) {
                    Destination tempUser = ArrayDestination.savedestinationlist.get(i);
                    if ((tempUser.getMaintext().equalsIgnoreCase(code))){
                        Intent intent = new Intent(getActivity(), Display.class);
                        intent.putExtra("Display", tempUser);
                        startActivity(intent);
                    }
                }
            }
        });
    }
}