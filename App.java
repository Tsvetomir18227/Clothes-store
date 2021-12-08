import java.util.Scanner;

public class App {

    public static Scanner scan = new Scanner(System.in);

    static {
        System.out.println("Здравейте!");
    }

    public static void main(String[] args) {

        System.out.print("Kато какъв потребител искате да се впишете в системата?");
        System.out.println("\n 1. Клиент\n 2. Служител\n 3. Искам да се кандидатирам");

        String input = scan.nextLine(); // 3 "3"

        if (input.equals("1")) {

            menu();

        } else if (input.equals("2")) {

            System.out.println("Въведете вашето потребителско име или e-mail адрес");
            String emailOrUsername = scan.nextLine();
            System.out.println("Въведете вашата парола");
            String password = scan.nextLine();

            Employee.getEmployee(emailOrUsername, password);

        } else if (input.equals("3")) {

            System.out.println(
                    "Изисквания : \n Навършени 19 години; \n Поне година стаж в тази сфера; \n Образование над, или на ниво 'Средно';\n");

            System.out.println("Въведете вашият e-mail адрес");
            String email = scan.nextLine();
            System.out.println("Въведете потребителско име");
            String username = scan.nextLine();
            System.out.println("Въведете вашето име");
            String name = scan.nextLine();
            System.out.println("Въведете вашата фамилия");
            String family = scan.nextLine();
            System.out.println("Въведете вашите години");
            int age = Integer.parseInt(scan.nextLine());
            System.out.println("Въведете вашето ЕГН");
            String egn = scan.nextLine();
            System.out.println("Въведете вашият опит");
            int experience = Integer.parseInt(scan.nextLine());
            System.out.println("Въведете вашето образование");
            String education = scan.nextLine();
            System.out.println("Въведете вашата парола");
            String password = scan.nextLine();

            Applications.getApplications(age, experience, education, egn, email, password, name, family, username);

        } else if(input.equalsIgnoreCase("stop") || input.equalsIgnoreCase("стоп")) {
            System.out.println("--ПРИЛОЖЕНИЕТО ИЗГОТВИЛИ--"
                    + "\n18201 Алекс Любенов"
                    + "\n18227 Цветомир Муташки"
                    + "\n18209 Владислав Димитров"
                    + "\n18212 Димитър Викентиев"
                    + "\n18213 Димитър Величков"
                    + "\n18218 Момчил Никифоров");
            System.exit(0);
        }else {
            System.out.println("Излязохте извън допустимите опции.");
            main(null);
        }

    }

    public static void menu() {

        System.out.println("Изберете:\n 1. Мъжко \n 2. Дамско");
        String input = scan.nextLine();
        String desiredGender;

        switch (input) {

            case "1":
                desiredGender = "мъжко";
                while (!input.equalsIgnoreCase("стоп")) {
                    System.out.println(" 1. Търсене по вид " + "\n 2. Търсене по размер " + "\n 3. Търсене по бранд"
                            + "\n 4. Търсене по цвят" + "\n 5. Търсене по цена" + "\n 6. Търсене по сезон"
                            + "\n 7. Всичко");
                    input = scan.nextLine();
                    switch (input) {
                        case "1":
                            System.out.println("Какъв вид дрехи търсите?");
                            String desiredType = scan.nextLine();
                            Clothes.getClothesType(desiredType, desiredGender);
                            break;

                        case "2":
                            System.out.println("Какъв размер търсите?");
                            String desiredSize = scan.nextLine();
                            Clothes.getClothesSize(desiredSize, desiredGender);
                            break;

                        case "3":
                            System.out.println("Какъв бранд търсите?");
                            String desiredBrand = scan.nextLine();
                            Clothes.getClothesBrand(desiredBrand, desiredGender);
                            break;

                        case "4":
                            System.out.println("Какъв цвят търсите?");
                            String desiredColor = scan.nextLine();
                            Clothes.getClothesColor(desiredColor, desiredGender);
                            break;

                        case "5":
                            System.out.println("До каква цена търсите?");
                            double desiredPrice = Double.parseDouble(scan.nextLine());
                            Clothes.getClothesPrice(desiredPrice, desiredGender);
                            break;

                        case "6":
                            System.out.println("За кой сезон търсите?");
                            String desiredSeason = scan.nextLine();
                            Clothes.getClothesSeason(desiredSeason, desiredGender);
                            break;

                        case "7":
                            Clothes.getAllClothes(desiredGender);
                            break;

                        case "стоп":
                            System.out.println("--ПРИЛОЖЕНИЕТО ИЗГОТВИЛИ--"
                                    + "\n18201 Алекс Любенов"
                                    + "\n18227 Цветомир Муташки"
                                    + "\n18209 Владислав Димитров"
                                    + "\n18212 Димитър Викентиев"
                                    + "\n18213 Димитър Величков"
                                    + "\n18218 Момчил Никифоров");
                            System.exit(0);

                        case "stop":
                            System.out.println("--ПРИЛОЖЕНИЕТО ИЗГОТВИЛИ--"
                                    + "\n18201 Алекс Любенов"
                                    + "\n18227 Цветомир Муташки"
                                    + "\n18209 Владислав Димитров"
                                    + "\n18212 Димитър Викентиев"
                                    + "\n18213 Димитър Величков"
                                    + "\n18218 Момчил Никифоров");
                            System.exit(0);

                        default:
                            System.out.println("Невалидна операция");
                            break;
                    }
                }
                break;
            case "2":
                desiredGender = "дамско";
                while (!input.equalsIgnoreCase("стоп")) {
                    System.out.println(" 1. Търсене по вид " + "\n 2. Търсене по размер " + "\n 3. Търсене по бранд"
                            + "\n 4. Търсене по цвят" + "\n 5. Търсене по цена" + "\n 6. Търсене по сезон"
                            + "\n 7. Всичко");
                    input = scan.nextLine();
                    switch (input) {
                        case "1":
                            System.out.println("Какъв вид дрехи търсите?");
                            String desiredType = scan.nextLine();
                            Clothes.getClothesType(desiredType, desiredGender);
                            break;

                        case "2":
                            System.out.println("Какъв размер търсите?");
                            String desiredSize = scan.nextLine();
                            Clothes.getClothesSize(desiredSize, desiredGender);
                            break;

                        case "3":
                            System.out.println("Какъв бранд търсите?");
                            String desiredBrand = scan.nextLine();
                            Clothes.getClothesBrand(desiredBrand, desiredGender);
                            break;

                        case "4":
                            System.out.println("Какъв цвят търсите?");
                            String desiredColor = scan.nextLine();
                            Clothes.getClothesColor(desiredColor, desiredGender);
                            break;

                        case "5":
                            System.out.println("До каква цена търсите?");
                            double desiredPrice = Double.parseDouble(scan.nextLine());
                            Clothes.getClothesPrice(desiredPrice, desiredGender);
                            break;

                        case "6":
                            System.out.println("За кой сезон търсите?");
                            String desiredSeason = scan.nextLine();
                            Clothes.getClothesSeason(desiredSeason, desiredGender);
                            break;

                        case "7":
                            Clothes.getAllClothes(desiredGender);
                            break;

                        case "стоп":
                            System.out.println("--ПРИЛОЖЕНИЕТО ИЗГОТВИЛИ--"
                                    + "\n18201 Алекс Любенов"
                                    + "\n18227 Цветомир Муташки"
                                    + "\n18209 Владислав Димитров"
                                    + "\n18212 Димитър Викентиев"
                                    + "\n18213 Димитър Величков"
                                    + "\n18218 Момчил Никифоров");
                            System.exit(0);

                        case "stop":
                            System.out.println("--ПРИЛОЖЕНИЕТО ИЗГОТВИЛИ--"
                                    + "\n18201 Алекс Любенов"
                                    + "\n18227 Цветомир Муташки"
                                    + "\n18209 Владислав Димитров"
                                    + "\n18212 Димитър Викентиев"
                                    + "\n18213 Димитър Величков"
                                    + "\n18218 Момчил Никифоров");
                            System.exit(0);

                        default:
                            System.out.println("Невалидна операция");
                    }
                }
                break;

            case "стоп":
                System.out.println("--ПРИЛОЖЕНИЕТО ИЗГОТВИЛИ--"
                        + "\n18201 Алекс Любенов"
                        + "\n18227 Цветомир Муташки"
                        + "\n18209 Владислав Димитров"
                        + "\n18212 Димитър Викентиев"
                        + "\n18213 Димитър Величков"
                        + "\n18218 Момчил Никифоров");
                System.exit(0);

            case "stop":
                System.out.println("--ПРИЛОЖЕНИЕТО ИЗГОТВИЛИ--"
                        + "\n18201 Алекс Любенов"
                        + "\n18227 Цветомир Муташки"
                        + "\n18209 Владислав Димитров"
                        + "\n18212 Димитър Викентиев"
                        + "\n18213 Димитър Величков"
                        + "\n18218 Момчил Никифоров");
                System.exit(0);

            default:
                System.out.println("Невалидна операция");
                main(null);

        }
    }

}