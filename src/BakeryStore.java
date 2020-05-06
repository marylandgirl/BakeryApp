import java.util.ArrayList;
/*
* The BakeryStore class manages a collection of baked goods and provides
*    functionality to search the collection for a subset of
*    of the collection. It also can return the entire set upon request.
* It is part of the implementation of a group assignment from
*    Java Bootcamp
* Kim Levin
* 5/4/2020
*/
public class BakeryStore {

    private ArrayList<BakedGoods> storeItems = new ArrayList<>();

    public BakeryStore() {
        populateStoreItems();
    }

    public void populateStoreItems() {

        storeItems.add(new BakedGoods("White Bread", 10.95, "5/30/2020",
                21, "gluten free, dairy free, egg free, soy free," +
                " nut free, vegan","Breads & Muffins"));

        storeItems.add(new BakedGoods("Cinnamon Raisin Bread", 10.95, "6/1/2020",
                15, "gluten free, dairy free, egg free, nut free, sesame free",
                "Breads & Muffins"));

        storeItems.add(new BakedGoods("Large Hamburger Buns", 5.00, "8/15/2020",
                30, "gluten free, dairy free, nut free, sesame free",
                "Breads & Muffins"));

        storeItems.add(new BakedGoods("3-Pack Muffins", 8.25, "8/30/2020",
                12, "nut free, sesame free","Breads & Muffins"));

        storeItems.add(new BakedGoods("Remedy Cookie Brownie Bar", 4.95, "7/31/2020",
                10, "gluten free, soy free, nut free, sesame free",
                "Brownies & Bars"));

        storeItems.add(new BakedGoods("Powdered Brownie", 4.50, "7/15/2020",
                17, "gluten free, sesame free","Brownies & Bars"));

        storeItems.add(new BakedGoods("Vegan Cookie Dough", 2.50, "7/4/2020",
                9, "gluten free, dairy free, egg free, soy free, nut free, " +
                "sesame free, vegan","Cookies"));

        storeItems.add(new BakedGoods("Chocolate Chip Cookies", 2.85,
                "9/30/2020", 40, "gluten free, soy free, nut free, " +
                "sesame free, sugar free","Cookies"));

        storeItems.add(new BakedGoods("8 Graduation Cookie Set", 24.95, "9/1/2020",
                6, "soy free, nut free, sesame free","Cookies"));

        storeItems.add(new BakedGoods("6 Spring Cupcake Cups", 24.00, "9/15/2020",
                5, "nut free","Cupcakes"));

        storeItems.add(new BakedGoods("Cupcake Bouquet", 38.95, "5/25/2020",
                3, "gluten free","Cupcakes"));

        storeItems.add(new BakedGoods("Dozen Mini Cupcakes", 21.00, "5/30/2020",
                4, "sugar free","Cupcakes"));

        storeItems.add(new BakedGoods("Organic Gummy Bears", 4.95, "10/31/2020",
                22, "gluten free, dairy free, egg free, soy free, nut free, corn",
                "Small Desserts"));

        storeItems.add(new BakedGoods("1 Dozen Pumpkin Donut Holes", 12.00, "6/15/2020",
                2, "gluten free, soy free, nut free, sesame free", "Small Desserts"));

        storeItems.add(new BakedGoods("Star Wars Cookie Truffle Set", 24.95, "7/5/2020",
                4, "gluten free, dairy free, egg free, nut free, coconut, " +
                "sesame free", "Small Deserts"));

    }

    //public String searchStore(String strToSearch) {
    public ArrayList<String> searchStore(String strToSearch) {
        ArrayList<String> selectedItems = new ArrayList();
        if ( !(strToSearch.toLowerCase().equals("all"))) {
            for (int i = 0; i < storeItems.size(); i++) {
                String item = storeItems.get(i).toString();
                String restrictions = storeItems.get(i).getDietRestrictionsMet();
    //            if (restrictions.contains(strToSearch)) {
                if (restrictions.toLowerCase().contains(strToSearch.toLowerCase())) {
                    selectedItems.add(item);
                }
            }
        } else {
            for (int i = 0; i < storeItems.size(); i++) {
                String item = storeItems.get(i).toString();
                selectedItems.add(item);
            }
        }
        return selectedItems;
    }
}
