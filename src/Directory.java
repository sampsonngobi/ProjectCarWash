import java.util.ArrayList;

public class Directory {

    private ArrayList<Car> carInfoList;

    public Directory(){
        carInfoList = new ArrayList<>();
    }

    public void addCar(Car c){
        carInfoList.add(c);
    }

    public void editCar(int id, Car c){
        carInfoList.set(id, c);
    }

    public void deleteCar(int id){
        carInfoList.remove(id);
    }

    public String ViewCarlist(){
        String text ="";
        int i =0;
        for (Car c : carInfoList){
            text += "[" + i +"] " +" " + "Car Brand: " + c.getBrand() + " " + "Model: " + c.getModel() +" "+ "Colo: " + c.getColor() + " " + "Plate Number: " + c.getPlateNumber() + "\n";
            i++;
        }
        return text;
        
    }
    
}
