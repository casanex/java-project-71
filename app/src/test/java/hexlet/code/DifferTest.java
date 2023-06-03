package hexlet.code;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DifferTest {
    private static final String path1json = "src/test/resources/filenumber1.json";
    private static final String path2json = "src/test/resources/filenumber2.json";
    private static final String path3yml = "src/test/resources/filenumber1.yml";
    private  static final String path4yml = "src/test/resources/filenumber2.yml";
    private static final String pathtoExpectedStylish = "src/test/resources/expected/testStylish";
    private static final String pathtoExpectedPlain = "src/test/resources/expected/testPlain";
    private static final String pathtoExpectedJson = "src/test/resources/expected/testJson";

    public DifferTest() throws IOException {
    }

    @Test
    public void test() throws Exception {
        String expected = Files.readString(Paths.get(pathtoExpectedStylish).toAbsolutePath().normalize());
        assertEquals(expected, Differ.generate(path3yml, path4yml));
    }
    @Test
    public void test1() throws Exception {
        String expected = Files.readString(Paths.get(pathtoExpectedStylish).toAbsolutePath().normalize());
        assertEquals(expected, Differ.generate(path1json, path2json));
    }

    @Test
    public void testStylish1() throws Exception {
        String expected = Files.readString(Paths.get(pathtoExpectedStylish).toAbsolutePath().normalize());
        assertEquals(expected, Differ.generate(path1json, path2json, "stylish"));
    }

    @Test
    public void testStylish2() throws Exception {
        String expected = Files.readString(Paths.get(pathtoExpectedStylish).toAbsolutePath().normalize());
        assertEquals(expected, Differ.generate(path3yml, path4yml, "stylish"));
    }

    @Test
    public void testPlain1() throws Exception {
        String expected = Files.readString(Paths.get(pathtoExpectedPlain).toAbsolutePath().normalize());
        assertEquals(expected, Differ.generate(path1json, path2json, "plain"));
    }

    @Test
    public void testPlain2() throws Exception {
        String expected = Files.readString(Paths.get(pathtoExpectedPlain).toAbsolutePath().normalize());
        assertEquals(expected, Differ.generate(path3yml, path4yml, "plain"));
    }

    @Test
    public void testJson1() throws Exception {
        String expected = Files.readString(Paths.get(pathtoExpectedJson).toAbsolutePath().normalize());
        assertEquals(expected, Differ.generate(path1json, path2json, "json"));
    }

    @Test
    public void testJson2() throws Exception {
        String expected = Files.readString(Paths.get(pathtoExpectedJson).toAbsolutePath().normalize());
        assertEquals(expected, Differ.generate(path3yml, path4yml, "json"));
    }
}

