public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder().setName("Анна").setSurname("Вольф").setAge(32).setAddress("Сидней").build();
        Person son = mom.newChildBuilder().setName("Антошка").build();
        System.out.format("У %s есть сын, %s \n", mom, son);
    }
}