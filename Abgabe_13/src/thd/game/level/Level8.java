package thd.game.level;

public class Level8 extends Level {
    /**
     * Initializes the level.
     */
    public Level8() {
        super.world = """
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                             WWWWWW\s
                WWWWWW                           WWWWWWW\s
                WWWWWWW                         WWWWWWWW\s
                WWWWWWWW                       WWWWWWWWW\s
                WWWWWWWWW                     WWWWWWWWWW\s
                WWWWWWWWWW                   WWWWWWWWWWW\s
                WWWWWWWWWWW                 WWWWWWWWWWWW\s
                WWWWWWWWWWWW               WWWWWWWWWWWWW\s
                WWWWWWWWWWWWW              WWWWWWWWWWWWW\s
                WWWWWWWWWWWWW             WWWWWWWWWWWWWW\s
                WWWWWWWWWWWW              WWWWWWWWWWWWWW\s
                WWWWWWWWWWW               WWWWWWWWWWWWWW\s
                WWWWWWWWWW                WWWWWWWWWWWWWW\s
                WWWWWWWWW                 WWWWWWWWWWWWWW\s
                WWWWWWWWW                 WWWWWWWWWWWWWW\s
                WWWWWWWWWW      G        WWWWWWWWWWWWWWW\s
                WWWWWWWWWWW             WWWWWWWWWWWWWWWW\s
                WWWWWWWWWWWW           WWWWWWWWWWWWWWWWW\s
                WWWWWWWWWWWWW          WWWWWWWWWWWWWWWWW\s
                WWWWWWWWWWWWWW         WWWWWWWWWWWWWWWWW\s
                WWWWWWWWWWWWWW          WWWWWWWWWWWWWWWW\s
                WWWWWWWWWWWWW            WWWWWWWWWWWWWWW\s
                WWWWWWWWWWWW              WWWWWWWWWWWWWW\s
                WWWWWWWWWWW        WW      WWWWWWWWWWWWW\s
                WWWWWWWWWW        WWWW      WWWWWWWWWWWW\s
                WWWWWWWWW        WWWWWW      WWWWWWWWWWW\s
                WWWWWWWW        WWWWWWWW     RWWWWWWWWWW\s
                WWWWWWW        WWWWWWWWWW      WWWWWWWWW\s
                WWWWWW         WWWWWWWWWW       WWWWWWWW\s
                WWWWW           WWWWWWWW         WWWWWWW\s
                WWWWW   WW       WWWWWW           WWWWWW\s
                WWWWW  WWWW       WWWW      WW     WWWWW\s
                WWWWW  WWWW        WW      WWWW    WWWWW\s
                WWWWW   WW                 WWWW    WWWWW\s
                WWWWW           WW          WW     WWWWW\s
                WWWWW    WW     WW                 WWWWW\s
                WWWWW   WWWW                WW     WWWWW\s
                WWWWW   WWWW        WW     WWWW    WWWWW\s
                WWWWW   WWWW       WWWW    WWWW    WWWWW\s
                WWWWW    WW   WW   WWWW    WWWW    WWWWW\s
                WWWWW         WW   WWWW    WWWW    WWWWW\s
                WWWWW               WW      WW     WWWWW\s
                WWWWW       WW                    WWWWWW\s
                WWWWW      WWWW     WW           WWWWWWW\s
                WWWWW     WWWWWW    WW    WW    WWWWWWWW\s
                WWWWW    WWWWWWWW        WWWW   WWWWWWWW\s
                WWWWW   WWWWWWWWWW       WWWW    WWWWWWW\s
                WWWWW   WWWWWWWWWW        WW      WWWWWW\s
                WWWWW   WWWWWWWWWW                 WWWWW\s
                WWWWW    WWWWWWWW            WW    WWWWW\s
                WWWWW     WWWWWW            WWWW   WWWWW\s
                WWWWW      WWWW        WW   WWWW   WWWWW\s
                WWWWWW      WW        WWWW   WW    WWWWW\s
                WWWWWWW               WWWW         WWWWW\s
                WWWWWWWW          WW  WWWW         WWWWW\s
                WWWWWWWW          WW   WW          WWWWW\s
                WWWWWWW      G                WW   WWWWW\s
                WWWWWW       WW       WW      WW   WWWWW\s
                WWWWW      WWWW       WW           WWWWW\s
                WWWWW      WWWW            WW      WWWWW\s
                WWWWW     WWWW     WW     WWWW     WWWWW\s
                WWWWW     WWWW    WWWW    WWWW     WWWWW\s
                WWWWW   WWWW      WWWW    WWWW     WWWWW\s
                WWWWW   WWWW   WW  WW      WW      WWWWW\s
                WWWWW    WW    WW            WW    WWWWW\s
                WWWWW                       WWWW   WWWWW\s
                WWWWW        WW       WW    WWWW   WWWWW\s
                WWWWW  WW   WWWW     WWWW    WW   RWWWWW\s
                WWWWW  WW   WWWW     WWWW          WWWWW\s
                WWWWW        WW      WWWW          WWWWW\s
                WWWWW                 WW   WW      WWWWW\s
                WWWWW   WW                WWWW     WWWWW\s
                WWWWW  WWWW               WWWW     WWWWW\s
                WWWWW  WWWW   WW     WW   WWWW     WWWWW\s
                WWWWW   WWWW  WW    WWWW   WW      WWWWW\s
                WWWWW   WWWW        WWWW           WWWWW\s
                WWWWW    WW         WWWW     WW    WWWWW\s
                WWWWWW               WW      WW   WWWWWW\s
                WWWWW   WW                       WWWWWWW\s
                WWWWW  WWWW       WW       WW    WWWWWWW\s
                WWWWW  WWWW      WWWW     WWWW    WWWWWW\s
                WWWWW  WWWW      WWWW     WWWW     WWWWW\s
                WWWWW   WW        WWWW     WW      WWWWW\s
                WWWWW             WWWW             WWWWW\s
                WWWWW              WWWW            WWWWW\s
                WWWWW       WW     WWWW      WW    WWWWW\s
                WWWWW      WWWW     WW       WW    WWWWW\s
                WWWWW      WWWW        WW         WWWWWW\s
                WWWWW      WWWW       WWWW       WWWWWWW\s
                WWWWW       WW        WWWW      WWWWWWWW\s
                WWWWW                  WW       WWWWWWWW\s
                WWWWW    WW          WW     WW   WWWWWWW\s
                WWWWW    WW         WWWW    WW    WWWWWW\s
                WWWWW               WWWW           WWWWW\s
                WWWWW       WW      WWWW           WWWWW\s
                WWWWW      WWWW      WW      WW    WWWWW\s
                WWWWW      WWWW             WWWW   WWWWW\s
                WWWWW       WW    WW        WWWW   WWWWW\s
                WWWWW     WW     WWWW        WW    WWWWW\s
                WWWWW    WWWW    WWWW              WWWWW\s
                WWWWW    WWWW     WW    WW         WWWWW\s
                WWWWW     WWWW         WWWW        WWWWW\s
                WWWWW     WWWW         WWWW   WW   WWWWW\s
                WWWWW       WWWW       WWWW   WW  WWWWWW\s
                WWWWW       WWWW        WW       WWWWWWW\s
                WWWWW         WWWW               WWWWWWW\s
                WWWWW         WWWW        WW      WWWWWW\s
                WWWWW    WW    WW        WWWW      WWWWW\s
                WWWWW   WWWW             WWWW     RWWWWW\s
                WWWWW   WWWW      WW     WWWW      WWWWW\s
                WWWWW    WW      WWWW     WW       WWWWW\s
                WWWWW            WWWW              WWWWW\s
                WWWWWW        WW  WW         WW    WWWWW\s
                WWWWWWW      WWWW      WW    WW    WWWWW\s
                WWWWWWW      WWWW     WWWW         WWWWW\s
                WWWWWW       WWWW     WWWW         WWWWW\s
                WWWWW         WW       WW    WW    WWWWW\s
                WWWWW                 WW    WWWW   WWWWW\s
                WWWWW     WW         WWWW   WWWW   WWWWW\s
                WWWWW    WWWW        WWWW    WW    WWWWW\s
                WWWWW    WWWW         WW           WWWWW\s
                WWWWW     WW     WW           WW   WWWWW\s
                WWWWWW          WWWW          WW   WWWWW\s
                WWWWWWW         WWWW      WW       WWWWW\s
                WWWWWWWW        WWWW     WWWW      WWWWW\s
                WWWWWWW          WW      WWWW      WWWWW\s
                WWWWWW      WW            WW       WWWWW\s
                WWWWW      WWWW                   WWWWWW\s
                WWWWW      WWWW                  WWWWWWW\s
                WWWWW      WWWW         WW      WWWWWWWW\s
                WWWWWW       WW        WWWW    WWWWWWWWW\s
                WWWWWWW                WWWW    WWWWWWWWW\s
                WWWWWWWW                WWWW    WWWWWWWW\s
                WWWWWWWW                WWWW      WWWWWW\s
                WWWWWWW                 WW         WWWWW\s
                WWWWWW    WW            WW         WWWWW\s
                WWWWW   WWWW           WWWW        WWWWW\s
                WWWWW   WWWW      WW   WWWW        WWWWW\s
                WWWWW    WWWW    WWWW   WWWW       WWWWW\s
                WWWWW    WWWW    WWWW   WWWW       WWWWW\s
                WWWWW     WWWW    WW     WWWWW     WWWWW\s
                WWWWW     WWWW           WWWWW     WWWWW\s
                WWWWW    WWWW             WWWW     WWWWW\s
                WWWWW    WWWW             WWWW     WWWWW\s
                WWWWW     WW        WW     WW      WWWWW\s
                WWWWW              WWWW            WWWWW\s
                WWWWW              WWWW            WWWWW\s
                WWWWW      WW       WW            WWWWWW\s
                WWWWW     WWWW                   WWWWWWW\s
                WWWWW     WWWW       WW        RWWWWWWWW\s
                WWWWW      WW       WWWW       WWWWWWWWW\s
                WWWWW               WWWW       WWWWWWWWW\s
                WWWWW      WW        WW         WWWWWWWW\s
                WWWWW     WWWW                   WWWWWWW\s
                WWWWW    WWWWWW         WW        WWWWWW\s
                WWWWWW   WWWWWW        WWWW        WWWWW\s
                WWWWWW   WWWWWW        WWWW       WWWWWW\s
                WWWWW    WWWWWW         WW       WWWWWWW\s
                WWWWW    WWWWWW                 WWWWWWWW\s
                WWWWWW   WWWWWW        WW       WWWWWWWW\s
                WWWWWW   WWWWWW       WWWW       WWWWWWW\s
                WWWWW     WWWW        WWWW        WWWWWW\s
                WWWWW      WW          WW          WWWWW\s
                WWWWWW                             WWWWW\s
                WWWWWWW                 WW        WWWWWW\s
                WWWWWWW                WWWW      WWWWWWW\s
                WWWWWW      WW         WWWW      WWWWWWW\s
                WWWWW      WWWW         WW        WWWWWW\s
                WWWWW      WWWW       WW       WW  WWWWW\s
                WWWWW      WWWW      WWWW     WWWW WWWWW\s
                WWWWW       WW       WWWW     WWWW WWWWW\s
                WWWWW       WW        WW       WW  WWWWW\s
                WWWWW                              WWWWW\s
                WWWWW                WW            WWWWW\s
                WWWWW                WW            WWWWW\s
                WWWWW         WW                   WWWWW\s
                WWWWW        WWWW                  WWWWW\s
                WWWWW        WWWW       WW         WWWWW\s
                WWWWW        WWWW      WWWW        WWWWW\s
                WWWWW      G  WW       WWWW        WWWWW\s
                WWWWW                   WW         WWWWW\s
                WWWWW           WW                 WWWWW\s
                WWWWW           WW           WW    WWWWW\s
                WWWWW      WW       WW      WWWW   WWWWW\s
                WWWWW     WWWW     WWWW     WWWW   WWWWW\s
                WWWWW     WWWW     WWWW      WW    WWWWW\s
                WWWWW     WWWW      WW             WWWWW\s
                WWWWW      WW                      WWWWW\s
                WWWWW                       WW     WWWWW\s
                WWWWW              WW      WWWW    WWWWW\s
                WWWWW             WWWW     WWWW   RWWWWW\s
                WWWWW    WW       WWWW     WWWW    WWWWW\s
                WWWWW   WWWW       WW       WW     WWWWW\s
                WWWWW   WWWW                       WWWWW\s
                WWWWW   WWWW         WW            WWWWW\s
                WWWWW    WW         WWWW           WWWWW\s
                WWWWW               WWWW           WWWWW\s
                WWWWW               WWWW           WWWWW\s
                WWWWW                WW            WWWWW\s
                WWWWW         WW             WW    WWWWW\s
                WWWWWW       WWWW           WWWW   WWWWW\s
                WWWWWWW      WWWW           WWWW  WWWWWW\s
                WWWWWWWW     WWWW            WW   WWWWWW\s
                WWWWWWWWW     WW                   WWWWW\s
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
                WWWWW                             WWWWWW\s
                WWWWW                            WWWWWWW\s
                WWWWWW                          WWWWWWWW\s
                WWWWWWW                WW      WWWWWWWWW\s
                WWWWWWWW               WW      WWWWWWWWW\s
                WWWWWWWWW                       WWWWWWWW\s
                WWWWWWWWWW                       WWWWWWW\s
                WWWWWWWWWWW                       WWWWWW\s
                WWWWWWWWWWWW                       WWWWW\s
                WWWWWWWWWWWWW      G               WWWWW\s
                WWWWWWWWWWWWWW                     WWWWW\s
                WWWWWWWWWWWWWWW            F       WWWWW\s
                WWWWWWWWWWWWWWW                    WWWWW\s
                WWWWWWWWWWWWWW                     WWWWW\s
                WWWWWWWWWWWWW                      WWWWW\s
                WWWWWWWWWWWW       F               WWWWW\s
                WWWWWWWWWWW                        WWWWW\s
                WWWWWWWWWW                         WWWWW\s
                WWWWWWWWW                          WWWWW\s
                WWWWWWWW                           WWWWW\s
                WWWWWWW                           RWWWWW\s
                WWWWWW                             WWWWW\s
                WWWWW                             WWWWWW\s
                WWWWW               WW           WWWWWWW\s
                WWWWWW             WWWW         WWWWWWWW\s
                WWWWWWW           WWWWWW       WWWWWWWWW\s
                WWWWWWWW          WWWWWW       WWWWWWWWW\s
                WWWWWWWW          WWWWWW        WWWWWWWW\s
                WWWWWWW          WWWWWWWW        WWWWWWW\s
                WWWWWW          WWWWWWWWWW        WWWWWW\s
                WWWWWW          WWWWWWWWWW         WWWWW\s
                WWWWWWW         WWWWWWWWWW        WWWWWW\s
                WWWWWWWW         WWWWWWWW         WWWWWW\s
                WWWWWWWWW         WWWWWW           WWWWW\s
                WWWWWWWWWL         WWWW            WWWWW\s
                WWWWWWWWWW          WW            WWWWWW\s
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
        number = 8;
        name = "Level 8";
        worldOffsetLines = world.split("\\R").length - 23;
        worldOffsetColumns = 0;
    }
}
