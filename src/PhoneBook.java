
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook{

    private Map<Long, Record> records = new HashMap<>();

    public List<Record> getAllRecords(){
        return List.copyOf(records.values());
    }

    public void createRecord(Record record) throws PhoneNumberAlreadyExists {
        for(Record r : records.values()){
            if(r.getNumber().equals(record.getNumber())){
                throw new PhoneNumberAlreadyExists("Number " + record.getNumber());
            }
        }

        records.put(record.getId(), record);
    }

    public void updateRecord(Record record) throws RecordNotValid {
        if(!records.containsKey(record.getId())){
            throw new RecordNotFound("Id " + record.getId());
        }

        if(record.getNumber()==null || record.getName()==null){
            throw new RecordNotValid("Record " + record);
        }

        records.put(record.getId(), record);
    }

    public void deleteRecord(long id){
        if(!records.containsKey(id)){
            throw new RecordNotFound("Id " + id);
        }

        records.remove(id);
    }
}