package thd.game.level;

/**
 * The second level of the game.
 */
public class Level2 extends Level {

    /**
     * Initializes the level.
     */
    public Level2() {
        super.world = """
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WWW                                   WW\s
                WWW                                   WW\s
                WWW                                   WW\s
                WWW                                   WW\s
                WWWW          OOO                     WW\s
                WWWW           OOO                    WW\s
                WWW                                  WWW\s
                WWW                                 WWWW\s
                WWW                                WWWWW\s
                WWWW                              WWWWWW\s
                WWWW                              WWWWWW\s
                WWW                                WWWWW\s
                WWW                                 WWWW\s
                WWW                                  WWW\s
                WWW                                   WW\s
                WWWW                                  WW\s
                WWWWW                                 WW\s
                WWWWWW         F                      WW\s
                WWWWWWW                               WW\s
                WWWWWWW                               WW\s
                WWWWWW                                WW\s
                WWWWWW                                WW\s
                WWWWW                                 WW\s
                WWWW                                  WW\s
                WWW                                   WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                 A                  WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                             G      WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                    H              WWW\s
                WW                    HH             WWW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WWW                                  WWW\s
                WWWW                  A            BWWWW\s
                WWWW                                WWWW\s
                WWW                                  WWW\s
                WW                                   SWW\s
                WWW                                   WW\s
                WWW                                   WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW           F                        WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                    F               WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s""";
        number = 2;
        worldOffsetLines = world.split("\\R").length - 23;
        worldOffsetColumns = 0;
    }
}
