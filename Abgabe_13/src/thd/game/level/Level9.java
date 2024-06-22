package thd.game.level;

public class Level9 extends Level {
    /**
     * Initializes the level.
     */
    public Level9() {
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
                WWWWW     G                        WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW               a              WWWWW\s
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
                WWWWWWWWWWWWWWWW  f       WWWWWWWWWWWWWW\s
                WWWWWWWWWWWWWWW           WWWWWWWWWWWWWW\s
                WWWWWWWWWWWWWWW            WWWWWWWWWWWWW\s
                WWWWWWWWWWWWWWW             WWWWWWWWWWWW\s
                WWWWWWWWWWWWWWWW             WWWWWWWWWWW\s
                WWWWWWWWWWWWWWWW        f    WWWWWWWWWWW\s
                WWWWWWWWWWWWWWWW            WWWWWWWWWWWW\s
                WWWWWWWWWWWWWWWW            WWWWWWWWWWWW\s
                WWWWWWWWWWWWWWW              WWWWWWWWWWW\s
                WWWWWWWWWWWWWW               WWWWWWWWWWW\s
                WWWWWWWWWWWWWW                WWWWWWWWWW\s
                WWWWWWWWWWWWW                 WWWWWWWWWW\s
                WWWWWWWWWWWW                  WWWWWWWWWW\s
                WWWWWWWWWWW                    WWWWWWWWW\s
                WWWWWWWWWWW                     WWWWWWWW\s
                WWWWWWWWWW             U         WWWWWWW\s
                WWWWWWWWWW                        WWWWWW\s
                WWWWWWWWW                          WWWWW\s
                WWWWWWWW                           WWWWW\s
                WWWWWWW                            WWWWW\s
                WWWWWW           a                 WWWWW\s
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
                WWWWW    G         WW              WWWWW\s
                WWWWW              WWW             WWWWW\s
                WWWWW              WWW          s  WWWWW\s
                WWWWW             WWWW             WWWWW\s
                WWWWW             WWWW             WWWWW\s
                WWWWW            WWWW              WWWWW\s
                WWWWW            WWWW              WWWWW\s
                WWWWW            WWW               WWWWW\s
                WWWWW            WWW               WWWWW\s
                WWWWW     f       WWW              WWWWW\s
                WWWWW             WWW              WWWWW\s
                WWWWWW            WW               WWWWW\s
                WWWWWWW                            WWWWW\s
                WWWWWWWW              G            WWWWW\s
                WWWWWWWWW                         WWWWWW\s
                WWWWWWWWWW                       WWWWWWW\s
                WWWWWWWWWWW                      WWWWWWW\s
                WWWWWWWWWWW                     WWWWWWWW\s
                WWWWWWWWWWWL                   WWWWWWWWW\s
                WWWWWWWWWWW       f            WWWWWWWWW\s
                WWWWWWWWWW                    RWWWWWWWWW\s
                WWWWWWWWW                      WWWWWWWWW\s
                WWWWWWWW                        WWWWWWWW\s
                WWWWWWWW                         WWWWWWW\s
                WWWWWWW                           WWWWWW\s
                WWWWWW         a                   WWWWW\s
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
                WWWWWWW                          WWWWWWW\s
                WWWWWW                            WWWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
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
                WWWWWWWW                          WWWWWW\s
                WWWWWWW                            WWWWW\s
                WWWWWW                             WWWWW\s
                WWWWW               33             WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW         WW                   WWWWW\s
                WWWWW   f     WWW                  WWWWW\s
                WWWWW         WWWW                 WWWWW\s
                WWWWW         WWWW                 WWWWW\s
                WWWWW          WWWW                WWWWW\s
                WWWWW           WWWW               WWWWW\s
                WWWWW            WWW               WWWWW\s
                WWWWW            WW                WWWWW\s
                WWWWW            WW                WWWWW\s
                WWWWW            WWW               WWWWW\s
                WWWWW            WWW      f        WWWWW\s
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
                WWWWW     f        WWW             WWWWW\s
                WWWWW              WWW             WWWWW\s
                WWWWW              WWW             WWWWW\s
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
                WWWWWWWWWWW         3333           WWWWW\s
                WWWWWWWWWW           hhh       +    WWWW\s
                WWWWWWWWW                            WWW\s
                WWWWWWWWWL                           WWW\s
                WWWWWWWWW                           WWWW\s
                WWWWWWWW                           WWWWW\s
                WWWWWWW                            WWWWW\s
                WWWWWW                             WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                a             WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW       G                      WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                 G            WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW      a                       WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                   a          WWWWW\s
                WWWWW        G                     WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW            a                 WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWWW                             WWWWW\s
                WWWWWWW                            WWWWW\s
                WWWWWWWW                           WWWWW\s
                WWWWWWWWW  s           b           WWWWW\s
                WWWWWWWWWW                         WWWWW\s
                WWWWWWWWWWW                       WWWWWW\s
                WWWWWWWWWWWW                     WWWWWWW\s
                WWWWWWWWWWWW                    WWWWWWWW\s
                WWWWWWWWWWW                    WWWWWWWWW\s
                WWWWWWWWWW                    RWWWWWWWWW\s
                WWWWWWWWW                      WWWWWWWWW\s
                WWWWWWWW                        WWWWWWWW\s
                WWWWWWWW                         WWWWWWW\s
                WWWWWWW                           WWWWWW\s
                WWWWWW                             WWWWW\s
                WWWWW            b                 WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW         WW                   WWWWW\s
                WWWWW         WW                   WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                            s WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW         4444                 WWWWW\s
                WWWWW          4444                WWWWW\s
                WWWWW           44                 WWWWW\s
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
                WWWWWWWWWWWWW      f       WWWWWWWWWWWWW\s
                WWWWWWWWWWWW              WWWWWWWWWWWWWW\s
                WWWWWWWWWWW               WWWWWWWWWWWWWW\s
                WWWWWWWWWW                 WWWWWWWWWWWWW\s
                WWWWWWWWWWL                 WWWWWWWWWWWW\s
                WWWWWWWWWW                   WWWWWWWWWWW\s
                WWWWWWWWW                    WWWWWWWWWWW\s
                WWWWWWWWWL                    WWWWWWWWWW\s
                WWWWWWWWW                   s  WWWWWWWWW\s
                WWWWWWWWW                       WWWWWWWW\s
                WWWWWWWW                       RWWWWWWWW\s
                WWWWWWWW                        WWWWWWWW\s
                WWWWWWW                          WWWWWWW\s
                WWWWWW                            WWWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW        WW                    WWWWW\s
                WWWWW        WW                    WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW    s                         WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                 WW           WWWWW\s
                WWWWW                 WW          RWWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWWW                             WWWWW\s
                WWWWWWW          44                WWWWW\s
                WWWWWWWW          hh               WWWWW\s
                WWWWWWWWW                          WWWWW\s
                WWWWWWWWWW                         WWWWW\s
                WWWWWWWWWWW                       WWWWWW\s
                WWWWWWWWWWWW                     WWWWWWW\s
                WWWWWWWWWWWW       G            WWWWWWWW\s
                WWWWWWWWWWW                    WWWWWWWWW\s
                WWWWWWWWWW                    RWWWWWWWWW\s
                WWWWWWWWW                      WWWWWWWWW\s
                WWWWWWWW                        WWWWWWWW\s
                WWWWWWWW                         WWWWWWW\s
                WWWWWWW                 b         WWWWWW\s
                WWWWWW                             WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW       b                      WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW             4444             WWWWW\s
                WWWWW              hh              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWWL                             WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW        WW                    WWWWW\s
                WWWWW        WW                    WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                  WW          WWWWW\s
                WWWWW                  WW          WWWWW\s
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
        number = 9;
        name = "Level 9";
        worldOffsetLines = world.split("\\R").length - 23;
        worldOffsetColumns = 0;

        if (Level.difficulty == Difficulty.STANDARD) {
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
                    WWWWW     G                        WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW               a              WWWWW\s
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
                    WWWWWWWWWWWWWWWW  f       WWWWWWWWWWWWWW\s
                    WWWWWWWWWWWWWWW           WWWWWWWWWWWWWW\s
                    WWWWWWWWWWWWWWW            WWWWWWWWWWWWW\s
                    WWWWWWWWWWWWWWW             WWWWWWWWWWWW\s
                    WWWWWWWWWWWWWWWW             WWWWWWWWWWW\s
                    WWWWWWWWWWWWWWWW        f    WWWWWWWWWWW\s
                    WWWWWWWWWWWWWWWW            WWWWWWWWWWWW\s
                    WWWWWWWWWWWWWWWW            WWWWWWWWWWWW\s
                    WWWWWWWWWWWWWWW              WWWWWWWWWWW\s
                    WWWWWWWWWWWWWW               WWWWWWWWWWW\s
                    WWWWWWWWWWWWWW                WWWWWWWWWW\s
                    WWWWWWWWWWWWW                 WWWWWWWWWW\s
                    WWWWWWWWWWWW                  WWWWWWWWWW\s
                    WWWWWWWWWWW                    WWWWWWWWW\s
                    WWWWWWWWWWW                     WWWWWWWW\s
                    WWWWWWWWWW             U         WWWWWWW\s
                    WWWWWWWWWW                        WWWWWW\s
                    WWWWWWWWW                          WWWWW\s
                    WWWWWWWW                           WWWWW\s
                    WWWWWWW                            WWWWW\s
                    WWWWWW           a                 WWWWW\s
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
                    WWWWW    G         WW              WWWWW\s
                    WWWWW              WWW             WWWWW\s
                    WWWWW              WWW          s  WWWWW\s
                    WWWWW             WWWW             WWWWW\s
                    WWWWW             WWWW             WWWWW\s
                    WWWWW            WWWW              WWWWW\s
                    WWWWW            WWWW              WWWWW\s
                    WWWWW            WWW               WWWWW\s
                    WWWWW            WWW               WWWWW\s
                    WWWWW     f       WWW              WWWWW\s
                    WWWWW             WWW              WWWWW\s
                    WWWWWW            WW               WWWWW\s
                    WWWWWWW                            WWWWW\s
                    WWWWWWWW              G            WWWWW\s
                    WWWWWWWWW                         WWWWWW\s
                    WWWWWWWWWW                       WWWWWWW\s
                    WWWWWWWWWWW                      WWWWWWW\s
                    WWWWWWWWWWW                     WWWWWWWW\s
                    WWWWWWWWWWWL                   WWWWWWWWW\s
                    WWWWWWWWWWW       f            WWWWWWWWW\s
                    WWWWWWWWWW                    RWWWWWWWWW\s
                    WWWWWWWWW                      WWWWWWWWW\s
                    WWWWWWWW                        WWWWWWWW\s
                    WWWWWWWW                         WWWWWWW\s
                    WWWWWWW                           WWWWWW\s
                    WWWWWW         a                   WWWWW\s
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
                    WWWWWWW                          WWWWWWW\s
                    WWWWWW                            WWWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
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
                    WWWWWWWW                          WWWWWW\s
                    WWWWWWW                            WWWWW\s
                    WWWWWW                             WWWWW\s
                    WWWWW               33             WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW         WW                   WWWWW\s
                    WWWWW   f     WWW                  WWWWW\s
                    WWWWW         WWWW                 WWWWW\s
                    WWWWW         WWWW                 WWWWW\s
                    WWWWW          WWWW                WWWWW\s
                    WWWWW           WWWW               WWWWW\s
                    WWWWW            WWW               WWWWW\s
                    WWWWW            WW                WWWWW\s
                    WWWWW            WW                WWWWW\s
                    WWWWW            WWW               WWWWW\s
                    WWWWW            WWW      f        WWWWW\s
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
                    WWWWW     f        WWW             WWWWW\s
                    WWWWW              WWW             WWWWW\s
                    WWWWW              WWW             WWWWW\s
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
                    WWWWWWWWWWW         3333           WWWWW\s
                    WWWWWWWWWW           hhh       +    WWWW\s
                    WWWWWWWWW                            WWW\s
                    WWWWWWWWWL                           WWW\s
                    WWWWWWWWW                           WWWW\s
                    WWWWWWWW                           WWWWW\s
                    WWWWWWW                            WWWWW\s
                    WWWWWW                             WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                a             WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW       G                      WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                 G            WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW      a                       WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                   a          WWWWW\s
                    WWWWW        G                     WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW            a                 WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWWW                             WWWWW\s
                    WWWWWWW                            WWWWW\s
                    WWWWWWWW                           WWWWW\s
                    WWWWWWWWW  s           b           WWWWW\s
                    WWWWWWWWWW                         WWWWW\s
                    WWWWWWWWWWW                       WWWWWW\s
                    WWWWWWWWWWWW                     WWWWWWW\s
                    WWWWWWWWWWWW                    WWWWWWWW\s
                    WWWWWWWWWWW                    WWWWWWWWW\s
                    WWWWWWWWWW                    RWWWWWWWWW\s
                    WWWWWWWWW                      WWWWWWWWW\s
                    WWWWWWWW                        WWWWWWWW\s
                    WWWWWWWW                         WWWWWWW\s
                    WWWWWWW                           WWWWWW\s
                    WWWWWW                             WWWWW\s
                    WWWWW            b                 WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW         WW                   WWWWW\s
                    WWWWW         WW                   WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                            s WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW         4444                 WWWWW\s
                    WWWWW          4444                WWWWW\s
                    WWWWW           44                 WWWWW\s
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
                    WWWWWWWWWWWWW      f       WWWWWWWWWWWWW\s
                    WWWWWWWWWWWW              WWWWWWWWWWWWWW\s
                    WWWWWWWWWWW               WWWWWWWWWWWWWW\s
                    WWWWWWWWWW                 WWWWWWWWWWWWW\s
                    WWWWWWWWWWL                 WWWWWWWWWWWW\s
                    WWWWWWWWWW                   WWWWWWWWWWW\s
                    WWWWWWWWW                    WWWWWWWWWWW\s
                    WWWWWWWWWL                    WWWWWWWWWW\s
                    WWWWWWWWW                   s  WWWWWWWWW\s
                    WWWWWWWWW                       WWWWWWWW\s
                    WWWWWWWW                       RWWWWWWWW\s
                    WWWWWWWW                        WWWWWWWW\s
                    WWWWWWW                          WWWWWWW\s
                    WWWWWW                            WWWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW        WW                    WWWWW\s
                    WWWWW        WW                    WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW    s                         WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                 WW           WWWWW\s
                    WWWWW                 WW          RWWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW    U                         WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                    f         WWWWW\s
                    WWWWWW                             WWWWW\s
                    WWWWWWW          44                WWWWW\s
                    WWWWWWWW          hh               WWWWW\s
                    WWWWWWWWW                          WWWWW\s
                    WWWWWWWWWW                         WWWWW\s
                    WWWWWWWWWWW                       WWWWWW\s
                    WWWWWWWWWWWW                     WWWWWWW\s
                    WWWWWWWWWWWW       G            WWWWWWWW\s
                    WWWWWWWWWWW                    WWWWWWWWW\s
                    WWWWWWWWWW                    RWWWWWWWWW\s
                    WWWWWWWWW                      WWWWWWWWW\s
                    WWWWWWWW                        WWWWWWWW\s
                    WWWWWWWW                         WWWWWWW\s
                    WWWWWWW                 b         WWWWWW\s
                    WWWWWW                             WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW       b                      WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW             4444             WWWWW\s
                    WWWWW              hh              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWWL                             WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW        WW                    WWWWW\s
                    WWWWW        WW                    WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                  b           WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW      f                       WWWWW\s
                    WWWWW                  WW          WWWWW\s
                    WWWWW                  WW          WWWWW\s
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
                    WWWWWWWW       U           WWWWWWWWWWWWW\s
                    WWWWWWWWL                  WWWWWWWWWWWWW\s
                    WWWWWWWW                    WWWWWWWWWWWW\s
                    WWWWWWWWW                    WWWWWWWWWWW\s
                    WWWWWWWWW                     WWWWWWWWWW\s
                    WWWWWWWWW                      WWWWWWWWW\s
                    WWWWWWWWW         a             WWWWWWWW\s
                    WWWWWWWW                         WWWWWWW\s
                    WWWWWWW                           WWWWWW\s
                    WWWWWW                             WWWWW\s
                    WWWWW             WW               WWWWW\s
                    WWWWW             WW               WWWWW\s
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
        }
    }
}
