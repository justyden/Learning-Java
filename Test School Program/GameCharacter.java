public class GameCharacter {
    private int color = 0;
    private GameHealth health = new GameHealth();
    private int entityId = 0;
    private GameCharacterMove move = new GameCharacterMove();

    public GameCharacter() {
    }

    public GameCharacter(int color, int entityId) {
        this.color = color;
        this.entityId = entityId;
    }

    public boolean CharacterMove(int moveCharacter) {
        this.move.setPosition(moveCharacter);
        return true;
    }

}
