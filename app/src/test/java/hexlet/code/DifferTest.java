package hexlet.code;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DifferTest {
    private static String pathToExpectedStylish;
    private static String pathToExpectedPlain;
    private static String pathToExpectedJson;
    private static final String PATH1_JSON = "src/test/resources/filenumber1.json";
    private static final String PATH2_JSON = "src/test/resources/filenumber2.json";
    private static final String PATH3_YML = "src/test/resources/filenumber1.yml";
    private static final String PATH4_YML = "src/test/resources/filenumber2.yml";


    public String readingString(String toNormalize) throws IOException {
        return Files.readString(Paths.get(toNormalize).toAbsolutePath().normalize());
    }


    public DifferTest() throws IOException {
    }
    @BeforeAll
    public static void initString() {
        pathToExpectedStylish = "src/test/resources/expected/testStylish";
        pathToExpectedPlain = "src/test/resources/expected/testPlain";
        pathToExpectedJson = "src/test/resources/expected/testJson";
    }
    @Test
        public void testGenerateStylishFromYaml() throws Exception {
        String expected = readingString(pathToExpectedStylish);
        assertEquals(expected, Differ.generate(PATH3_YML, PATH4_YML));
    }
    @Test
        public void testGenerateStylishFromJson() throws Exception {
        String expected = readingString(pathToExpectedStylish);
        assertEquals(expected, Differ.generate(PATH1_JSON, PATH2_JSON));
    }

    @Test
        public void testStylish1() throws Exception {
        String expected = readingString(pathToExpectedStylish);
        assertEquals(expected, Differ.generate(PATH1_JSON, PATH2_JSON, "stylish"));
    }

    @Test
        public void testStylish2() throws Exception {
        String expected = readingString(pathToExpectedStylish);
        assertEquals(expected, Differ.generate(PATH3_YML, PATH4_YML, "stylish"));
    }

    @Test
        public void testPlain1() throws Exception {
        String expected = readingString(pathToExpectedPlain);
        assertEquals(expected, Differ.generate(PATH1_JSON, PATH2_JSON, "plain"));
    }

    @Test
        public void testPlain2() throws Exception {
        String expected = readingString(pathToExpectedPlain);
        assertEquals(expected, Differ.generate(PATH3_YML, PATH4_YML, "plain"));
    }

    @Test
        public void testJson1() throws Exception {
        String expected = readingString(pathToExpectedJson);
        assertEquals(expected, Differ.generate(PATH1_JSON, PATH2_JSON, "json"));
    }

    @Test
        public void testJson2() throws Exception {
        String expected = readingString(pathToExpectedJson);
        assertEquals(expected, Differ.generate(PATH3_YML, PATH4_YML, "json"));
    }

}


