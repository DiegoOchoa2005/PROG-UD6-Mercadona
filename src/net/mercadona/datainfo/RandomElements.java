package net.mercadona.datainfo;

public class RandomElements {
    private static String[] productList = {"Tomate", "Huevo", "Arroz", "Pasta", "Leche", "Aceituna", "Ron", "Gofio Palmero", "Yogurt", "Galletas", "San Jacobo", "Almendrados", "Pechuga de Pavo", "Coca-cola", "Caraotas"};

    private static String[] nameList = {"Ryuko Matoi", "Satsuki Kiryüin", "Mako Makanshoku", "PunPun", "Rias Gremory", "Kokichi Ouma", "Enoshima Junko", "Nagito Komaeda", "Aqua", "Megumin", "Lalatina Darkness", "Kumagawa Misogi", "Ochako Uraraka", "Natsu Dragneel", "Tatsumaki", "Fubuki", "Archer", "Shouko Nishimiya", "Araragi Koyomi", "Vivy", "Kirei Kotomine"};

    public static String randomProduct() {
        int indexProduct = (int) (Math.random() * ((productList.length + 1) - 1));
        return productList[indexProduct];
    }

    public static String randomName() {
        int indexName = (int) (Math.random() * ((productList.length + 1) - 1));
        return nameList[indexName];
    }
}
