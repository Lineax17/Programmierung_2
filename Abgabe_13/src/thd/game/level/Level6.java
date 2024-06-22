package thd.game.level;

/**
 * The sixth level of the game.
 */
public class Level6 extends Level {

    /**
     * Initializes the level.
     */
    public Level6() {
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
                WWWWWW                             WWWWW\s
                WWWWWWW                            WWWWW\s
                WWWWWWWW                           WWWWW\s
                WWWWWWWWW                        WWWWWWW\s
                WWWWWWWWWW           WW         WWWWWWWW\s
                WWWWWWWWWWW          WW        WWWWWWWWW\s
                WWWWWWWWWWWW                  WWWWWWWWWW\s
                WWWWWWWWWWWW                 WWWWWWWWWWW\s
                WWWWWWWWWWW                  WWWWWWWWWWW\s
                WWWWWWWWWW                    WWWWWWWWWW\s
                WWWWWWWWW      G               WWWWWWWWW\s
                WWWWWWWW                       WWWWWWWWW\s
                WWWWWWW                       WWWWWWWWWW\s
                WWWWWW                        WWWWWWWWWW\s
                WWWWW                          WWWWWWWWW\s
                WWWWW              WW           WWWWWWWW\s
                WWWWW             WWWW           WWWWWWW\s
                WWWWW            WWWWWW           WWWWWW\s
                WWWWW            WWWWWW            WWWWW\s
                WWWWW             WWWW             WWWWW\s
                WWWWWW             WW             WWWWWW\s
                WWWWWWW                          WWWWWWW\s
                WWWWWWWW                        WWWWWWWW\s
                WWWWWWWWW                      WWWWWWWWW\s
                WWWWWWWWWW                    WWWWWWWWWW\s
                WWWWWWWWWWW                  WWWWWWWWWWW\s
                WWWWWWWWWWW                 WWWWWWWWWWWW\s
                WWWWWWWWWW                  WWWWWWWWWWWW\s
                WWWWWWWWW                    WWWWWWWWWWW\s
                WWWWWWWW                      WWWWWWWWWW\s
                WWWWWWW                        WWWWWWWWW\s
                WWWWWW                          WWWWWWWW\s
                WWWWW                WW          WWWWWWW\s
                WWWWW                WW            WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWWW                             WWWWW\s
                WWWWWWW      G                    WWWWWW\s
                WWWWWWWW                         WWWWWWW\s
                WWWWWWWW                        WWWWWWWW\s
                WWWWWWW                        WWWWWWWWW\s
                WWWWWW                        WWWWWWWWWW\s
                WWWWW                        WWWWWWWWWWW\s
                WWWWWL                      WWWWWWWWWWWW\s
                WWWWW                      WWWWWWWWWWWWW\s
                WWWWW                     WWWWWWWWWWWWWW\s
                WWWWWW                   WWWWWWWWWWWWWWW\s
                WWWWWWW                 WWWWWWWWWWWWWWWW\s
                WWWWWWWW      a         WWWWWWWWWWWWWWWW\s
                WWWWWWWW                 WWWWWWWWWWWWWWW\s
                WWWWWWW                   WWWWWWWWWWWWWW\s
                WWWWWW                     WWWWWWWWWWWWW\s
                WWWWW                       WWWWWWWWWWWW\s
                WWWWW           WW           WWWWWWWWWWW\s
                WWWWW          WWWW           WWWWWWWWWW\s
                WWWWW         WWWWWW     f     WWWWWWWWW\s
                WWWWWW       WWWWWWWW           WWWWWWWW\s
                WWWWWWW      WWWWWWWW            WWWWWWW\s
                WWWWWWWW      WWWWWW              WWWWWW\s
                WWWWWWWWW      WWWW                WWWWW\s
                WWWWWWWWWW      WW                 WWWWW\s
                WWWWWWWWWW           WW            WWWWW\s
                WWWWWWWWW            WW           RWWWWW\s
                WWWWWWWW                           WWWWW\s
                WWWWWWW                            WWWWW\s
                WWWWWW                             WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW      G                       WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                  b           WWWWW\s
                WWWWW                              WWWWW\s
                WWWWWW                             WWWWW\s
                WWWWWWW                            WWWWW\s
                WWWWWWWW                           WWWWW\s
                WWWWWWWW                        s  WWWWW\s
                WWWWWWW                            WWWWW\s
                WWWWWW                             WWWWW\s
                WWWWW        b                     WWWWW\s
                WWWWW                              WWWWW\s
                WWWWWW                            WWWWWW\s
                WWWWWWW                          WWWWWWW\s
                WWWWWWWW                        WWWWWWWW\s
                WWWWWWWWW                      WWWWWWWWW\s
                WWWWWWWWWW                    WWWWWWWWWW\s
                WWWWWWWWWWW                   WWWWWWWWWW\s
                WWWWWWWWWWWW                 WWWWWWWWWWW\s
                WWWWWWWWWWWWW               WWWWWWWWWWWW\s
                WWWWWWWWWWWWW      f       WWWWWWWWWWWWW\s
                WWWWWWWWWWWW              WWWWWWWWWWWWWW\s
                WWWWWWWWWWW               WWWWWWWWWWWWWW\s
                WWWWWWWWWW                 WWWWWWWWWWWWW\s
                WWWWWWWWWWL                 WWWWWWWWWWWW\s
                WWWWWWWWWW                   WWWWWWWWWWW\s
                WWWWWWWWW                    WWWWWWWWWWW\s
                WWWWWWWWWL                    WWWWWWWWWW\s
                WWWWWWWWW                      WWWWWWWWW\s
                WWWWWWWWW                  s    WWWWWWWW\s
                WWWWWWWW                       RWWWWWWWW\s
                WWWWWWWW                        WWWWWWWW\s
                WWWWWWW                          WWWWWWW\s
                WWWWWW                            WWWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW       b                      WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                   b          WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW           b                  WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                WW            WWWWW\s
                WWWWW               WWWW           WWWWW\s
                WWWWW              WWWWWW          WWWWW\s
                WWWWW             WWWWWWWW         WWWWW\s
                WWWWW            WWWWWWWWWW        WWWWW\s
                WWWWW            WWWWWWWWWW        WWWWW\s
                WWWWW             WWWWWWWW         WWWWW\s
                WWWWW      b       WWWWWW          WWWWW\s
                WWWWW               WWWW           WWWWW\s
                WWWWW                WW            WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                             WWWWWW\s
                WWWWW                            WWWWWWW\s
                WWWWW                           WWWWWWWW\s
                WWWWW                          WWWWWWWWW\s
                WWWWWW                        WWWWWWWWWW\s
                WWWWWWW                      WWWWWWWWWWW\s
                WWWWWWWW                    WWWWWWWWWWWW\s
                WWWWWWWWW                  WWWWWWWWWWWWW\s
                WWWWWWWWWW                 WWWWWWWWWWWWW\s
                WWWWWWWWWWL                 WWWWWWWWWWWW\s
                WWWWWWWWWW                   WWWWWWWWWWW\s
                WWWWWWWWW                    WWWWWWWWWWW\s
                WWWWWWWWWL                    WWWWWWWWWW\s
                WWWWWWWWW                  s   WWWWWWWWW\s
                WWWWWWWWW                       WWWWWWWW\s
                WWWWWWWW                       RWWWWWWWW\s
                WWWWWWWW                        WWWWWWWW\s
                WWWWWWW                          WWWWWWW\s
                WWWWWW                            WWWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW       b                      WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWWL                             WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                   f          WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW    WW                        WWWWW\s
                WWWWW    WW                        WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                   b          WWWWW\s
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
                WWWWWWWWW                   WWWWWWWWWWWW\s
                WWWWWWWW                     WWWWWWWWWWW\s
                WWWWWWW                 f     WWWWWWWWWW\s
                WWWWWW                         WWWWWWWWW\s
                WWWWW                           WWWWWWWW\s
                WWWWW    WW                      WWWWWWW\s
                WWWWW    WW                       WWWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                   b          WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW               WW             WWWWW\s
                WWWWW               WW             WWWWW\s
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
                WWWWWWWWWW           f      WWWWWWWWWWWW\s
                WWWWWWWWWW                   WWWWWWWWWWW\s
                WWWWWWWWW                    WWWWWWWWWWW\s
                WWWWWWWWWL                    WWWWWWWWWW\s
                WWWWWWWWW      f               WWWWWWWWW\s
                WWWWWWWWW                       WWWWWWWW\s
                WWWWWWWW                       RWWWWWWWW\s
                WWWWWWWW                        WWWWWWWW\s
                WWWWWWW               a          WWWWWWW\s
                WWWWWW                            WWWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                   b          WWWWW\s
                WWWWWW                             WWWWW\s
                WWWWWWW                             WWWW\s
                WWWWWWWW                             WWW\s
                WWWWWWWW                             WWW\s
                WWWWWWW                             WWWW\s
                WWWWWW           b                 WWWWW\s
                WWWWW                             WWWWWW\s
                WWWWW                            WWWWWWW\s
                WWWWW                           WWWWWWWW\s
                WWWWW                           WWWWWWWW\s
                WWWWW                            WWWWWWW\s
                WWWWW                             WWWWWW\s
                WWWWWW                            WWWWWW\s
                WWWWWWW                          WWWWWWW\s
                WWWWWWWW                        WWWWWWWW\s
                WWWWWWWWW          WW          WWWWWWWWW\s
                WWWWWWWWWW         WW         WWWWWWWWWW\s
                WWWWWWWWWWW        WW         WWWWWWWWWW\s
                WWWWWWWWWWWW                 WWWWWWWWWWW\s
                WWWWWWWWWWWWW               WWWWWWWWWWWW\s
                WWWWWWWWWWWWW              WWWWWWWWWWWWW\s
                WWWWWWWWWWWW              WWWWWWWWWWWWWW\s
                WWWWWWWWWWW               WWWWWWWWWWWWWW\s
                WWWWWWWWWW                 WWWWWWWWWWWWW\s
                WWWWWWWWWW           f      WWWWWWWWWWWW\s
                WWWWWWWWWW                   WWWWWWWWWWW\s
                WWWWWWWWW                    WWWWWWWWWWW\s
                WWWWWWWWWL                    WWWWWWWWWW\s
                WWWWWWWWW      f               WWWWWWWWW\s
                WWWWWWWWW                       WWWWWWWW\s
                WWWWWWWW                       RWWWWWWWW\s
                WWWWWWWW                        WWWWWWWW\s
                WWWWWWW               a          WWWWWWW\s
                WWWWWW                            WWWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW     WW                       WWWWW\s
                WWWWW     WW                       WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                   WW         WWWWW\s
                WWWWW                   WW         WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW      WW                      WWWWW\s
                WWWWW      WW                      WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                WW            WWWWW\s
                WWWWWW               WW            WWWWW\s
                WWWWWWW                           WWWWWW\s
                WWWWWWWW                         WWWWWWW\s
                WWWWWWWWW                       WWWWWWWW\s
                WWWWWWWWWW                     WWWWWWWWW\s
                WWWWWWWWWWW      G            WWWWWWWWWW\s
                WWWWWWWWWWWW                 WWWWWWWWWWW\s
                WWWWWWWWWWWWW               WWWWWWWWWWWW\s
                WWWWWWWWWWWWWW             WWWWWWWWWWWWW\s
                WWWWWWWWWWWWWWW            WWWWWWWWWWWWW\s
                WWWWWWWWWWWWWWWW            WWWWWWWWWWWW\s
                WWWWWWWWWWWWWWWW             WWWWWWWWWWW\s
                WWWWWWWWWWWWWWW               WWWWWWWWWW\s
                WWWWWWWWWWWWWW                 WWWWWWWWW\s
                WWWWWWWWWWWWW                   WWWWWWWW\s
                WWWWWWWWWWWW                     WWWWWWW\s
                WWWWWWWWWWW                       WWWWWW\s
                WWWWWWWWWW                         WWWWW\s
                WWWWWWWWW                          WWWWW\s
                WWWWWWWW                           WWWWW\s
                WWWWWWW              WW            WWWWW\s
                WWWWWW              WWWW           WWWWW\s
                WWWWW              WWWWWW          WWWWW\s
                WWWWW              WWWWWW          WWWWW\s
                WWWWW               WWWW           WWWWW\s
                WWWWW                WW            WWWWW\s
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
                WWWWWWWWWWW         444            WWWWW\s
                WWWWWWWWWW           44             WWWW\s
                WWWWWWWWW                            WWW\s
                WWWWWWWWWL                           WWW\s
                WWWWWWWWW                           WWWW\s
                WWWWWWWW                           WWWWW\s
                WWWWWWW                            WWWWW\s
                WWWWWW                             WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                  f           WWWWW\s
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
        number = 6;
        name = "Level 6";
        worldOffsetLines = world.split("\\R").length - 23;
        worldOffsetColumns = 0;
    }
}
