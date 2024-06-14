package thd.game.level;

public class Level2 extends Level {
    /**
     * Initializes the level.
     */
    public Level2() {
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
                WWWWWW                             WWWWW\s
                WWWWWWW                            WWWWW\s
                WWWWWWWW                           WWWWW\s
                WWWWWWWWW                          WWWWW\s
                WWWWWWWWWW                         WWWWW\s
                WWWWWWWWWWW                       WWWWWW\s
                WWWWWWWWWWWW                     WWWWWWW\s
                WWWWWWWWWWWW                    WWWWWWWW\s
                WWWWWWWWWWW                    WWWWWWWWW\s
                WWWWWWWWWW                    RWWWWWWWWW\s
                WWWWWWWWW           F          WWWWWWWWW\s
                WWWWWWWW                        WWWWWWWW\s
                WWWWWWWW                         WWWWWWW\s
                WWWWWWW                           WWWWWW\s
                WWWWWW                             WWWWW\s
                WWWWW            G                 WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW             A                WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWWW                            WWWWWW\s
                WWWWWWW                          WWWWWWW\s
                WWWWWWWW                        WWWWWWWW\s
                WWWWWWWWW                      WWWWWWWWW\s
                WWWWWWWWWW                    WWWWWWWWWW\s
                WWWWWWWWWWW                   WWWWWWWWWW\s
                WWWWWWWWWWWW                 WWWWWWWWWWW\s
                WWWWWWWWWWWWW               WWWWWWWWWWWW\s
                WWWWWWWWWWWWW              WWWWWWWWWWWWW\s
                WWWWWWWWWWWW              WWWWWWWWWWWWWW\s
                WWWWWWWWWWW               WWWWWWWWWWWWWW\s
                WWWWWWWWWW                 WWWWWWWWWWWWW\s
                WWWWWWWWWW           F      WWWWWWWWWWWW\s
                WWWWWWWWWW                   WWWWWWWWWWW\s
                WWWWWWWWW                    WWWWWWWWWWW\s
                WWWWWWWWWL                    WWWWWWWWWW\s
                WWWWWWWWW      F               WWWWWWWWW\s
                WWWWWWWWW                       WWWWWWWW\s
                WWWWWWWW                       RWWWWWWWW\s
                WWWWWWWW                        WWWWWWWW\s
                WWWWWWW                          WWWWWWW\s
                WWWWWW                            WWWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                """;
        number = 2;
        name = "Level 2";
        worldOffsetLines = world.split("\\R").length - 23;
        worldOffsetColumns = 0;
    }
}
