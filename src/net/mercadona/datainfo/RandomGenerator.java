package net.mercadona.datainfo;

public class RandomGenerator {
    private static final String[] PRODUCT_LIST = { "Tomate", "Huevo", "Arroz", "Pasta", "Leche", "Aceituna", "Ron",
            "Gofio Palmero", "Yogurt", "Galletas", "San Jacobo", "Almendrados", "Pechuga de Pavo", "Coca-cola",
            "Caraotas" };

    private static final String[] NAME_LIST = { "Ryuko Matoi", "Satsuki Kiryüin", "Mako Makanshoku", "PunPun",
            "Rias Gremory",
            "Kokichi Ouma", "Enoshima Junko", "Nagito Komaeda", "Aqua", "Megumin", "Lalatina Darkness",
            "Kumagawa Misogi", "Ochako Uraraka", "Natsu Dragneel", "Tatsumaki", "Fubuki", "Archer", "Shouko Nishimiya",
            "Araragi Koyomi", "Vivy", "Kirei Kotomine" };

    private static final String[] BLOOD_TYPES = { "A+", "O+", "B+", "AB+", "A-", "O-", "B-", "AB-" };

    public static String randomProduct() {
        int indexProduct = (int) (Math.random() * ((PRODUCT_LIST.length + 1) - 1));
        return PRODUCT_LIST[indexProduct];
    }

    public static String generateRandomName() {
        int indexName = (int) (Math.random() * ((PRODUCT_LIST.length + 1) - 1));
        return NAME_LIST[indexName];
    }

    public static String generateRandomDni() {
        final String LETTERS = "TRWAGMYFPDXBNJZSQVHLCKE";
        int numDni = (int) (Math.random() * (90000000 - 10000000) + 10000000);
        int rest = numDni % 23;
        String dniLetter = String.valueOf(LETTERS.charAt(rest));

        return numDni + dniLetter;
    }

    public static String generateRandomPhoneNum() {
        String numPhone = String.valueOf((int) (Math.random() * (699999999 - 600000000) + 600000000));
        return "+34 " + numPhone;
    }

    public static String generateRandomBloodType() {
        int bloodSelected = (int) (Math.random() * (BLOOD_TYPES.length + 1) - 1);
        return BLOOD_TYPES[bloodSelected];
    }

    // Estamos practicando pa' trabajar en el tranvia
    public static boolean isLatam() {
        int latamSelector = (int) (Math.random() * (10 - 1) + 1);
        return latamSelector == 1 ? true : false;
    }
}
