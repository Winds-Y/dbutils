import org.apache.commons.dbutils.QueryRunner;

import java.util.List;

public class DbUtilsExer {
    private void test1(){
        QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
        String sql="select * from dict_surname_info where surname= ? and pinyin=?";
        try {
            List<Dict_user>list=qr.query(sql,new MyHandler(),"严","yan");

            for(Dict_user usr : list){
                System.out.println(usr.getId()+" "+usr.getSurname()+" "+usr.getPinyin());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DbUtilsExer dbUtilsExer=new DbUtilsExer();
        dbUtilsExer.test1();
    }
}
