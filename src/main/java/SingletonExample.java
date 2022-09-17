class DBConnection {

    private static DBConnection instance;

    private DBConnection(){
    }
    public static DBConnection getInstance(){
        if (instance == null){
            instance = new DBConnection();
        }
        return instance;
    }
    public void getfromDB(){
        System.out.println("Data fromDB");
    }
}


public class SingletonExample{
    public static void main(String[] args) {
        DBConnection connection = DBConnection.getInstance();
        connection.getfromDB();
    }

}
