package paterns.structural.bridge;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Developer[] developers = {
                new CppDeveloper(),
                new JavaDeveloper(),
                new JsDeveloper(),
        };

        Program[] programs = {
                new EducationProgram(developers[0]),
                new BankProgram(developers[1]),
                new LogisticCompanyProgram(developers[2])
        };

        Arrays.stream(programs).forEach(Program::createProgram);
    }
}
