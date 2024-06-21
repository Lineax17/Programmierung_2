package thd.game.level;

/**
 * The first Level of the game.
 */
public class Level1 extends Level {
    /**
     * Initializes the level.
     */
    public Level1() {
        //Standard length = 140/2 = 70
        //Easy length = 110/2 = 55
        super.world = """
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW             WW  WW           WWWWW\s
                WWWWW             WW  WW           WWWWW\s
                WWWWW            WWWWWWWW          WWWWW\s
                WWWWW            WWWWWWWW          WWWWW\s
                WWWWW             WWWWWW           WWWWW\s
                WWWWW              WWWW            WWWWW\s
                WWWWW               WW             WWWWW\s
                WWWWWW                            WWWWWW\s
                WWWWWWW                          WWWWWWW\s
                WWWWWWWW                        WWWWWWWW\s
                WWWWWWWW                        WWWWWWWW\s
                WWWWWWW      G                   WWWWWWW\s
                WWWWWW                            WWWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW       WW         WW          WWWWW\s
                WWWWW       WW         WW          WWWWW\s
                WWWWW            WW                WWWWW\s
                WWWWW            WW                WWWWW\s
                WWWWW     WW             WW        WWWWW\s
                WWWWW     WW             WW        WWWWW\s
                WWWWW         WW  WW  WW           WWWWW\s
                WWWWW                             RWWWWW\s
                WWWWW                             WWWWWW\s
                WWWWW                            WWWWWWW\s
                WWWWW                           WWWWWWWW\s
                WWWWW                          WWWWWWWWW\s
                WWWWW                         WWWWWWWWWW\s
                WWWWW                        WWWWWWWWWWW\s
                WWWWW                        WWWWWWWWWWW\s
                WWWWW                         WWWWWWWWWW\s
                WWWWW                          WWWWWWWWW\s
                WWWWWW                          WWWWWWWW\s
                WWWWWWW                          WWWWWWW\s
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
                WWWWW               WW             WWWWW\s
                WWWWW               WW             WWWWW\s
                WWWWW            WW    WW          WWWWW\s
                WWWWW            WW    WW          WWWWW\s
                WWWWW          WW        WW        WWWWW\s
                WWWWW          WW        WW        WWWWW\s
                WWWWW        WW            WW      WWWWW\s
                WWWWW        WW            WW      WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWWL                             WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW               F              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW       WW            WW       WWWWW\s
                WWWWW       WW            WW       WWWWW\s
                WWWWW         WW        WW         WWWWW\s
                WWWWW         WW        WW         WWWWW\s
                WWWWW           WW    WW           WWWWW\s
                WWWWW           WW    WW           WWWWW\s
                WWWWW              WW              WWWWW\s
                WWWWW              WW              WWWWW\s
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
                WWWWW             WW               WWWWW\s
                WWWWW             WW               WWWWW\s
                WWWWW           WW  WW             WWWWW\s
                WWWWW           WW  WW             WWWWW\s
                WWWWW         WW      WW           WWWWW\s
                WWWWW         WW      WW           WWWWW\s
                WWWWW       WW          WW         WWWWW\s
                WWWWW       WW          WW         WWWWW\s
                WWWWW         WW      WW           WWWWW\s
                WWWWW         WW      WW           WWWWW\s
                WWWWW           WW  WW             WWWWW\s
                WWWWW           WW  WW             WWWWW\s
                WWWWW             WW               WWWWW\s
                WWWWW             WW               WWWWW\s
                WWWWW             WW               WWWWW\s
                WWWWW             WW               WWWWW\s
                WWWWW             WW               WWWWW\s
                WWWWW             WW               WWWWW\s
                WWWWW             WW               WWWWW\s
                WWWWW             WW               WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                             WWWWWW\s
                WWWWW                            WWWWWWW\s
                WWWWW                           WWWWWWWW\s
                WWWWW                          WWWWWWWWW\s
                WWWWW                         WWWWWWWWWW\s
                WWWWW                        WWWWWWWWWWW\s
                WWWWW                       WWWWWWWWWWWW\s
                WWWWWW                      WWWWWWWWWWWW\s
                WWWWWWW                      WWWWWWWWWWW\s
                WWWWWWWW              G       WWWWWWWWWW\s
                WWWWWWWWW                      WWWWWWWWW\s
                WWWWWWWWWW                      WWWWWWWW\s
                WWWWWWWWWWW                      WWWWWWW\s
                WWWWWWWWWWW                      WWWWWWW\s
                WWWWWWWWWWWL                    WWWWWWWW\s
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
                WWWWW                WW            WWWWW\s
                WWWWW                WW            WWWWW\s
                WWWWW              WW  WW          WWWWW\s
                WWWWW              WW  WW          WWWWW\s
                WWWWW            WW  WW  WW        WWWWW\s
                WWWWW            WW  WW  WW        WWWWW\s
                WWWWW              WW  WW          WWWWW\s
                WWWWW              WW  WW          WWWWW\s
                WWWWW                WW            WWWWW\s
                WWWWW                WW            WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW              2HH             WWWWW\s
                WWWWW                2             WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW            WW                WWWWW\s
                WWWWW            WW               WWWWWW\s
                WWWWW                            WWWWWWW\s
                WWWWW                           WWWWWWWW\s
                WWWWWW                         WWWWWWWWW\s
                WWWWWWW                       WWWWWWWWWW\s
                WWWWWWWW                     WWWWWWWWWWW\s
                WWWWWWWWW                    WWWWWWWWWWW\s
                WWWWWWWWWW                    WWWWWWWWWW\s
                WWWWWWWWWWW                    WWWWWWWWW\s
                WWWWWWWWWWWW                    WWWWWWWW\s
                WWWWWWWWWWWWW                    WWWWWWW\s
                WWWWWWWWWWWWWW                    WWWWWW\s
                WWWWWWWWWWWWWW                     WWWWW\s
                WWWWWWWWWWWWW                      WWWWW\s
                WWWWWWWWWWWW                       WWWWW\s
                WWWWWWWWWWW                        WWWWW\s
                WWWWWWWWWW              WW         WWWWW\s
                WWWWWWWWW               WW         WWWWW\s
                WWWWWWWW                          WWWWWW\s
                WWWWWWW                          WWWWWWW\s
                WWWWWW                          WWWWWWWW\s
                WWWWW                          WWWWWWWWW\s
                WWWWW                         WWWWWWWWWW\s
                WWWWW                         WWWWWWWWWW\s
                WWWWW                          WWWWWWWWW\s
                WWWWWW                          WWWWWWWW\s
                WWWWWWW                          WWWWWWW\s
                WWWWWWWW             G            WWWWWW\s
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
                
                """;
        number = 1;
        name = "Level 1";
        worldOffsetLines = world.split("\\R").length - 23;
        worldOffsetColumns = 0;
    }
}
