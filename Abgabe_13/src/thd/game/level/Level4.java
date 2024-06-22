package thd.game.level;

/**
 * The fourth level of the game.
 */
public class Level4 extends Level {
    /**
     * Initializes the level.
     */
    public Level4() {
        super.world = """
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWWW                            WWWWWW\s
                WWWWWWW                          WWWWWWW\s
                WWWWWWWW                        WWWWWWWW\s
                WWWWWWWWW                      WWWWWWWWW\s
                WWWWWWWWWW                     WWWWWWWWW\s
                WWWWWWWWWWW                   WWWWWWWWWW\s
                WWWWWWWWWWW                   WWWWWWWWWW\s
                WWWWWWWWWWWW                 WWWWWWWWWWW\s
                WWWWWWWWWWWWW S             WWWWWWWWWWWW\s
                WWWWWWWWWWWWW               WWWWWWWWWWWW\s
                WWWWWWWWWWWWWW              WWWWWWWWWWWW\s
                WWWWWWWWWWWWWWW              WWWWWWWWWWW\s
                WWWWWWWWWWWWWWW              WWWWWWWWWWW\s
                WWWWWWWWWWWWWW                WWWWWWWWWW\s
                WWWWWWWWWWWWWW S            S WWWWWWWWWW\s
                WWWWWWWWWWWWW                 WWWWWWWWWW\s
                WWWWWWWWWWWWW                  WWWWWWWWW\s
                WWWWWWWWWWWW                    WWWWWWWW\s
                WWWWWWWWWWWW                     WWWWWWW\s
                WWWWWWWWWWW                       WWWWWW\s
                WWWWWWWWWWW                        WWWWW\s
                WWWWWWWWWW                         WWWWW\s
                WWWWWWWWWW       U                 WWWWW\s
                WWWWWWWWWW                         WWWWW\s
                WWWWWWWWW                          WWWWW\s
                WWWWWWWWW                          WWWWW\s
                WWWWWWWW                           WWWWW\s
                WWWWWWWW                           WWWWW\s
                WWWWWWW                   U        WWWWW\s
                WWWWWWW                            WWWWW\s
                WWWWWWW                            WWWWW\s
                WWWWWW                             WWWWW\s
                WWWWWW                             WWWWW\s
                WWWWW            U                 WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                             WWWWWW\s
                WWWW                             WWWWWWW\s
                WWWW                            WWWWWWWW\s
                WWWW                           WWWWWWWWW\s
                WWWW                           WWWWWWWWW\s
                WWWW                          WWWWWWWWWW\s
                WWW                           WWWWWWWWWW\s
                WWW         WW               WWWWWWWWWWW\s
                WWWW        WW            S WWWWWWWWWWWW\s
                WWWW                        WWWWWWWWWWWW\s
                WWWW                         WWWWWWWWWWW\s
                WWWWW                         WWWWWWWWWW\s
                WWWWW                         WWWWWWWWWW\s
                WWWWW                          WWWWWWWWW\s
                WWWWW                          WWWWWWWWW\s
                WWWWW                           WWWWWWWW\s
                WWWWW           A                WWWWWWW\s
                WWWWW                             WWWWWW\s
                WWWWWW                             WWWWW\s
                WWWWWWW                            WWWWW\s
                WWWWWWWW                           WWWWW\s
                WWWWWWWWW                          WWWWW\s
                WWWWWWWWWW                         WWWWW\s
                WWWWWWWWWWW                       WWWWWW\s
                WWWWWWWWWWWW                     WWWWWWW\s
                WWWWWWWWWWWW       G            WWWWWWWW\s
                WWWWWWWWWWW                    WWWWWWWWW\s
                WWWWWWWWWW                    RWWWWWWWWW\s
                WWWWWWWWW                     wWWWWWWWWW\s
                WWWWWWWW                        WWWWWWWW\s
                WWWWWWWW                         WWWWWWW\s
                WWWWWWW                           WWWWWW\s
                WWWWWW                             WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW            WW                WWWWW\s
                WWWWW            WW                WWWWW\s
                WWWWW            WWW               WWWWW\s
                WWWWW            WWW      F        WWWWW\s
                WWWWW            WWW               WWWWW\s
                WWWWW            WWWW              WWWWW\s
                WWWWW            WWWW              WWWWW\s
                WWWWW            WWWW              WWWWW\s
                WWWWW            WWWW              WWWWW\s
                WWWWW             WWW              WWWWW\s
                WWWWW             WWW              WWWWW\s
                WWWWW             WWW              WWWWW\s
                WWWWW             WWWW             WWWWW\s
                WWWWW             WWWWW            WWWWW\s
                WWWWW              WWWW            WWWWW\s
                WWWWW              WWW             WWWWW\s
                WWWWW     F        WWW             WWWWW\s
                WWWWW              WWW             WWWWW\s
                WWWWW              WWW             WWWWW\s
                WWWWW              WW              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW            A                 WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
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
                WWWWWWWWWWW                        WWWWW\s
                WWWWWWWWWW                          WWWW\s
                WWWWWWWWW              11            WWW\s
                WWWWWWWWWL              HH           WWW\s
                WWWWWWWWW                           WWWW\s
                WWWWWWWW                           WWWWW\s
                WWWWWWW                            WWWWW\s
                WWWWWW                             WWWWW\s
                WWWWW           F               S  WWWWW\s
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
                WWWWWWWWW                  S    WWWWWWWW\s
                WWWWWWWW                       RWWWWWWWW\s
                WWWWWWWW                        WWWWWWWW\s
                WWWWWWW                          WWWWWWW\s
                WWWWWW                            WWWWWW\s
                WWWWWW                             WWWWW\s
                WWWWWW                             WWWWW\s
                WWWWWWW                           WWWWWW\s
                WWWWWWWW                         WWWWWWW\s
                WWWWWWWW                        WWWWWWWW\s
                WWWWWWWW                       WWWWWWWWW\s
                WWWWWWWWL       WW            WWWWWWWWWW\s
                WWWWWWWW        WW            WWWWWWWWWW\s
                WWWWWWWWW                    RWWWWWWWWWW\s
                WWWWWWWWW                     WWWWWWWWWW\s
                WWWWWWWWW                    WWWWWWWWWWW\s
                WWWWWWWWW                    WWWWWWWWWWW\s
                WWWWWWWWW                   WWWWWWWWWWWW\s
                WWWWWWWW                    WWWWWWWWWWWW\s
                WWWWWWWW                   WWWWWWWWWWWWW\s
                WWWWWWWWL                  WWWWWWWWWWWWW\s
                WWWWWWWW                    WWWWWWWWWWWW\s
                WWWWWWWWW                    WWWWWWWWWWW\s
                WWWWWWWWW                     WWWWWWWWWW\s
                WWWWWWWWW                      WWWWWWWWW\s
                WWWWWWWWW                       WWWWWWWW\s
                WWWWWWWW                         WWWWWWW\s
                WWWWWWW                           WWWWWW\s
                WWWWWW                             WWWWW\s
                WWWWW             WW               WWWWW\s
                WWWWW             WW               WWWWW\s
                WWWWW                              WWWWW\s
                WWWWWW                             WWWWW\s
                WWWWWWW                            WWWWW\s
                WWWWWWWW                           WWWWW\s
                WWWWWWWWW                          WWWWW\s
                WWWWWWWWWW                         WWWWW\s
                WWWWWWWWWW                         WWWWW\s
                WWWWWWWWW                      S   WWWWW\s
                WWWWWWWW                          WWWWWW\s
                WWWWWWW       F                  WWWWWWW\s
                WWWWWW                          WWWWWWWW\s
                WWWWW                          WWWWWWWWW\s
                WWWW                          WWWWWWWWWW\s
                WWWW                          WWWWWWWWWW\s
                WWWW              A          WWWWWWWWWWW\s
                WWWW                         WWWWWWWWWWW\s
                WWW                         WWWWWWWWWWWW\s
                WWW    F                   WWWWWWWWWWWWW\s
                WWW                        WWWWWWWWWWWWW\s
                WWW                        WWWWWWWWWWWWW\s
                WWWW                       WWWWWWWWWWWWW\s
                WWWW                        WWWWWWWWWWWW\s
                WWWW                         WWWWWWWWWWW\s
                WWWW         222              WWWWWWWWWW\s
                WWWWW         22               WWWWWWWWW\s
                WWWWW                           WWWWWWWW\s
                WWWWW                            WWWWWWW\s
                WWWWW                             WWWWWW\s
                WWWWW                              WWWWW\s
                WWWWWW                             WWWWW\s
                WWWWWWW                            WWWWW\s
                WWWWWWWW              G            WWWWW\s
                WWWWWWWWW                          WWWWW\s
                WWWWWWWWWW                         WWWWW\s
                WWWWWWWWWWW                       WWWWWW\s
                WWWWWWWWWWWW                     WWWWWWW\s
                WWWWWWWWWWWW                    WWWWWWWW\s
                WWWWWWWWWWW                    WWWWWWWWW\s
                WWWWWWWWWW                     WWWWWWWWW\s
                WWWWWWWWW                      WWWWWWWWW\s
                WWWWWWWW                        WWWWWWWW\s
                WWWWWWWW                         WWWWWWW\s
                WWWWWWW                           WWWWWW\s
                WWWWWW                             WWWWW\s
                WWWWW               11             WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW         WW                   WWWWW\s
                WWWWW   F     WWW                  WWWWW\s
                WWWWW         WWWW                 WWWWW\s
                WWWWW         WWWW                 WWWWW\s
                WWWWW          WWWW                WWWWW\s
                WWWWW           WWWW               WWWWW\s
                WWWWW            WWW               WWWWW\s
                WWWWW            WW                WWWWW\s
                WWWWW            WW                WWWWW\s
                WWWWW            WWW               WWWWW\s
                WWWWW            WWW      F        WWWWW\s
                WWWWW            WWW               WWWWW\s
                WWWWW            WWWW              WWWWW\s
                WWWWW            WWWW              WWWWW\s
                WWWWW            WWWW              WWWWW\s
                WWWWW            WWWW              WWWWW\s
                WWWWW             WWW              WWWWW\s
                WWWWW             WWW              WWWWW\s
                WWWWW             WWW              WWWWW\s
                WWWWW             WWWW             WWWWW\s
                WWWWW             WWWWW            WWWWW\s
                WWWWW              WWWW            WWWWW\s
                WWWWW              WWW             WWWWW\s
                WWWWW     F        WWW             WWWWW\s
                WWWWW              WWW             WWWWW\s
                WWWWW              WWW             WWWWW\s
                WWWWWW             WW        +     WWWWW\s
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
                WWWWW     G                        WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                  G           WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW        WW                    WWWWW\s
                WWWWW        WW                    WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWWW                             WWWWW\s
                WWWWWWW                            WWWWW\s
                WWWWWWWW              G            WWWWW\s
                WWWWWWWWW                         WWWWWW\s
                WWWWWWWWWW                       WWWWWWW\s
                WWWWWWWWWWW                      WWWWWWW\s
                WWWWWWWWWWW                     WWWWWWWW\s
                WWWWWWWWWWWL                   WWWWWWWWW\s
                WWWWWWWWWWW       F            WWWWWWWWW\s
                WWWWWWWWWW                    RWWWWWWWWW\s
                WWWWWWWWW                      WWWWWWWWW\s
                WWWWWWWW                        WWWWWWWW\s
                WWWWWWWW                         WWWWWWW\s
                WWWWWWW                           WWWWWW\s
                WWWWWW         A                   WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                 WW           WWWWW\s
                WWWWW                 WW           WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW    WW                        WWWWW\s
                WWWWW    WW                        WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                  WW          WWWWW\s
                WWWWW                  WW          WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW              2HH             WWWWW\s
                WWWWW        WW      2             WWWWW\s
                WWWWW        WW                    WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW            WW                WWWWW\s
                WWWWW            WW                WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                    WW        WWWWW\s
                WWWWW                    WW        WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW          WW                  WWWWW\s
                WWWWW          WW                  WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW         WW                   WWWWW\s
                WWWWW         WW                   WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                   WW         WWWWW\s
                WWWWW                   WW         WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                """;
        number = 4;
        name = "Level 4";
        worldOffsetLines = world.split("\\R").length - 23;
        worldOffsetColumns = 0;
        if (Level.difficulty == Difficulty.STANDARD) {
            super.world = """
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWWW                            WWWWWW\s
                    WWWWWWW                          WWWWWWW\s
                    WWWWWWWW                        WWWWWWWW\s
                    WWWWWWWWW                      WWWWWWWWW\s
                    WWWWWWWWWW                     WWWWWWWWW\s
                    WWWWWWWWWWW         A         WWWWWWWWWW\s
                    WWWWWWWWWWW                   WWWWWWWWWW\s
                    WWWWWWWWWWWW                 WWWWWWWWWWW\s
                    WWWWWWWWWWWWW S             WWWWWWWWWWWW\s
                    WWWWWWWWWWWWW               WWWWWWWWWWWW\s
                    WWWWWWWWWWWWWW              WWWWWWWWWWWW\s
                    WWWWWWWWWWWWWWW              WWWWWWWWWWW\s
                    WWWWWWWWWWWWWWW              WWWWWWWWWWW\s
                    WWWWWWWWWWWWWW                WWWWWWWWWW\s
                    WWWWWWWWWWWWWW S            S WWWWWWWWWW\s
                    WWWWWWWWWWWWW                 WWWWWWWWWW\s
                    WWWWWWWWWWWWW                  WWWWWWWWW\s
                    WWWWWWWWWWWW                    WWWWWWWW\s
                    WWWWWWWWWWWW                     WWWWWWW\s
                    WWWWWWWWWWW                       WWWWWW\s
                    WWWWWWWWWWW                        WWWWW\s
                    WWWWWWWWWW                         WWWWW\s
                    WWWWWWWWWWL      U      B          WWWWW\s
                    WWWWWWWWWW                         WWWWW\s
                    WWWWWWWWW                          WWWWW\s
                    WWWWWWWWW                          WWWWW\s
                    WWWWWWWW                           WWWWW\s
                    WWWWWWWW        B                  WWWWW\s
                    WWWWWWW                   U        WWWWW\s
                    WWWWWWW                            WWWWW\s
                    WWWWWWW                           RWWWWW\s
                    WWWWWW                             WWWWW\s
                    WWWWWW                             WWWWW\s
                    WWWWW            U                 WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                             WWWWWW\s
                    WWWW                             WWWWWWW\s
                    WWWW                            WWWWWWWW\s
                    WWWWL                          WWWWWWWWW\s
                    WWWW                           WWWWWWWWW\s
                    WWWW                          WWWWWWWWWW\s
                    WWW                           WWWWWWWWWW\s
                    WWW         WW               WWWWWWWWWWW\s
                    WWWW        WW            S WWWWWWWWWWWW\s
                    WWWW                        WWWWWWWWWWWW\s
                    WWWW                         WWWWWWWWWWW\s
                    WWWWW                         WWWWWWWWWW\s
                    WWWWW                         WWWWWWWWWW\s
                    WWWWW                          WWWWWWWWW\s
                    WWWWW                          WWWWWWWWW\s
                    WWWWW                           WWWWWWWW\s
                    WWWWW           A                WWWWWWW\s
                    WWWWW                             WWWWWW\s
                    WWWWWW                             WWWWW\s
                    WWWWWWW               F            WWWWW\s
                    WWWWWWWW                           WWWWW\s
                    WWWWWWWWW                          WWWWW\s
                    WWWWWWWWWW                         WWWWW\s
                    WWWWWWWWWWW                       WWWWWW\s
                    WWWWWWWWWWWW                     WWWWWWW\s
                    WWWWWWWWWWWW       G            WWWWWWWW\s
                    WWWWWWWWWWW                    WWWWWWWWW\s
                    WWWWWWWWWW                    RWWWWWWWWW\s
                    WWWWWWWWW                     wWWWWWWWWW\s
                    WWWWWWWW                        WWWWWWWW\s
                    WWWWWWWW                         WWWWWWW\s
                    WWWWWWW                           WWWWWW\s
                    WWWWWW             A               WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW            WW                WWWWW\s
                    WWWWW            WW                WWWWW\s
                    WWWWW            WWW               WWWWW\s
                    WWWWW            WWW      F        WWWWW\s
                    WWWWW            WWW               WWWWW\s
                    WWWWW            WWWW              WWWWW\s
                    WWWWW            WWWW              WWWWW\s
                    WWWWW            WWWW              WWWWW\s
                    WWWWW            WWWW              WWWWW\s
                    WWWWW             WWW              WWWWW\s
                    WWWWW             WWW              WWWWW\s
                    WWWWW             WWW              WWWWW\s
                    WWWWW             WWWW             WWWWW\s
                    WWWWW             WWWWW            WWWWW\s
                    WWWWW              WWWW            WWWWW\s
                    WWWWW              WWW             WWWWW\s
                    WWWWW     F        WWW             WWWWW\s
                    WWWWW              WWW             WWWWW\s
                    WWWWW              WWW             WWWWW\s
                    WWWWW              WW              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW     U                        WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                   U          WWWWW\s
                    WWWWW            A                 WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
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
                    WWWWWW               A            WWWWWW\s
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
                    WWWWWWWWW                  S    WWWWWWWW\s
                    WWWWWWWW                       RWWWWWWWW\s
                    WWWWWWWW                        WWWWWWWW\s
                    WWWWWWW                          WWWWWWW\s
                    WWWWWW                            WWWWWW\s
                    WWWWWW            A                WWWWW\s
                    WWWWWW                             WWWWW\s
                    WWWWWWW                           WWWWWW\s
                    WWWWWWWW                         WWWWWWW\s
                    WWWWWWWW                        WWWWWWWW\s
                    WWWWWWWW                       WWWWWWWWW\s
                    WWWWWWWWL       WW            WWWWWWWWWW\s
                    WWWWWWWW        WW            WWWWWWWWWW\s
                    WWWWWWWWW                    RWWWWWWWWWW\s
                    WWWWWWWWW                     WWWWWWWWWW\s
                    WWWWWWWWW                    WWWWWWWWWWW\s
                    WWWWWWWWW                    WWWWWWWWWWW\s
                    WWWWWWWWW                   WWWWWWWWWWWW\s
                    WWWWWWWW                    WWWWWWWWWWWW\s
                    WWWWWWWW      B            WWWWWWWWWWWWW\s
                    WWWWWWWWL                  WWWWWWWWWWWWW\s
                    WWWWWWWW                    WWWWWWWWWWWW\s
                    WWWWWWWWW                  S WWWWWWWWWWW\s
                    WWWWWWWWW        B            WWWWWWWWWW\s
                    WWWWWWWWW                      WWWWWWWWW\s
                    WWWWWWWWW S                     WWWWWWWW\s
                    WWWWWWWW                         WWWWWWW\s
                    WWWWWWW                           WWWWWW\s
                    WWWWWW                         S   WWWWW\s
                    WWWWW             WW               WWWWW\s
                    WWWWW             WW               WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWWW                             WWWWW\s
                    WWWWWWW                            WWWWW\s
                    WWWWWWWW                           WWWWW\s
                    WWWWWWWWW                          WWWWW\s
                    WWWWWWWWWW                         WWWWW\s
                    WWWWWWWWWW                         WWWWW\s
                    WWWWWWWWW                   S     WWWWW\s
                    WWWWWWWW                          WWWWWW\s
                    WWWWWWW       F                  WWWWWWW\s
                    WWWWWW                          WWWWWWWW\s
                    WWWWW                          WWWWWWWWW\s
                    WWWW                          WWWWWWWWWW\s
                    WWWW                          WWWWWWWWWW\s
                    WWWW              A          WWWWWWWWWWW\s
                    WWWW                         WWWWWWWWWWW\s
                    WWW                         WWWWWWWWWWWW\s
                    WWW    F                   WWWWWWWWWWWWW\s
                    WWW                        WWWWWWWWWWWWW\s
                    WWW                        WWWWWWWWWWWWW\s
                    WWWW                       WWWWWWWWWWWWW\s
                    WWWW                        WWWWWWWWWWWW\s
                    WWWW                         WWWWWWWWWWW\s
                    WWWW         222              WWWWWWWWWW\s
                    WWWWW         22               WWWWWWWWW\s
                    WWWWW                           WWWWWWWW\s
                    WWWWW                 F          WWWWWWW\s
                    WWWWW                             WWWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWWW                             WWWWW\s
                    WWWWWWW                            WWWWW\s
                    WWWWWWWW              G            WWWWW\s
                    WWWWWWWWW                          WWWWW\s
                    WWWWWWWWWW                         WWWWW\s
                    WWWWWWWWWWW                       WWWWWW\s
                    WWWWWWWWWWWW                     WWWWWWW\s
                    WWWWWWWWWWWW     B              WWWWWWWW\s
                    WWWWWWWWWWW                    WWWWWWWWW\s
                    WWWWWWWWWW                     WWWWWWWWW\s
                    WWWWWWWWW                      WWWWWWWWW\s
                    WWWWWWWW                        WWWWWWWW\s
                    WWWWWWWW             B           WWWWWWW\s
                    WWWWWWW                           WWWWWW\s
                    WWWWWW                             WWWWW\s
                    WWWWW               11             WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW         WW                   WWWWW\s
                    WWWWW   F     WWW                  WWWWW\s
                    WWWWW         WWWW                 WWWWW\s
                    WWWWW         WWWW                 WWWWW\s
                    WWWWW          WWWW                WWWWW\s
                    WWWWW           WWWW               WWWWW\s
                    WWWWW            WWW               WWWWW\s
                    WWWWW            WW                WWWWW\s
                    WWWWW            WW                WWWWW\s
                    WWWWW            WWW               WWWWW\s
                    WWWWW            WWW      F        WWWWW\s
                    WWWWW            WWW               WWWWW\s
                    WWWWW            WWWW              WWWWW\s
                    WWWWW            WWWW              WWWWW\s
                    WWWWW            WWWW              WWWWW\s
                    WWWWW            WWWW              WWWWW\s
                    WWWWW             WWW              WWWWW\s
                    WWWWW             WWW              WWWWW\s
                    WWWWW             WWW              WWWWW\s
                    WWWWW             WWWW             WWWWW\s
                    WWWWW             WWWWW            WWWWW\s
                    WWWWW              WWWW            WWWWW\s
                    WWWWW              WWW             WWWWW\s
                    WWWWW     F        WWW             WWWWW\s
                    WWWWW              WWW             WWWWW\s
                    WWWWW              WWW             WWWWW\s
                    WWWWWW             WW        +     WWWWW\s
                    WWWWWW                             WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWWW                            WWWWWW\s
                    WWWWWWW                          WWWWWWW\s
                    WWWWWWWW                        WWWWWWWW\s
                    WWWWWWWWW          A           WWWWWWWWW\s
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
                    WWWWW                   B          WWWWW\s
                    WWWWW     G                        WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                  G           WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW        WW                    WWWWW\s
                    WWWWW        WW                    WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                 B            WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWWW      U                      WWWWW\s
                    WWWWWWW                            WWWWW\s
                    WWWWWWWW              G            WWWWW\s
                    WWWWWWWWW                         WWWWWW\s
                    WWWWWWWWWW                       WWWWWWW\s
                    WWWWWWWWWWW                      WWWWWWW\s
                    WWWWWWWWWWW                     WWWWWWWW\s
                    WWWWWWWWWWWL                   WWWWWWWWW\s
                    WWWWWWWWWWW       F            WWWWWWWWW\s
                    WWWWWWWWWW                    RWWWWWWWWW\s
                    WWWWWWWWW                      WWWWWWWWW\s
                    WWWWWWWW             A          WWWWWWWW\s
                    WWWWWWWW                         WWWWWWW\s
                    WWWWWWW                           WWWWWW\s
                    WWWWWW         A                   WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                 WW           WWWWW\s
                    WWWWW                 WW           WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW    WW                        WWWWW\s
                    WWWWW    WW                        WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW       F          WW          WWWWW\s
                    WWWWW                  WW          WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW              2HH             WWWWW\s
                    WWWWW        WW      2             WWWWW\s
                    WWWWW        WW                    WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                       U      WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW            WW                WWWWW\s
                    WWWWW            WW                WWWWW\s
                    WWWWW      F                       WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                    WW        WWWWW\s
                    WWWWW                    WW        WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW          WW                  WWWWW\s
                    WWWWW          WW                  WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                   A          WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW         WW                   WWWWW\s
                    WWWWW         WW                   WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                   WW         WWWWW\s
                    WWWWW                   WW         WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    """;
        }
    }
}
