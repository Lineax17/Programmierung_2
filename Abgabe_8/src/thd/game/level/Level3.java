package thd.game.level;

/**
 * The third level of the game.
 */
public class Level3 extends Level {

    /**
     * Initializes the level.
     */
    public Level3() {
        super.world = """
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                         F            W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W         F                            W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                 A                    W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                             G        W\s
                W                                      W\s
                W                                      W\s
                W       O    O   O  O      OOO         W\s
                W       O     O O   O     O   O        W\s
                W       O     O O   O       OOO        W\s
                W       OOOO   O    OOOO  O   O        W\s
                W                          OOO         W\s
                W                                      W\s
                WW                                   WWW\s
                WW                                    WW\s
                WWW                                  BWW\s
                WWWW                                WWWW\s
                WW                                    WW\s
                W                                      W\s
                WW                                    SW\s
                WWW                                    W\s
                WW                                     W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s""";
        number = 3;
        worldOffsetLines = world.split("\\R").length - 23;
        worldOffsetColumns = 0;
    }
}
