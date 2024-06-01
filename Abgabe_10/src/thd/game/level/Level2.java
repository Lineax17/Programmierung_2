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
                WWW                                   WW\s
                WWW                                   WW\s
                WWW                                   WW\s
                WWW                                   WW\s
                WWWW                                  WW\s
                WWWW                                  WW\s
                WWW                                   WW\s
                WWW                                   WW\s
                WWW                                   WW\s
                WWWW         A                        WW\s
                WWWW                                  WW\s
                WWW                                   WW\s
                WWW                         F         WW\s
                WWW                                   WW\s
                WWW                                   WW\s
                WWWW                                  WW\s
                WWWWW                                 WW\s
                WWWWWW         F                      WW\s
                WWWWWWW                               WW\s
                WWWWWWW                               WW\s
                WWWWWWW                               WW\s
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
                WW       G                            WW\s
                WW                             G      WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW              O                     WW\s
                WW              OOO                   WW\s
                WW               OO                   WW\s
                WW                                   WWW\s
                WW                    H              WWW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WWW                                  WWW\s
                WWWW         G        A            BWWWW\s
                WWWW                                WWWW\s
                WWW                                  WWW\s
                WW             A                     SWW\s
                WWW                       F           WW\s
                WWW                                   WW\s
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
                WW           A                        WW\s
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
