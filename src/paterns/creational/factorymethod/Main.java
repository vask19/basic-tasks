package paterns.creational.factorymethod;

public class Main {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperFactoryBySpeciality("java");
        developerFactory.createDeveloper().writeCode();

    }


    static DeveloperFactory createDeveloperFactoryBySpeciality(String speciality){
       if (speciality.equalsIgnoreCase("java")){
           return new JavaDeveloperFactory();
       }
       else if (speciality.equals("cpp")){
           return new CppDeveloperFactory();
       }
       else {
           throw new RuntimeException("speciality isn't exists");
       }
    }
}
