package hexlet.code;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DifferTest {
    private static final String PATH1_JSON = "src/test/resources/filenumber1.json";
    private static final String PATH2_JSON = "src/test/resources/filenumber2.json";
    private static final String PATH3_YML = "src/test/resources/filenumber1.yml";
    private  static final String PATH4_YML = "src/test/resources/filenumber2.yml";
    private static final String PATH_TO_EXPECTED_STYLISH = "src/test/resources/expected/testStylish";
    private static final String PATH_TO_EXPECTED_PLAIN = "src/test/resources/expected/testPlain";
    private static final String PATH_TO_EXPECTED_JSON = "src/test/resources/expected/testJson";

    public DifferTest() throws IOException {
    }

    @Test
    public void test() throws Exception {
        String expected = Files.readString(Paths.get(PATH_TO_EXPECTED_STYLISH).toAbsolutePath().normalize());
        assertEquals(expected, Differ.generate(PATH3_YML, PATH4_YML));
    }
    @Test
    public void test1() throws Exception {
        String expected = Files.readString(Paths.get(PATH_TO_EXPECTED_STYLISH).toAbsolutePath().normalize());
        assertEquals(expected, Differ.generate(PATH1_JSON, PATH2_JSON));
    }

    @Test
    public void testStylish1() throws Exception {
        String expected = Files.readString(Paths.get(PATH_TO_EXPECTED_STYLISH).toAbsolutePath().normalize());
        assertEquals(expected, Differ.generate(PATH1_JSON, PATH2_JSON, "stylish"));
    }

    @Test
    public void testStylish2() throws Exception {
        String expected = Files.readString(Paths.get(PATH_TO_EXPECTED_STYLISH).toAbsolutePath().normalize());
        assertEquals(expected, Differ.generate(PATH3_YML, PATH4_YML, "stylish"));
    }

    @Test
    public void testPlain1() throws Exception {
        String expected = Files.readString(Paths.get(PATH_TO_EXPECTED_PLAIN).toAbsolutePath().normalize());
        assertEquals(expected, Differ.generate(PATH1_JSON, PATH2_JSON, "plain"));
    }

    @Test
    public void testPlain2() throws Exception {
        String expected = Files.readString(Paths.get(PATH_TO_EXPECTED_PLAIN).toAbsolutePath().normalize());
        assertEquals(expected, Differ.generate(PATH3_YML, PATH4_YML, "plain"));
    }

    @Test
    public void testJson1() throws Exception {
        String expected = Files.readString(Paths.get(PATH_TO_EXPECTED_JSON).toAbsolutePath().normalize());
        assertEquals(expected, Differ.generate(PATH1_JSON, PATH2_JSON, "json"));
    }

    @Test
    public void testJson2() throws Exception {
        String expected = Files.readString(Paths.get(PATH_TO_EXPECTED_JSON).toAbsolutePath().normalize());
        assertEquals(expected, Differ.generate(PATH3_YML, PATH4_YML, "json"));
    }
}

