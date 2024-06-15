package thd.game.utilities;

import thd.game.level.Difficulty;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Manages access to files on the pc.
 */
public class FileAccess {

    private static final Path WICHTEL_GAME_FILE = Path.of(System.getProperty("user.home"), new String[0]).resolve("wichtelgame.txt");

    /**
     * Writes the difficulty to a file.
     *
     * @param difficulty The difficulty to write.
     */
    public static void writeDifficultyToDisc(Difficulty difficulty) {
        try {
            Files.writeString(WICHTEL_GAME_FILE, difficulty.toString(), new java.nio.file.OpenOption[0]);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
    }

    /**
     * Reads the difficulty from a file.
     *
     * @return The difficulty.
     */
    public static Difficulty readDifficultyFromDisc() {
        try {
            String difficultyString = Files.readString(WICHTEL_GAME_FILE);
            if (difficultyString.equals("EASY")) {
                return Difficulty.EASY;
            } else if (difficultyString.equals("STANDARD")) {
                return Difficulty.STANDARD;
            }
            throw new IOException();
        } catch (IOException e) {
            return Difficulty.STANDARD;
        }
    }
}
