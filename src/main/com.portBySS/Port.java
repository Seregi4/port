import java.util.ArrayList;

public class Port {
    private ArrayList<Berth> berths;



    public Port() {
        super();
    }

    public Port(ArrayList<Berth> berths) {
        this.berths = berths;

    }

    public ArrayList<Berth> getBerths() {
        return berths;
    }

    public void setBerths(ArrayList<Berth> berths) {
        this.berths = berths;
    }


}
