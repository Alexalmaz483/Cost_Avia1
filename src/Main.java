public class Main {
    public static void main(String[] args) {
        int ticketPrice =20275; // стоимость билета в рублях
        int mileCost = 20;       // рублей за 1 милю

        int miles = ticketPrice / mileCost; // целочисленное деление, дробные мили отбрасываются

        System.out.println("Начислено миль: " + miles);
    }
}