package hexlet.code;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DifferTest {

    private static final String path1Json = "src/test/resources/filenumber1.json";
    private static final String path2Json = "src/test/resources/filenumber2.json";
    private static final String path3Yml = "src/test/resources/filenumber1.yml";
    private static final String path4Yml = "src/test/resources/filenumber2.yml";

    private static final Path pathStylish =
            Paths.get("src/test/resources/expected/testStylish").toAbsolutePath().normalize();
    private static final Path pathPlain =
            Paths.get("src/test/resources/expected/testPlain").toAbsolutePath().normalize();
    private static final Path pathJson =
            Paths.get("src/test/resources/expected/testJson").toAbsolutePath().normalize();

    public DifferTest() throws IOException {
    }

    @Test
    public void test1() throws Exception {
        String expected = Files.readString(pathStylish);
        assertEquals(expected, Differ.generate(path1Json, path2Json));
    }
    @Test
    public void test2() throws Exception {
        String expected = Files.readString(pathStylish);
        assertEquals(expected, Differ.generate(path3Yml, path4Yml));
    }

    @Test
    public void testStylish1() throws Exception {
        String expected = Files.readString(pathStylish);
        assertEquals(expected, Differ.generate(path1Json, path2Json, "stylish"));
    }

    @Test
    public void testStylish2() throws Exception {
        String expected = Files.readString(pathStylish);
        assertEquals(expected, Differ.generate(path3Yml, path4Yml, "stylish"));
    }

    @Test
    public void testPlain1() throws Exception {
        String expected = Files.readString(pathPlain);
        assertEquals(expected, Differ.generate(path1Json, path2Json, "plain"));
    }

    @Test
    public void testPlain2() throws Exception {
        String expected = Files.readString(pathPlain);
        assertEquals(expected, Differ.generate(path3Yml, path4Yml, "plain"));
    }

    @Test
    public void testJson1() throws Exception {
        String expected = Files.readString(pathJson);
        assertEquals(expected, Differ.generate(path1Json, path2Json, "json"));
    }

    @Test
    public void testJson2() throws Exception {
        String expected = Files.readString(pathJson);
        assertEquals(expected, Differ.generate(path3Yml, path4Yml, "json"));
    }
}

