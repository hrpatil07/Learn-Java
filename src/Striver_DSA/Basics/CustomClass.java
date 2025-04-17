package src.Striver_DSA.Basics;

// Class to hold user-defined data with some internal information
class Data {
    // Private member variables
    private Integer num;
    private String name;
    private InternalData internalData;

    // Constructor to initialize all fields
    Data(int _num, String _name, int _revenue) {
        this.num = _num;
        this.name = _name;
        // InternalData is a separate class holding more details
        this.internalData = new InternalData(_revenue);
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Setter method for num
    public void setNum(int num) {
        this.num = num;
    }

    // Getter method for num
    public Integer getNum() {
        return num;
    }

    // Getter method for name
    public String getName() {
        return name;
    }
}

// A helper class to hold internal information (here, revenue)
class InternalData {
    public Integer revenue;

    // Constructor to initialize revenue
    InternalData(Integer _revenue) {
        this.revenue = _revenue;
    }
}

// Main class to test the functionality of Data class
public class CustomClass {
    public static void main(String args[]) {
        // Creating two Data objects with different values
        Data dataObj1 = new Data(1, "Hrushi", 1000);
        Data dataObj2 = new Data(2, "Bhushan", 10000);

        // Printing name of second object
        System.out.println(dataObj2.getName()); // Output: Bhushan

        // Modifying the name of first object
        dataObj1.setName("Hrushikesh");

        // Printing updated name of first object
        System.out.println(dataObj1.getName()); // Output: Hrushikesh
    }
}
