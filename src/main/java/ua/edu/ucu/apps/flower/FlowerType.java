package ua.edu.ucu.apps.flower;

public enum FlowerType {
    CHAMOMILE("Chamomile"), ROSE("rose"), TULIP("TULIP");
    String stringRepresentation;

    FlowerType(String stringRepresentation) {
        this.stringRepresentation = stringRepresentation;
    }

    @Override
    public String toString() {
        return stringRepresentation;
    }
}
