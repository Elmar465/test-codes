public class Car {
    private String car_name;
    private Double car_price;
    private Integer car_year;

    public String getCar_name(){
        return car_name;
    }

    public void setCar_name(String car_name){
        this.car_name = car_name;
    }

    public Double getCar_price(){
        return car_price;
    }

    public void setCar_price(Double car_price){
        this.car_price = car_price;
    }

    public Integer getCar_year(){
        return car_year;
    }

    public void setCar_year(Integer car_year){
        this.car_year = car_year;
    }


    public void accelarate(){
        System.out.println("Car is starting");
    }

    public void stop(){
        System.out.println("Car is stopping");
    }


}
