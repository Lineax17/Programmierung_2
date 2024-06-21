package thd.game.level;

public class Level7 extends Level{
    /**
     * Initializes the level.
     */
    public Level7() {
        super.world = """
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                WW            WWWWW\s
                 WWWWW                WW            WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW      G                       WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                             RWWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWWW                             WWWWW\s
                 WWWWWWW                           WWWWWW\s
                 WWWWWWWW                          WWWWWW\s
                 WWWWWWWWW                          WWWWW\s
                 WWWWWWWWWL                         WWWWW\s
                 WWWWWWWWWW                        WWWWWW\s
                 WWWWWWWWWW                        WWWWWW\s
                 WWWWWWWWW          G               WWWWW\s
                 WWWWWWWW                           WWWWW\s
                 WWWWWWWW                          WWWWWW\s
                 WWWWWWWWW                        WWWWWWW\s
                 WWWWWWWWWW                       WWWWWWW\s
                 WWWWWWWWWWW                       WWWWWW\s
                 WWWWWWWWWWW         222            WWWWW\s
                 WWWWWWWWWW           22             WWWW\s
                 WWWWWWWWW                            WWW\s
                 WWWWWWWWWL                           WWW\s
                 WWWWWWWWW                           WWWW\s
                 WWWWWWWW                           WWWWW\s
                 WWWWWWW                            WWWWW\s
                 WWWWWW                             WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                  F           WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW      WW                      WWWWW\s
                 WWWWW      WW                      WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 WWWWW                              WWWWW\s
                 """;
        number = 7;
        name = "Level 7";
        worldOffsetLines = world.split("\\R").length - 23;
        worldOffsetColumns = 0;
    }
}
