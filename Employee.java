import java.util.ArrayList;

public class Employee {

    private static double ePrice;
    private String name, family, egn, email, password, username;
    public static ArrayList<Employee> emps = new ArrayList<>();

    static {
        emps.add(new Employee("Ivan", "Ivanov", "9800000000", "ivan_ivanov@abv.bg", "1234i", "ii"));
        emps.add(new Employee("Asen", "Asenov", "8900000000", "asen_asenov@abv.bg", "1234a", "aa"));
        emps.add(new Employee("Georgi", "Georgiev", "7800000000", "georgi_georgiev@abv.bg", "1234g", "gg"));
    }

    public Employee() {

    }

    public Employee(String name, String family, String egn, String email, String password, String username) {
        this.name = name;
        this.family = family;
        this.egn = egn;
        this.email = email;
        this.password = password;
        this.username = username;
    }

    public double getePrice() {
        return ePrice;
    }

    public void setePrice(double ePrice) {
        Employee.ePrice = ePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getEgn() {
        return egn;
    }

    public void setEgn(String egn) {
        this.egn = egn;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public static void employeeFirstPage() {
        System.out.println("Бихте желал да пазарувате (въведете '1'), да редактирате цената на стоката в магазина(въведете '2'), или да добавите нова стока(въведете '3')");
        String input = App.scan.nextLine();
        if (input.contentEquals("1")) {
            App.menu();
        } else if (input.contentEquals("2")) {
            employeeSetPrice();
        } else if (input.contentEquals("3")) {
            addClothe();
        } else {
            System.out.println("Невалидна операция");
        }
    }

    //Служители - вход
    public static void getEmployee(String enteredEmailOrUsername, String enteredPassword) {
        boolean bEmployee = true;
        for (Employee emp : emps) {
            if ((emp.email.equalsIgnoreCase(enteredEmailOrUsername) && emp.password.equals(enteredPassword))
                    || (emp.username.equals(enteredEmailOrUsername) && emp.password.equals(enteredPassword))) {
                System.out.println("Добре дошъл, " + emp.name + "!");
                bEmployee = false;
                employeeFirstPage();
            }

        }
        if (bEmployee) {
            System.out.println("Няма такъв потребител или сте въвели грешни данни.");
            App.main(null);
        }
    }

    //Служителите редактират цена (продукта да се избира по сериен номер)
    public static void employeeSetPrice() {

        int currentProduct = 0;
        int serialNum = 0;
        String input;
        for (Clothes cl : Clothes.clothesStorage) {
            cl.getAllClothesEmpV(currentProduct);
            currentProduct++;
        }
        currentProduct = 0;

        do{
            System.out.println("Изберете '1' ако искате да продължите да редактирате и '2' ако искате да се върнете");

            input = App.scan.nextLine();

            if(input.equals("1")){
                System.out.println("Изберете един продукт по серийния му номер.");
                serialNum = Integer.parseInt(App.scan.nextLine());
                if (serialNum > -1 && serialNum < Clothes.clothesStorage.toArray().length) {
                    System.out.println("Избрахте следния продукт : ");
                    System.out.println(Clothes.clothesStorage.get(serialNum).toString());
                    System.out.print("Въведете новата цена на продукта : ");
                    double ePrice = Double.parseDouble(App.scan.nextLine());
                    System.out.println("");
                    if (ePrice == Clothes.clothesStorage.get(serialNum).getClothePrice()) {
                        System.out.println("Цената остана същата.");
                    } else if (ePrice != Clothes.clothesStorage.get(serialNum).getClothePrice() && ePrice >= 0) {
                        Clothes.clothesStorage.get(serialNum).setClothePrice(ePrice);
                        System.out.println("Променихте цената успешно.");
                    } else {
                        System.out.println("Невалидна сума.");
                    }
                } else if (serialNum < -1 || serialNum > Clothes.clothesStorage.toArray().length) {
                    System.out.println("Няма такъв сериен номер");

                }
            }
            else if (input.equals("2")){
                employeeFirstPage();

            }



        }
        while (input != "2");


    }

    //Служителите да добавят нови дрехи
    public static void addClothe() {
        System.out.println("Вид : ");
        String type = App.scan.nextLine();
        System.out.println("Размер : ");
        String size = App.scan.nextLine();
        System.out.println("Марка : ");
        String brand = App.scan.nextLine();
        System.out.println("Цвят : ");
        String color = App.scan.nextLine();
        System.out.println("Цена : ");
        double price = Double.parseDouble(App.scan.nextLine());
        System.out.println("Сезон : ");
        String season = App.scan.nextLine();
        System.out.println("Пол : ");
        String gender = App.scan.nextLine();
        Clothes c1 = new Clothes(type, size, brand, color, price, season, gender);
        Clothes.clothesStorage.add(c1);
        System.out.println("Успешно добавена стока!");
        c1.getAllInfo();
        employeeFirstPage();

    }

}