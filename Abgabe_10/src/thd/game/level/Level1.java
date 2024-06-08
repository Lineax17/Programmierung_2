package thd.game.level;

/**
 * The first Level of the game.
 */
public class Level1 extends Level {
    /**
     * Initializes the level.
     */
    public Level1() {
        //Standard length = 139
        //Easy length = 111
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
                WW            w                       WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                      w             WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW             WW                     WW\s
                WW      B      WW         U           WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW          B                         WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW              U                     WW\s
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
                WW              1                     WW\s
                WW              111                   WW\s
                WW               11                   WW\s
                WW                                   WWW\s
                WWL                   H              WWW\s
                WW                                    WW\s
                WW               22                   WW\s
                WW                22                  WW\s
                WWW                                  WWW\s
                WWWW         G        A            RWWWW\s
                WWWW                                WWWW\s
                WWW                                  WWW\s
                WW             A                     RWW\s
                WWW                       F           WW\s
                WWW                                   WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WWL                                   WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                   RWW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WWL                                   WW\s
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
        number = 1;
        worldOffsetLines = world.split("\\R").length - 23;
        worldOffsetColumns = 0;



        if (difficulty == Difficulty.EASY) {
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
                WWWWWW                                WW\s
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
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW       G                            WW\s
                WW                             G      WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW              1                     WW\s
                WW              111                   WW\s
                WW               11                   WW\s
                WW                                   WWW\s
                WWL                   H              WWW\s
                WW                                    WW\s
                WW               22                   WW\s
                WW                22                  WW\s
                WWW                                  WWW\s
                WWWW                  A            RWWWW\s
                WWWW                                WWWW\s
                WWW                                  WWW\s
                WW             A                     RWW\s
                WWW                                   WW\s
                WWW                                   WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WWL                                   WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                   RWW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WWL                                   WW\s
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
            worldOffsetLines = world.split("\\R").length - 23;
        }
    }
}
