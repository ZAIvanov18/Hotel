public class Hotel {
    String name;
    String id;
    int status;
    int nights;
    double beds;
    String city;

    public Hotel(String name, String id, int status, int nights, double beds, String city) {
        this.name = name;
        this.id = id;
        this.status = status;
        this.nights = nights;
        this.beds = beds;
        this.city = city;
    }

    public Hotel(){

    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", status=" + status +
                ", nights=" + nights +
                ", beds=" + beds +
                ", city='" + city + '\'' +
                '}';
    }
}
