package hexlet.code;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

import java.io.File;
import java.math.BigInteger;
import java.nio.file.Files;
import java.security.MessageDigest;
import java.util.concurrent.Callable;

    @Command(name = "gendiff", mixinStandardHelpOptions = true, version = "gendiff ver 1.0",
        description = "Compares two configuration files and shows a difference.")

        public class App implements Callable<Integer> {
        @Option(names = {"-f", "--format"}, paramLabel = "format",
                defaultValue = "stylish", description = "output format [default: stylish]")
        private String format;

        @Parameters(paramLabel= "filepath1", description = "path to first file")
        private String filepath1;
        @Parameters(paramLabel= "filepath2", description = "path to second file")
        private String filepath2;

        @Option(names = {"-V", "--version"}, versionHelp = true, description = "Print version information and exit.")
        boolean versionInfoRequested;
        @Option(names = {"-h", "--help"}, usageHelp = true, description = "Show this help message and exit.")
        boolean usageHelpRequested;


        public static void main(String... args) {
            int exitCode = new CommandLine(new App()).execute(args);
            System.exit(exitCode);
        }
        @Override
        public Integer call() throws Exception {
                        return 0;
        }
    }
