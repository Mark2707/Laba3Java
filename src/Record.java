public class Record{
    private long id;
    private String number;
    private String name;

    public long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Record(long id, String number, String name){
        this.id = id;
        this.number = number;
        this.name = name;
    }
}
