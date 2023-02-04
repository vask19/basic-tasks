package paterns.structural.adapter;

public class AdapterJavaToDatabase extends JavaApplication implements Database{
    @Override
    public void insert() {
        insertJavaObject();
    }

    @Override
    public void save() {
        saveJavaObject();
    }

    @Override
    public void delete() {
        deleteJavaObject();
    }

    @Override
    public void update() {
        updateJavaObject();
    }
}
