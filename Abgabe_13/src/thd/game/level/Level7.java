package thd.game.level;

public class Level7 extends Level {
    /**
     * Initializes the level.
     */
    public Level7() {
        super.world = """
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
                WWWWWWWWWWL     U           WWWWWWWWWWWW\s
                WWWWWWWWWW                   WWWWWWWWWWW\s
                WWWWWWWWW                    WWWWWWWWWWW\s
                WWWWWWWWWL                    WWWWWWWWWW\s
                WWWWWWWWW                      WWWWWWWWW\s
                WWWWWWWWW                 w     WWWWWWWW\s
                WWWWWWWW                       RWWWWWWWW\s
                WWWWWWWW                        WWWWWWWW\s
                WWWWWWW                          WWWWWWW\s
                WWWWWW      B                     WWWWWW\s
                WWWWW                              WWWWW\s
                WWWWWW                   U         WWWWW\s
                WWWWWWW                           WWWWWW\s
                WWWWWWWW                         WWWWWWW\s
                WWWWWWWWW                       WWWWWWWW\s
                WWWWWWWWWW                     WWWWWWWWW\s
                WWWWWWWWWW                     WWWWWWWWW\s
                WWWWWWWWWW          A          WWWWWWWWW\s
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
                WWWWWWWWWWWWWW       F       WWWWWWWWWWW\s
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
                WWWWWWWWWWL     U           WWWWWWWWWWWW\s
                WWWWWWWWWW                   WWWWWWWWWWW\s
                WWWWWWWWW                    WWWWWWWWWWW\s
                WWWWWWWWWL                    WWWWWWWWWW\s
                WWWWWWWWW                      WWWWWWWWW\s
                WWWWWWWWW                 w     WWWWWWWW\s
                WWWWWWWW                       RWWWWWWWW\s
                WWWWWWWW                        WWWWWWWW\s
                WWWWWWW                          WWWWWWW\s
                WWWWWW      B                     WWWWWW\s
                WWWWW                              WWWWW\s
                WWWWWW                   U         WWWWW\s
                WWWWWWW                           WWWWWW\s
                WWWWWWWW                         WWWWWWW\s
                WWWWWWWWW                       WWWWWWWW\s
                WWWWWWWWWW                     WWWWWWWWW\s
                WWWWWWWWWW                     WWWWWWWWW\s
                WWWWWWWWWW          A          WWWWWWWWW\s
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
                WWWWWWWWWWWWWW       F       WWWWWWWWWWW\s
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
                WWWWWWWWW              WW           WWWW\s
                WWWWWWWWWW            WWWW         WWWWW\s
                WWWWWWWWWWW          WWWWWW        WWWWW\s
                WWWWWWWWWWWW         WWWWWW        WWWWW\s
                WWWWWWWWWWWWW         WWWW        WWWWWW\s
                WWWWWWWWWWWWWW        WWWW       WWWWWWW\s
                WWWWWWWWWWWWWWW      WWWWWW     WWWWWWWW\s
                WWWWWWWWWWWWWWWW  F  WWWWWW   WWWWWWWWW\s
                WWWWWWWWWWWWWWWWW    WWWWWW   WWWWWWWWWW\s
                WWWWWWWWWWWWWWWWW     WWWW    WWWWWWWWWW\s
                WWWWWWWWWWWWWWWW       WW      WWWWWWWWW\s
                WWWWWWWWWWWWWWW                 WWWWWWWW\s
                WWWWWWWWWWWWWW                   WWWWWWW\s
                WWWWWWWWWWWWW                     WWWWWW\s
                WWWWWWWWWWWW         WW            WWWWW\s
                WWWWWWWWWWW          WW            WWWWW\s
                WWWWWWWWWW                         WWWWW\s
                WWWWWWWWWW                         WWWWW\s
                WWWWWWWWW                          WWWWW\s
                WWWWWWWW                          WWWWWW\s
                WWWWWWW      G                   WWWWWWW\s
                WWWWWW                          WWWWWWWW\s
                WWWWW                          WWWWWWWWW\s
                WWWWW                         WWWWWWWWWW\s
                WWWWW                        WWWWWWWWWWW\s
                WWWWWW                      WWWWWWWWWWWW\s
                WWWWWWW                    WWWWWWWWWWWWW\s
                WWWWWWWW                  WWWWWWWWWWWWWW\s
                WWWWWWWW                 WWWWWWWWWWWWWWW\s
                WWWWWWW                 WWWWWWWWWWWWWWWW\s
                WWWWWW                 WWWWWWWWWWWWWWWWW\s
                WWWWW                 WWWWWWWWWWWWWWWWWW\s
                WWWWW                WWWWWWWWWWWWWWWWWWW\s
                WWWWW               WWWWWWWWWWWWWWWWWWWW\s
                WWWWW   WW         WWWWWWWWWWWWWWWWWWWWW\s
                WWWWW   WW        WWWWWWWWWWWWWWWWWWWWWW\s
                WWWWW   WW       WWWWWWWWWWWWWWWWWWWWWWW\s
                WWWWW            WWWWWWWWWWWWWWWWWWWWWWW\s
                WWWWW             WWWWWWWWWWWWWWWWWWWWWW\s
                WWWWW              WWWWWWWWWWWWWWWWWWWWW\s
                WWWWWW              WWWWWWWWWWWWWWWWWWWW\s
                WWWWWWW              WWWWWWWWWWWWWWWWWWW\s
                WWWWWWWW              WWWWWWWWWWWWWWWWWW\s
                WWWWWWWWW              WWWWWWWWWWWWWWWWW\s
                WWWWWWWWWW              WWWWWWWWWWWWWWWW\s
                WWWWWWWWWWW              WWWWWWWWWWWWWWW\s
                WWWWWWWWWWWW      WW      WWWWWWWWWWWWWW\s
                WWWWWWWWWWWWW    WWWW      WWWWWWWWWWWWW\s
                WWWWWWWWWWWWWW   WWWW       WWWWWWWWWWWW\s
                WWWWWWWWWWWWWWW   WW         WWWWWWWWWWW\s
                WWWWWWWWWWWWWWWW              WWWWWWWWWW\s
                WWWWWWWWWWWWWWWWW              WWWWWWWWW\s
                WWWWWWWWWWWWWWWWWW              WWWWWWWW\s
                WWWWWWWWWWWWWWWWWWW              WWWWWWW\s
                WWWWWWWWWWWWWWWWWWWW              WWWWWW\s
                WWWWWWWWWWWWWWWWWWWWW              WWWWW\s
                WWWWWWWWWWWWWWWWWWWWW               WWWW\s
                WWWWWWWWWWWWWWWWWWWW                 WWW\s
                WWWWWWWWWWWWWWWWWWW                  WWW\s
                WWWWWWWWWWWWWWWWWW                  WWWW\s
                WWWWWWWWWWWWWWWWW                  WWWWW\s
                WWWWWWWWWWWWWWWW                  WWWWWW\s
                WWWWWWWWWWWWWWW                  WWWWWWW\s
                WWWWWWWWWWWWWW                  WWWWWWWW\s
                WWWWWWWWWWWWW                   WWWWWWWW\s
                WWWWWWWWWWWW                     WWWWWWW\s
                WWWWWWWWWWW                       WWWWWW\s
                WWWWWWWWWW                         WWWWW\s
                WWWWWWWWW                          WWWWW\s
                WWWWWWWW      WW           WW      WWWWW\s
                WWWWWWW      WWWW         WWWW     WWWWW\s
                WWWWWW       WWWW         WWWW     WWWWW\s
                WWWWW         WW           WW      WWWWW\s
                WWWWW                             WWWWWW\s
                WWWWW                WW          WWWWWWW\s
                WWWWW               WWWW        WWWWWWWW\s
                WWWWW       WW      WWWW        WWWWWWWW\s
                WWWWW      WWWW      WW    WW    WWWWWWW\s
                WWWWW      WWWW           WWWW    WWWWWW\s
                WWWWWW      WW            WWWW     WWWWW\s
                WWWWWWW      G             WW      WWWWW\s
                WWWWWWWW            WW             WWWWW\s
                WWWWWWWW           WWWW            WWWWW\s
                WWWWWWW            WWWW      WW    WWWWW\s
                WWWWWW              WW      WWWW   WWWWW\s
                WWWWW       WW              WWWW   WWWWW\s
                WWWWW      WWWW              WW    WWWWW\s
                WWWWW      WWWW       WW           WWWWW\s
                WWWWW       WW       WWWW          WWWWW\s
                WWWWW                WWWW          WWWWW\s
                WWWWWW                WW           WWWWW\s
                WWWWWWW                            WWWWW\s
                WWWWWWWW                           WWWWW\s
                WWWWWWWWW                         WWWWWW\s
                WWWWWWWWWW                       WWWWWWW\s
                WWWWWWWWWWW                     WWWWWWWW\s
                WWWWWWWWWWW                    WWWWWWWWW\s
                WWWWWWWWWW                    WWWWWWWWWW\s
                WWWWWWWWW                    WWWWWWWWWWW\s
                WWWWWWWW                    WWWWWWWWWWWW\s
                WWWWWWW                    WWWWWWWWWWWWW\s
                WWWWWW                     WWWWWWWWWWWWW\s
                WWWWW                       WWWWWWWWWWWW\s
                WWWWW                        WWWWWWWWWWW\s
                WWWWW                W        WWWWWWWWWW\s
                WWWWW                WW        WWWWWWWWW\s
                WWWWW                           WWWWWWWW\s
                WWWWWW                           WWWWWWW\s
                WWWWWWW                           WWWWWW\s
                WWWWWWWW                           WWWWW\s
                WWWWWWWWW      G                   WWWWW\s
                WWWWWWWWWW                        WWWWWW\s
                WWWWWWWWWWW                      WWWWWWW\s
                WWWWWWWWWWWW                    WWWWWWWW\s
                WWWWWWWWWWWWW                  WWWWWWWWW\s
                WWWWWWWWWWWWWW                 WWWWWWWWW\s
                WWWWWWWWWWWWWWW                 WWWWWWWW\s
                WWWWWWWWWWWWWWWW                 WWWWWWW\s
                WWWWWWWWWWWWWWWWW                 WWWWWW\s
                WWWWWWWWWWWWWWWWWW                 WWWWW\s
                WWWWWWWWWWWWWWWWWW                 WWWWW\s
                WWWWWWWWWWWWWWWWW                 RWWWWW\s
                WWWWWWWWWWWWWWWW                   WWWWW\s
                WWWWWWWWWWWWWWW                    WWWWW\s
                WWWWWWWWWWWWWW         WW          WWWWW\s
                WWWWWWWWWWWWW         WWWW         WWWWW\s
                WWWWWWWWWWWW          WWWW         WWWWW\s
                WWWWWWWWWWW          WWWWWW        WWWWW\s
                WWWWWWWWWW          WWWWWWWW       WWWWW\s
                WWWWWWWWW          WWWWWWWWWW      WWWWW\s
                WWWWWWWW           WWWWWWWWWW      WWWWW\s
                WWWWWWW             WWWWWWWW       WWWWW\s
                WWWWWWW              WWWWWW       WWWWWW\s
                WWWWWWWW              WWWW        WWWWWW\s
                WWWWWWWWW              WW          WWWWW\s
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
