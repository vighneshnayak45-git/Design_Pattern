public class Team implements Observer{

    private String name;

    public Team(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {

        System.out.println(name + " notified: " + message);

    }




//    class EmailService implements Observer {
//        public void update(String message) {
//            System.out.println("Email sent: " + message);
//        }
//    }
//
//    class AuditLogger implements Observer {
//        public void update(String message) {
//            System.out.println("Audit log: " + message);
//        }
//    }
}
