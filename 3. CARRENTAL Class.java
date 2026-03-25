import java.util.Scanner;

class CARRENTAL {
    int CarId;
    String CarType;
    float Rent;

    void GetCar(int id, String type) {
        CarId = id;
        CarType = type;
    }

    float GetRent() {
        if (CarType.equalsIgnoreCase("Small Car"))
            Rent = 1000;
        else if (CarType.equalsIgnoreCase("Van"))
            Rent = 800;
        else if (CarType.equalsIgnoreCase("SUV"))
            Rent = 2500;
        return Rent;
    }

    void ShowCar() {
        System.out.println(CarId + " " + CarType + " " + Rent);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CARRENTAL c = new CARRENTAL();

        int id = sc.nextInt();
        sc.nextLine();
        String type = sc.nextLine();

        c.GetCar(id, type);
        c.GetRent();
        c.ShowCar();
    }
}
