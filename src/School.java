public class School {

    void oldLearning() {
        System.out.println("Using Galpuwaruwa");
    }
}
class newSchool extends School {
    void newLearning() {
        System.out.println("Using Books");
    }
}
class modernSchool extends School {
    void modernLearning() {
        System.out.println("Using Tab");
    }
}
class Test2 {
    public static void main(String[] args) {
        modernSchool ms = new modernSchool();
        ms.oldLearning();
        //ms.newLearning();
        ms.modernLearning();
    }
}

