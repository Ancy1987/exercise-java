package designpattern.creational;

public class SingletonClient {

    public static void main(String[] args) {
        int i=0;
        while(i<10){
            System.out.println("get instance calling");
            DbConnection x =DbConnection.getInstance();
            i++;
        }
    }

}

class DbConnection{
    static DbConnection dbConnection = null;
    private DbConnection() {

    }

    static DbConnection getInstance(){
        if(dbConnection == null){
            System.out.println("created once");
            dbConnection = new DbConnection();
        }
        return dbConnection;
    }
}