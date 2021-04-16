public class ShipService implements UnloadingLoadingContainers {
    @Override
    public int loadingContainers() {
        Ship ship = new Ship();
        ship.getContainers().add(new Container());
        return ship.getContainers().size();
    }

    @Override
    public int unloadContainers() {
        return 0;
    }
}
