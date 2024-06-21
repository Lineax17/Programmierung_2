package thd.game.level;

/**
 * The third level of the game.
 */
public class Level5 extends Level {

    /**
     * Initializes the level.
     */
    public Level5() {
        super.world = """
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW            WW                WWWWW\s
                WWWWW            WW                WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                   WW         WWWWW\s
                WWWWW                   WW         WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW          WW                  WWWWW\s
                WWWWW          WW                  WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWWW                             WWWWW\s
                WWWWWWW                           WWWWWW\s
                WWWWWWWW                       w WWWWWWW\s
                WWWWWWWWW                       WWWWWWWW\s
                WWWWWWWWWW   A                 WWWWWWWWW\s
                WWWWWWWWWW                     WWWWWWWWW\s
                WWWWWWWWWW                     WWWWWWWWW\s
                WWWWWWWWWWW w           F     WWWWWWWWWW\s
                WWWWWWWWWWWW                 WWWWWWWWWWW\s
                WWWWWWWWWWWWW               WWWWWWWWWWWW\s
                WWWWWWWWWWWWWW              WWWWWWWWWWWW\s
                WWWWWWWWWWWWWWW            WWWWWWWWWWWWW\s
                WWWWWWWWWWWWWWWW          WWWWWWWWWWWWWW\s
                WWWWWWWWWWWWWWWW          WWWWWWWWWWWWWW\s
                WWWWWWWWWWWWWWW           WWWWWWWWWWWWWW\s
                WWWWWWWWWWWWWWW            WWWWWWWWWWWWW\s
                WWWWWWWWWWWWWWW             WWWWWWWWWWWW\s
                WWWWWWWWWWWWWWWW      F      WWWWWWWWWWW\s
                WWWWWWWWWWWWWWWW w           WWWWWWWWWWW\s
                WWWWWWWWWWWWWWWW            WWWWWWWWWWWW\s
                WWWWWWWWWWWWWWWW            WWWWWWWWWWWW\s
                WWWWWWWWWWWWWWW              WWWWWWWWWWW\s
                WWWWWWWWWWWWWW   G           WWWWWWWWWWW\s
                WWWWWWWWWWWWWW              w WWWWWWWWWW\s
                WWWWWWWWWWWWW          G      WWWWWWWWWW\s
                WWWWWWWWWWWW                  WWWWWWWWWW\s
                WWWWWWWWWWW                    WWWWWWWWW\s
                WWWWWWWWWWW     U               WWWWWWWW\s
                WWWWWWWWWW                       WWWWWWW\s
                WWWWWWWWWW                        WWWWWW\s
                WWWWWWWWW           A     U        WWWWW\s
                WWWWWWWW                           WWWWW\s
                WWWWWWW     U              G       WWWWW\s
                WWWWWW                             WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWWW                             WWWWW\s
                WWWWWWW                            WWWWW\s
                WWWWWWWW           b               WWWWW\s
                WWWWWWWWW                          WWWWW\s
                WWWWWWWWWW                         WWWWW\s
                WWWWWWWWWW                         WWWWW\s
                WWWWWWWWW          U               WWWWW\s
                WWWWWWWW                          WWWWWW\s
                WWWWWWW                          WWWWWWW\s
                WWWWWW                          WWWWWWWW\s
                WWWWW         WW               WWWWWWWWW\s
                WWWW          WW              WWWWWWWWWW\s
                WWWW                          WWWWWWWWWW\s
                WWWW                         WWWWWWWWWWW\s
                WWWW                         WWWWWWWWWWW\s
                WWW                         WWWWWWWWWWWW\s
                WWW                        WWWWWWWWWWWWW\s
                WWW         U              WWWWWWWWWWWWW\s
                WWW                        WWWWWWWWWWWWW\s
                WWWW                       WWWWWWWWWWWWW\s
                WWWW                        WWWWWWWWWWWW\s
                WWWW                         WWWWWWWWWWW\s
                WWWW                          WWWWWWWWWW\s
                WWWWW                          WWWWWWWWW\s
                WWWWW                           WWWWWWWW\s
                WWWWW                            WWWWWWW\s
                WWWWW                             WWWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW    G         WW              WWWWW\s
                WWWWW              WWW             WWWWW\s
                WWWWW              WWW             WWWWW\s
                WWWWW w           WWWW             WWWWW\s
                WWWWW             WWWW             WWWWW\s
                WWWWW            WWWW              WWWWW\s
                WWWWW            WWWW              WWWWW\s
                WWWWW            WWW               WWWWW\s
                WWWWW            WWW     F     w   WWWWW\s
                WWWWW     G       WWW              WWWWW\s
                WWWWW             WWWW             WWWWW\s
                WWWWW              WWWW            WWWWW\s
                WWWWW              WWWW            WWWWW\s
                WWWWW              WWW             WWWWW\s
                WWWWW              WWW             WWWWW\s
                WWWWW             WWW              WWWWW\s
                WWWWW             WWW              WWWWW\s
                WWWWW             WWW              WWWWW\s
                WWWWW      A       WWW             WWWWW\s
                WWWWW              WWWW            WWWWW\s
                WWWWW              WWWW            WWWWW\s
                WWWWW             WWWW             WWWWW\s
                WWWWW             WWW              WWWWW\s
                WWWWW            WWW               WWWWW\s
                WWWWW           WWW                WWWWW\s
                WWWWW           WWW       U        WWWWW\s
                WWWWW           WWW                WWWWW\s
                WWWWW           WWW                WWWWW\s
                WWWWW          WWW                 WWWWW\s
                WWWWW         WWW                  WWWWW\s
                WWWWW         WWW                  WWWWW\s
                WWWWW         WWW                  WWWWW\s
                WWWWW         WWW                  WWWWW\s
                WWWWW         WW                   WWWWW\s
                WWWWW   F     WWW                  WWWWW\s
                WWWWW         WWWW                 WWWWW\s
                WWWWW         WWWW                 WWWWW\s
                WWWWW          WWWW                WWWWW\s
                WWWWW           WWWW               WWWWW\s
                WWWWW            WWW               WWWWW\s
                WWWWW  w         WW                WWWWW\s
                WWWWW            WW                WWWWW\s
                WWWWW            WWW               WWWWW\s
                WWWWW            WWW      F        WWWWW\s
                WWWWW            WWW               WWWWW\s
                WWWWW            WWWW              WWWWW\s
                WWWWW     U      WWWW              WWWWW\s
                WWWWW            WWWW              WWWWW\s
                WWWWW            WWWW              WWWWW\s
                WWWWW             WWW              WWWWW\s
                WWWWW             WWW              WWWWW\s
                WWWWW             WWW              WWWWW\s
                WWWWW             WWWW             WWWWW\s
                WWWWW             WWWWW            WWWWW\s
                WWWWW              WWWW            WWWWW\s
                WWWWW              WWW             WWWWW\s
                WWWWW              WWW             WWWWW\s
                WWWWW              WWW             WWWWW\s
                WWWWW   +          WWW             WWWWW\s
                WWWWW              WW              WWWWW\s
                WWWWW              WW              WWWWW\s
                WWWWWW             WW              WWWWW\s
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
                WWWWWWWWWWW                        WWWWW\s
                WWWWWWWWWW                          WWWW\s
                WWWWWWWWW              11            WWW\s
                WWWWWWWWWL              HH           WWW\s
                WWWWWWWWW                           WWWW\s
                WWWWWWWW                           WWWWW\s
                WWWWWWW                            WWWWW\s
                WWWWWW                             WWWWW\s
                WWWWW           F                  WWWWW\s
                WWWWW                              WWWWW\s
                WWWWWW                            WWWWWW\s
                WWWWWWW                          WWWWWWW\s
                WWWWWWWW                        WWWWWWWW\s
                WWWWWWWWW                      WWWWWWWWW\s
                WWWWWWWWWW                    WWWWWWWWWW\s
                WWWWWWWWWWW                   WWWWWWWWWW\s
                WWWWWWWWWWWW                 WWWWWWWWWWW\s
                WWWWWWWWWWWWW               WWWWWWWWWWWW\s
                WWWWWWWWWWWWW      F       WWWWWWWWWWWWW\s
                WWWWWWWWWWWW              WWWWWWWWWWWWWW\s
                WWWWWWWWWWW               WWWWWWWWWWWWWW\s
                WWWWWWWWWW                 WWWWWWWWWWWWW\s
                WWWWWWWWWWL                 WWWWWWWWWWWW\s
                WWWWWWWWWW                   WWWWWWWWWWW\s
                WWWWWWWWW                    WWWWWWWWWWW\s
                WWWWWWWWWL                    WWWWWWWWWW\s
                WWWWWWWWW                      WWWWWWWWW\s
                WWWWWWWWW            w          WWWWWWWW\s
                WWWWWWWW                       RWWWWWWWW\s
                WWWWWWWW                        WWWWWWWW\s
                WWWWWWW                          WWWWWWW\s
                WWWWWW                            WWWWWW\s
                WWWWW                              WWWWW\s
                WWWWWW                             WWWWW\s
                WWWWWWW                           WWWWWW\s
                WWWWWWWW                         WWWWWWW\s
                WWWWWWWWW                       WWWWWWWW\s
                WWWWWWWWWW                     WWWWWWWWW\s
                WWWWWWWWWW                     WWWWWWWWW\s
                WWWWWWWWWW                     WWWWWWWWW\s
                WWWWWWWWWWW                   WWWWWWWWWW\s
                WWWWWWWWWWWW                 WWWWWWWWWWW\s
                WWWWWWWWWWWWW               WWWWWWWWWWWW\s
                WWWWWWWWWWWWWW              WWWWWWWWWWWW\s
                WWWWWWWWWWWWWWW            WWWWWWWWWWWWW\s
                WWWWWWWWWWWWWWWW          WWWWWWWWWWWWWW\s
                WWWWWWWWWWWWWWWW          WWWWWWWWWWWWWW\s
                WWWWWWWWWWWWWWW           WWWWWWWWWWWWWW\s
                WWWWWWWWWWWWWWW            WWWWWWWWWWWWW\s
                WWWWWWWWWWWWWWW             WWWWWWWWWWWW\s
                WWWWWWWWWWWWWWWW             WWWWWWWWWWW\s
                WWWWWWWWWWWWWWWW             WWWWWWWWWWW\s
                WWWWWWWWWWWWWWWW            WWWWWWWWWWWW\s
                WWWWWWWWWWWWWWWW            WWWWWWWWWWWW\s
                WWWWWWWWWWWWWWW              WWWWWWWWWWW\s
                WWWWWWWWWWWWWW               WWWWWWWWWWW\s
                WWWWWWWWWWWWWW                WWWWWWWWWW\s
                WWWWWWWWWWWWW                 WWWWWWWWWW\s
                WWWWWWWWWWWW                  WWWWWWWWWW\s
                WWWWWWWWWWW                    WWWWWWWWW\s
                WWWWWWWWWWW                     WWWWWWWW\s
                WWWWWWWWWW                       WWWWWWW\s
                WWWWWWWWWW                        WWWWWW\s
                WWWWWWWWW                          WWWWW\s
                WWWWWWWW                           WWWWW\s
                WWWWWWW                            WWWWW\s
                WWWWWW                             WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW              WW              WWWWW\s
                WWWWWW             WW              WWWWW\s
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
                WWWWWWWWWW           11             WWWW\s
                WWWWWWWWW                            WWW\s
                WWWWWWWWWL                           WWW\s
                WWWWWWWWW                           WWWW\s
                WWWWWWWW                           WWWWW\s
                WWWWWWW                            WWWWW\s
                WWWWWW                             WWWWW\s
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
                WWWWWWWWWWWWW      F       WWWWWWWWWWWWW\s
                WWWWWWWWWWWW              WWWWWWWWWWWWWW\s
                WWWWWWWWWWW               WWWWWWWWWWWWWW\s
                WWWWWWWWWW                 WWWWWWWWWWWWW\s
                WWWWWWWWWWL                 WWWWWWWWWWWW\s
                WWWWWWWWWW                   WWWWWWWWWWW\s
                WWWWWWWWW                    WWWWWWWWWWW\s
                WWWWWWWWWL                    WWWWWWWWWW\s
                WWWWWWWWW                      WWWWWWWWW\s
                WWWWWWWWW            w          WWWWWWWW\s
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
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWWL                             WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                   F          WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW    WW                        WWWWW\s
                WWWWW    WW                        WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
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
                WWWWWWW               A          WWWWWWW\s
                WWWWWW                            WWWWWW\s
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
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                """;
        number = 5;
        name = "Level 5";
        worldOffsetLines = world.split("\\R").length - 23;
        worldOffsetColumns = 0;
    }
}
