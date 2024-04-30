package de.dhbw.advancewars;

import de.dhbw.advancewars.GUI.GUI2;
import de.dhbw.advancewars.maps.IMapService;
import de.dhbw.advancewars.maps.MapService;
import de.dhbw.advancewars.maps.data.MapDTO;
import de.dhbw.advancewars.maps.data.MapTile;
import de.dhbw.advancewars.maps.data.TileType;

public class AdvanceWars{
    private void saveTestMap() {
        IMapService mapService = new MapService();

        MapTile[][] tiles = new MapTile[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tiles[i][j] = new MapTile(TileType.PLAIN, i, j);
            }
        }
        MapDTO map = new MapDTO("TestMap", 10, 10, tiles);

        mapService.saveMap(map, "assets/maps/test.pak0");
    }

    private void loadTestMap() {
        IMapService mapService = new MapService();

        try {
            MapDTO map = mapService.loadMap("assets/maps/test.pak0");
            System.out.println("Map name: " + map.getName());
            System.out.println("Map width: " + map.getWidth());
            System.out.println("Map height: " + map.getHeight());
            System.out.println("Map tiles:");
            for (MapTile[] row : map.getTiles()) {
                for (MapTile tile : row) {
                    System.out.print(tile.type() + " ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public AdvanceWars(){
        GUI2 gui = new GUI2(this);

        saveTestMap();
        loadTestMap();
    }

    public static void main(String[] args){
        System.out.println("AdvanceWars");
        AdvanceWars advanceWars = new AdvanceWars();
    }
}
