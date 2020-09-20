package pl.sda.javawwa24.exercice.computer;

import java.util.Optional;

public class ServerComputer {
    private GraphicsCard graphicsCard;

    public ServerComputer(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public Optional<GraphicsCard> getGraphicsCard() {
        return Optional.ofNullable(graphicsCard);
    }
}
