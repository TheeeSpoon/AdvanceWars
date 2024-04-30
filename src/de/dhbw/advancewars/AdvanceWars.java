package de.dhbw.advancewars;

import de.dhbw.advancewars.GUI.GUI2;
import de.dhbw.advancewars.maps.IMapService;
import de.dhbw.advancewars.maps.MapService;
import de.dhbw.advancewars.maps.data.MapDTO;
import de.dhbw.advancewars.maps.data.MapTile;

public class AdvanceWars{
    private void loadMap(String name) {
        IMapService mapService = new MapService();

        try {
            MapDTO map = mapService.loadMap("assets/maps/" + name + ".pak0");
            System.out.println("Map name: " + map.getName());
            System.out.println("Map width: " + map.getTiles().length);
            System.out.println("Map height: " + map.getHeight());
            System.out.println("Map tiles:");
            for (MapTile[] row : map.getTiles()) {
                for (MapTile tile : row) {
                    System.out.print(tile.type() + " " + tile.x() + " " + tile.y() + " | ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public AdvanceWars(){
        GUI2 gui = new GUI2(this);

        loadMap("test");
    }

    public static void main(String[] args){
        System.out.println("AdvanceWars");
        AdvanceWars advanceWars = new AdvanceWars();
    }
}
