import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        Directory directory = new Directory();

        Object[] options = {"Add", "View List",
         "Edit", "Delete", "Exit"};

         int choice = 0;
         int id = 0;


         do {

            choice = JOptionPane.showOptionDialog(null, "Choose Action", "Advice", 
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.WARNING_MESSAGE, null, options,options[0]);

            switch(choice){

            case 0:
                Car car = new Car();
                car.setBrand(JOptionPane.showInputDialog(null, "Type in Car BRAND"));
                car.setModel(JOptionPane.showInputDialog(null, "Type in Car MODEL"));
                car.setColor(JOptionPane.showInputDialog(null, "Type in Car COLOR"));
                car.setPlateNumber(JOptionPane.showInputDialog(null, "Type in Car PLATE NUMBER"));
                directory.addCar(car);
                break;

            case 1:
                JOptionPane.showMessageDialog(null, directory.ViewCarlist());
                break;

            case 2:
            id = Integer.parseInt(JOptionPane.showInputDialog(null, directory.ViewCarlist() + "Type in ID to be EDITED"));
                Car editedCar = new Car();
                editedCar.setBrand(JOptionPane.showInputDialog(null, "Type in Car BRAND"));
                editedCar.setModel(JOptionPane.showInputDialog(null, "Type in Car MODEL"));
                editedCar.setColor(JOptionPane.showInputDialog(null, "Type in Car COLOR"));
                editedCar.setPlateNumber(JOptionPane.showInputDialog(null, "Type in Car PLATE NUMBER"));
                directory.editCar(id, editedCar);
                break;

            case 3:
            id = Integer.parseInt(JOptionPane.showInputDialog(null, directory.ViewCarlist() + "Type in ID to be DELETED"));
            directory.deleteCar(id);
            break;

            default:
                break;

            }

         }while (choice !=4);

        
    }


}
