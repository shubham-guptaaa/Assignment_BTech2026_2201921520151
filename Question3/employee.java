package Question3;
class employee{
    private String name;
    private int id;
    private String dept;
    
    //Constructor to display only name
    employee(String name){
        this.name = name;
    }

    //Constructor to display name and id
    employee(String name, int id){
        this.name = name;
        this.id = id;

    }

    //Constructor to display name , id and Department

    employee(String name, int id, String dept){
        this.name = name;
        this.id = id;
        this.dept = dept;
    }

    // Method to display the details of the employee
    public void displayDetails(){
        System.out.println("Name:- "+ name);
        if(id!=0){
            System.out.println("Id:- "+ id);
        }
        if(dept!=null){
            System.out.println("Department:- "+dept);
        }
    }

    public static void main(String[] args){
        employee emp1 = new employee("Shubham Gupta");
        emp1.displayDetails();

        employee emp2 = new employee("Shubham Gupta", 151);
        emp2.displayDetails();

        employee emp3 = new employee("Shubham Gupta", 151, "IT");
        emp3.displayDetails();
    }
}