package hexlet.code;

import java.util.List;
import java.util.Map;

public class Differ {
    public static String generate(String filePath1, String filePath2, String Format) {
        Map<String, Object> map1 = getFileData(filePath1);
        Map<String, Object> map2 = getFileData(filePath2);
        List<Map<String, Object>> result = FinderDifference.differ(map1, map2);
        return
    }

    private static Map<String, Object> getFileData(String filePath1) {
    }
}
