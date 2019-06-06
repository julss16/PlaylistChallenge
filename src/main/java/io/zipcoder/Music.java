package io.zipcoder;
import java.util.Arrays;
public class Music {

    private String[] playList;

    public Music(String[] playList) {

        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {

        int n = playList.length;
        int buttons = 0;

        for (int k =0; k < n ; k++) {

            int song = Arrays.asList(playList).indexOf(playList[k]);


            buttons += song - startIndex;

                if (startIndex < 1) {

                    n = playList.length/2;
                    buttons = song - startIndex;
                }



        }return buttons;
    }
}


