public class Main {
    public static void main(String[] args) {

//        задание 1

        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println(fullName);

//        задание 2

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

//        задание 3

        fullName = "Иванов Семён Семёнович ";
        String repName = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сторудника - " + repName);

    }
}