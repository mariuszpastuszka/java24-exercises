package pl.sda.javawwa24.exercice.computer;

public class Computer {
    private GraphicsCard graphicsCard;

    public Computer(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }
}
