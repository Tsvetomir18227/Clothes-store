import java.io.File;
import java.io.IOException;
import java.util.*;

public class Clothes {

    private String clotheType, clotheSize, clotheBrand, clotheColor, clotheSeason, clotheGender;
    public double clothePrice;
    public static ArrayList<Clothes> clothesStorage = new ArrayList<>();

   /* public static void file() throws IOException {
        Scanner scan = new Scanner(new File("data/Storage.txt"));
        while(scan.hasNextLine()){
            clothesStorage.add(scan.nextLine());

        }
    }*/
   static {
       clothesStorage.add(new Clothes("Анцунг", "XS", "Flair", "светло-сив", 50, "пролет, есен", "Мъжко"));
       clothesStorage.add(new Clothes("Анцунг", "S", "ZARA", "червен", 40, "пролет", "Мъжко"));
       clothesStorage.add(new Clothes("Анцунг", "M", "Flair", "син", 30, "пролет, есен", "Мъжко"));
       clothesStorage.add(new Clothes("Анцунг", "L", "HM", "бял", 35, "пролет, есен, зима", "Мъжко"));
       clothesStorage.add(new Clothes("Анцунг", "L", "Nike", "черен", 25, "пролет, есен", "Дамско"));
       clothesStorage.add(new Clothes("Анцунг", "XL", "Flair", "бял", 50, "пролет, есен", "Дамско"));
       clothesStorage.add(new Clothes("Анцунг", "L", "Nike", "зелен", 35, "пролет, есен, зима", "Дамско"));
       clothesStorage.add(new Clothes("Анцунг", "XL", "Flair", "бордо", 35, "пролет, есен, зима", "Дамско"));

       clothesStorage.add(new Clothes("Тениска", "L", "Puma", "сив", 25, "лято", "Мъжко"));
       clothesStorage.add(new Clothes("Тениска", "XL", "HM", "сив", 50, "лято", "Мъжко"));
       clothesStorage.add(new Clothes("Тениска", "S", "Lacoste", "жълт", 30, "лято", "Мъжко"));
       clothesStorage.add(new Clothes("Тениска", "XS", "Gucci", "син", 50, "лято", "Мъжко"));
       clothesStorage.add(new Clothes("Тениска", "M", "Tom Tailor", "циан", 20, "лято", "Дамско"));
       clothesStorage.add(new Clothes("Тениска", "L", "Gucci", "зелен", 17, "лято", "Дамско"));
       clothesStorage.add(new Clothes("Тениска", "M", "LCW", "циан", 20, "лято", "Дамско"));
       clothesStorage.add(new Clothes("Тениска", "XS", "Nike", "кафяв", 25, "лято", "Дамско"));

       clothesStorage.add(new Clothes("Суичър", "L", "LCW", "син", 35, "есен", "Мъжко"));
       clothesStorage.add(new Clothes("Суичър", "L", "Lacoste", "кафяв", 65, "пролет, есен, зима", "Мъжко"));
       clothesStorage.add(new Clothes("Суичър", "M", "Adidas", "черен", 35, "есен", "Мъжко"));
       clothesStorage.add(new Clothes("Суичър", "XL", "Puma", "червен", 45, "есен", "Мъжко"));
       clothesStorage.add(new Clothes("Суичър", "S", "Nike", "розов", 50, "пролет, есен", "Дамско"));
       clothesStorage.add(new Clothes("Суичър", "M", "Adidas", "бежов", 25, "пролет, есен", "Дамско"));
       clothesStorage.add(new Clothes("Суичър", "XL", "Nike", "светло-сив", 50, "есен", "Дамско"));
       clothesStorage.add(new Clothes("Суичър", "L", "Puma", "бял", 43, "лято, есен", "Дамско"));

       clothesStorage.add(new Clothes("Дънки", "S", "HM", "светло-сив", 44, "пролет, есен", "Мъжко"));
       clothesStorage.add(new Clothes("Дънки", "XL", "LCW", "черен", 30, "пролет, есен", "Мъжко"));
       clothesStorage.add(new Clothes("Дънки", "L", "ZARA", "бежов", 45, "пролет", "Мъжко"));
       clothesStorage.add(new Clothes("Дънки", "L", "LCW", "син", 30, "пролет, есен", "Мъжко"));
       clothesStorage.add(new Clothes("Дънки", "M", "HM", "тъмно-син", 35, "пролет", "Дамско"));
       clothesStorage.add(new Clothes("Дънки", "XS", "Adidas", "син", 50, "пролет", "Дамско"));
       clothesStorage.add(new Clothes("Дънки", "S", "Tom Tailor", "тъмно-сив", 35, "пролет", "Дамско"));
       clothesStorage.add(new Clothes("Дънки", "XS", "Adidas", "син", 50, "пролет", "Дамско"));
   }

    public Clothes() {

    }

    public Clothes(String clotheType, String clotheSize, String clotheBrand, String clotheColor, double clothePrice,
                   String clotheSeason, String clotheGender) {
        this.clotheType = clotheType;
        this.clotheSize = clotheSize;
        this.clotheBrand = clotheBrand;
        this.clotheColor = clotheColor;
        this.clothePrice = clothePrice;
        this.clotheSeason = clotheSeason;
        this.clotheGender = clotheGender;
    }

    public String getClotheColor() {
        return clotheColor;
    }

    public void setClotheColor(String clotheColor) {
        this.clotheColor = clotheColor;
    }

    public String getClotheType() {
        return clotheType;
    }

    public void setClotheType(String clotheType) {
        this.clotheType = clotheType;
    }

    public String getClotheGender() {
        return clotheGender;
    }

    public void setClotheGender(String clotheGender) {
        this.clotheGender = clotheGender;
    }

    public static ArrayList<Clothes> getClothesStorage() {
        return clothesStorage;
    }

    public static void setClothesStorage(ArrayList<Clothes> clothesStorage) {
        Clothes.clothesStorage = clothesStorage;
    }

    public void setClothePrice(double clothePrice) {
        this.clothePrice = clothePrice;
    }

    public String getClotheSize() {
        return clotheSize;
    }

    public String getClotheBrand() {
        return clotheBrand;
    }

    public double getClothePrice() {
        return clothePrice;
    }

    public String getClotheSeason() {
        return clotheSeason;
    }

    public void setClotheSize(String clotheSize) {
        this.clotheSize = clotheSize;
    }

    public void setClotheBrand(String clotheBrand) {
        this.clotheBrand = clotheBrand;
    }

    public void setClotheSeason(String clotheSeason) {
        this.clotheSeason = clotheSeason;
    }

    public void getAllInfo() {
        System.out.println("Вид : " + this.clotheType + " | Размер : " + this.clotheSize + " | Бранд : " + this.clotheBrand + " | Цвят : " + this.clotheColor + " | Цена : " + this.clothePrice + " | Сезон : " + this.clotheSeason);
    }

    public static void getClothesType(String desiredType, String desiredGender) {
        boolean bStyle = true;
        for (Clothes cl : clothesStorage) {
            if (cl.clotheType.equalsIgnoreCase(desiredType) && cl.clotheGender.equalsIgnoreCase(desiredGender)) {
                cl.getAllInfo();
                bStyle = false;
            }

        }
        if (bStyle) {
            System.out.println("Няма такъв вид дрехи");
        }
    }

    public static void getClothesSize(String desiredSize, String desiredGender) {
        boolean bSize = true;
        for (Clothes cl : clothesStorage) {
            if (cl.clotheSize.equalsIgnoreCase(desiredSize) && cl.clotheGender.equalsIgnoreCase(desiredGender)) {
                cl.getAllInfo();
                bSize = false;
            }

        }
        if (bSize) {
            System.out.println("Няма такъв размер дрехи");
        }
    }

    public static void getClothesBrand(String desiredBrand, String desiredGender) {
        boolean bBrand = true;
        for (Clothes cl : clothesStorage) {
            if (cl.clotheBrand.equalsIgnoreCase(desiredBrand) && cl.clotheGender.equalsIgnoreCase(desiredGender)) {
                cl.getAllInfo();
                bBrand = false;
            }

        }
        if (bBrand) {
            System.out.println("Няма такъв бранд дрехи");
        }
    }

    public static void getClothesColor(String desiredColor, String desiredGender) {
        boolean bColor = true;
        for (Clothes cl : clothesStorage) {
            if (cl.clotheColor.contains(desiredColor) && cl.clotheGender.equalsIgnoreCase(desiredGender)) {
                cl.getAllInfo();
                bColor = false;
            }

        }
        if (bColor) {
            System.out.println("Няма такъв цвят дрехи");
        }
    }

    public static void getClothesPrice(double desiredPrice, String desiredGender) {
        boolean bPrice = true;
        for (Clothes cl : clothesStorage) {
            if (cl.clothePrice <= desiredPrice && cl.clotheGender.equalsIgnoreCase(desiredGender) && cl.clothePrice >= 0) {
                cl.getAllInfo();
                bPrice = false;
            }
        }
        if (bPrice) {
            System.out.println("Няма дрехи до тази цена");
        }
    }

    public static void getClothesSeason(String desiredSeason, String desiredGender) {
        boolean bSeason = true;
        for (Clothes cl : clothesStorage) {
            if (cl.clotheSeason.contains(desiredSeason) && cl.clotheGender.equalsIgnoreCase(desiredGender)) {
                cl.getAllInfo();
                bSeason = false;
            }

        }
        if (bSeason) {
            System.out.println("Няма дрехи за такъв сезон");
        }
    }

    public static void getAllClothes(String desiredGender) {
        for (Clothes cl : clothesStorage) {
            if (cl.clotheGender.equalsIgnoreCase(desiredGender)) {
                cl.getAllInfo();
            }
        }
    }

    public void getAllClothesEmpV(int currentProduct) {
        System.out.println("Вид : " + this.clotheType + " | Размер : " + this.clotheSize + " | Бранд : " + this.clotheBrand + " | Цвят : " + this.clotheColor + " | Цена : " + this.clothePrice + " | Сезон : " + this.clotheSeason + " | Пол : " + this.clotheGender + " | Сериен номер : " + currentProduct);
    }

    public String toString() {
        return "Вид : " + this.clotheType + " | Размер : " + this.clotheSize + " | Бранд : " + this.clotheBrand + " | Цвят : " + this.clotheColor + " | Цена : " + this.clothePrice + " | Сезон : " + this.clotheSeason + " | Пол : " + this.clotheGender;
    }

}