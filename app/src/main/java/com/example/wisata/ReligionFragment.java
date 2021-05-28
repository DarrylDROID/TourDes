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


public class ReligionFragment extends Fragment {
    Button btn_masjid, btn_gereja, btn_vihara, btn_klenteng, btn_gua, btn_pura;
    String code="";
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_religion, container, false);
        initView();
        return view;
    }

    private void initView() {
        btn_masjid = view.findViewById(R.id.btn_masjid);
        btn_gereja = view.findViewById(R.id.btn_gereja);
        btn_vihara = view.findViewById(R.id.btn_vihara);
        btn_klenteng = view.findViewById(R.id.btn_klenteng);
        btn_gua = view.findViewById(R.id.btn_gua);
        btn_pura = view.findViewById(R.id.btn_pura);

        savedestinationlist.add(new Destination(R.drawable.masjid, "Istiqlal Mosque", "Location: Jakarta", "The first religious tourism object is located in the capital city of Jakarta. Istiqlal Mosque is the largest mosque in Indonesia, even in Southeast Asia! Standing on an area of 93,200 M2, this mosque can accommodate up to 200,000 worshipers! During Muslim celebrations, this mosque is often flooded with various worshipers from various places, sometimes even the president of the Republic of Indonesia often performs worship activities at this mosque. The mosque, which is now one of the Muslim pilgrimage destinations, was initiated by the Indonesian proclaimer, Ir. Soekarno and was designed by Architect Frederich Silaban who is actually a non-Muslim."));
        savedestinationlist.add(new Destination(R.drawable.gereja, "Blenduk Church", "Location: Semarang", "The next religious tourism is in the city of Semarang, to be precise the Blenduk Church which has existed since 1753. This church which is also a landmark of the city of Semarang is a Protestant church with the original name Koepelker and was initiated by the Portuguese government. With a Neo-Classical architectural style, this church building has a beauty that attracts tourists and pilgrims. The name Blenduk itself is a Javanese language which means a convex dome which describes the shape of this building. In his historical church, there is still a Bible in Dutch which was published in 1748, you know! No wonder the Blenduk Church is one of the best religious tourism objects in Indonesia."));
        savedestinationlist.add(new Destination(R.drawable.vihara, "Maha Vihara Mojopahit", "Location: Trowulan, Mojokerto", "The Sleeping Buddha Statue is one of the iconic monuments that often exist in Buddhist pilgrimage destinations such as it is famous for being in Thailand. However, in Indonesia itself there is a monastery with a similar statue, even among the largest in the world. To see it, Toppers can visit the Maha Vihara Mojopahit in Mojokerto, East Java."));
        savedestinationlist.add(new Destination(R.drawable.klenteng, "Pagoda Kwan Sing Bio", "Location: Tuban", "Standing on an area of 3 hectares, Kwan Sing Bio Temple, located in Tuban, is the largest temple in Southeast Asia. This makes this religious tourism destination not only attracting local tourists but also various tourists from abroad, you know! The Kwan Sing Bio temple itself is a place of worship for followers of the Tri Dharma teachings (Buddhism, Taoism, and Confucianism) with a Crab statue which is the icon of this building. This temple also provides a free overnight stay for its visitors, you know."));
        savedestinationlist.add(new Destination(R.drawable.gua, "Cave Maria Laudres", "Location: Kediri", "For those of you who are Catholics, Maria Laudres Cave in Kediri can be one of the pilgrimage destinations of choice. The Maria Cave which stands on an area of 13 hectares has 12 showers which symbolize the 12 Apostles. Many believe that drinking water from this shower can bring health and good luck."));
        savedestinationlist.add(new Destination(R.drawable.pura, "Temple Besakih", "Location: Bali", "Another beautiful temple in Bali that can be a religious tourist destination for Hindus in Indonesia and the world, namely Pura Besakih. This temple itself is the largest temple complex in Bali and is on the slopes of Mount Agung, the highest mountain in Bali. The name Besakih itself is taken from the Sanskrit language wasuki which means safe. As the center of the temples in Bali, Pura Besakih has 1 central temple, 18 companion temples, and the Penataran Agung temple."));

        btn_masjid.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                code = "Istiqlal Mosque";
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

        btn_gereja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code = "Blenduk Church";
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

        btn_vihara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code = "Maha Vihara Mojopahit";
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

        btn_klenteng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code = "Pagoda Kwan Sing Bio";
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

        btn_gua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code = "Cave Maria Laudres";
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

        btn_pura.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                code = "Temple Besakih";
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