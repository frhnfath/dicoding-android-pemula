package com.dicoding.submission1;

import java.util.ArrayList;

class FoodData {
    private static String[] foodNames = {
            "Mie Aceh",
            "Rendang Padang",
            "Pempek Palembang",
            "Kerak Telor Jakarta",
            "Asinan Bogor",
            "Gudeg Yogya",
            "Soto Rawon Surabaya",
            "Bubur Manado",
            "Coto Makassar",
            "Papeda Maluku"
    };

    private static String[] foodDescription = {
            "Mie Aceh (Aceh noodles) have a thick texture and yellowish color. Aceh noodles are served in the form of fried noodles and wet noodles with sliced beef or mutton. Aceh noodles which actually has a pungent taste and thick/thick seasoning.",
            "Rendang from Minangkabau tribe is a food that has been spread throughout Indonesia because rendang is one of the mandatory menus of Padang Restaurant. Rendang has a spicy flavor and thick seasoning. Based on the rendang cooking process, rendang padang is very durable.",
            "Pempek Palembang is one of Indonesian culinary from South Sumatra which is quite famous. Pempek is made from sago flour and fish (usually mackerel). Pempek is usually served with vinegar sauce. Pempek has several types, and among them the best known are pempek submarines that contain boiled eggs.",
            "This special food from Jakarta is actually a fusion of Portuguese cuisine. The egg crust is easy to find in Jakarta especially at the Jakarta Fair even the egg crust is often used as a classic culinary symbol of Betawi culture.",
            "Asinan Bogor is a typical culinary of Bogor which is very popular in the city of Bogor. Asinan Bogor consists of two types of pickles, namely pickled fruits and pickled vegetables. Asinan Bogor has a sour, sweet and spicy taste.",
            "Gudeg is a culinary that cannot be separated from the city of Yogyakarta even to the point that Yogyakarta has a nickname as the city of Gudeg. The original warm Gudeg in Yogyakarta has a very sweet taste. Gudeg is made from young coconut milk jackfruit which is usually enjoyed with rice, native chicken, and soy sauce eggs.",
            "This soup with rawon cuts of meat from Surabaya is very popular in the area of Java. Soto Rawon Surabaya has a characteristic located in the broth. The soup from Soto Rawon does not use soy sauce but instead uses Kluwek.",
            "Manado porridge or Tinutuan porridge is a favorite special food from Sulawesi Island. Tinutuan in Manado means mixed. Inside the Manado porridge there are a variety of vegetables, animal side dishes such as fish, and vegetable side dishes such as tofu and tempeh.",
            "Actually Coto has the same meaning as Soto. However, specifically for Soto from Makassar, ordinary people know him as Coto. Coto Makassar has its own uniqueness, which is in the form of contents and seasonings. The contents of Coto Makassar consist of beef and beef offal. Flavored peanut that is only found in Coto Makassar soup.",
            "Eastern Indonesia has staple foods made from sago. One of the most popular Maluku specialties made from sago is papeda. Papeda is a staple food of the Maluku region as a substitute for rice. Usually, papeda is enjoyed with the addition of animal side dishes such as fish sauce."
    };

    private static int[] foodImages = {
            R.drawable.mie,
            R.drawable.rendang,
            R.drawable.pempek,
            R.drawable.kerak,
            R.drawable.asinan,
            R.drawable.gudeg,
            R.drawable.rawon,
            R.drawable.bubur,
            R.drawable.coto,
            R.drawable.papeda,
    };

    static ArrayList<Food> getListData(){
        ArrayList<Food> list = new ArrayList<>();
        for (int position = 0; position <foodNames.length; position++) {
            Food food = new Food();
            food.setName(foodNames[position]);
            food.setDescription(foodDescription[position]);
            food.setPhoto(foodImages[position]);
            list.add(food);
        }
        return list;
    }
}
