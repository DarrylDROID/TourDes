package com.example.wisata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import model.Destination;

import static model.ArrayDestination.savedestinationlist;

public class MainMenu extends AppCompatActivity {
    Button btn_nature, btn_education, btn_religion, btn_culinary, btn_about, btn_exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainmenu);

        btn_nature = findViewById(R.id.btn_nature);
        btn_education = findViewById(R.id.btn_education);
        btn_religion = findViewById(R.id.btn_religion);
        btn_culinary = findViewById(R.id.btn_culinary);
        btn_about = findViewById(R.id.btn_about);
        btn_exit =  findViewById(R.id.btn_exit);

        savedestinationlist.add(new Destination(R.drawable.raja_ampat, "Raja Ampat Islands", "Location: Papua", "The Raja Ampat Islands are the number 1 destination that you must visit before deciding to take a vacation abroad. Why is that? This archipelago, which is located at the eastern tip of Indonesia, is the most complete underwater riches paradise on earth. Raja Ampat itself is the name given to the four beautiful islands that come from local myths, namely Waigeo, Salawati, Batanta, and Misool. Tourists from all over the world desperately want to come to this island to enjoy 540 types of coral, 1,511 species of fish, and 700 types of mollusks. Even The Nature Conservancy and Conservation International say that you can find 75% of the worlds marine species on this island. Raja Ampat in Papua is a paradise for diving lovers."));
        savedestinationlist.add(new Destination(R.drawable.pulau_komodo, "Komodo Island", "Location: Nusa Tenggara Islands","If you want to enjoy the real habitat of Indonesian animals, this is the right location. Komodo Island itself consists of several islands and sea waters. One of the famous ones is Loh Liang National Park which is located on Rinca Island, West Manggarai, Labuan Bajo, Flores. Here you can get a close look at how the life of Komodo dragons really is. Komodo Island is also included as a UNESCO World Heritage Site."));
        savedestinationlist.add(new Destination(R.drawable.gunung_rinjani, "Mount Rinjani", "Location: Lombok Island", "Mount Rinjani, many people call this mountain as one of the most beautiful mountains in Indonesia. With a height of 3,726 meters above sea level, Mount Rinjani is the second highest volcano in Indonesia. For the Balinese themselves, this mountain is included in the ranks of three mountains that are consecrated after Mount Semeru and Mount Agung. Climbing Mount Rinjani, you will be treated to exotic views of tropical forests, savanna, and also beautiful hilly areas. Mount Rinjani is one of the mountains that is a favorite of climbers from abroad. From the top of Rinjani, you can enjoy the whole view of the islands of Lombok, Bali and Sumba."));
        savedestinationlist.add(new Destination(R.drawable.kepulauan_belitung, "Belitung Islands", "Location: Bangka Belitung", "The island that rose in popularity after the film Laskar Pelangi does have a perfect beach beauty. The beaches in the Belitung Islands have a different view from other beaches in Indonesia. We should be grateful for the Laskar Pelangi film, because from this film we can know that Indonesia has a hidden paradise on the island of Belitung. Some of the recommended beaches for those of you who visit this island include Tanjung Tinggi Beach, Penyabong Beach, Tanjung Kelayang Beach, Lengkuas Island, and Keramat Beach."));
        savedestinationlist.add(new Destination(R.drawable.gunung_bromo, "Mount Bromo", "Location: East Java", "It can be said that Mount Bromo is the most popular mountain among foreign and domestic tourists. Even Mount Bromo is often used as a location for filming films, one of which is the award-winning film, Pasir Berbisik. Sunrise or sunrise on Mount Bromo is very beautiful. If the weather is favorable, you can see the sun rising against the foreground of Mount Semeru emitting smoke from a distance and the sun shining brightly which slowly rises to the sky. From an altitude of 2,770 meters above sea level in Penanjakan, you can also enjoy the beauty of the sea of the expanse of the ocean. If the sun has started to rise, you can climb the mountain and enjoy the beauty of the crater of Mount Bromo, then continue the journey to take pictures on the Teletubbies hill which is often used as a photo shoot location."));
        savedestinationlist.add(new Destination(R.drawable.danau_toba, "Lake Toba", "Location: North Sumatera", "Lake Toba is one of the famous lakes in Indonesia. Lake Toba is located in North Sumatra. What makes this lake amazing is that in the middle of a stretch of clear lake water, there is an island with an area almost the same as the size of Singapore. The island is called Samosir Island. In the middle of Samosir Island, it turns out that there are still two beautiful lakes, namely Lake Sidihoni and Lake Aek Natonang. Lake Toba has been named the largest lake in Southeast Asia, and is the second largest lake after Lake Victoria in Africa."));
        savedestinationlist.add(new Destination(R.drawable.museum_angkut, "Museum Angkut", "Location: Malang", "If you are on vacation in Malang, it's a shame if you don't stop by the Museum of Transport. This vacation spot as well as educational tourism in Indonesia has indeed been very popular in recent years."));
        savedestinationlist.add(new Destination(R.drawable.kota_tua, "Kota Tua", "Location: Jakarta", "Even though it is famous for its very developed city, Jakarta also has many historical destinations that are suitable for educational tours that are a pity to miss. One of the most popular vacation spots and is still favored by many tourists today is Kota Tua, Jakarta. Located in the West Jakarta area, this educational tourist attraction in Indonesia will provide an in-depth historical experience about Batavia in the past. There are lots of interesting spots that you can explore in this educational tourism area in Indonesia, starting from the Fatahillah Museum, Bank Indonesia Museum, Jakarta Kota Station which has been open since 1929, Sunda Kelapa Harbor which is a witness to the history of the glory of Sunda Kelapa, Wayang Museum to the Museum Maritime and various other interesting educational tourist destinations."));
        savedestinationlist.add(new Destination(R.drawable.taman_pintar, "Taman Pintar", "Location: Yogyakarta", "Yogyakarta is not only popular for its culture and natural scenery. Educational tourism as a vacation spot is also very much. One of the most popular is Taman Pintar. This educational tourist attraction in Indonesia is located on Jalan Panembahan Senopati number 1-3, close to the Vredeburg Fort area. This park is managed directly by the local government as a learning tool for students and people who want to deepen their knowledge in an exciting way.This educational tourist attraction in Indonesia is divided into several zones and rides. Each vehicle has a special theme such as the automotive zone, replica zone, oil and petroleum processing zone and so on. Even though it provides many rides, the entrance fee to Taman Pintar is very affordable."));
        savedestinationlist.add(new Destination(R.drawable.kidzania, "Kidzania", "Location: Jakarta", "If you are looking for educational tours that are suitable for children's learning media while on vacation, Kidzania is one option that is no less interesting. This educational tourist attraction in Indonesia is located in a shopping center so that the whole family can visit and do various other activities."));
        savedestinationlist.add(new Destination(R.drawable.taman_mini, "Taman Mini Indonesia", "Location: Jakarta", "This educational tourism destination in Indonesia, which is more popularly known as TMII, is also still in Jakarta. As one of the attractions that has been in operation for a long time, TMII is a favorite educational holiday location not only for locals but also those from outside the city. In this place, visitors can learn about the diversity of customs that Indonesia has."));
        savedestinationlist.add(new Destination(R.drawable.jatim_park, "Jatim Park 2", "Location: Batu", "As the name suggests, Jatim Park is located in East Java, precisely in the city of Batu. This educational tourist spot consists of the Animal Museum, Batu Secret Zoo and Eco Green Park, which each location has its own peculiarities. With these various rides, in Jatim Park 2 you can learn a variety of knowledge related to animals to replicas of Stegosaurus and Tyrannosaurus. Not only that, you can also enjoy a zoo with a modern concept."));
        savedestinationlist.add(new Destination(R.drawable.masjid, "Istiqlal Mosque", "Location: Jakarta", "The first religious tourism object is located in the capital city of Jakarta. Istiqlal Mosque is the largest mosque in Indonesia, even in Southeast Asia! Standing on an area of 93,200 M2, this mosque can accommodate up to 200,000 worshipers! During Muslim celebrations, this mosque is often flooded with various worshipers from various places, sometimes even the president of the Republic of Indonesia often performs worship activities at this mosque. The mosque, which is now one of the Muslim pilgrimage destinations, was initiated by the Indonesian proclaimer, Ir. Soekarno and was designed by Architect Frederich Silaban who is actually a non-Muslim."));
        savedestinationlist.add(new Destination(R.drawable.gereja, "Blenduk Church", "Location: Semarang", "The next religious tourism is in the city of Semarang, to be precise the Blenduk Church which has existed since 1753. This church which is also a landmark of the city of Semarang is a Protestant church with the original name Koepelker and was initiated by the Portuguese government. With a Neo-Classical architectural style, this church building has a beauty that attracts tourists and pilgrims. The name Blenduk itself is a Javanese language which means a convex dome which describes the shape of this building. In his historical church, there is still a Bible in Dutch which was published in 1748, you know! No wonder the Blenduk Church is one of the best religious tourism objects in Indonesia."));
        savedestinationlist.add(new Destination(R.drawable.vihara, "Maha Vihara Mojopahit", "Location: Trowulan, Mojokerto", "The Sleeping Buddha Statue is one of the iconic monuments that often exist in Buddhist pilgrimage destinations such as it is famous for being in Thailand. However, in Indonesia itself there is a monastery with a similar statue, even among the largest in the world. To see it, Toppers can visit the Maha Vihara Mojopahit in Mojokerto, East Java."));
        savedestinationlist.add(new Destination(R.drawable.klenteng, "Pagoda Kwan Sing Bio", "Location: Tuban", "Standing on an area of 3 hectares, Kwan Sing Bio Temple, located in Tuban, is the largest temple in Southeast Asia. This makes this religious tourism destination not only attracting local tourists but also various tourists from abroad, you know! The Kwan Sing Bio temple itself is a place of worship for followers of the Tri Dharma teachings (Buddhism, Taoism, and Confucianism) with a Crab statue which is the icon of this building. This temple also provides a free overnight stay for its visitors, you know."));
        savedestinationlist.add(new Destination(R.drawable.gua, "Cave Maria Laudres", "Location: Kediri", "For those of you who are Catholics, Maria Laudres Cave in Kediri can be one of the pilgrimage destinations of choice. The Maria Cave which stands on an area of 13 hectares has 12 showers which symbolize the 12 Apostles. Many believe that drinking water from this shower can bring health and good luck."));
        savedestinationlist.add(new Destination(R.drawable.pura, "Temple Besakih", "Location: Bali", "Another beautiful temple in Bali that can be a religious tourist destination for Hindus in Indonesia and the world, namely Pura Besakih. This temple itself is the largest temple complex in Bali and is on the slopes of Mount Agung, the highest mountain in Bali. The name Besakih itself is taken from the Sanskrit language wasuki which means safe. As the center of the temples in Bali, Pura Besakih has 1 central temple, 18 companion temples, and the Penataran Agung temple."));
        savedestinationlist.add(new Destination(R.drawable.durian_medan, "Durian Medan", "Location: Medan, North Sumatera", "Durian fruit lovers must know Medan well. This city, which is a paradise for durian fruit lovers, is also a favorite culinary tourism destination in Indonesia. Besides being able to taste durian directly on the side of the road and its interesting preparations (durian pankuk), this city has a number of iconic culinary delights. Among them are bika Ambon, meranti cake, Medan noodle, Soto Kesawan, passion fruit syrup, gomak noodles, Medan rice cake, and duck rice vermicelli!"));
        savedestinationlist.add(new Destination(R.drawable.sate_padang, "Satay Padang", "Location: Padang, West Sumatera", "The city of Padang in West Sumatra is one of the favorite culinary tourism destinations in Indonesia and is well known by domestic tourists. Apart from being the area of origin for the iconic rendang food that is recognized by the world and often dominating the list of the tastiest foods according to the foreign media, the city of Padang also has several other culinary delights with interesting flavors that would be a pity if you miss it. Starting from balado dendeng, chicken curry, goldfish head curry, batokok dendeng, daka-daka, to balado chips and sanjai chips guaranteed to shake your tongue and make you addicted!"));
        savedestinationlist.add(new Destination(R.drawable.gudeg, "Gudeg", "Location: Yogyakarta, Central Java", "Apart from being famous for its historical and cultural tourism, Yogyakarta is also known as a culinary destination in Indonesia whose name resonates quite well among tourists. Visiting the city of Yogyakarta, you will be treated to a variety of culinary delights with sweet and savory flavors such as gudeg which is usually eaten with various kinds, Javanese noodles, curry, tongseng, satay, pecel rice, the famous klathak satay. While you are in Yogyakarta, don't miss tasting the angkringan that are scattered all over the city. Besides that, you can also taste Javanese beer and joss coffee and buy special souvenirs such as bakpia, various jenangs, getuk, diamonds, and yangko."));
        savedestinationlist.add(new Destination(R.drawable.rendang, "Rendang", "Location: West Sumatera", "Rendang is a meat dish originating from the Minangkabau tribe in West Sumatra. This dish is known for its spiciness and lengthy cooking procedure. It is often compared to Indian curries for its consistency and unique taste."));
        savedestinationlist.add(new Destination(R.drawable.ayam_betutu, "Chicken Betutu", "Location: Bali", "The Balinese dish that appears at this ceremony comes in two versions: the chicken-based betutu chicken, or the traditional duck version called the duck betutu. All the animals are covered and filled with a mixture of local spices such as turmeric, ginger, pepper, chili and shrimp paste."));
        savedestinationlist.add(new Destination(R.drawable.bebek_goreng, "Fried Duck", "Location: Madura", "Fried duck is a typical Indonesian food that is appreciated for its crispiness and soft and delicious meat. Duck is usually cut into pieces, boiled or steamed, then fried until crispy. Before frying, the pieces are coated with spices such as garlic, ginger, turmeric, galangal, or coriander. Fried duck is eaten all over the country - but the famous one comes from Madura - and is traditionally served alongside rice, fresh vegetables such as cucumber or cabbage, and hot chili sauce."));

        getSupportActionBar().hide();

        btn_nature.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, NatureDestination.class);
                startActivity(intent);
            }
        });

        btn_education.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, EducationDestination.class);
                startActivity(intent);
            }
        });
        btn_religion.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, ReligionDestination.class);
                startActivity(intent);
            }
        });
        btn_culinary.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, CulinaryDestination.class);
                startActivity(intent);
            }
        });
        btn_about.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainMenu.this, About.class);
                startActivity(intent);
            }
        });
        btn_exit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // TODO Auto-generated method stub
                moveTaskToBack(true);

                //membuat method tombol keluar dari aplikasi

            }
        });
    }
}