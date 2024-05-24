package thd.game.level;

/**
 * The first Level of the game.
 */
public class Level1 extends Level {
    /**
     * Initializes the level.
     */
    public Level1() {
        super.world = """
                WW                                     W\s
                WWW                                    W\s
                WWW                                    W\s
                WWW                                    W\s
                WWW                                    W\s
                WWWW                                   W\s
                WWWW                                   W\s
                WWW                                    W\s
                WWW                                    W\s
                WWW                                    W\s
                WWWW         F                         W\s
                WWWW                                   W\s
                WWW                                    W\s
                WWW                         F          W\s
                WWW                                    W\s
                WWW                                    W\s
                WWWW                                   W\s
                WWWWW                                  W\s
                WWWWWW         F                       W\s
                WWWWWWW                                W\s
                WWWWWWW                                W\s
                WWWWWWW                                W\s
                WWWWWW                                 W\s
                WWWWW                                  W\s
                WWWW                                   W\s
                WWW                                    W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                 A                   W\s
                WW                                     W\s
                WW                                     W\s
                WW       G                             W\s
                WW                             G       W\s
                WW                                     W\s
                WW                                     W\s
                WW              O                      W\s
                WW              OOO                    W\s
                WW               OO                    W\s
                WW                                     W\s
                WW                    H                W\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WWW                                  WWW\s
                WWWW         G        A            BWWWW\s
                WWWW                                WWWW\s
                WWW                                  WWW\s
                WW             A                     SWW\s
                WWW                       F            W\s
                WWW                                    W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s
                WW                                     W\s""";
        number = 1;
        worldOffsetLines = world.split("\\R").length - 23;
        worldOffsetColumns = 0;
    }
}
