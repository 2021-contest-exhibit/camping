package modak.camping.opendata;

import java.util.List;

public interface OpendataService {
    void getOpenDataJson(String tableName, int rangePageNo, int numOfRows, int contentId) throws Exception;
    List findAll(String tableName);
    void save(String tableName, Opendata opendata);
}
