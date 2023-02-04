package paterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        Database database = new AdapterJavaToDatabase();
        database.save();
        database.insert();
        database.update();
        database.delete();
    }
}
