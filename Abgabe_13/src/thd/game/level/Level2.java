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
                WWWWWWWWWWW         222            WWWWW\s
                WWWWWWWWWW           22             WWWW\s
                WWWWWWWWW           222              WWW\s
                WWWWWWWWWL                           WWW\s
                WWWWWWWWW                           WWWW\s
                WWWWWWWW                           WWWWW\s
                WWWWWWW                            WWWWW\s
                WWWWWW                             WWWWW\s
                WWWWW           F                  WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW    G         WW              WWWWW\s
                WWWWW              WWW             WWWWW\s
                WWWWW              WWW     S       WWWWW\s
                WWWWW             WWWW             WWWWW\s
                WWWWW             WWWW             WWWWW\s
                WWWWW            WWWW              WWWWW\s
                WWWWW            WWWW              WWWWW\s
                WWWWW            WWW               WWWWW\s
                WWWWW            WWW               WWWWW\s
                WWWWW     F       WWW              WWWWW\s
                WWWWW             WWW              WWWWW\s
                WWWWWW            WW               WWWWW\s
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
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW     WW                       WWWWW\s
                WWWWW     WW                       WWWWW\s
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
                WWWWW                 WW           WWWWW\s
                WWWWW                 WW           WWWWW\s
                WWWWW                              WWWWW\s
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
                WWWWWW                             WWWWW\s
                WWWWWWW                            WWWWW\s
                WWWWWWWW                           WWWWW\s
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
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                A             WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW        A                     WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                  F           WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW          G                   WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                     G        WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW              A               WWWWW\s
                WWWWW      G                       WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW             G                WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                     G        WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW      G                       WWWWW\s
                WWWWW                  F           WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW          A                   WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                       A      WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW      A                       WWWWW\s
                WWWWW                      F       WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW          F                   WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                     U        WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW     U                        WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW             F                WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                      B       WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW        B                     WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW              #               WWWWW\s
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
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW            WW                WWWWW\s
                WWWWW            WW                WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW  +                           WWWWW\s
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
                WWWWW              WWW             WWWWW\s
                WWWWW             WWWW             WWWWW\s
                WWWWW             WWWW             WWWWW\s
                WWWWW            WWWW              WWWWW\s
                WWWWW            WWWW              WWWWW\s
                WWWWW            WWW               WWWWW\s
                WWWWW            WWW     F     F   WWWWW\s
                WWWWW     F       WWW              WWWWW\s
                WWWWW             WWWW             WWWWW\s
                WWWWW              WWWW            WWWWW\s
                WWWWW              WWWW            WWWWW\s
                WWWWW              WWW             WWWWW\s
                WWWWW              WWW             WWWWW\s
                WWWWW             WWW              WWWWW\s
                WWWWW             WWW              WWWWW\s
                WWWWW             WWW              WWWWW\s
                WWWWW              WWW             WWWWW\s
                WWWWW              WWWW            WWWWW\s
                WWWWW              WWWW            WWWWW\s
                WWWWW             WWWW             WWWWW\s
                WWWWW             WWW              WWWWW\s
                WWWWW            WWW               WWWWW\s
                WWWWW           WWW                WWWWW\s
                WWWWW           WWW       F        WWWWW\s
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
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                """;
        number = 2;
        name = "Level 2";
        worldOffsetLines = world.split("\\R").length - 23;
        worldOffsetColumns = 0;
        if (Level.difficulty == Difficulty.STANDARD) {
            super.world = """
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
                    WWWWWWWWW                 S      WWWWWWW\s
                    WWWWWWWWWW                       WWWWWWW\s
                    WWWWWWWWWWW                       WWWWWW\s
                    WWWWWWWWWWW         222            WWWWW\s
                    WWWWWWWWWW           22             WWWW\s
                    WWWWWWWWW           222              WWW\s
                    WWWWWWWWWL                           WWW\s
                    WWWWWWWWW                           WWWW\s
                    WWWWWWWW                           WWWWW\s
                    WWWWWWW                            WWWWW\s
                    WWWWWW                             WWWWW\s
                    WWWWW           F                  WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW    G         WW              WWWWW\s
                    WWWWW              WWW             WWWWW\s
                    WWWWW              WWW     S       WWWWW\s
                    WWWWW             WWWW             WWWWW\s
                    WWWWW             WWWW             WWWWW\s
                    WWWWW            WWWW              WWWWW\s
                    WWWWW            WWWW              WWWWW\s
                    WWWWW            WWW               WWWWW\s
                    WWWWW            WWW         S     WWWWW\s
                    WWWWW     F       WWW              WWWWW\s
                    WWWWW             WWW              WWWWW\s
                    WWWWWW            WW               WWWWW\s
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
                    WWWWWWW                  U        WWWWWW\s
                    WWWWWW         A                   WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW     WW                       WWWWW\s
                    WWWWW     WW            A          WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW             2222             WWWWW\s
                    WWWWW              2222            WWWWW\s
                    WWWWW               HH             WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW       F                      WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                 WW           WWWWW\s
                    WWWWW                 WW           WWWWW\s
                    WWWWW      A                       WWWWW\s
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
                    WWWWW     U      WWWW              WWWWW\s
                    WWWWW             WWW              WWWWW\s
                    WWWWW             WWW              WWWWW\s
                    WWWWW             WWW              WWWWW\s
                    WWWWW             WWWW             WWWWW\s
                    WWWWW             WWWWW    U       WWWWW\s
                    WWWWW              WWWW            WWWWW\s
                    WWWWW              WWW             WWWWW\s
                    WWWWW     F        WWW             WWWWW\s
                    WWWWW              WWW             WWWWW\s
                    WWWWW              WWW             WWWWW\s
                    WWWWW              WW              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW            WW                WWWWW\s
                    WWWWWW           WW      A         WWWWW\s
                    WWWWWWW                            WWWWW\s
                    WWWWWWWW                           WWWWW\s
                    WWWWWWWWW            222           WWWWW\s
                    WWWWWWWWWW             HH          WWWWW\s
                    WWWWWWWWWW                         WWWWW\s
                    WWWWWWWWW          U               WWWWW\s
                    WWWWWWWW                          WWWWWW\s
                    WWWWWWW                          WWWWWWW\s
                    WWWWWW                          WWWWWWWW\s
                    WWWWW         WW               WWWWWWWWW\s
                    WWWW          WW              WWWWWWWWWW\s
                    WWWW                 A        WWWWWWWWWW\s
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
                    WWWWW         WW                WWWWWWWW\s
                    WWWWW        WWWW                WWWWWWW\s
                    WWWWW        WWWW                 WWWWWW\s
                    WWWWW         WW                   WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                A             WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW        A                     WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                  F           WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW          G                   WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                     G        WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW              A               WWWWW\s
                    WWWWW      G                       WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW             G                WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                     G        WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW      G                       WWWWW\s
                    WWWWW                  F           WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW          A                   WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                       A      WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW      A                       WWWWW\s
                    WWWWW                      F       WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW          F                   WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                     U        WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW            A                 WWWWW\s
                    WWWWW     U                        WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                             RWWWWW\s
                    WWWWW             F                WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWWL                     B       WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW           WW                 WWWWW\s
                    WWWWW           WW                 WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW        B                     WWWWW\s
                    WWWWWL                             WWWWW\s
                    WWWWW                  F           WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                             RWWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW              #               WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW     U                        WWWWW\s
                    WWWWW                             RWWWWW\s
                    WWWWW                              WWWWW\s
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
                    WWWWWWWWWWW         222            WWWWW\s
                    WWWWWWWWWW           11             WWWW\s
                    WWWWWWWWW                            WWW\s
                    WWWWWWWWWL                           WWW\s
                    WWWWWWWWW                           WWWW\s
                    WWWWWWWW           U               WWWWW\s
                    WWWWWWW                            WWWWW\s
                    WWWWWW                             WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW            WW                WWWWW\s
                    WWWWW            WW                WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                     A        WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW  +                           WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWWW                             WWWWW\s
                    WWWWWWW                            WWWWW\s
                    WWWWWWWW              G            WWWWW\s
                    WWWWWWWWW                          WWWWW\s
                    WWWWWWWWWW                         WWWWW\s
                    WWWWWWWWWWW                       WWWWWW\s
                    WWWWWWWWWWWW                     WWWWWWW\s
                    WWWWWWWWWWWW       F            WWWWWWWW\s
                    WWWWWWWWWWW                    WWWWWWWWW\s
                    WWWWWWWWWW                     WWWWWWWWW\s
                    WWWWWWWWW                      WWWWWWWWW\s
                    WWWWWWWW                        WWWWWWWW\s
                    WWWWWWWW                         WWWWWWW\s
                    WWWWWWW                           WWWWWW\s
                    WWWWWW               22            WWWWW\s
                    WWWWW               11             WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW     U             F          WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                   A          WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW    G         WW              WWWWW\s
                    WWWWW              WWW             WWWWW\s
                    WWWWW              WWW             WWWWW\s
                    WWWWW             WWWW             WWWWW\s
                    WWWWW             WWWW             WWWWW\s
                    WWWWW            WWWW              WWWWW\s
                    WWWWW            WWWW              WWWWW\s
                    WWWWW            WWW               WWWWW\s
                    WWWWW            WWW     F     F   WWWWW\s
                    WWWWW     F       WWW              WWWWW\s
                    WWWWW             WWWW             WWWWW\s
                    WWWWW              WWWW            WWWWW\s
                    WWWWW              WWWW            WWWWW\s
                    WWWWW              WWW             WWWWW\s
                    WWWWW              WWW             WWWWW\s
                    WWWWW             WWW              WWWWW\s
                    WWWWW             WWW              WWWWW\s
                    WWWWW             WWW              WWWWW\s
                    WWWWW              WWW             WWWWW\s
                    WWWWW              WWWW            WWWWW\s
                    WWWWW              WWWW            WWWWW\s
                    WWWWW             WWWW             WWWWW\s
                    WWWWW             WWW              WWWWW\s
                    WWWWW            WWW               WWWWW\s
                    WWWWW           WWW                WWWWW\s
                    WWWWW           WWW       F        WWWWW\s
                    WWWWW           WWW                WWWWW\s
                    WWWWW           WWW                WWWWW\s
                    WWWWW          WWW                 WWWWW\s
                    WWWWW         WWW                  WWWWW\s
                    WWWWW         WWW                  WWWWW\s
                    WWWWW         WWW                  WWWWW\s
                    WWWWW         WWW                  WWWWW\s
                    WWWWW         WW                   WWWWW\s
                    WWWWW   F     WWW          A       WWWWW\s
                    WWWWW         WWWW                 WWWWW\s
                    WWWWW         WWWW                 WWWWW\s
                    WWWWW          WWWW                WWWWW\s
                    WWWWW           WWWW               WWWWW\s
                    WWWWW            WWW               WWWWW\s
                    WWWWW            WW                WWWWW\s
                    WWWWW            WW                WWWWW\s
                    WWWWW            WWW               WWWWW\s
                    WWWWW     A      WWW      F        WWWWW\s
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
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    WWWWW                              WWWWW\s
                    """;
        }
    }
}
