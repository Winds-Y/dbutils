import org.apache.commons.dbutils.ResultSetHandler;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MyHandler implements ResultSetHandler<List<Dict_user>> {

    @Override
    public List<Dict_user> handle(ResultSet resultSet) throws SQLException {
        List<Dict_user> list=new ArrayList<>();
        while (resultSet.next()){
            Dict_user dictUser =new Dict_user();
            dictUser .setId(resultSet.getInt("id"));
            dictUser .setSurname(resultSet.getString("surname"));
            dictUser .setPinyin(resultSet.getString("pinyin"));
            list.add(dictUser );
        }
        return list;
    }
}
