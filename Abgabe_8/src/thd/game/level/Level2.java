package thd.game.level;

public class Level2 extends Level {

    public Level2() {
        super.world = """
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W         F                            W\s
                W                                      W\s
                W                                      W\s
                W                         F            W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W         F                            W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W       O    O   O  O      OOO         W\s
                W       O     O O   O     O  O         W\s
                W       O     O O   O       O          W\s
                W       OOOO   O    OOOO  OOOOO        W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s
                W                                      W\s""";
        numberOfLevel = 1;
        worldOffsetLines = world.split("\\R").length - 23;
        worldOffsetColumns = 0;
    }
}
