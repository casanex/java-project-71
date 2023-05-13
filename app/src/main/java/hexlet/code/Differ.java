package hexlet.code;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

public class Differ {
    public static String generate(String filePath1, String filePath2, String Format) throws Exception {
        Map<String, Object> map1 = getUrlData(filePath1);
        Map<String, Object> map2 = getUrlData(filePath2);
        List<Map<String, Object>> result = FinderDifference.differ(map1, map2);
        return
    }


}
