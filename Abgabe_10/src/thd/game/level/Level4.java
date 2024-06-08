package thd.game.level;

public class Level4 extends Level {
    public Level4() {
        super.world = """
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WWW                                   WW\s
                WWW                                   WW\s
                WWW                                   WW\s
                WWW                                   WW\s
                WWWW                                  WW\s
                WWWW                                  WW\s
                WWW                                   WW\s
                WWW                                   WW\s
                WWW                                   WW\s
                WWWW         A                        WW\s
                WWWW                                  WW\s
                WWW                                   WW\s
                WWW                         F         WW\s
                WWW                                   WW\s
                WWW                                   WW\s
                WWWW                                  WW\s
                WWWWW                                 WW\s
                WWWWWW         F                      WW\s
                WWWWWWW                               WW\s
                WWWWWWW                               WW\s
                WWWWWWW                               WW\s
                WWWWWW                                WW\s
                WWWWW                                 WW\s
                WWWW                                  WW\s
                WWW                                   WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                 A                  WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW       G                            WW\s
                WW                             G      WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW              1                     WW\s
                WW              111                   WW\s
                WW               11                   WW\s
                WW                                   WWW\s
                WW                    H              WWW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WWW                                  WWW\s
                WWWW         G        A            RWWWW\s
                WWWW                                WWWW\s
                WWW                                  WWW\s
                WW             A                     RWW\s
                WWW                       F           WW\s
                WWW                                   WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s
                WW                                    WW\s""";
        number = 4;
        name = "Level 4";
        worldOffsetLines = world.split("\\R").length - 23;
        worldOffsetColumns = 0;
    }

}
